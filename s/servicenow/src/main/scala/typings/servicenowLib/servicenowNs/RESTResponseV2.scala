package typings
package servicenowLib.servicenowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RESTResponseV2 extends js.Object {
  def getBody(): java.lang.String
  def getCookies(): servicenowLib.Anon_Get
  def getErrorCode(): scala.Double
  def getErrorMessage(): java.lang.String
  def getHeader(name: java.lang.String): java.lang.String
  def getHeaders(): js.Object
  def getQueryString(): java.lang.String
  def getResponseAttachmentSysid(): java.lang.String
  def getStatusCode(): scala.Double
  def haveError(): scala.Boolean
  def waitForResponse(timeoutSecs: scala.Double): scala.Unit
}

object RESTResponseV2 {
  @scala.inline
  def apply(
    getBody: () => java.lang.String,
    getCookies: () => servicenowLib.Anon_Get,
    getErrorCode: () => scala.Double,
    getErrorMessage: () => java.lang.String,
    getHeader: java.lang.String => java.lang.String,
    getHeaders: () => js.Object,
    getQueryString: () => java.lang.String,
    getResponseAttachmentSysid: () => java.lang.String,
    getStatusCode: () => scala.Double,
    haveError: () => scala.Boolean,
    waitForResponse: scala.Double => scala.Unit
  ): RESTResponseV2 = {
    val __obj = js.Dynamic.literal(getBody = js.Any.fromFunction0(getBody), getCookies = js.Any.fromFunction0(getCookies), getErrorCode = js.Any.fromFunction0(getErrorCode), getErrorMessage = js.Any.fromFunction0(getErrorMessage), getHeader = js.Any.fromFunction1(getHeader), getHeaders = js.Any.fromFunction0(getHeaders), getQueryString = js.Any.fromFunction0(getQueryString), getResponseAttachmentSysid = js.Any.fromFunction0(getResponseAttachmentSysid), getStatusCode = js.Any.fromFunction0(getStatusCode), haveError = js.Any.fromFunction0(haveError), waitForResponse = js.Any.fromFunction1(waitForResponse))
  
    __obj.asInstanceOf[RESTResponseV2]
  }
}

