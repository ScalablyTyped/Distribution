package typings.sipJs.sessionDescriptionHandlerOptionsMod

import typings.std.RTCAnswerOptions
import typings.std.RTCDataChannel
import typings.std.RTCDataChannelInit
import typings.std.RTCOfferOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionDescriptionHandlerOptions
  extends typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions {
  /**
    * Answer options to use when creating an answer.
    */
  var answerOptions: js.UndefOr[RTCAnswerOptions] = js.native
  /**
    * If true, create a data channel when making initial offer.
    */
  var dataChannel: js.UndefOr[Boolean] = js.native
  /**
    * A human-readable name to use when creating the data channel.
    */
  var dataChannelLabel: js.UndefOr[String] = js.native
  /**
    * Configuration options for creating the data channel.
    */
  var dataChannelOptions: js.UndefOr[RTCDataChannelInit] = js.native
  /**
    * The maximum duration to wait in ms for ICE gathering to complete.
    * No timeout if undefined or zero.
    */
  var iceGatheringTimeout: js.UndefOr[Double] = js.native
  /**
    * Offer options to use when creating an offer.
    */
  var offerOptions: js.UndefOr[RTCOfferOptions] = js.native
  /**
    * Called upon creating a data channel.
    */
  var onDataChannel: js.UndefOr[js.Function1[/* dataChannel */ RTCDataChannel, Unit]] = js.native
}

object SessionDescriptionHandlerOptions {
  @scala.inline
  def apply(): SessionDescriptionHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionDescriptionHandlerOptions]
  }
  @scala.inline
  implicit class SessionDescriptionHandlerOptionsOps[Self <: SessionDescriptionHandlerOptions] (val x: Self) extends AnyVal {
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
    def setAnswerOptions(value: RTCAnswerOptions): Self = this.set("answerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnswerOptions: Self = this.set("answerOptions", js.undefined)
    @scala.inline
    def setDataChannel(value: Boolean): Self = this.set("dataChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataChannel: Self = this.set("dataChannel", js.undefined)
    @scala.inline
    def setDataChannelLabel(value: String): Self = this.set("dataChannelLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataChannelLabel: Self = this.set("dataChannelLabel", js.undefined)
    @scala.inline
    def setDataChannelOptions(value: RTCDataChannelInit): Self = this.set("dataChannelOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataChannelOptions: Self = this.set("dataChannelOptions", js.undefined)
    @scala.inline
    def setIceGatheringTimeout(value: Double): Self = this.set("iceGatheringTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIceGatheringTimeout: Self = this.set("iceGatheringTimeout", js.undefined)
    @scala.inline
    def setOfferOptions(value: RTCOfferOptions): Self = this.set("offerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferOptions: Self = this.set("offerOptions", js.undefined)
    @scala.inline
    def setOnDataChannel(value: /* dataChannel */ RTCDataChannel => Unit): Self = this.set("onDataChannel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDataChannel: Self = this.set("onDataChannel", js.undefined)
  }
  
}

