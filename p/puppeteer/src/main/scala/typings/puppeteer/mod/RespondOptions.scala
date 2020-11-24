package typings.puppeteer.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RespondOptions extends js.Object {
  
  /** Specifies the response body. */
  var body: js.UndefOr[Buffer | String] = js.native
  
  /** Specifies the Content-Type response header. */
  var contentType: js.UndefOr[String] = js.native
  
  /** Specifies the response headers. */
  var headers: js.UndefOr[Headers] = js.native
  
  /**
    * Specifies the response status code.
    * @default 200
    */
  var status: js.UndefOr[Double] = js.native
}
object RespondOptions {
  
  @scala.inline
  def apply(): RespondOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RespondOptions]
  }
  
  @scala.inline
  implicit class RespondOptionsOps[Self <: RespondOptions] (val x: Self) extends AnyVal {
    
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
    def setBody(value: Buffer | String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
