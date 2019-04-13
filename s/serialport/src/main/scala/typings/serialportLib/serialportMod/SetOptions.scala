package typings
package serialportLib.serialportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOptions extends js.Object {
  var brk: js.UndefOr[scala.Boolean] = js.undefined
  var cts: js.UndefOr[scala.Boolean] = js.undefined
  var dsr: js.UndefOr[scala.Boolean] = js.undefined
  var dtr: js.UndefOr[scala.Boolean] = js.undefined
  var rts: js.UndefOr[scala.Boolean] = js.undefined
}

object SetOptions {
  @scala.inline
  def apply(
    brk: js.UndefOr[scala.Boolean] = js.undefined,
    cts: js.UndefOr[scala.Boolean] = js.undefined,
    dsr: js.UndefOr[scala.Boolean] = js.undefined,
    dtr: js.UndefOr[scala.Boolean] = js.undefined,
    rts: js.UndefOr[scala.Boolean] = js.undefined
  ): SetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(brk)) __obj.updateDynamic("brk")(brk)
    if (!js.isUndefined(cts)) __obj.updateDynamic("cts")(cts)
    if (!js.isUndefined(dsr)) __obj.updateDynamic("dsr")(dsr)
    if (!js.isUndefined(dtr)) __obj.updateDynamic("dtr")(dtr)
    if (!js.isUndefined(rts)) __obj.updateDynamic("rts")(rts)
    __obj.asInstanceOf[SetOptions]
  }
}

