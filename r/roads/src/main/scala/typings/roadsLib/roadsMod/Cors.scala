package typings
package roadsLib.roadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cors extends js.Object {
  var cacheMaxAge: js.UndefOr[scala.Double] = js.undefined
  var requestHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var responseHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var supportsCredentials: js.UndefOr[scala.Boolean] = js.undefined
  var validMethods: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var validOrigins: js.Array[java.lang.String]
}

object Cors {
  @scala.inline
  def apply(
    validOrigins: js.Array[java.lang.String],
    cacheMaxAge: scala.Int | scala.Double = null,
    requestHeaders: js.Array[java.lang.String] = null,
    responseHeaders: js.Array[java.lang.String] = null,
    supportsCredentials: js.UndefOr[scala.Boolean] = js.undefined,
    validMethods: js.Array[java.lang.String] = null
  ): Cors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("validOrigins")(validOrigins)
    if (cacheMaxAge != null) __obj.updateDynamic("cacheMaxAge")(cacheMaxAge.asInstanceOf[js.Any])
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    if (!js.isUndefined(supportsCredentials)) __obj.updateDynamic("supportsCredentials")(supportsCredentials)
    if (validMethods != null) __obj.updateDynamic("validMethods")(validMethods)
    __obj.asInstanceOf[Cors]
  }
}

