package typings.servicenow.snWs

import typings.servicenow.servicenow.SOAPResponseV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SOAPMessageV2 extends js.Object {
  def execute(): SOAPResponseV2
  def executeAsync(): SOAPResponseV2
  def getEndpoint(): String
  def getRequestBody(): String
  def getRequestHeader(headerName: String): String
  def getRequestHeaders(): js.Object
  def setBasicAuth(userName: String, userPass: String): Unit
  def setEccCorrelator(correlator: String): Unit
  def setEccParameter(name: String, value: String): Unit
  def setEndpoint(endpoint: String): Unit
  def setHttpMethod(method: String): Unit
  def setHttpTimeout(timeoutMs: Double): Unit
  def setMIDServer(midServer: String): Unit
  def setMutualAuth(profileName: String): Unit
  def setRequestBody(body: String): Unit
  def setRequestHeader(name: String, value: String): Unit
  def setStringParameter(name: String, value: String): Unit
  def setStringParameterNoEscape(name: String, value: String): Unit
  def setWSSecurity(keystoreId: String, keystoreAlias: String, keystorePassword: String, certificateId: String): Unit
}

object SOAPMessageV2 {
  @scala.inline
  def apply(
    execute: () => SOAPResponseV2,
    executeAsync: () => SOAPResponseV2,
    getEndpoint: () => String,
    getRequestBody: () => String,
    getRequestHeader: String => String,
    getRequestHeaders: () => js.Object,
    setBasicAuth: (String, String) => Unit,
    setEccCorrelator: String => Unit,
    setEccParameter: (String, String) => Unit,
    setEndpoint: String => Unit,
    setHttpMethod: String => Unit,
    setHttpTimeout: Double => Unit,
    setMIDServer: String => Unit,
    setMutualAuth: String => Unit,
    setRequestBody: String => Unit,
    setRequestHeader: (String, String) => Unit,
    setStringParameter: (String, String) => Unit,
    setStringParameterNoEscape: (String, String) => Unit,
    setWSSecurity: (String, String, String, String) => Unit
  ): SOAPMessageV2 = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), executeAsync = js.Any.fromFunction0(executeAsync), getEndpoint = js.Any.fromFunction0(getEndpoint), getRequestBody = js.Any.fromFunction0(getRequestBody), getRequestHeader = js.Any.fromFunction1(getRequestHeader), getRequestHeaders = js.Any.fromFunction0(getRequestHeaders), setBasicAuth = js.Any.fromFunction2(setBasicAuth), setEccCorrelator = js.Any.fromFunction1(setEccCorrelator), setEccParameter = js.Any.fromFunction2(setEccParameter), setEndpoint = js.Any.fromFunction1(setEndpoint), setHttpMethod = js.Any.fromFunction1(setHttpMethod), setHttpTimeout = js.Any.fromFunction1(setHttpTimeout), setMIDServer = js.Any.fromFunction1(setMIDServer), setMutualAuth = js.Any.fromFunction1(setMutualAuth), setRequestBody = js.Any.fromFunction1(setRequestBody), setRequestHeader = js.Any.fromFunction2(setRequestHeader), setStringParameter = js.Any.fromFunction2(setStringParameter), setStringParameterNoEscape = js.Any.fromFunction2(setStringParameterNoEscape), setWSSecurity = js.Any.fromFunction4(setWSSecurity))
    __obj.asInstanceOf[SOAPMessageV2]
  }
}

