package typings.sipJs

import typings.std.RTCSessionDescriptionInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiSessionDescriptionHandlerMod {
  
  trait BodyAndContentType extends StObject {
    
    /** Message body content. */
    var body: String
    
    /** Message body content type. */
    var contentType: String
  }
  object BodyAndContentType {
    
    inline def apply(body: String, contentType: String): BodyAndContentType = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyAndContentType]
    }
    
    extension [Self <: BodyAndContentType](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SessionDescriptionHandler extends StObject {
    
    /**
      * Destructor.
      */
    def close(): Unit = js.native
    
    /**
      * Gets the local description from the underlying media implementation.
      * @param options - Options object to be used by getDescription.
      * @param modifiers - Array with one time use description modifiers.
      * @returns Promise that resolves with the local description to be used for the session.
      * Rejects with `ClosedSessionDescriptionHandlerError` when this method
      * is called after close or when close occurs before complete.
      */
    def getDescription(): js.Promise[BodyAndContentType] = js.native
    def getDescription(options: Unit, modifiers: js.Array[SessionDescriptionHandlerModifier]): js.Promise[BodyAndContentType] = js.native
    def getDescription(options: SessionDescriptionHandlerOptions): js.Promise[BodyAndContentType] = js.native
    def getDescription(options: SessionDescriptionHandlerOptions, modifiers: js.Array[SessionDescriptionHandlerModifier]): js.Promise[BodyAndContentType] = js.native
    
    /**
      * Returns true if the Session Description Handler can handle the Content-Type described by a SIP message.
      * @param contentType - The content type that is in the SIP Message.
      * @returns True if the content type is  handled by this session description handler. False otherwise.
      */
    def hasDescription(contentType: String): Boolean = js.native
    
    /**
      * Rolls back the current local/remote offer to the prior stable state.
      */
    var rollbackDescription: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
    
    /**
      * Send DTMF via RTP (RFC 4733).
      * Returns true if DTMF send is successful, false otherwise.
      * @param tones - A string containing DTMF digits.
      * @param options - Options object to be used by sendDtmf.
      * @returns True if DTMF send is successful, false otherwise.
      */
    def sendDtmf(tones: String): Boolean = js.native
    def sendDtmf(tones: String, options: Any): Boolean = js.native
    
    /**
      * Sets the remote description to the underlying media implementation.
      * @param  sessionDescription - The description provided by a SIP message to be set on the media implementation.
      * @param options - Options object to be used by setDescription.
      * @param modifiers - Array with one time use description modifiers.
      * @returns Promise that resolves once the description is set.
      * Rejects with `ClosedSessionDescriptionHandlerError` when this method
      * is called after close or when close occurs before complete.
      */
    def setDescription(sdp: String): js.Promise[Unit] = js.native
    def setDescription(sdp: String, options: Unit, modifiers: js.Array[SessionDescriptionHandlerModifier]): js.Promise[Unit] = js.native
    def setDescription(sdp: String, options: SessionDescriptionHandlerOptions): js.Promise[Unit] = js.native
    def setDescription(
      sdp: String,
      options: SessionDescriptionHandlerOptions,
      modifiers: js.Array[SessionDescriptionHandlerModifier]
    ): js.Promise[Unit] = js.native
  }
  
  type SessionDescriptionHandlerModifier = js.Function1[
    /* sessionDescription */ RTCSessionDescriptionInit, 
    js.Promise[RTCSessionDescriptionInit]
  ]
  
  trait SessionDescriptionHandlerOptions extends StObject {
    
    var constraints: js.UndefOr[js.Object] = js.undefined
  }
  object SessionDescriptionHandlerOptions {
    
    inline def apply(): SessionDescriptionHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionDescriptionHandlerOptions]
    }
    
    extension [Self <: SessionDescriptionHandlerOptions](x: Self) {
      
      inline def setConstraints(value: js.Object): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    }
  }
}
