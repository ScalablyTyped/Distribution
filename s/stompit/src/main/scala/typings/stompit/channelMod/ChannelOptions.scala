package typings.stompit.channelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelOptions extends js.Object {
  var alwaysConnected: js.UndefOr[Boolean] = js.native
  var recoverAfterApplicationError: js.UndefOr[Boolean] = js.native
}

object ChannelOptions {
  @scala.inline
  def apply(): ChannelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelOptions]
  }
  @scala.inline
  implicit class ChannelOptionsOps[Self <: ChannelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlwaysConnected(value: Boolean): Self = this.set("alwaysConnected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysConnected: Self = this.set("alwaysConnected", js.undefined)
    @scala.inline
    def setRecoverAfterApplicationError(value: Boolean): Self = this.set("recoverAfterApplicationError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecoverAfterApplicationError: Self = this.set("recoverAfterApplicationError", js.undefined)
  }
  
}

