package typings.roads

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCacheMaxAge extends js.Object {
  var cacheMaxAge: js.UndefOr[Double] = js.undefined
  var requestHeaders: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var responseHeaders: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var supportsCredentials: js.UndefOr[Boolean] = js.undefined
  var validMethods: js.UndefOr[js.Array[String]] = js.undefined
  var validOrigins: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonCacheMaxAge {
  @scala.inline
  def apply(
    cacheMaxAge: Int | Double = null,
    requestHeaders: StringDictionary[js.Any] = null,
    responseHeaders: StringDictionary[js.Any] = null,
    supportsCredentials: js.UndefOr[Boolean] = js.undefined,
    validMethods: js.Array[String] = null,
    validOrigins: js.Array[String] = null
  ): AnonCacheMaxAge = {
    val __obj = js.Dynamic.literal()
    if (cacheMaxAge != null) __obj.updateDynamic("cacheMaxAge")(cacheMaxAge.asInstanceOf[js.Any])
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders.asInstanceOf[js.Any])
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsCredentials)) __obj.updateDynamic("supportsCredentials")(supportsCredentials.asInstanceOf[js.Any])
    if (validMethods != null) __obj.updateDynamic("validMethods")(validMethods.asInstanceOf[js.Any])
    if (validOrigins != null) __obj.updateDynamic("validOrigins")(validOrigins.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCacheMaxAge]
  }
}

