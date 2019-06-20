package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationScalarField extends NormalizationField {
   // 'ScalarField';
  val alias: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val args: js.UndefOr[js.Array[NormalizationArgument] | scala.Null] = js.undefined
  val kind: java.lang.String
  val name: java.lang.String
  val storageKey: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object NormalizationScalarField {
  @scala.inline
  def apply(
    kind: java.lang.String,
    name: java.lang.String,
    alias: java.lang.String = null,
    args: js.Array[NormalizationArgument] = null,
    storageKey: java.lang.String = null
  ): NormalizationScalarField = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (args != null) __obj.updateDynamic("args")(args)
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey)
    __obj.asInstanceOf[NormalizationScalarField]
  }
}

