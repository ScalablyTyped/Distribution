package typings.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RESTAPIResponse extends js.Object {
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
}

