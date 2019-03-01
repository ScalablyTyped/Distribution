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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBody")(getBody)
    __obj.updateDynamic("getCookies")(getCookies)
    __obj.updateDynamic("getErrorCode")(getErrorCode)
    __obj.updateDynamic("getErrorMessage")(getErrorMessage)
    __obj.updateDynamic("getHeader")(getHeader)
    __obj.updateDynamic("getHeaders")(getHeaders)
    __obj.updateDynamic("getQueryString")(getQueryString)
    __obj.updateDynamic("getResponseAttachmentSysid")(getResponseAttachmentSysid)
    __obj.updateDynamic("getStatusCode")(getStatusCode)
    __obj.updateDynamic("haveError")(haveError)
    __obj.updateDynamic("waitForResponse")(waitForResponse)
    __obj.asInstanceOf[RESTResponseV2]
  }
}

