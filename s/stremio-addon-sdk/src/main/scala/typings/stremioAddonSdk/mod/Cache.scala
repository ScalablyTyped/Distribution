package typings.stremioAddonSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resolving object can also include the following cache related properties
  */
trait Cache extends js.Object {
  /**
    * (in seconds) sets the Cache-Control header to max-age=$cacheMaxAge
    * and overwrites the global cache time set in serveHTTP options.
    */
  var cacheMaxAge: js.UndefOr[Double] = js.undefined
  /**
    * (in seconds) sets the Cache-Control header to stale-if-error=$staleError.
    */
  var staleError: js.UndefOr[Double] = js.undefined
  /**
    * (in seconds) sets the Cache-Control header to stale-while-revalidate=$staleRevalidate.
    */
  var staleRevalidate: js.UndefOr[Double] = js.undefined
}

object Cache {
  @scala.inline
  def apply(
    cacheMaxAge: Int | Double = null,
    staleError: Int | Double = null,
    staleRevalidate: Int | Double = null
  ): Cache = {
    val __obj = js.Dynamic.literal()
    if (cacheMaxAge != null) __obj.updateDynamic("cacheMaxAge")(cacheMaxAge.asInstanceOf[js.Any])
    if (staleError != null) __obj.updateDynamic("staleError")(staleError.asInstanceOf[js.Any])
    if (staleRevalidate != null) __obj.updateDynamic("staleRevalidate")(staleRevalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache]
  }
}

