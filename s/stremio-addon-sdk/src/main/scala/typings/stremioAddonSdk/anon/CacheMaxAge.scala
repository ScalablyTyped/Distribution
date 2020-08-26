package typings.stremioAddonSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheMaxAge extends js.Object {
  /**
    * (in seconds) cacheMaxAge means the Cache-Control header being set to max-age=$cacheMaxAge
    */
  var cacheMaxAge: js.UndefOr[Double] = js.native
  var port: js.UndefOr[Double] = js.native
  /**
    * Static directory to serve.
    */
  var static: js.UndefOr[String] = js.native
}

object CacheMaxAge {
  @scala.inline
  def apply(): CacheMaxAge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheMaxAge]
  }
  @scala.inline
  implicit class CacheMaxAgeOps[Self <: CacheMaxAge] (val x: Self) extends AnyVal {
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
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setStatic(value: String): Self = this.set("static", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatic: Self = this.set("static", js.undefined)
  }
  
}

