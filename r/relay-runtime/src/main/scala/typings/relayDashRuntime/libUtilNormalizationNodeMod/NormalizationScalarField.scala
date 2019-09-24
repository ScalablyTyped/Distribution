package typings.relayDashRuntime.libUtilNormalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationScalarField extends NormalizationField {
   // 'ScalarField';
  val alias: js.UndefOr[String | Null] = js.undefined
  val args: js.UndefOr[js.Array[NormalizationArgument] | Null] = js.undefined
  val kind: String
  val name: String
  val storageKey: js.UndefOr[String | Null] = js.undefined
}

object NormalizationScalarField {
  @scala.inline
  def apply(
    kind: String,
    name: String,
    alias: String = null,
    args: js.Array[NormalizationArgument] = null,
    storageKey: String = null
  ): NormalizationScalarField = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (args != null) __obj.updateDynamic("args")(args)
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey)
    __obj.asInstanceOf[NormalizationScalarField]
  }
}

