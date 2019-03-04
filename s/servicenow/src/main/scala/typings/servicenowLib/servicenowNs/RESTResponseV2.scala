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
    getBody: js.Function0[java.lang.String],
    getCookies: js.Function0[servicenowLib.Anon_Get],
    getErrorCode: js.Function0[scala.Double],
    getErrorMessage: js.Function0[java.lang.String],
    getHeader: js.Function1[java.lang.String, java.lang.String],
    getHeaders: js.Function0[js.Object],
    getQueryString: js.Function0[java.lang.String],
    getResponseAttachmentSysid: js.Function0[java.lang.String],
    getStatusCode: js.Function0[scala.Double],
    haveError: js.Function0[scala.Boolean],
    waitForResponse: js.Function1[scala.Double, scala.Unit]
  ): RESTResponseV2 = {
    val __obj = js.Dynamic.literal(getBody = getBody, getCookies = getCookies, getErrorCode = getErrorCode, getErrorMessage = getErrorMessage, getHeader = getHeader, getHeaders = getHeaders, getQueryString = getQueryString, getResponseAttachmentSysid = getResponseAttachmentSysid, getStatusCode = getStatusCode, haveError = haveError, waitForResponse = waitForResponse)
  
    __obj.asInstanceOf[RESTResponseV2]
  }
}

