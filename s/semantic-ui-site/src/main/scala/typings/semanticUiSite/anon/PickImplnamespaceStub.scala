package typings.semanticUiSite.anon

import typings.semanticUiSite.SemanticUI.Site.NamespaceStubSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-site.SemanticUI.SiteSettings._Impl, 'namespaceStub'> */
@js.native
trait PickImplnamespaceStub extends js.Object {
  var namespaceStub: NamespaceStubSettings = js.native
}

object PickImplnamespaceStub {
  @scala.inline
  def apply(namespaceStub: NamespaceStubSettings): PickImplnamespaceStub = {
    val __obj = js.Dynamic.literal(namespaceStub = namespaceStub.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnamespaceStub]
  }
  @scala.inline
  implicit class PickImplnamespaceStubOps[Self <: PickImplnamespaceStub] (val x: Self) extends AnyVal {
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
    def setNamespaceStub(value: NamespaceStubSettings): Self = this.set("namespaceStub", value.asInstanceOf[js.Any])
  }
  
}

