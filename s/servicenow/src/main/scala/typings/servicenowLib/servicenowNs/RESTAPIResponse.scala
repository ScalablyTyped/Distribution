package typings
package servicenowLib.servicenowNs

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
    getStreamWriter: js.Function0[RESTAPIResponseStream],
    setBody: js.Function1[js.Any, scala.Unit],
    setContentType: js.Function1[java.lang.String, scala.Unit],
    setError: js.Function1[js.Any, scala.Unit],
    setHeader: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setHeaders: js.Function1[js.Any, scala.Unit],
    setLocation: js.Function1[java.lang.String, scala.Unit],
    setStatus: js.Function1[scala.Double, scala.Unit]
  ): RESTAPIResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStreamWriter")(getStreamWriter)
    __obj.updateDynamic("setBody")(setBody)
    __obj.updateDynamic("setContentType")(setContentType)
    __obj.updateDynamic("setError")(setError)
    __obj.updateDynamic("setHeader")(setHeader)
    __obj.updateDynamic("setHeaders")(setHeaders)
    __obj.updateDynamic("setLocation")(setLocation)
    __obj.updateDynamic("setStatus")(setStatus)
    __obj.asInstanceOf[RESTAPIResponse]
  }
}

