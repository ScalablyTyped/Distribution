package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderContextFieldInForm extends RenderContextForm {
  var CurrentFieldSchema: FieldSchemaInForm = js.native
  var CurrentFieldValue: js.Any = js.native
  var CurrentGroup: Group = js.native
  var CurrentGroupIdx: Double = js.native
  var CurrentItems: js.Array[Item] = js.native
}

object RenderContextFieldInForm {
  @scala.inline
  def apply(
    CurrentFieldSchema: FieldSchemaInForm,
    CurrentFieldValue: js.Any,
    CurrentGroup: Group,
    CurrentGroupIdx: Double,
    CurrentItem: Item,
    CurrentItems: js.Array[Item],
    FieldControlModes: StringDictionary[ClientControlMode],
    FormContext: ClientFormContext,
    FormUniqueId: String,
    ListData: ListDataInForm,
    ListSchema: ListSchemaInForm
  ): RenderContextFieldInForm = {
    val __obj = js.Dynamic.literal(CurrentFieldSchema = CurrentFieldSchema.asInstanceOf[js.Any], CurrentFieldValue = CurrentFieldValue.asInstanceOf[js.Any], CurrentGroup = CurrentGroup.asInstanceOf[js.Any], CurrentGroupIdx = CurrentGroupIdx.asInstanceOf[js.Any], CurrentItem = CurrentItem.asInstanceOf[js.Any], CurrentItems = CurrentItems.asInstanceOf[js.Any], FieldControlModes = FieldControlModes.asInstanceOf[js.Any], FormContext = FormContext.asInstanceOf[js.Any], FormUniqueId = FormUniqueId.asInstanceOf[js.Any], ListData = ListData.asInstanceOf[js.Any], ListSchema = ListSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderContextFieldInForm]
  }
  @scala.inline
  implicit class RenderContextFieldInFormOps[Self <: RenderContextFieldInForm] (val x: Self) extends AnyVal {
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
    def setCurrentFieldSchema(value: FieldSchemaInForm): Self = this.set("CurrentFieldSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentFieldValue(value: js.Any): Self = this.set("CurrentFieldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentGroup(value: Group): Self = this.set("CurrentGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentGroupIdx(value: Double): Self = this.set("CurrentGroupIdx", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentItemsVarargs(value: Item*): Self = this.set("CurrentItems", js.Array(value :_*))
    @scala.inline
    def setCurrentItems(value: js.Array[Item]): Self = this.set("CurrentItems", value.asInstanceOf[js.Any])
  }
  
}

