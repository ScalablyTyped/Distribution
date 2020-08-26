package typings.sipJs.sessionDescriptionHandlerConfigurationMod

import typings.std.RTCConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionDescriptionHandlerConfiguration extends js.Object {
  /**
    * The maximum duration to wait in ms for ICE gathering to complete.
    * If undefined, implementation dependent.
    * If zero, no timeout.
    */
  var iceGatheringTimeout: js.UndefOr[Double] = js.native
  /**
    * Peer connection options.
    */
  var peerConnectionConfiguration: js.UndefOr[RTCConfiguration] = js.native
}

object SessionDescriptionHandlerConfiguration {
  @scala.inline
  def apply(): SessionDescriptionHandlerConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionDescriptionHandlerConfiguration]
  }
  @scala.inline
  implicit class SessionDescriptionHandlerConfigurationOps[Self <: SessionDescriptionHandlerConfiguration] (val x: Self) extends AnyVal {
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
    def setIceGatheringTimeout(value: Double): Self = this.set("iceGatheringTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIceGatheringTimeout: Self = this.set("iceGatheringTimeout", js.undefined)
    @scala.inline
    def setPeerConnectionConfiguration(value: RTCConfiguration): Self = this.set("peerConnectionConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerConnectionConfiguration: Self = this.set("peerConnectionConfiguration", js.undefined)
  }
  
}

