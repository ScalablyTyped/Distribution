package typings.servicenowDashLondon.snUnderscoreWsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sn_ws.SOAPMessageV2")
@js.native
class SOAPMessageV2 () extends js.Object {
  def this(soapMessage: String, soapFunction: String) = this()
  def execute(): SOAPResponseV2 = js.native
  def executeAsync(): SOAPResponseV2 = js.native
  def getEndpoint(): String = js.native
  def getRequestBody(): String = js.native
  def getRequestHeader(headerName: String): String = js.native
  def getRequestHeaders(): js.Object = js.native
  def setBasicAuth(userName: String, userPass: String): Unit = js.native
  def setEccCorrelator(correlator: String): Unit = js.native
  def setEccParameter(name: String, value: String): Unit = js.native
  def setEndpoint(endpoint: String): Unit = js.native
  def setHttpMethod(method: String): Unit = js.native
  def setHttpTimeout(timeoutMs: Double): Unit = js.native
  def setMIDServer(midServer: String): Unit = js.native
  def setMutualAuth(profileName: String): Unit = js.native
  def setRequestBody(body: String): Unit = js.native
  def setRequestHeader(name: String, value: String): Unit = js.native
  def setSOAPAction(soapAction: String): Unit = js.native
  def setStringParameter(name: String, value: String): Unit = js.native
  def setStringParameterNoEscape(name: String, value: String): Unit = js.native
  def setWSSecurity(keystoreId: String, keystoreAlias: String, keystorePassword: String, certificateId: String): Unit = js.native
}

