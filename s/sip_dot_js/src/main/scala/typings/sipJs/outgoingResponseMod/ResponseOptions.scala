package typings.sipJs.outgoingResponseMod

import typings.sipJs.bodyMod.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseOptions extends js.Object {
  
  /** Body to include in the message. */
  var body: js.UndefOr[Body] = js.native
  
  /** Extra headers to include in the message. */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  
  /** Reason phrase of the response. */
  var reasonPhrase: js.UndefOr[String] = js.native
  
  /** Status code of the response. */
  var statusCode: Double = js.native
  
  /** Support options tags for Supported header. */
  var supported: js.UndefOr[js.Array[String]] = js.native
  
  /** To tag of the response. If not provided, one is generated. */
  var toTag: js.UndefOr[String] = js.native
  
  /** User agent string for User-Agent header. */
  var userAgent: js.UndefOr[String] = js.native
}
object ResponseOptions {
  
  @scala.inline
  def apply(statusCode: Double): ResponseOptions = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseOptions]
  }
  
  @scala.inline
  implicit class ResponseOptionsOps[Self <: ResponseOptions] (val x: Self) extends AnyVal {
    
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
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: Body): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setExtraHeadersVarargs(value: String*): Self = this.set("extraHeaders", js.Array(value :_*))
    
    @scala.inline
    def setExtraHeaders(value: js.Array[String]): Self = this.set("extraHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraHeaders: Self = this.set("extraHeaders", js.undefined)
    
    @scala.inline
    def setReasonPhrase(value: String): Self = this.set("reasonPhrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonPhrase: Self = this.set("reasonPhrase", js.undefined)
    
    @scala.inline
    def setSupportedVarargs(value: String*): Self = this.set("supported", js.Array(value :_*))
    
    @scala.inline
    def setSupported(value: js.Array[String]): Self = this.set("supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupported: Self = this.set("supported", js.undefined)
    
    @scala.inline
    def setToTag(value: String): Self = this.set("toTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToTag: Self = this.set("toTag", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
  }
}
