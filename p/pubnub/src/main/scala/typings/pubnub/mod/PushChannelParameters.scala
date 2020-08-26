package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushChannelParameters extends js.Object {
  var channels: js.Array[String] = js.native
  var device: String = js.native
  var pushGateway: String = js.native
}

object PushChannelParameters {
  @scala.inline
  def apply(channels: js.Array[String], device: String, pushGateway: String): PushChannelParameters = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], pushGateway = pushGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushChannelParameters]
  }
  @scala.inline
  implicit class PushChannelParametersOps[Self <: PushChannelParameters] (val x: Self) extends AnyVal {
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
    def setChannelsVarargs(value: String*): Self = this.set("channels", js.Array(value :_*))
    @scala.inline
    def setChannels(value: js.Array[String]): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def setDevice(value: String): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def setPushGateway(value: String): Self = this.set("pushGateway", value.asInstanceOf[js.Any])
  }
  
}

