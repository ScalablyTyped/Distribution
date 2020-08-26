package typings.stompit.channelPoolMod

import typings.stompit.channelMod.ChannelOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelPoolOptions extends js.Object {
  var channelOptions: js.UndefOr[ChannelOptions] = js.native
  var freeExcessTimeout: js.UndefOr[Double] = js.native
  var maxChannels: js.UndefOr[Double] = js.native
  var minChannels: js.UndefOr[Double] = js.native
  var minFreeChannels: js.UndefOr[Double] = js.native
  var requestChannelTimeout: js.UndefOr[Double] = js.native
}

object ChannelPoolOptions {
  @scala.inline
  def apply(): ChannelPoolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelPoolOptions]
  }
  @scala.inline
  implicit class ChannelPoolOptionsOps[Self <: ChannelPoolOptions] (val x: Self) extends AnyVal {
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
    def setChannelOptions(value: ChannelOptions): Self = this.set("channelOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelOptions: Self = this.set("channelOptions", js.undefined)
    @scala.inline
    def setFreeExcessTimeout(value: Double): Self = this.set("freeExcessTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeExcessTimeout: Self = this.set("freeExcessTimeout", js.undefined)
    @scala.inline
    def setMaxChannels(value: Double): Self = this.set("maxChannels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxChannels: Self = this.set("maxChannels", js.undefined)
    @scala.inline
    def setMinChannels(value: Double): Self = this.set("minChannels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinChannels: Self = this.set("minChannels", js.undefined)
    @scala.inline
    def setMinFreeChannels(value: Double): Self = this.set("minFreeChannels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinFreeChannels: Self = this.set("minFreeChannels", js.undefined)
    @scala.inline
    def setRequestChannelTimeout(value: Double): Self = this.set("requestChannelTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestChannelTimeout: Self = this.set("requestChannelTimeout", js.undefined)
  }
  
}

