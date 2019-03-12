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

object SOAPResponseV2 {
  @scala.inline
  def apply(
    getBody: () => java.lang.String,
    getErrorCode: () => scala.Double,
    getErrorMessage: () => java.lang.String,
    getHeader: java.lang.String => java.lang.String,
    getHeaders: () => js.Object,
    getStatusCode: () => scala.Double,
    haveError: () => scala.Boolean,
    waitForResponse: scala.Double => scala.Unit
  ): SOAPResponseV2 = {
    val __obj = js.Dynamic.literal(getBody = js.Any.fromFunction0(getBody), getErrorCode = js.Any.fromFunction0(getErrorCode), getErrorMessage = js.Any.fromFunction0(getErrorMessage), getHeader = js.Any.fromFunction1(getHeader), getHeaders = js.Any.fromFunction0(getHeaders), getStatusCode = js.Any.fromFunction0(getStatusCode), haveError = js.Any.fromFunction0(haveError), waitForResponse = js.Any.fromFunction1(waitForResponse))
  
    __obj.asInstanceOf[SOAPResponseV2]
  }
}

