package typings.servicenow.snWs

import typings.servicenow.servicenow.SOAPResponseV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SOAPMessageV2 extends js.Object {
  
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
  
  def setStringParameter(name: String, value: String): Unit = js.native
  
  def setStringParameterNoEscape(name: String, value: String): Unit = js.native
  
  def setWSSecurity(keystoreId: String, keystoreAlias: String, keystorePassword: String, certificateId: String): Unit = js.native
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
  
  @scala.inline
  implicit class SOAPMessageV2Ops[Self <: SOAPMessageV2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExecute(value: () => SOAPResponseV2): Self = this.set("execute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExecuteAsync(value: () => SOAPResponseV2): Self = this.set("executeAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEndpoint(value: () => String): Self = this.set("getEndpoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRequestBody(value: () => String): Self = this.set("getRequestBody", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRequestHeader(value: String => String): Self = this.set("getRequestHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRequestHeaders(value: () => js.Object): Self = this.set("getRequestHeaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetBasicAuth(value: (String, String) => Unit): Self = this.set("setBasicAuth", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetEccCorrelator(value: String => Unit): Self = this.set("setEccCorrelator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEccParameter(value: (String, String) => Unit): Self = this.set("setEccParameter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetEndpoint(value: String => Unit): Self = this.set("setEndpoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHttpMethod(value: String => Unit): Self = this.set("setHttpMethod", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHttpTimeout(value: Double => Unit): Self = this.set("setHttpTimeout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMIDServer(value: String => Unit): Self = this.set("setMIDServer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMutualAuth(value: String => Unit): Self = this.set("setMutualAuth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRequestBody(value: String => Unit): Self = this.set("setRequestBody", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRequestHeader(value: (String, String) => Unit): Self = this.set("setRequestHeader", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetStringParameter(value: (String, String) => Unit): Self = this.set("setStringParameter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetStringParameterNoEscape(value: (String, String) => Unit): Self = this.set("setStringParameterNoEscape", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetWSSecurity(value: (String, String, String, String) => Unit): Self = this.set("setWSSecurity", js.Any.fromFunction4(value))
  }
}
