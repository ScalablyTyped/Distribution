package typings.simplecrawler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActualDataSize extends js.Object {
  
  var actualDataSize: Double = js.native
  
  var code: Double = js.native
  
  var contentLength: Double = js.native
  
  var contentType: String = js.native
  
  var downloadTime: Double = js.native
  
  var headers: js.Object = js.native
  
  var requestLatency: Double = js.native
  
  var requestTime: Double = js.native
  
  var sentIncorrectSize: Boolean = js.native
}
object ActualDataSize {
  
  @scala.inline
  def apply(
    actualDataSize: Double,
    code: Double,
    contentLength: Double,
    contentType: String,
    downloadTime: Double,
    headers: js.Object,
    requestLatency: Double,
    requestTime: Double,
    sentIncorrectSize: Boolean
  ): ActualDataSize = {
    val __obj = js.Dynamic.literal(actualDataSize = actualDataSize.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], contentLength = contentLength.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], downloadTime = downloadTime.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], requestLatency = requestLatency.asInstanceOf[js.Any], requestTime = requestTime.asInstanceOf[js.Any], sentIncorrectSize = sentIncorrectSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActualDataSize]
  }
  
  @scala.inline
  implicit class ActualDataSizeOps[Self <: ActualDataSize] (val x: Self) extends AnyVal {
    
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
    def setActualDataSize(value: Double): Self = this.set("actualDataSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLength(value: Double): Self = this.set("contentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadTime(value: Double): Self = this.set("downloadTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestLatency(value: Double): Self = this.set("requestLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTime(value: Double): Self = this.set("requestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentIncorrectSize(value: Boolean): Self = this.set("sentIncorrectSize", value.asInstanceOf[js.Any])
  }
}
