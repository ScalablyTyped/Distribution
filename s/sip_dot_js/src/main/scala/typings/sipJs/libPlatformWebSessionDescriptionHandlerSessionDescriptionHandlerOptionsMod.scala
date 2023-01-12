package typings.sipJs

import typings.std.RTCAnswerOptions
import typings.std.RTCDataChannel
import typings.std.RTCDataChannelInit
import typings.std.RTCOfferOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlatformWebSessionDescriptionHandlerSessionDescriptionHandlerOptionsMod {
  
  trait SessionDescriptionHandlerOptions
    extends StObject
       with typings.sipJs.libApiSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions {
    
    /**
      * Answer options to use when creating an answer.
      */
    var answerOptions: js.UndefOr[RTCAnswerOptions] = js.undefined
    
    /**
      * If true, create a data channel when making initial offer.
      */
    var dataChannel: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A human-readable name to use when creating the data channel.
      */
    var dataChannelLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Configuration options for creating the data channel.
      */
    var dataChannelOptions: js.UndefOr[RTCDataChannelInit] = js.undefined
    
    /**
      * If true, offer and answer directions will be set to place peer on hold.
      */
    var hold: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The maximum duration to wait in ms for ICE gathering to complete.
      * No timeout if undefined or zero.
      */
    var iceGatheringTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Offer options to use when creating an offer.
      */
    var offerOptions: js.UndefOr[RTCOfferOptions] = js.undefined
    
    /**
      * Called upon creating a data channel.
      */
    var onDataChannel: js.UndefOr[js.Function1[/* dataChannel */ RTCDataChannel, Unit]] = js.undefined
  }
  object SessionDescriptionHandlerOptions {
    
    inline def apply(): SessionDescriptionHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionDescriptionHandlerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SessionDescriptionHandlerOptions] (val x: Self) extends AnyVal {
      
      inline def setAnswerOptions(value: RTCAnswerOptions): Self = StObject.set(x, "answerOptions", value.asInstanceOf[js.Any])
      
      inline def setAnswerOptionsUndefined: Self = StObject.set(x, "answerOptions", js.undefined)
      
      inline def setDataChannel(value: Boolean): Self = StObject.set(x, "dataChannel", value.asInstanceOf[js.Any])
      
      inline def setDataChannelLabel(value: String): Self = StObject.set(x, "dataChannelLabel", value.asInstanceOf[js.Any])
      
      inline def setDataChannelLabelUndefined: Self = StObject.set(x, "dataChannelLabel", js.undefined)
      
      inline def setDataChannelOptions(value: RTCDataChannelInit): Self = StObject.set(x, "dataChannelOptions", value.asInstanceOf[js.Any])
      
      inline def setDataChannelOptionsUndefined: Self = StObject.set(x, "dataChannelOptions", js.undefined)
      
      inline def setDataChannelUndefined: Self = StObject.set(x, "dataChannel", js.undefined)
      
      inline def setHold(value: Boolean): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
      
      inline def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
      
      inline def setIceGatheringTimeout(value: Double): Self = StObject.set(x, "iceGatheringTimeout", value.asInstanceOf[js.Any])
      
      inline def setIceGatheringTimeoutUndefined: Self = StObject.set(x, "iceGatheringTimeout", js.undefined)
      
      inline def setOfferOptions(value: RTCOfferOptions): Self = StObject.set(x, "offerOptions", value.asInstanceOf[js.Any])
      
      inline def setOfferOptionsUndefined: Self = StObject.set(x, "offerOptions", js.undefined)
      
      inline def setOnDataChannel(value: /* dataChannel */ RTCDataChannel => Unit): Self = StObject.set(x, "onDataChannel", js.Any.fromFunction1(value))
      
      inline def setOnDataChannelUndefined: Self = StObject.set(x, "onDataChannel", js.undefined)
    }
  }
}
