package typings.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RESTAPIResponse extends js.Object {
  
  def getStreamWriter(): RESTAPIResponseStream = js.native
  
  def setBody(body: js.Any): Unit = js.native
  
  def setContentType(contentType: String): Unit = js.native
  
  def setError(error: js.Any): Unit = js.native
  
  def setHeader(header: String, value: String): Unit = js.native
  
  def setHeaders(headers: js.Any): Unit = js.native
  
  def setLocation(location: String): Unit = js.native
  
  def setStatus(status: Double): Unit = js.native
}
object RESTAPIResponse {
  
  @scala.inline
  def apply(
    getStreamWriter: () => RESTAPIResponseStream,
    setBody: js.Any => Unit,
    setContentType: String => Unit,
    setError: js.Any => Unit,
    setHeader: (String, String) => Unit,
    setHeaders: js.Any => Unit,
    setLocation: String => Unit,
    setStatus: Double => Unit
  ): RESTAPIResponse = {
    val __obj = js.Dynamic.literal(getStreamWriter = js.Any.fromFunction0(getStreamWriter), setBody = js.Any.fromFunction1(setBody), setContentType = js.Any.fromFunction1(setContentType), setError = js.Any.fromFunction1(setError), setHeader = js.Any.fromFunction2(setHeader), setHeaders = js.Any.fromFunction1(setHeaders), setLocation = js.Any.fromFunction1(setLocation), setStatus = js.Any.fromFunction1(setStatus))
    __obj.asInstanceOf[RESTAPIResponse]
  }
  
  @scala.inline
  implicit class RESTAPIResponseOps[Self <: RESTAPIResponse] (val x: Self) extends AnyVal {
    
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
    def setGetStreamWriter(value: () => RESTAPIResponseStream): Self = this.set("getStreamWriter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetBody(value: js.Any => Unit): Self = this.set("setBody", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetContentType(value: String => Unit): Self = this.set("setContentType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetError(value: js.Any => Unit): Self = this.set("setError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHeader(value: (String, String) => Unit): Self = this.set("setHeader", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetHeaders(value: js.Any => Unit): Self = this.set("setHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLocation(value: String => Unit): Self = this.set("setLocation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStatus(value: Double => Unit): Self = this.set("setStatus", js.Any.fromFunction1(value))
  }
}
