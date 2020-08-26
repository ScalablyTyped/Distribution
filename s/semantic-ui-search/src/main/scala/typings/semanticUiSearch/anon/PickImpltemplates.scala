package typings.semanticUiSearch.anon

import typings.semanticUiSearch.SemanticUI.Search.TemplatesSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'templates'> */
@js.native
trait PickImpltemplates extends js.Object {
  var templates: TemplatesSettings = js.native
}

object PickImpltemplates {
  @scala.inline
  def apply(templates: TemplatesSettings): PickImpltemplates = {
    val __obj = js.Dynamic.literal(templates = templates.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltemplates]
  }
  @scala.inline
  implicit class PickImpltemplatesOps[Self <: PickImpltemplates] (val x: Self) extends AnyVal {
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
    def setTemplates(value: TemplatesSettings): Self = this.set("templates", value.asInstanceOf[js.Any])
  }
  
}

