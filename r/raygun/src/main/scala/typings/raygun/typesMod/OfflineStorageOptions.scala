package typings.raygun.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfflineStorageOptions extends js.Object {
  var cacheLimit: js.UndefOr[Double] = js.native
  var cachePath: String = js.native
}

object OfflineStorageOptions {
  @scala.inline
  def apply(cachePath: String): OfflineStorageOptions = {
    val __obj = js.Dynamic.literal(cachePath = cachePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineStorageOptions]
  }
  @scala.inline
  implicit class OfflineStorageOptionsOps[Self <: OfflineStorageOptions] (val x: Self) extends AnyVal {
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
    def setCachePath(value: String): Self = this.set("cachePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheLimit(value: Double): Self = this.set("cacheLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheLimit: Self = this.set("cacheLimit", js.undefined)
  }
  
}

