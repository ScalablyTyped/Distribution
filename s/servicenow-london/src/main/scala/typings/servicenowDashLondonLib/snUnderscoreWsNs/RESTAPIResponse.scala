package typings
package servicenowDashLondonLib.snUnderscoreWsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RESTAPIResponse extends js.Object {
  def getStreamWriter(): RESTAPIResponseStream
  def setBody(body: js.Any): scala.Unit
  def setContentType(contentType: java.lang.String): scala.Unit
  def setError(error: js.Any): scala.Unit
  def setHeader(header: java.lang.String, value: java.lang.String): scala.Unit
  def setHeaders(headers: js.Any): scala.Unit
  def setLocation(location: java.lang.String): scala.Unit
  def setStatus(status: scala.Double): scala.Unit
}

object RESTAPIResponse {
  @scala.inline
  def apply(
    getStreamWriter: () => RESTAPIResponseStream,
    setBody: js.Any => scala.Unit,
    setContentType: java.lang.String => scala.Unit,
    setError: js.Any => scala.Unit,
    setHeader: (java.lang.String, java.lang.String) => scala.Unit,
    setHeaders: js.Any => scala.Unit,
    setLocation: java.lang.String => scala.Unit,
    setStatus: scala.Double => scala.Unit
  ): RESTAPIResponse = {
    val __obj = js.Dynamic.literal(getStreamWriter = js.Any.fromFunction0(getStreamWriter), setBody = js.Any.fromFunction1(setBody), setContentType = js.Any.fromFunction1(setContentType), setError = js.Any.fromFunction1(setError), setHeader = js.Any.fromFunction2(setHeader), setHeaders = js.Any.fromFunction1(setHeaders), setLocation = js.Any.fromFunction1(setLocation), setStatus = js.Any.fromFunction1(setStatus))
  
    __obj.asInstanceOf[RESTAPIResponse]
  }
}

