package typings.semanticUiSite.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-site.SemanticUI.Site.NamespaceStubSettings._Impl, 'sections'> */
@js.native
trait PickImplsections extends js.Object {
  var sections: js.Any = js.native
}

object PickImplsections {
  @scala.inline
  def apply(sections: js.Any): PickImplsections = {
    val __obj = js.Dynamic.literal(sections = sections.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsections]
  }
  @scala.inline
  implicit class PickImplsectionsOps[Self <: PickImplsections] (val x: Self) extends AnyVal {
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
    def setSections(value: js.Any): Self = this.set("sections", value.asInstanceOf[js.Any])
  }
  
}

