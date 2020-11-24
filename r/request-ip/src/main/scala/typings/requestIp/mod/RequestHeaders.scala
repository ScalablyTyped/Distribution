package typings.requestIp.mod

import typings.node.httpMod.IncomingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestHeaders extends IncomingHttpHeaders {
  
  var `forwarded-for`: js.UndefOr[String] = js.native
  
  var `x-client-ip`: js.UndefOr[String] = js.native
  
  var `x-cluster-client-ip`: js.UndefOr[String] = js.native
  
  var `x-forwarded`: js.UndefOr[String] = js.native
  
  var `x-forwarded-for`: js.UndefOr[String] = js.native
  
  var `x-real-ip`: js.UndefOr[String] = js.native
}
object RequestHeaders {
  
  @scala.inline
  def apply(): RequestHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestHeaders]
  }
  
  @scala.inline
  implicit class RequestHeadersOps[Self <: RequestHeaders] (val x: Self) extends AnyVal {
    
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
    def `setForwarded-for`(value: String): Self = this.set("forwarded-for", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteForwarded-for`: Self = this.set("forwarded-for", js.undefined)
    
    @scala.inline
    def `setX-client-ip`(value: String): Self = this.set("x-client-ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteX-client-ip`: Self = this.set("x-client-ip", js.undefined)
    
    @scala.inline
    def `setX-cluster-client-ip`(value: String): Self = this.set("x-cluster-client-ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteX-cluster-client-ip`: Self = this.set("x-cluster-client-ip", js.undefined)
    
    @scala.inline
    def `setX-forwarded`(value: String): Self = this.set("x-forwarded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteX-forwarded`: Self = this.set("x-forwarded", js.undefined)
    
    @scala.inline
    def `setX-forwarded-for`(value: String): Self = this.set("x-forwarded-for", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteX-forwarded-for`: Self = this.set("x-forwarded-for", js.undefined)
    
    @scala.inline
    def `setX-real-ip`(value: String): Self = this.set("x-real-ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteX-real-ip`: Self = this.set("x-real-ip", js.undefined)
  }
}
