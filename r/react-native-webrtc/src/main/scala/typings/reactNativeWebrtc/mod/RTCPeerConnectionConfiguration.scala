package typings.reactNativeWebrtc.mod

import typings.reactNativeWebrtc.reactNativeWebrtcStrings.all
import typings.reactNativeWebrtc.reactNativeWebrtcStrings.public
import typings.reactNativeWebrtc.reactNativeWebrtcStrings.relay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCPeerConnectionConfiguration extends js.Object {
  var iceServers: js.Array[ConfigurationParamWithUrl | ConfigurationParamWithUrls] = js.native
  var iceTransportPolicy: js.UndefOr[all | public | relay] = js.native
}

object RTCPeerConnectionConfiguration {
  @scala.inline
  def apply(iceServers: js.Array[ConfigurationParamWithUrl | ConfigurationParamWithUrls]): RTCPeerConnectionConfiguration = {
    val __obj = js.Dynamic.literal(iceServers = iceServers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCPeerConnectionConfiguration]
  }
  @scala.inline
  implicit class RTCPeerConnectionConfigurationOps[Self <: RTCPeerConnectionConfiguration] (val x: Self) extends AnyVal {
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
    def setIceServersVarargs(value: (ConfigurationParamWithUrl | ConfigurationParamWithUrls)*): Self = this.set("iceServers", js.Array(value :_*))
    @scala.inline
    def setIceServers(value: js.Array[ConfigurationParamWithUrl | ConfigurationParamWithUrls]): Self = this.set("iceServers", value.asInstanceOf[js.Any])
    @scala.inline
    def setIceTransportPolicy(value: all | public | relay): Self = this.set("iceTransportPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIceTransportPolicy: Self = this.set("iceTransportPolicy", js.undefined)
  }
  
}

