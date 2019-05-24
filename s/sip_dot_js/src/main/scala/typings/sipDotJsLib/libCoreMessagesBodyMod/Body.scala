package typings
package sipDotJsLib.libCoreMessagesBodyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  /**
    * Requests, including new requests defined in extensions to this
    * specification, MAY contain message bodies unless otherwise noted.
    * The interpretation of the body depends on the request method.
    * For response messages, the request method and the response status
    * code determine the type and interpretation of any message body.  All
    * responses MAY include a body.
    * https://tools.ietf.org/html/rfc3261#section-7.4
    */
  var content: java.lang.String
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
  var contentDisposition: java.lang.String
  /**
    * The Content-Type header field indicates the media type of the
    * message-body sent to the recipient.  The Content-Type header field
    * MUST be present if the body is not empty.  If the body is empty,
    * and a Content-Type header field is present, it indicates that the body
    * of the specific type has zero length (for example, an empty audio file).
    * https://tools.ietf.org/html/rfc3261#section-20.15
    */
  var contentType: java.lang.String
}

object Body {
  @scala.inline
  def apply(content: java.lang.String, contentDisposition: java.lang.String, contentType: java.lang.String): Body = {
    val __obj = js.Dynamic.literal(content = content, contentDisposition = contentDisposition, contentType = contentType)
  
    __obj.asInstanceOf[Body]
  }
}

