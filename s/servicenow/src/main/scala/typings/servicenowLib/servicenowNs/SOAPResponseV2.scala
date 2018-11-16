package typings
package servicenowLib.servicenowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SOAPResponseV2 extends js.Object {
  def getBody(): java.lang.String
  def getErrorCode(): scala.Double
  def getErrorMessage(): java.lang.String
  def getHeader(name: java.lang.String): java.lang.String
  def getHeaders(): js.Object
  def getStatusCode(): scala.Double
  def haveError(): scala.Boolean
  def waitForResponse(timeoutSecs: scala.Double): scala.Unit
}

