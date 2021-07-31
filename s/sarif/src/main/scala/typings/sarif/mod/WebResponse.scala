package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebResponse extends StObject {
  
  /**
    * The body of the response.
    */
  var body: js.UndefOr[ArtifactContent] = js.undefined
  
  /**
    * The response headers.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The index within the run.webResponses array of the response object associated with this result.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether a response was received from the server.
    */
  var noResponseReceived: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the response.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * The response protocol. Example: 'http'.
    */
  var protocol: js.UndefOr[String] = js.undefined
  
  /**
    * The response reason. Example: 'Not found'.
    */
  var reasonPhrase: js.UndefOr[String] = js.undefined
  
  /**
    * The response status code. Example: 451.
    */
  var statusCode: js.UndefOr[Double] = js.undefined
  
  /**
    * The response version. Example: '1.1'.
    */
  var version: js.UndefOr[String] = js.undefined
}
object WebResponse {
  
  @scala.inline
  def apply(): WebResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebResponse]
  }
  
  @scala.inline
  implicit class WebResponseMutableBuilder[Self <: WebResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: ArtifactContent): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setNoResponseReceived(value: Boolean): Self = StObject.set(x, "noResponseReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoResponseReceivedUndefined: Self = StObject.set(x, "noResponseReceived", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setReasonPhrase(value: String): Self = StObject.set(x, "reasonPhrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonPhraseUndefined: Self = StObject.set(x, "reasonPhrase", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
