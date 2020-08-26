package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheQueryOptions extends js.Object {
  var ignoreMethod: js.UndefOr[scala.Boolean] = js.native
  var ignoreSearch: js.UndefOr[scala.Boolean] = js.native
  var ignoreVary: js.UndefOr[scala.Boolean] = js.native
}

object CacheQueryOptions {
  @scala.inline
  def apply(): CacheQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheQueryOptions]
  }
  @scala.inline
  implicit class CacheQueryOptionsOps[Self <: CacheQueryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIgnoreMethod(value: scala.Boolean): Self = this.set("ignoreMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreMethod: Self = this.set("ignoreMethod", js.undefined)
    @scala.inline
    def setIgnoreSearch(value: scala.Boolean): Self = this.set("ignoreSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreSearch: Self = this.set("ignoreSearch", js.undefined)
    @scala.inline
    def setIgnoreVary(value: scala.Boolean): Self = this.set("ignoreVary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreVary: Self = this.set("ignoreVary", js.undefined)
  }
  
}

