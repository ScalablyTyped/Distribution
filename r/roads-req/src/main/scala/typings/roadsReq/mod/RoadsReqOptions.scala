package typings.roadsReq.mod

import typings.node.httpMod.RequestOptions
import typings.roadsReq.anon.Encoding
import typings.roadsReq.anon.Pw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoadsReqOptions extends js.Object {
  
  var basicAuth: js.UndefOr[Pw] = js.native
  
  var followRedirects: js.UndefOr[Boolean] = js.native
  
  var request: RequestOptions | typings.node.httpsMod.RequestOptions = js.native
  
  var requestBody: js.UndefOr[String] = js.native
  
  var response: js.UndefOr[Encoding] = js.native
}
object RoadsReqOptions {
  
  @scala.inline
  def apply(request: RequestOptions | typings.node.httpsMod.RequestOptions): RoadsReqOptions = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoadsReqOptions]
  }
  
  @scala.inline
  implicit class RoadsReqOptionsOps[Self <: RoadsReqOptions] (val x: Self) extends AnyVal {
    
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
    def setRequest(value: RequestOptions | typings.node.httpsMod.RequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicAuth(value: Pw): Self = this.set("basicAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasicAuth: Self = this.set("basicAuth", js.undefined)
    
    @scala.inline
    def setFollowRedirects(value: Boolean): Self = this.set("followRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowRedirects: Self = this.set("followRedirects", js.undefined)
    
    @scala.inline
    def setRequestBody(value: String): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    
    @scala.inline
    def setResponse(value: Encoding): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
  }
}
