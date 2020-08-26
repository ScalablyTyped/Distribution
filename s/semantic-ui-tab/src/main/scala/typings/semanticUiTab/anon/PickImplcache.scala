package typings.semanticUiTab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'cache'> */
@js.native
trait PickImplcache extends js.Object {
  var cache: Boolean = js.native
}

object PickImplcache {
  @scala.inline
  def apply(cache: Boolean): PickImplcache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcache]
  }
  @scala.inline
  implicit class PickImplcacheOps[Self <: PickImplcache] (val x: Self) extends AnyVal {
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
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
  }
  
}

