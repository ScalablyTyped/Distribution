package typings.slimerjs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceResponse extends StObject {
  
  var body: js.Any = js.native
  
  var bodySize: Double = js.native
  
  var contentCharset: String = js.native
  
  var contentType: js.UndefOr[String] = js.native
  
  var headers: StringDictionary[String] = js.native
  
  var httpVersion: HttpVersion = js.native
  
  var id: Double = js.native
  
  var isFileDownloading: Boolean = js.native
  
  var redirectURL: js.UndefOr[String] = js.native
  
  var referrer: String = js.native
  
  var stage: String = js.native
  
  var status: Double = js.native
  
  var statusText: String = js.native
  
  var time: Date = js.native
  
  var url: String = js.native
}
object ResourceResponse {
  
  @scala.inline
  def apply(
    body: js.Any,
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
    time: Date,
    url: String
  ): ResourceResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], bodySize = bodySize.asInstanceOf[js.Any], contentCharset = contentCharset.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], httpVersion = httpVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isFileDownloading = isFileDownloading.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceResponse]
  }
  
  @scala.inline
  implicit class ResourceResponseMutableBuilder[Self <: ResourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodySize(value: Double): Self = StObject.set(x, "bodySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentCharset(value: String): Self = StObject.set(x, "contentCharset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpVersion(value: HttpVersion): Self = StObject.set(x, "httpVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFileDownloading(value: Boolean): Self = StObject.set(x, "isFileDownloading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectURL(value: String): Self = StObject.set(x, "redirectURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectURLUndefined: Self = StObject.set(x, "redirectURL", js.undefined)
    
    @scala.inline
    def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
