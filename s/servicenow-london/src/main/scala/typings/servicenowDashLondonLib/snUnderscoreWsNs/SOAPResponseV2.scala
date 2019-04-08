package typings
package servicenowDashLondonLib.snUnderscoreWsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SOAPResponseV2 extends js.Object {
  def getAllHeaders(): js.Array[servicenowDashLondonLib.Anon_Name]
  def getBody(): java.lang.String
  def getCookies(): servicenowDashLondonLib.Anon_Get
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
    getAllHeaders: () => js.Array[servicenowDashLondonLib.Anon_Name],
    getBody: () => java.lang.String,
    getCookies: () => servicenowDashLondonLib.Anon_Get,
    getErrorCode: () => scala.Double,
    getErrorMessage: () => java.lang.String,
    getHeader: java.lang.String => java.lang.String,
    getHeaders: () => js.Object,
    getStatusCode: () => scala.Double,
    haveError: () => scala.Boolean,
    waitForResponse: scala.Double => scala.Unit
  ): SOAPResponseV2 = {
    val __obj = js.Dynamic.literal(getAllHeaders = js.Any.fromFunction0(getAllHeaders), getBody = js.Any.fromFunction0(getBody), getCookies = js.Any.fromFunction0(getCookies), getErrorCode = js.Any.fromFunction0(getErrorCode), getErrorMessage = js.Any.fromFunction0(getErrorMessage), getHeader = js.Any.fromFunction1(getHeader), getHeaders = js.Any.fromFunction0(getHeaders), getStatusCode = js.Any.fromFunction0(getStatusCode), haveError = js.Any.fromFunction0(haveError), waitForResponse = js.Any.fromFunction1(waitForResponse))
  
    __obj.asInstanceOf[SOAPResponseV2]
  }
}

