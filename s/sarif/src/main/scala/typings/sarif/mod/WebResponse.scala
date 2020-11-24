package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebResponse extends js.Object {
  
  /**
    * The body of the response.
    */
  var body: js.UndefOr[ArtifactContent] = js.native
  
  /**
    * The response headers.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The index within the run.webResponses array of the response object associated with this result.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * Specifies whether a response was received from the server.
    */
  var noResponseReceived: js.UndefOr[Boolean] = js.native
  
  /**
    * Key/value pairs that provide additional information about the response.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * The response protocol. Example: 'http'.
    */
  var protocol: js.UndefOr[String] = js.native
  
  /**
    * The response reason. Example: 'Not found'.
    */
  var reasonPhrase: js.UndefOr[String] = js.native
  
  /**
    * The response status code. Example: 451.
    */
  var statusCode: js.UndefOr[Double] = js.native
  
  /**
    * The response version. Example: '1.1'.
    */
  var version: js.UndefOr[String] = js.native
}
object WebResponse {
  
  @scala.inline
  def apply(): WebResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebResponse]
  }
  
  @scala.inline
  implicit class WebResponseOps[Self <: WebResponse] (val x: Self) extends AnyVal {
    
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
    def setBody(value: ArtifactContent): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setNoResponseReceived(value: Boolean): Self = this.set("noResponseReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoResponseReceived: Self = this.set("noResponseReceived", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setReasonPhrase(value: String): Self = this.set("reasonPhrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonPhrase: Self = this.set("reasonPhrase", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
