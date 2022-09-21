package typings.sipJs

import typings.sipJs.incomingRequestMessageMod.IncomingRequestMessage
import typings.sipJs.incomingResponseMessageMod.IncomingResponseMessage
import typings.sipJs.outgoingRequestMessageMod.OutgoingRequestMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bodyMod {
  
  @JSImport("sip.js/lib/core/messages/body", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromBodyLegacy(bodyLegacy: String): Body = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBodyLegacy")(bodyLegacy.asInstanceOf[js.Any]).asInstanceOf[Body]
  inline def fromBodyLegacy(bodyLegacy: typings.sipJs.anon.Body): Body = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBodyLegacy")(bodyLegacy.asInstanceOf[js.Any]).asInstanceOf[Body]
  
  inline def getBody(message: Body): js.UndefOr[Body] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBody")(message.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Body]]
  inline def getBody(message: IncomingRequestMessage): js.UndefOr[Body] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBody")(message.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Body]]
  inline def getBody(message: IncomingResponseMessage): js.UndefOr[Body] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBody")(message.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Body]]
  inline def getBody(message: OutgoingRequestMessage): js.UndefOr[Body] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBody")(message.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Body]]
  
  inline def isBody(body: Any): /* is sip.js.sip.js/lib/core/messages/body.Body */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBody")(body.asInstanceOf[js.Any]).asInstanceOf[/* is sip.js.sip.js/lib/core/messages/body.Body */ Boolean]
  
  trait Body extends StObject {
    
    /**
      * Requests, including new requests defined in extensions to this
      * specification, MAY contain message bodies unless otherwise noted.
      * The interpretation of the body depends on the request method.
      * For response messages, the request method and the response status
      * code determine the type and interpretation of any message body.  All
      * responses MAY include a body.
      * https://tools.ietf.org/html/rfc3261#section-7.4
      */
    var content: String
    
    /**
      * If the Content-Disposition header field is missing, bodies of
      * Content-Type application/sdp imply the disposition "session", while
      * other content types imply "render".
      * https://tools.ietf.org/html/rfc3261#section-13.2.1
      * For backward-compatibility, if the Content-Disposition header field
      * is missing, the server SHOULD assume bodies of Content-Type
      * application/sdp are the disposition "session", while other content
      * types are "render".
      * https://tools.ietf.org/html/rfc3261#section-20.11
      */
    var contentDisposition: String
    
    /**
      * The Content-Type header field indicates the media type of the
      * message-body sent to the recipient.  The Content-Type header field
      * MUST be present if the body is not empty.  If the body is empty,
      * and a Content-Type header field is present, it indicates that the body
      * of the specific type has zero length (for example, an empty audio file).
      * https://tools.ietf.org/html/rfc3261#section-20.15
      */
    var contentType: String
  }
  object Body {
    
    inline def apply(content: String, contentDisposition: String, contentType: String): Body = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentDisposition = contentDisposition.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    }
  }
}
