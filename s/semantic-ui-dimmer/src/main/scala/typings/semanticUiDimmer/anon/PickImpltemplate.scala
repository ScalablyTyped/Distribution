package typings.semanticUiDimmer.anon

import typings.semanticUiDimmer.SemanticUI.Dimmer.TemplateSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl, 'template'> */
@js.native
trait PickImpltemplate extends js.Object {
  var template: TemplateSettings = js.native
}

object PickImpltemplate {
  @scala.inline
  def apply(template: TemplateSettings): PickImpltemplate = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltemplate]
  }
  @scala.inline
  implicit class PickImpltemplateOps[Self <: PickImpltemplate] (val x: Self) extends AnyVal {
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
    def setTemplate(value: TemplateSettings): Self = this.set("template", value.asInstanceOf[js.Any])
  }
  
}

