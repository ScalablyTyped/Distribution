package typings
package relaxedDashJsonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duplicate extends js.Object {
  var duplicate: js.UndefOr[scala.Boolean] = js.undefined
  var relaxed: js.UndefOr[scala.Boolean] = js.undefined
  var reviver: js.UndefOr[relaxedDashJsonLib.relaxedDashJsonMod.Reviver] = js.undefined
  var tolerant: js.UndefOr[scala.Boolean] = js.undefined
  var warnings: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Duplicate {
  @scala.inline
  def apply(
    duplicate: js.UndefOr[scala.Boolean] = js.undefined,
    relaxed: js.UndefOr[scala.Boolean] = js.undefined,
    reviver: relaxedDashJsonLib.relaxedDashJsonMod.Reviver = null,
    tolerant: js.UndefOr[scala.Boolean] = js.undefined,
    warnings: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Duplicate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duplicate)) __obj.updateDynamic("duplicate")(duplicate)
    if (!js.isUndefined(relaxed)) __obj.updateDynamic("relaxed")(relaxed)
    if (reviver != null) __obj.updateDynamic("reviver")(reviver)
    if (!js.isUndefined(tolerant)) __obj.updateDynamic("tolerant")(tolerant)
    if (!js.isUndefined(warnings)) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[Anon_Duplicate]
  }
}

