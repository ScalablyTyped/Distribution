package typings.sipJs.bodyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var content: String = js.native
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
  var contentDisposition: String = js.native
  /**
    * The Content-Type header field indicates the media type of the
    * message-body sent to the recipient.  The Content-Type header field
    * MUST be present if the body is not empty.  If the body is empty,
    * and a Content-Type header field is present, it indicates that the body
    * of the specific type has zero length (for example, an empty audio file).
    * https://tools.ietf.org/html/rfc3261#section-20.15
    */
  var contentType: String = js.native
}

object Body {
  @scala.inline
  def apply(content: String, contentDisposition: String, contentType: String): Body = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentDisposition = contentDisposition.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  @scala.inline
  implicit class BodyOps[Self <: Body] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentDisposition(value: String): Self = this.set("contentDisposition", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
  }
  
}

