package typings.slonik.mod

import typings.slonik.slonikStrings.DISABLE_TIMEOUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientConfigurationType extends StObject {
  
  /** Dictates whether to capture stack trace before executing query. Middlewares access stack trace through query execution context. (Default: true) */
  var captureStackTrace: js.UndefOr[Boolean] = js.undefined
  
  /** Number of times to retry establishing a new connection. (Default: 3) */
  var connectionRetryLimit: js.UndefOr[Double] = js.undefined
  
  /** connectionTimeout Timeout (in milliseconds) after which an error is raised if connection cannot cannot be established. (Default: 5000) */
  var connectionTimeout: js.UndefOr[Double | DISABLE_TIMEOUT] = js.undefined
  
  /** idleInTransactionSessionTimeout Timeout (in milliseconds) after which idle clients are closed. Use 'DISABLE_TIMEOUT' constant to disable the timeout. (Default: 60000) */
  var idleInTransactionSessionTimeout: js.UndefOr[Double | DISABLE_TIMEOUT] = js.undefined
  
  /** Timeout (in milliseconds) after which idle clients are closed. (Default: 5000) */
  var idleTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * An array of [Slonik interceptors](https://github.com/gajus/slonik#slonik-interceptors)
    */
  var interceptors: js.UndefOr[js.Array[InterceptorType]] = js.undefined
  
  /** Do not allow more than this many connections. (Default: 10) */
  var maximumPoolSize: js.UndefOr[Double] = js.undefined
  
  /** Uses libpq bindings when `pg-native` module is installed. (Default: true) */
  var preferNativeBindings: js.UndefOr[Boolean] = js.undefined
  
  /** Timeout (in milliseconds) after which database is instructed to abort the query. Use 'DISABLE_TIMEOUT' constant to disable the timeout. (Default: 60000) */
  var statementTimeout: js.UndefOr[Double | DISABLE_TIMEOUT] = js.undefined
  
  /**
    * An array of [Slonik type parsers](https://github.com/gajus/slonik#slonik-type-parsers)
    */
  var typeParsers: js.UndefOr[js.Array[TypeParserType[js.Any]]] = js.undefined
}
object ClientConfigurationType {
  
  inline def apply(): ClientConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientConfigurationType]
  }
  
  extension [Self <: ClientConfigurationType](x: Self) {
    
    inline def setCaptureStackTrace(value: Boolean): Self = StObject.set(x, "captureStackTrace", value.asInstanceOf[js.Any])
    
    inline def setCaptureStackTraceUndefined: Self = StObject.set(x, "captureStackTrace", js.undefined)
    
    inline def setConnectionRetryLimit(value: Double): Self = StObject.set(x, "connectionRetryLimit", value.asInstanceOf[js.Any])
    
    inline def setConnectionRetryLimitUndefined: Self = StObject.set(x, "connectionRetryLimit", js.undefined)
    
    inline def setConnectionTimeout(value: Double | DISABLE_TIMEOUT): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
    
    inline def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
    
    inline def setIdleInTransactionSessionTimeout(value: Double | DISABLE_TIMEOUT): Self = StObject.set(x, "idleInTransactionSessionTimeout", value.asInstanceOf[js.Any])
    
    inline def setIdleInTransactionSessionTimeoutUndefined: Self = StObject.set(x, "idleInTransactionSessionTimeout", js.undefined)
    
    inline def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
    
    inline def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
    
    inline def setInterceptors(value: js.Array[InterceptorType]): Self = StObject.set(x, "interceptors", value.asInstanceOf[js.Any])
    
    inline def setInterceptorsUndefined: Self = StObject.set(x, "interceptors", js.undefined)
    
    inline def setInterceptorsVarargs(value: InterceptorType*): Self = StObject.set(x, "interceptors", js.Array(value :_*))
    
    inline def setMaximumPoolSize(value: Double): Self = StObject.set(x, "maximumPoolSize", value.asInstanceOf[js.Any])
    
    inline def setMaximumPoolSizeUndefined: Self = StObject.set(x, "maximumPoolSize", js.undefined)
    
    inline def setPreferNativeBindings(value: Boolean): Self = StObject.set(x, "preferNativeBindings", value.asInstanceOf[js.Any])
    
    inline def setPreferNativeBindingsUndefined: Self = StObject.set(x, "preferNativeBindings", js.undefined)
    
    inline def setStatementTimeout(value: Double | DISABLE_TIMEOUT): Self = StObject.set(x, "statementTimeout", value.asInstanceOf[js.Any])
    
    inline def setStatementTimeoutUndefined: Self = StObject.set(x, "statementTimeout", js.undefined)
    
    inline def setTypeParsers(value: js.Array[TypeParserType[js.Any]]): Self = StObject.set(x, "typeParsers", value.asInstanceOf[js.Any])
    
    inline def setTypeParsersUndefined: Self = StObject.set(x, "typeParsers", js.undefined)
    
    inline def setTypeParsersVarargs(value: TypeParserType[js.Any]*): Self = StObject.set(x, "typeParsers", js.Array(value :_*))
  }
}
