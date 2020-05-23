package typings.slonik.mod

import typings.slonik.slonikStrings.DISABLE_TIMEOUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConfigurationType extends js.Object {
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
  var typeParsers: js.UndefOr[js.Array[TypeParserType[_]]] = js.undefined
}

object ClientConfigurationType {
  @scala.inline
  def apply(
    captureStackTrace: js.UndefOr[Boolean] = js.undefined,
    connectionRetryLimit: js.UndefOr[Double] = js.undefined,
    connectionTimeout: Double | DISABLE_TIMEOUT = null,
    idleInTransactionSessionTimeout: Double | DISABLE_TIMEOUT = null,
    idleTimeout: js.UndefOr[Double] = js.undefined,
    interceptors: js.Array[InterceptorType] = null,
    maximumPoolSize: js.UndefOr[Double] = js.undefined,
    preferNativeBindings: js.UndefOr[Boolean] = js.undefined,
    statementTimeout: Double | DISABLE_TIMEOUT = null,
    typeParsers: js.Array[TypeParserType[_]] = null
  ): ClientConfigurationType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(captureStackTrace)) __obj.updateDynamic("captureStackTrace")(captureStackTrace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionRetryLimit)) __obj.updateDynamic("connectionRetryLimit")(connectionRetryLimit.get.asInstanceOf[js.Any])
    if (connectionTimeout != null) __obj.updateDynamic("connectionTimeout")(connectionTimeout.asInstanceOf[js.Any])
    if (idleInTransactionSessionTimeout != null) __obj.updateDynamic("idleInTransactionSessionTimeout")(idleInTransactionSessionTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(idleTimeout)) __obj.updateDynamic("idleTimeout")(idleTimeout.get.asInstanceOf[js.Any])
    if (interceptors != null) __obj.updateDynamic("interceptors")(interceptors.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumPoolSize)) __obj.updateDynamic("maximumPoolSize")(maximumPoolSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preferNativeBindings)) __obj.updateDynamic("preferNativeBindings")(preferNativeBindings.get.asInstanceOf[js.Any])
    if (statementTimeout != null) __obj.updateDynamic("statementTimeout")(statementTimeout.asInstanceOf[js.Any])
    if (typeParsers != null) __obj.updateDynamic("typeParsers")(typeParsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfigurationType]
  }
}

