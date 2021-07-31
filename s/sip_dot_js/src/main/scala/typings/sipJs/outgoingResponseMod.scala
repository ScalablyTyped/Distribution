package typings.sipJs

import typings.sipJs.bodyMod.Body
import typings.sipJs.incomingRequestMessageMod.IncomingRequestMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outgoingResponseMod {
  
  @JSImport("sip.js/lib/core/messages/outgoing-response", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def constructOutgoingResponse(message: IncomingRequestMessage, options: ResponseOptions): OutgoingResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("constructOutgoingResponse")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[OutgoingResponse]
  
  trait OutgoingResponse extends StObject {
    
    /** The outgoing message. */
    val message: String
  }
  object OutgoingResponse {
    
    @scala.inline
    def apply(message: String): OutgoingResponse = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutgoingResponse]
    }
    
    @scala.inline
    implicit class OutgoingResponseMutableBuilder[Self <: OutgoingResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResponseOptions extends StObject {
    
    /** Body to include in the message. */
    var body: js.UndefOr[Body] = js.undefined
    
    /** Extra headers to include in the message. */
    var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Reason phrase of the response. */
    var reasonPhrase: js.UndefOr[String] = js.undefined
    
    /** Status code of the response. */
    var statusCode: Double
    
    /** Support options tags for Supported header. */
    var supported: js.UndefOr[js.Array[String]] = js.undefined
    
    /** To tag of the response. If not provided, one is generated. */
    var toTag: js.UndefOr[String] = js.undefined
    
    /** User agent string for User-Agent header. */
    var userAgent: js.UndefOr[String] = js.undefined
  }
  object ResponseOptions {
    
    @scala.inline
    def apply(statusCode: Double): ResponseOptions = {
      val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseOptions]
    }
    
    @scala.inline
    implicit class ResponseOptionsMutableBuilder[Self <: ResponseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
      
      @scala.inline
      def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value :_*))
      
      @scala.inline
      def setReasonPhrase(value: String): Self = StObject.set(x, "reasonPhrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonPhraseUndefined: Self = StObject.set(x, "reasonPhrase", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupported(value: js.Array[String]): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedUndefined: Self = StObject.set(x, "supported", js.undefined)
      
      @scala.inline
      def setSupportedVarargs(value: String*): Self = StObject.set(x, "supported", js.Array(value :_*))
      
      @scala.inline
      def setToTag(value: String): Self = StObject.set(x, "toTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToTagUndefined: Self = StObject.set(x, "toTag", js.undefined)
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
}
