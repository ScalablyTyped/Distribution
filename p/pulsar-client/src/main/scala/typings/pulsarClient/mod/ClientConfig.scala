package typings.pulsarClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientConfig extends StObject {
  
  var authentication: js.UndefOr[
    AuthenticationTls | AuthenticationAthenz | AuthenticationToken | AuthenticationOauth2
  ] = js.undefined
  
  var concurrentLookupRequest: js.UndefOr[Double] = js.undefined
  
  var ioThreads: js.UndefOr[Double] = js.undefined
  
  var log: js.UndefOr[
    js.Function4[/* level */ LogLevel, /* file */ String, /* line */ Double, /* message */ String, Unit]
  ] = js.undefined
  
  var messageListenerThreads: js.UndefOr[Double] = js.undefined
  
  var operationTimeoutSeconds: js.UndefOr[Double] = js.undefined
  
  var serviceUrl: String
  
  var statsIntervalInSeconds: js.UndefOr[Double] = js.undefined
  
  var tlsAllowInsecureConnection: js.UndefOr[Boolean] = js.undefined
  
  var tlsTrustCertsFilePath: js.UndefOr[String] = js.undefined
  
  var tlsValidateHostname: js.UndefOr[Boolean] = js.undefined
  
  var useTls: js.UndefOr[Boolean] = js.undefined
}
object ClientConfig {
  
  inline def apply(serviceUrl: String): ClientConfig = {
    val __obj = js.Dynamic.literal(serviceUrl = serviceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientConfig] (val x: Self) extends AnyVal {
    
    inline def setAuthentication(value: AuthenticationTls | AuthenticationAthenz | AuthenticationToken | AuthenticationOauth2): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
    
    inline def setConcurrentLookupRequest(value: Double): Self = StObject.set(x, "concurrentLookupRequest", value.asInstanceOf[js.Any])
    
    inline def setConcurrentLookupRequestUndefined: Self = StObject.set(x, "concurrentLookupRequest", js.undefined)
    
    inline def setIoThreads(value: Double): Self = StObject.set(x, "ioThreads", value.asInstanceOf[js.Any])
    
    inline def setIoThreadsUndefined: Self = StObject.set(x, "ioThreads", js.undefined)
    
    inline def setLog(value: (/* level */ LogLevel, /* file */ String, /* line */ Double, /* message */ String) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction4(value))
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setMessageListenerThreads(value: Double): Self = StObject.set(x, "messageListenerThreads", value.asInstanceOf[js.Any])
    
    inline def setMessageListenerThreadsUndefined: Self = StObject.set(x, "messageListenerThreads", js.undefined)
    
    inline def setOperationTimeoutSeconds(value: Double): Self = StObject.set(x, "operationTimeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setOperationTimeoutSecondsUndefined: Self = StObject.set(x, "operationTimeoutSeconds", js.undefined)
    
    inline def setServiceUrl(value: String): Self = StObject.set(x, "serviceUrl", value.asInstanceOf[js.Any])
    
    inline def setStatsIntervalInSeconds(value: Double): Self = StObject.set(x, "statsIntervalInSeconds", value.asInstanceOf[js.Any])
    
    inline def setStatsIntervalInSecondsUndefined: Self = StObject.set(x, "statsIntervalInSeconds", js.undefined)
    
    inline def setTlsAllowInsecureConnection(value: Boolean): Self = StObject.set(x, "tlsAllowInsecureConnection", value.asInstanceOf[js.Any])
    
    inline def setTlsAllowInsecureConnectionUndefined: Self = StObject.set(x, "tlsAllowInsecureConnection", js.undefined)
    
    inline def setTlsTrustCertsFilePath(value: String): Self = StObject.set(x, "tlsTrustCertsFilePath", value.asInstanceOf[js.Any])
    
    inline def setTlsTrustCertsFilePathUndefined: Self = StObject.set(x, "tlsTrustCertsFilePath", js.undefined)
    
    inline def setTlsValidateHostname(value: Boolean): Self = StObject.set(x, "tlsValidateHostname", value.asInstanceOf[js.Any])
    
    inline def setTlsValidateHostnameUndefined: Self = StObject.set(x, "tlsValidateHostname", js.undefined)
    
    inline def setUseTls(value: Boolean): Self = StObject.set(x, "useTls", value.asInstanceOf[js.Any])
    
    inline def setUseTlsUndefined: Self = StObject.set(x, "useTls", js.undefined)
  }
}
