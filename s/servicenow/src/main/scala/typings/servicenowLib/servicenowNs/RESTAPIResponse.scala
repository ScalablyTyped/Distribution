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

