package typings.stremioAddonSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resolving object can also include the following cache related properties
  */
@js.native
trait Cache extends js.Object {
  /**
    * (in seconds) sets the Cache-Control header to max-age=$cacheMaxAge
    * and overwrites the global cache time set in serveHTTP options.
    */
  var cacheMaxAge: js.UndefOr[Double] = js.native
  /**
    * (in seconds) sets the Cache-Control header to stale-if-error=$staleError.
    */
  var staleError: js.UndefOr[Double] = js.native
  /**
    * (in seconds) sets the Cache-Control header to stale-while-revalidate=$staleRevalidate.
    */
  var staleRevalidate: js.UndefOr[Double] = js.native
}

object Cache {
  @scala.inline
  def apply(): Cache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cache]
  }
  @scala.inline
  implicit class CacheOps[Self <: Cache] (val x: Self) extends AnyVal {
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
    def setCacheMaxAge(value: Double): Self = this.set("cacheMaxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheMaxAge: Self = this.set("cacheMaxAge", js.undefined)
    @scala.inline
    def setStaleError(value: Double): Self = this.set("staleError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaleError: Self = this.set("staleError", js.undefined)
    @scala.inline
    def setStaleRevalidate(value: Double): Self = this.set("staleRevalidate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaleRevalidate: Self = this.set("staleRevalidate", js.undefined)
  }
  
}

