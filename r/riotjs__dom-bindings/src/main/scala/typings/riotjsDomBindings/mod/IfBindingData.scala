package typings.riotjsDomBindings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IfBindingData
  extends BaseBindingData
     with BindingData {
  var template: TemplateChunk[_, _] = js.native
}

object IfBindingData {
  @scala.inline
  def apply(template: TemplateChunk[_, _]): IfBindingData = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfBindingData]
  }
  @scala.inline
  implicit class IfBindingDataOps[Self <: IfBindingData] (val x: Self) extends AnyVal {
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
    def setTemplate(value: TemplateChunk[_, _]): Self = this.set("template", value.asInstanceOf[js.Any])
  }
  
}

