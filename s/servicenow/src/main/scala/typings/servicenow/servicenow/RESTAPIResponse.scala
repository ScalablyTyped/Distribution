package typings.servicenow.servicenow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RESTAPIResponse extends StObject {
  
  def getStreamWriter(): RESTAPIResponseStream
  
  def setBody(body: js.Any): Unit
  
  def setContentType(contentType: String): Unit
  
  def setError(error: js.Any): Unit
  
  def setHeader(header: String, value: String): Unit
  
  def setHeaders(headers: js.Any): Unit
  
  def setLocation(location: String): Unit
  
  def setStatus(status: Double): Unit
}
object RESTAPIResponse {
  
  inline def apply(
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
  
  extension [Self <: RESTAPIResponse](x: Self) {
    
    inline def setGetStreamWriter(value: () => RESTAPIResponseStream): Self = StObject.set(x, "getStreamWriter", js.Any.fromFunction0(value))
    
    inline def setSetBody(value: js.Any => Unit): Self = StObject.set(x, "setBody", js.Any.fromFunction1(value))
    
    inline def setSetContentType(value: String => Unit): Self = StObject.set(x, "setContentType", js.Any.fromFunction1(value))
    
    inline def setSetError(value: js.Any => Unit): Self = StObject.set(x, "setError", js.Any.fromFunction1(value))
    
    inline def setSetHeader(value: (String, String) => Unit): Self = StObject.set(x, "setHeader", js.Any.fromFunction2(value))
    
    inline def setSetHeaders(value: js.Any => Unit): Self = StObject.set(x, "setHeaders", js.Any.fromFunction1(value))
    
    inline def setSetLocation(value: String => Unit): Self = StObject.set(x, "setLocation", js.Any.fromFunction1(value))
    
    inline def setSetStatus(value: Double => Unit): Self = StObject.set(x, "setStatus", js.Any.fromFunction1(value))
  }
}
