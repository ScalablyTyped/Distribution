package typings.semanticUiSite.anon

import typings.semanticUiSite.SemanticUI.Site.NamespaceStubSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-site.SemanticUI.SiteSettings._Impl, keyof semantic-ui-site.SemanticUI.SiteSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImpl extends js.Object {
  var debug: js.UndefOr[Boolean] = js.native
  var modules: js.UndefOr[js.Array[String]] = js.native
  var name: js.UndefOr[String] = js.native
  var namespace: js.UndefOr[String] = js.native
  var namespaceStub: js.UndefOr[NamespaceStubSettings] = js.native
  var performance: js.UndefOr[Boolean] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var siteNamespace: js.UndefOr[String] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplOps[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setModulesVarargs(value: String*): Self = this.set("modules", js.Array(value :_*))
    @scala.inline
    def setModules(value: js.Array[String]): Self = this.set("modules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setNamespaceStub(value: NamespaceStubSettings): Self = this.set("namespaceStub", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespaceStub: Self = this.set("namespaceStub", js.undefined)
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformance: Self = this.set("performance", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setSiteNamespace(value: String): Self = this.set("siteNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteNamespace: Self = this.set("siteNamespace", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

