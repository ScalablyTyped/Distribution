package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderContextForm extends RenderContext {
  var CSRCustomLayout: js.UndefOr[Boolean] = js.native
  var CurrentItem: Item = js.native
  var FieldControlModes: StringDictionary[ClientControlMode] = js.native
  var FormContext: ClientFormContext = js.native
  var FormUniqueId: String = js.native
  var ListData: ListDataInForm = js.native
  var ListSchema: ListSchemaInForm = js.native
}

object RenderContextForm {
  @scala.inline
  def apply(
    CurrentItem: Item,
    FieldControlModes: StringDictionary[ClientControlMode],
    FormContext: ClientFormContext,
    FormUniqueId: String,
    ListData: ListDataInForm,
    ListSchema: ListSchemaInForm
  ): RenderContextForm = {
    val __obj = js.Dynamic.literal(CurrentItem = CurrentItem.asInstanceOf[js.Any], FieldControlModes = FieldControlModes.asInstanceOf[js.Any], FormContext = FormContext.asInstanceOf[js.Any], FormUniqueId = FormUniqueId.asInstanceOf[js.Any], ListData = ListData.asInstanceOf[js.Any], ListSchema = ListSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderContextForm]
  }
  @scala.inline
  implicit class RenderContextFormOps[Self <: RenderContextForm] (val x: Self) extends AnyVal {
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
    def setCurrentItem(value: Item): Self = this.set("CurrentItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldControlModes(value: StringDictionary[ClientControlMode]): Self = this.set("FieldControlModes", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormContext(value: ClientFormContext): Self = this.set("FormContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormUniqueId(value: String): Self = this.set("FormUniqueId", value.asInstanceOf[js.Any])
    @scala.inline
    def setListData(value: ListDataInForm): Self = this.set("ListData", value.asInstanceOf[js.Any])
    @scala.inline
    def setListSchema(value: ListSchemaInForm): Self = this.set("ListSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def setCSRCustomLayout(value: Boolean): Self = this.set("CSRCustomLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCSRCustomLayout: Self = this.set("CSRCustomLayout", js.undefined)
  }
  
}

