package typings.servicenow.servicenowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SOAPResponseV2 extends js.Object {
  def getBody(): String
  def getErrorCode(): Double
  def getErrorMessage(): String
  def getHeader(name: String): String
  def getHeaders(): js.Object
  def getStatusCode(): Double
  def haveError(): Boolean
  def waitForResponse(timeoutSecs: Double): Unit
}

object SOAPResponseV2 {
  @scala.inline
  def apply(
    getBody: () => String,
    getErrorCode: () => Double,
    getErrorMessage: () => String,
    getHeader: String => String,
    getHeaders: () => js.Object,
    getStatusCode: () => Double,
    haveError: () => Boolean,
    waitForResponse: Double => Unit
  ): SOAPResponseV2 = {
    val __obj = js.Dynamic.literal(getBody = js.Any.fromFunction0(getBody), getErrorCode = js.Any.fromFunction0(getErrorCode), getErrorMessage = js.Any.fromFunction0(getErrorMessage), getHeader = js.Any.fromFunction1(getHeader), getHeaders = js.Any.fromFunction0(getHeaders), getStatusCode = js.Any.fromFunction0(getStatusCode), haveError = js.Any.fromFunction0(haveError), waitForResponse = js.Any.fromFunction1(waitForResponse))
  
    __obj.asInstanceOf[SOAPResponseV2]
  }
}

