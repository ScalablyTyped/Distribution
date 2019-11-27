package typings.slonik.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConfigurationType extends js.Object {
  /** Dictates whether to capture stack trace before executing query. Middlewares access stack trace through query execution context. (Default: true) */
  var captureStackTrace: js.UndefOr[Boolean] = js.undefined
  /** Number of times to retry establishing a new connection. (Default: 3) */
  var connectionRetryLimit: js.UndefOr[Double] = js.undefined
  /** Timeout (in milliseconds) after which an error is raised if cannot cannot be established. (Default: 5000) */
  var connectionTimeout: js.UndefOr[Double] = js.undefined
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
  /**
    * An array of [Slonik type parsers](https://github.com/gajus/slonik#slonik-type-parsers)
    */
  var typeParsers: js.UndefOr[js.Array[TypeParserType[_]]] = js.undefined
}

object ClientConfigurationType {
  @scala.inline
  def apply(
    captureStackTrace: js.UndefOr[Boolean] = js.undefined,
    connectionRetryLimit: Int | Double = null,
    connectionTimeout: Int | Double = null,
    idleTimeout: Int | Double = null,
    interceptors: js.Array[InterceptorType] = null,
    maximumPoolSize: Int | Double = null,
    preferNativeBindings: js.UndefOr[Boolean] = js.undefined,
    typeParsers: js.Array[TypeParserType[_]] = null
  ): ClientConfigurationType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(captureStackTrace)) __obj.updateDynamic("captureStackTrace")(captureStackTrace.asInstanceOf[js.Any])
    if (connectionRetryLimit != null) __obj.updateDynamic("connectionRetryLimit")(connectionRetryLimit.asInstanceOf[js.Any])
    if (connectionTimeout != null) __obj.updateDynamic("connectionTimeout")(connectionTimeout.asInstanceOf[js.Any])
    if (idleTimeout != null) __obj.updateDynamic("idleTimeout")(idleTimeout.asInstanceOf[js.Any])
    if (interceptors != null) __obj.updateDynamic("interceptors")(interceptors.asInstanceOf[js.Any])
    if (maximumPoolSize != null) __obj.updateDynamic("maximumPoolSize")(maximumPoolSize.asInstanceOf[js.Any])
    if (!js.isUndefined(preferNativeBindings)) __obj.updateDynamic("preferNativeBindings")(preferNativeBindings.asInstanceOf[js.Any])
    if (typeParsers != null) __obj.updateDynamic("typeParsers")(typeParsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfigurationType]
  }
}

