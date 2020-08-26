package typings.semanticUiSite.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-site.SemanticUI.SiteSettings._Impl, 'siteNamespace'> */
@js.native
trait PickImplsiteNamespace extends js.Object {
  var siteNamespace: String = js.native
}

object PickImplsiteNamespace {
  @scala.inline
  def apply(siteNamespace: String): PickImplsiteNamespace = {
    val __obj = js.Dynamic.literal(siteNamespace = siteNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsiteNamespace]
  }
  @scala.inline
  implicit class PickImplsiteNamespaceOps[Self <: PickImplsiteNamespace] (val x: Self) extends AnyVal {
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
    def setSiteNamespace(value: String): Self = this.set("siteNamespace", value.asInstanceOf[js.Any])
  }
  
}

