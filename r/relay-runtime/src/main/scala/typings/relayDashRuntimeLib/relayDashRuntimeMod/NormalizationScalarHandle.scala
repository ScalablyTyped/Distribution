package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationScalarHandle extends NormalizationHandle {
   // 'ScalarHandle';
  val alias: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val args: js.UndefOr[js.Array[NormalizationArgument] | scala.Null] = js.undefined
  val filters: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
  val handle: java.lang.String
  val key: java.lang.String
  val kind: java.lang.String
  val name: java.lang.String
}

object NormalizationScalarHandle {
  @scala.inline
  def apply(
    handle: java.lang.String,
    key: java.lang.String,
    kind: java.lang.String,
    name: java.lang.String,
    alias: java.lang.String = null,
    args: js.Array[NormalizationArgument] = null,
    filters: js.Array[java.lang.String] = null
  ): NormalizationScalarHandle = {
    val __obj = js.Dynamic.literal(handle = handle, key = key, kind = kind, name = name)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (args != null) __obj.updateDynamic("args")(args)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[NormalizationScalarHandle]
  }
}

