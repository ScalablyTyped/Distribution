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
  
  inline def apply(): WebResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebResponse] (val x: Self) extends AnyVal {
    
    inline def setBody(value: ArtifactContent): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setNoResponseReceived(value: Boolean): Self = StObject.set(x, "noResponseReceived", value.asInstanceOf[js.Any])
    
    inline def setNoResponseReceivedUndefined: Self = StObject.set(x, "noResponseReceived", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setReasonPhrase(value: String): Self = StObject.set(x, "reasonPhrase", value.asInstanceOf[js.Any])
    
    inline def setReasonPhraseUndefined: Self = StObject.set(x, "reasonPhrase", js.undefined)
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
