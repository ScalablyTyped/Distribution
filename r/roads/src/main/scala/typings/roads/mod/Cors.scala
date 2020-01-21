package typings.roads.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cors extends js.Object {
  var cacheMaxAge: js.UndefOr[Double] = js.undefined
  var requestHeaders: js.UndefOr[js.Array[String]] = js.undefined
  var responseHeaders: js.UndefOr[js.Array[String]] = js.undefined
  var supportsCredentials: js.UndefOr[Boolean] = js.undefined
  var validMethods: js.UndefOr[js.Array[String]] = js.undefined
  var validOrigins: js.Array[String]
}

object Cors {
  @scala.inline
  def apply(
    validOrigins: js.Array[String],
    cacheMaxAge: Int | Double = null,
    requestHeaders: js.Array[String] = null,
    responseHeaders: js.Array[String] = null,
    supportsCredentials: js.UndefOr[Boolean] = js.undefined,
    validMethods: js.Array[String] = null
  ): Cors = {
    val __obj = js.Dynamic.literal(validOrigins = validOrigins.asInstanceOf[js.Any])
    if (cacheMaxAge != null) __obj.updateDynamic("cacheMaxAge")(cacheMaxAge.asInstanceOf[js.Any])
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders.asInstanceOf[js.Any])
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsCredentials)) __obj.updateDynamic("supportsCredentials")(supportsCredentials.asInstanceOf[js.Any])
    if (validMethods != null) __obj.updateDynamic("validMethods")(validMethods.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cors]
  }
}

