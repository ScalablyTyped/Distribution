package typings.slimerjs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceResponse extends StObject {
  
  var body: Any
  
  var bodySize: Double
  
  var contentCharset: String
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var headers: StringDictionary[String]
  
  var httpVersion: HttpVersion
  
  var id: Double
  
  var isFileDownloading: Boolean
  
  var redirectURL: js.UndefOr[String] = js.undefined
  
  var referrer: String
  
  var stage: String
  
  var status: Double
  
  var statusText: String
  
  var time: js.Date
  
  var url: String
}
object ResourceResponse {
  
  inline def apply(
    body: Any,
    bodySize: Double,
    contentCharset: String,
    headers: StringDictionary[String],
    httpVersion: HttpVersion,
    id: Double,
    isFileDownloading: Boolean,
    referrer: String,
    stage: String,
    status: Double,
    statusText: String,
    time: js.Date,
    url: String
  ): ResourceResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], bodySize = bodySize.asInstanceOf[js.Any], contentCharset = contentCharset.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], httpVersion = httpVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isFileDownloading = isFileDownloading.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceResponse] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodySize(value: Double): Self = StObject.set(x, "bodySize", value.asInstanceOf[js.Any])
    
    inline def setContentCharset(value: String): Self = StObject.set(x, "contentCharset", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHttpVersion(value: HttpVersion): Self = StObject.set(x, "httpVersion", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsFileDownloading(value: Boolean): Self = StObject.set(x, "isFileDownloading", value.asInstanceOf[js.Any])
    
    inline def setRedirectURL(value: String): Self = StObject.set(x, "redirectURL", value.asInstanceOf[js.Any])
    
    inline def setRedirectURLUndefined: Self = StObject.set(x, "redirectURL", js.undefined)
    
    inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    inline def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
