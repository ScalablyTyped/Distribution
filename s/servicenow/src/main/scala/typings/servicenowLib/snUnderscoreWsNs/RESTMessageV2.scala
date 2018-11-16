package typings
package servicenowLib.snUnderscoreWsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sn_ws.RESTMessageV2")
@js.native
class RESTMessageV2 () extends js.Object {
  def this(name: java.lang.String, methodName: servicenowLib.servicenowNs.RestHTTPMethods) = this()
  def execute(): servicenowLib.servicenowNs.RESTResponseV2 = js.native
  def executeAsync(): servicenowLib.servicenowNs.RESTResponseV2 = js.native
  def getEndpoint(): java.lang.String = js.native
  def getRequestBody(): java.lang.String = js.native
  def getRequestHeader(headerName: java.lang.String): java.lang.String = js.native
  def getRequestHeaders(): js.Object = js.native
  def saveResponseBodyAsAttachment(tableName: java.lang.String, recordSysId: java.lang.String, fileName: java.lang.String): scala.Unit = js.native
  def saveResponseBodyAsAttachment(
    tableName: java.lang.String,
    recordSysId: java.lang.String,
    fileName: java.lang.String,
    encryptContext: java.lang.String
  ): scala.Unit = js.native
  def setAuthenticationProfile(`type`: java.lang.String, profileId: java.lang.String): scala.Unit = js.native
  def setBasicAuth(userName: java.lang.String, userPass: java.lang.String): scala.Unit = js.native
  def setEccCorrelator(correlator: java.lang.String): scala.Unit = js.native
  def setEccParameter(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setEndpoint(endpoint: java.lang.String): scala.Unit = js.native
  def setHttpMethod(method: servicenowLib.servicenowNs.RestHTTPMethods): scala.Unit = js.native
  def setHttpTimeout(timeoutMs: scala.Double): scala.Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_all(level: servicenowLib.servicenowLibStrings.all): scala.Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_basic(level: servicenowLib.servicenowLibStrings.basic): scala.Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_elevated(level: servicenowLib.servicenowLibStrings.elevated): scala.Unit = js.native
  def setMIDServer(midServer: java.lang.String): scala.Unit = js.native
  def setMutualAuth(profileName: java.lang.String): scala.Unit = js.native
  def setQueryParameter(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setRequestBody(body: java.lang.String): scala.Unit = js.native
  def setRequestBodyFromAttachment(sys_id: java.lang.String): scala.Unit = js.native
  def setRequestBodyFromStream(stream: js.Object): scala.Unit = js.native
  def setRequestHeader(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setRequestorProfile(requestorContext: java.lang.String, requestorId: java.lang.String): scala.Unit = js.native
  def setStringParameter(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setStringParameterNoEscape(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
}

