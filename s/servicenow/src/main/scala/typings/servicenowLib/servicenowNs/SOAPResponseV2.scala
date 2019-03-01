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
    getBody: js.Function0[java.lang.String],
    getErrorCode: js.Function0[scala.Double],
    getErrorMessage: js.Function0[java.lang.String],
    getHeader: js.Function1[java.lang.String, java.lang.String],
    getHeaders: js.Function0[js.Object],
    getStatusCode: js.Function0[scala.Double],
    haveError: js.Function0[scala.Boolean],
    waitForResponse: js.Function1[scala.Double, scala.Unit]
  ): SOAPResponseV2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBody")(getBody)
    __obj.updateDynamic("getErrorCode")(getErrorCode)
    __obj.updateDynamic("getErrorMessage")(getErrorMessage)
    __obj.updateDynamic("getHeader")(getHeader)
    __obj.updateDynamic("getHeaders")(getHeaders)
    __obj.updateDynamic("getStatusCode")(getStatusCode)
    __obj.updateDynamic("haveError")(haveError)
    __obj.updateDynamic("waitForResponse")(waitForResponse)
    __obj.asInstanceOf[SOAPResponseV2]
  }
}

