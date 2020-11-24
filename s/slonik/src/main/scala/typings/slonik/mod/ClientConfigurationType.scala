package typings.slonik.mod

import typings.slonik.slonikStrings.DISABLE_TIMEOUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientConfigurationType extends js.Object {
  
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
  implicit class ClientConfigurationTypeOps[Self <: ClientConfigurationType] (val x: Self) extends AnyVal {
    
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
    def setCaptureStackTrace(value: Boolean): Self = this.set("captureStackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureStackTrace: Self = this.set("captureStackTrace", js.undefined)
    
    @scala.inline
    def setConnectionRetryLimit(value: Double): Self = this.set("connectionRetryLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionRetryLimit: Self = this.set("connectionRetryLimit", js.undefined)
    
    @scala.inline
    def setConnectionTimeout(value: Double | DISABLE_TIMEOUT): Self = this.set("connectionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionTimeout: Self = this.set("connectionTimeout", js.undefined)
    
    @scala.inline
    def setIdleInTransactionSessionTimeout(value: Double | DISABLE_TIMEOUT): Self = this.set("idleInTransactionSessionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleInTransactionSessionTimeout: Self = this.set("idleInTransactionSessionTimeout", js.undefined)
    
    @scala.inline
    def setIdleTimeout(value: Double): Self = this.set("idleTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleTimeout: Self = this.set("idleTimeout", js.undefined)
    
    @scala.inline
    def setInterceptorsVarargs(value: InterceptorType*): Self = this.set("interceptors", js.Array(value :_*))
    
    @scala.inline
    def setInterceptors(value: js.Array[InterceptorType]): Self = this.set("interceptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterceptors: Self = this.set("interceptors", js.undefined)
    
    @scala.inline
    def setMaximumPoolSize(value: Double): Self = this.set("maximumPoolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumPoolSize: Self = this.set("maximumPoolSize", js.undefined)
    
    @scala.inline
    def setPreferNativeBindings(value: Boolean): Self = this.set("preferNativeBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferNativeBindings: Self = this.set("preferNativeBindings", js.undefined)
    
    @scala.inline
    def setStatementTimeout(value: Double | DISABLE_TIMEOUT): Self = this.set("statementTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatementTimeout: Self = this.set("statementTimeout", js.undefined)
    
    @scala.inline
    def setTypeParsersVarargs(value: TypeParserType[js.Any]*): Self = this.set("typeParsers", js.Array(value :_*))
    
    @scala.inline
    def setTypeParsers(value: js.Array[TypeParserType[_]]): Self = this.set("typeParsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeParsers: Self = this.set("typeParsers", js.undefined)
  }
}
