package typings.sipJs

import typings.std.RTCConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionDescriptionHandlerConfigurationMod {
  
  trait SessionDescriptionHandlerConfiguration extends StObject {
    
    /**
      * The maximum duration to wait in ms for ICE gathering to complete.
      * If undefined, implementation dependent.
      * If zero, no timeout.
      */
    var iceGatheringTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Peer connection options.
      */
    var peerConnectionConfiguration: js.UndefOr[RTCConfiguration] = js.undefined
  }
  object SessionDescriptionHandlerConfiguration {
    
    @scala.inline
    def apply(): SessionDescriptionHandlerConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionDescriptionHandlerConfiguration]
    }
    
    @scala.inline
    implicit class SessionDescriptionHandlerConfigurationMutableBuilder[Self <: SessionDescriptionHandlerConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIceGatheringTimeout(value: Double): Self = StObject.set(x, "iceGatheringTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIceGatheringTimeoutUndefined: Self = StObject.set(x, "iceGatheringTimeout", js.undefined)
      
      @scala.inline
      def setPeerConnectionConfiguration(value: RTCConfiguration): Self = StObject.set(x, "peerConnectionConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerConnectionConfigurationUndefined: Self = StObject.set(x, "peerConnectionConfiguration", js.undefined)
    }
  }
}
