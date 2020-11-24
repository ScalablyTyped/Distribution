package typings.sparkpost.mod

import typings.sparkpost.anon.Email
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineContent extends js.Object {
  
  /** JSON array of attachments. */
  var attachments: js.UndefOr[js.Array[Attachment]] = js.native
  
  /** "deals@company.com" or JSON object composed of the “name” and “email” fields “from” : { “name” : “My Company”, “email” : "deals@company.com" } used to compose the email’s “From” header */
  var from: js.UndefOr[String | Email] = js.native
  
  /** JSON dictionary containing headers other than “Subject”, “From”, “To”, and “Reply-To” */
  var headers: js.UndefOr[js.Any] = js.native
  
  /** HTML content for the email’s text/html MIME part  At a minimum, html, text, or push is required. */
  var html: js.UndefOr[String] = js.native
  
  /** JSON array of inline images. */
  var inline_images: js.UndefOr[js.Array[Attachment]] = js.native
  
  /**  Content of push notifications  At a minimum, html, text, or push is required.  SparkPost Enterprise API only. */
  var push: js.UndefOr[PushData] = js.native
  
  /** Email address used to compose the email’s “Reply-To” header */
  var reply_to: js.UndefOr[String] = js.native
  
  /** Email subject line  required for email transmissions  Expected in the UTF-8 charset without RFC2047 encoding. Substitution syntax is supported. */
  var subject: js.UndefOr[String] = js.native
  
  /** Text content for the email’s text/plain MIME part  At a minimum, html, text, or push is required. */
  var text: js.UndefOr[String] = js.native
}
object InlineContent {
  
  @scala.inline
  def apply(): InlineContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineContent]
  }
  
  @scala.inline
  implicit class InlineContentOps[Self <: InlineContent] (val x: Self) extends AnyVal {
    
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
    def setAttachmentsVarargs(value: Attachment*): Self = this.set("attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttachments(value: js.Array[Attachment]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    
    @scala.inline
    def setFrom(value: String | Email): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setInline_imagesVarargs(value: Attachment*): Self = this.set("inline_images", js.Array(value :_*))
    
    @scala.inline
    def setInline_images(value: js.Array[Attachment]): Self = this.set("inline_images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline_images: Self = this.set("inline_images", js.undefined)
    
    @scala.inline
    def setPush(value: PushData): Self = this.set("push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
    
    @scala.inline
    def setReply_to(value: String): Self = this.set("reply_to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReply_to: Self = this.set("reply_to", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
