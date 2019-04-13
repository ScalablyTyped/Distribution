package typings
package stompitLib.libChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelOptions extends js.Object {
  var alwaysConnected: js.UndefOr[scala.Boolean] = js.undefined
  var recoverAfterApplicationError: js.UndefOr[scala.Boolean] = js.undefined
}

object ChannelOptions {
  @scala.inline
  def apply(
    alwaysConnected: js.UndefOr[scala.Boolean] = js.undefined,
    recoverAfterApplicationError: js.UndefOr[scala.Boolean] = js.undefined
  ): ChannelOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysConnected)) __obj.updateDynamic("alwaysConnected")(alwaysConnected)
    if (!js.isUndefined(recoverAfterApplicationError)) __obj.updateDynamic("recoverAfterApplicationError")(recoverAfterApplicationError)
    __obj.asInstanceOf[ChannelOptions]
  }
}

