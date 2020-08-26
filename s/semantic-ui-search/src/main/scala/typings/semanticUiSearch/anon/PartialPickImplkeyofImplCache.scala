package typings.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.MetadataSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.MetadataSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplCache extends js.Object {
  var cache: js.UndefOr[String] = js.native
  var results: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplCache {
  @scala.inline
  def apply(): PartialPickImplkeyofImplCache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplCache]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplCacheOps[Self <: PartialPickImplkeyofImplCache] (val x: Self) extends AnyVal {
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
    def setCache(value: String): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setResults(value: String): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
  
}

