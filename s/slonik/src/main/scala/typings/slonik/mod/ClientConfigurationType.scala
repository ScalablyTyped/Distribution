package typings.slonik.mod

import typings.slonik.slonikStrings.DISABLE_TIMEOUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientConfigurationType extends StObject {
  
  /** Dictates whether to capture stack trace before executing query. Middlewares access stack trace through query execution context. (Default: true) */
  var captureStackTrace: js.UndefOr[Boolean] = js.native
  
  /** Number of times to retry establishing a new connection. (Default: 3) */
  var connectionRetryLimit: js.UndefOr[Double] = js.native
  
  /** connectionTimeout Timeout (in milliseconds) after which an error is raised if connection cannot cannot be established. (Default: 5000) */
  var connectionTimeout: js.UndefOr[Double | DISABLE_TIMEOUT] = js.native
  
  /** idleInTransactionSessionTimeout Timeout (in milliseconds) after which idle clients are closed. Use 'DISABLE_TIMEOUT' constant to disable the timeout. (Default: 60000) */
  var idleInTransactionSessionTimeout: js.UndefOr[Double | DISABLE_TIMEOUT] = js.native
  
  /** Timeout (in milliseconds) after which idle clients are closed. (Default: 5000) */
  var idleTimeout: js.UndefOr[Double] = js.native
  
  /**
    * An array of [Slonik interceptors](https://github.com/gajus/slonik#slonik-interceptors)
    */
  var interceptors: js.UndefOr[js.Array[InterceptorType]] = js.native
  
  /** Do not allow more than this many connections. (Default: 10) */
  var maximumPoolSize: js.UndefOr[Double] = js.native
  
  /** Uses libpq bindings when `pg-native` module is installed. (Default: true) */
  var preferNativeBindings: js.UndefOr[Boolean] = js.native
  
  /** Timeout (in milliseconds) after which database is instructed to abort the query. Use 'DISABLE_TIMEOUT' constant to disable the timeout. (Default: 60000) */
  var statementTimeout: js.UndefOr[Double | DISABLE_TIMEOUT] = js.native
  
  /**
    * An array of [Slonik type parsers](https://github.com/gajus/slonik#slonik-type-parsers)
    */
  var typeParsers: js.UndefOr[js.Array[TypeParserType[_]]] = js.native
}
object ClientConfigurationType {
  
  @scala.inline
  def apply(): ClientConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientConfigurationType]
  }
  
  @scala.inline
  implicit class ClientConfigurationTypeMutableBuilder[Self <: ClientConfigurationType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptureStackTrace(value: Boolean): Self = StObject.set(x, "captureStackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureStackTraceUndefined: Self = StObject.set(x, "captureStackTrace", js.undefined)
    
    @scala.inline
    def setConnectionRetryLimit(value: Double): Self = StObject.set(x, "connectionRetryLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionRetryLimitUndefined: Self = StObject.set(x, "connectionRetryLimit", js.undefined)
    
    @scala.inline
    def setConnectionTimeout(value: Double | DISABLE_TIMEOUT): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
    
    @scala.inline
    def setIdleInTransactionSessionTimeout(value: Double | DISABLE_TIMEOUT): Self = StObject.set(x, "idleInTransactionSessionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleInTransactionSessionTimeoutUndefined: Self = StObject.set(x, "idleInTransactionSessionTimeout", js.undefined)
    
    @scala.inline
    def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
    
    @scala.inline
    def setInterceptors(value: js.Array[InterceptorType]): Self = StObject.set(x, "interceptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterceptorsUndefined: Self = StObject.set(x, "interceptors", js.undefined)
    
    @scala.inline
    def setInterceptorsVarargs(value: InterceptorType*): Self = StObject.set(x, "interceptors", js.Array(value :_*))
    
    @scala.inline
    def setMaximumPoolSize(value: Double): Self = StObject.set(x, "maximumPoolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumPoolSizeUndefined: Self = StObject.set(x, "maximumPoolSize", js.undefined)
    
    @scala.inline
    def setPreferNativeBindings(value: Boolean): Self = StObject.set(x, "preferNativeBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferNativeBindingsUndefined: Self = StObject.set(x, "preferNativeBindings", js.undefined)
    
    @scala.inline
    def setStatementTimeout(value: Double | DISABLE_TIMEOUT): Self = StObject.set(x, "statementTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementTimeoutUndefined: Self = StObject.set(x, "statementTimeout", js.undefined)
    
    @scala.inline
    def setTypeParsers(value: js.Array[TypeParserType[_]]): Self = StObject.set(x, "typeParsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParsersUndefined: Self = StObject.set(x, "typeParsers", js.undefined)
    
    @scala.inline
    def setTypeParsersVarargs(value: TypeParserType[js.Any]*): Self = StObject.set(x, "typeParsers", js.Array(value :_*))
  }
}
