package typings.qlik.mod

import typings.qlik.qlikStrings.string
import typings.qlik.qlikStrings.textarea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPropertyTextArea
  extends CustomPropertyCommon
     with CustomProperty {
  var component: textarea = js.native
  var defaultValue: js.UndefOr[String] = js.native
  var maxlength: js.UndefOr[Double] = js.native
  var rows: js.UndefOr[Double] = js.native
  @JSName("type")
  var type_CustomPropertyTextArea: string = js.native
}

object CustomPropertyTextArea {
  @scala.inline
  def apply(component: textarea, `type`: string): CustomPropertyTextArea = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyTextArea]
  }
  @scala.inline
  implicit class CustomPropertyTextAreaOps[Self <: CustomPropertyTextArea] (val x: Self) extends AnyVal {
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
    def setComponent(value: textarea): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: string): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setMaxlength(value: Double): Self = this.set("maxlength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxlength: Self = this.set("maxlength", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
  
}

