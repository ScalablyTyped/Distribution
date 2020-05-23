package typings.servicenow.snWs

import typings.servicenow.servicenow.RESTResponseV2
import typings.servicenow.servicenow.RestHTTPMethods
import typings.servicenow.servicenowStrings.all
import typings.servicenow.servicenowStrings.basic
import typings.servicenow.servicenowStrings.elevated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RESTMessageV2 extends js.Object {
  def execute(): RESTResponseV2 = js.native
  def executeAsync(): RESTResponseV2 = js.native
  def getEndpoint(): String = js.native
  def getRequestBody(): String = js.native
  def getRequestHeader(headerName: String): String = js.native
  def getRequestHeaders(): js.Object = js.native
  def saveResponseBodyAsAttachment(tableName: String, recordSysId: String, fileName: String): Unit = js.native
  def saveResponseBodyAsAttachment(tableName: String, recordSysId: String, fileName: String, encryptContext: String): Unit = js.native
  def setAuthenticationProfile(`type`: String, profileId: String): Unit = js.native
  def setBasicAuth(userName: String, userPass: String): Unit = js.native
  def setEccCorrelator(correlator: String): Unit = js.native
  def setEccParameter(name: String, value: String): Unit = js.native
  def setEndpoint(endpoint: String): Unit = js.native
  def setHttpMethod(method: RestHTTPMethods): Unit = js.native
  def setHttpTimeout(timeoutMs: Double): Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_all(level: all): Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_basic(level: basic): Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_elevated(level: elevated): Unit = js.native
  def setMIDServer(midServer: String): Unit = js.native
  def setMutualAuth(profileName: String): Unit = js.native
  def setQueryParameter(name: String, value: String): Unit = js.native
  def setRequestBody(body: String): Unit = js.native
  def setRequestBodyFromAttachment(sys_id: String): Unit = js.native
  def setRequestBodyFromStream(stream: js.Object): Unit = js.native
  def setRequestHeader(name: String, value: String): Unit = js.native
  def setRequestorProfile(requestorContext: String, requestorId: String): Unit = js.native
  def setStringParameter(name: String, value: String): Unit = js.native
  def setStringParameterNoEscape(name: String, value: String): Unit = js.native
}

