package typings.semanticUiSite.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-site.SemanticUI.Site.NamespaceStubSettings._Impl, 'section'> */
@js.native
trait PickImplsection extends js.Object {
  var section: js.Any = js.native
}

object PickImplsection {
  @scala.inline
  def apply(section: js.Any): PickImplsection = {
    val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsection]
  }
  @scala.inline
  implicit class PickImplsectionOps[Self <: PickImplsection] (val x: Self) extends AnyVal {
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
    def setSection(value: js.Any): Self = this.set("section", value.asInstanceOf[js.Any])
  }
  
}

