package typings.restifyCorsMiddleware.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** user defined headers to allow */
  var allowHeaders: js.Array[String]
  /** if true, uses creds */
  var credentials: js.UndefOr[Boolean] = js.undefined
  /** user defined headers to expose */
  var exposeHeaders: js.Array[String]
  /**
    * an array of whitelisted origins
    * can be both strings and regular expressions
    */
  var origins: js.Array[String | RegExp]
  /** ms to cache preflight requests */
  var preflightMaxAge: js.UndefOr[Double] = js.undefined
  /** customize preflight request handling */
  var preflightStrategy: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowHeaders: js.Array[String],
    exposeHeaders: js.Array[String],
    origins: js.Array[String | RegExp],
    credentials: js.UndefOr[Boolean] = js.undefined,
    preflightMaxAge: Int | Double = null,
    preflightStrategy: js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal(allowHeaders = allowHeaders.asInstanceOf[js.Any], exposeHeaders = exposeHeaders.asInstanceOf[js.Any], origins = origins.asInstanceOf[js.Any])
    if (!js.isUndefined(credentials)) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (preflightMaxAge != null) __obj.updateDynamic("preflightMaxAge")(preflightMaxAge.asInstanceOf[js.Any])
    if (preflightStrategy != null) __obj.updateDynamic("preflightStrategy")(preflightStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

