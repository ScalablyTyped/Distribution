package typings.stremioAddonSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCacheMaxAge extends js.Object {
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

object AnonCacheMaxAge {
  @scala.inline
  def apply(cacheMaxAge: Int | Double = null, port: Int | Double = null, static: String = null): AnonCacheMaxAge = {
    val __obj = js.Dynamic.literal()
    if (cacheMaxAge != null) __obj.updateDynamic("cacheMaxAge")(cacheMaxAge.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (static != null) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCacheMaxAge]
  }
}

