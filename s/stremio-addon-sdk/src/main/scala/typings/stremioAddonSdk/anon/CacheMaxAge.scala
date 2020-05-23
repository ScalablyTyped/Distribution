package typings.stremioAddonSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheMaxAge extends js.Object {
  /**
    * (in seconds) cacheMaxAge means the Cache-Control header being set to max-age=$cacheMaxAge
    */
  var cacheMaxAge: js.UndefOr[Double] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  /**
    * Static directory to serve.
    */
  var static: js.UndefOr[String] = js.undefined
}

object CacheMaxAge {
  @scala.inline
  def apply(
    cacheMaxAge: js.UndefOr[Double] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    static: String = null
  ): CacheMaxAge = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheMaxAge)) __obj.updateDynamic("cacheMaxAge")(cacheMaxAge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (static != null) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheMaxAge]
  }
}

