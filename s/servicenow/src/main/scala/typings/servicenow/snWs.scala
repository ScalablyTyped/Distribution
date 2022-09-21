package typings.servicenow

import typings.servicenow.servicenow.RESTResponseV2
import typings.servicenow.servicenow.RestHTTPMethods
import typings.servicenow.servicenow.SOAPResponseV2
import typings.servicenow.servicenowStrings.all
import typings.servicenow.servicenowStrings.basic
import typings.servicenow.servicenowStrings.elevated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snWs {
  
  @js.native
  trait RESTMessageV2 extends StObject {
    
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
    
    def setLogLevel(level: basic | elevated | all): Unit = js.native
    
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
  
  trait SOAPMessageV2 extends StObject {
    
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
    
    inline def apply(
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
    
    extension [Self <: SOAPMessageV2](x: Self) {
      
      inline def setExecute(value: () => SOAPResponseV2): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
      
      inline def setExecuteAsync(value: () => SOAPResponseV2): Self = StObject.set(x, "executeAsync", js.Any.fromFunction0(value))
      
      inline def setGetEndpoint(value: () => String): Self = StObject.set(x, "getEndpoint", js.Any.fromFunction0(value))
      
      inline def setGetRequestBody(value: () => String): Self = StObject.set(x, "getRequestBody", js.Any.fromFunction0(value))
      
      inline def setGetRequestHeader(value: String => String): Self = StObject.set(x, "getRequestHeader", js.Any.fromFunction1(value))
      
      inline def setGetRequestHeaders(value: () => js.Object): Self = StObject.set(x, "getRequestHeaders", js.Any.fromFunction0(value))
      
      inline def setSetBasicAuth(value: (String, String) => Unit): Self = StObject.set(x, "setBasicAuth", js.Any.fromFunction2(value))
      
      inline def setSetEccCorrelator(value: String => Unit): Self = StObject.set(x, "setEccCorrelator", js.Any.fromFunction1(value))
      
      inline def setSetEccParameter(value: (String, String) => Unit): Self = StObject.set(x, "setEccParameter", js.Any.fromFunction2(value))
      
      inline def setSetEndpoint(value: String => Unit): Self = StObject.set(x, "setEndpoint", js.Any.fromFunction1(value))
      
      inline def setSetHttpMethod(value: String => Unit): Self = StObject.set(x, "setHttpMethod", js.Any.fromFunction1(value))
      
      inline def setSetHttpTimeout(value: Double => Unit): Self = StObject.set(x, "setHttpTimeout", js.Any.fromFunction1(value))
      
      inline def setSetMIDServer(value: String => Unit): Self = StObject.set(x, "setMIDServer", js.Any.fromFunction1(value))
      
      inline def setSetMutualAuth(value: String => Unit): Self = StObject.set(x, "setMutualAuth", js.Any.fromFunction1(value))
      
      inline def setSetRequestBody(value: String => Unit): Self = StObject.set(x, "setRequestBody", js.Any.fromFunction1(value))
      
      inline def setSetRequestHeader(value: (String, String) => Unit): Self = StObject.set(x, "setRequestHeader", js.Any.fromFunction2(value))
      
      inline def setSetStringParameter(value: (String, String) => Unit): Self = StObject.set(x, "setStringParameter", js.Any.fromFunction2(value))
      
      inline def setSetStringParameterNoEscape(value: (String, String) => Unit): Self = StObject.set(x, "setStringParameterNoEscape", js.Any.fromFunction2(value))
      
      inline def setSetWSSecurity(value: (String, String, String, String) => Unit): Self = StObject.set(x, "setWSSecurity", js.Any.fromFunction4(value))
    }
  }
}
