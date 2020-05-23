package typings.servicenow.servicenow

import typings.servicenow.anon.Get
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RESTResponseV2 extends js.Object {
  def getBody(): String
  def getCookies(): Get
  def getErrorCode(): Double
  def getErrorMessage(): String
  def getHeader(name: String): String
  def getHeaders(): js.Object
  def getQueryString(): String
  def getResponseAttachmentSysid(): String
  def getStatusCode(): Double
  def haveError(): Boolean
  def waitForResponse(timeoutSecs: Double): Unit
}

object RESTResponseV2 {
  @scala.inline
  def apply(
    getBody: () => String,
    getCookies: () => Get,
    getErrorCode: () => Double,
    getErrorMessage: () => String,
    getHeader: String => String,
    getHeaders: () => js.Object,
    getQueryString: () => String,
    getResponseAttachmentSysid: () => String,
    getStatusCode: () => Double,
    haveError: () => Boolean,
    waitForResponse: Double => Unit
  ): RESTResponseV2 = {
    val __obj = js.Dynamic.literal(getBody = js.Any.fromFunction0(getBody), getCookies = js.Any.fromFunction0(getCookies), getErrorCode = js.Any.fromFunction0(getErrorCode), getErrorMessage = js.Any.fromFunction0(getErrorMessage), getHeader = js.Any.fromFunction1(getHeader), getHeaders = js.Any.fromFunction0(getHeaders), getQueryString = js.Any.fromFunction0(getQueryString), getResponseAttachmentSysid = js.Any.fromFunction0(getResponseAttachmentSysid), getStatusCode = js.Any.fromFunction0(getStatusCode), haveError = js.Any.fromFunction0(haveError), waitForResponse = js.Any.fromFunction1(waitForResponse))
    __obj.asInstanceOf[RESTResponseV2]
  }
}

