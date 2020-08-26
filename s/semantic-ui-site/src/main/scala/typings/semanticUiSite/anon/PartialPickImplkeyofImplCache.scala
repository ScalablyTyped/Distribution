package typings.semanticUiSite.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-site.SemanticUI.Site.NamespaceStubSettings._Impl, keyof semantic-ui-site.SemanticUI.Site.NamespaceStubSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplCache extends js.Object {
  var cache: js.UndefOr[js.Any] = js.native
  var config: js.UndefOr[js.Any] = js.native
  var section: js.UndefOr[js.Any] = js.native
  var sections: js.UndefOr[js.Any] = js.native
  var utilities: js.UndefOr[js.Any] = js.native
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
    def setCache(value: js.Any): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setConfig(value: js.Any): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setSection(value: js.Any): Self = this.set("section", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSection: Self = this.set("section", js.undefined)
    @scala.inline
    def setSections(value: js.Any): Self = this.set("sections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSections: Self = this.set("sections", js.undefined)
    @scala.inline
    def setUtilities(value: js.Any): Self = this.set("utilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtilities: Self = this.set("utilities", js.undefined)
  }
  
}

