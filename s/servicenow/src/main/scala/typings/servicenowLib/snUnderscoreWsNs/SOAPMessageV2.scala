package typings
package servicenowLib.snUnderscoreWsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sn_ws.SOAPMessageV2")
@js.native
class SOAPMessageV2 () extends js.Object {
  def this(soapMessage: java.lang.String, soapFunction: java.lang.String) = this()
  def execute(): servicenowLib.servicenowNs.SOAPResponseV2 = js.native
  def executeAsync(): servicenowLib.servicenowNs.SOAPResponseV2 = js.native
  def getEndpoint(): java.lang.String = js.native
  def getRequestBody(): java.lang.String = js.native
  def getRequestHeader(headerName: java.lang.String): java.lang.String = js.native
  def getRequestHeaders(): js.Object = js.native
  def setBasicAuth(userName: java.lang.String, userPass: java.lang.String): scala.Unit = js.native
  def setEccCorrelator(correlator: java.lang.String): scala.Unit = js.native
  def setEccParameter(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setEndpoint(endpoint: java.lang.String): scala.Unit = js.native
  def setHttpMethod(method: java.lang.String): scala.Unit = js.native
  def setHttpTimeout(timeoutMs: scala.Double): scala.Unit = js.native
  def setMIDServer(midServer: java.lang.String): scala.Unit = js.native
  def setMutualAuth(profileName: java.lang.String): scala.Unit = js.native
  def setRequestBody(body: java.lang.String): scala.Unit = js.native
  def setRequestHeader(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setStringParameter(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setStringParameterNoEscape(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setWSSecurity(
    keystoreId: java.lang.String,
    keystoreAlias: java.lang.String,
    keystorePassword: java.lang.String,
    certificateId: java.lang.String
  ): scala.Unit = js.native
}

