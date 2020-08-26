package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IFieldInfo extends js.Object {
  var dateOnly: js.UndefOr[Boolean] = js.native
  var defaultCellStyleId: js.UndefOr[js.Any] = js.native
  var editMode: js.UndefOr[EditMode] = js.native
  var fieldKey: String = js.native
  var hasDataValue: js.UndefOr[Boolean] = js.native
  var hasLocalizedValue: js.UndefOr[Boolean] = js.native
  var multiValue: js.UndefOr[Boolean] = js.native
  var propertyTypeId: String = js.native
  var textDirection: js.UndefOr[TextDirection] = js.native
}

object IFieldInfo {
  @scala.inline
  def apply(fieldKey: String, propertyTypeId: String): IFieldInfo = {
    val __obj = js.Dynamic.literal(fieldKey = fieldKey.asInstanceOf[js.Any], propertyTypeId = propertyTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldInfo]
  }
  @scala.inline
  implicit class IFieldInfoOps[Self <: IFieldInfo] (val x: Self) extends AnyVal {
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
    def setFieldKey(value: String): Self = this.set("fieldKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertyTypeId(value: String): Self = this.set("propertyTypeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateOnly(value: Boolean): Self = this.set("dateOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateOnly: Self = this.set("dateOnly", js.undefined)
    @scala.inline
    def setDefaultCellStyleId(value: js.Any): Self = this.set("defaultCellStyleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultCellStyleId: Self = this.set("defaultCellStyleId", js.undefined)
    @scala.inline
    def setEditMode(value: EditMode): Self = this.set("editMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditMode: Self = this.set("editMode", js.undefined)
    @scala.inline
    def setHasDataValue(value: Boolean): Self = this.set("hasDataValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasDataValue: Self = this.set("hasDataValue", js.undefined)
    @scala.inline
    def setHasLocalizedValue(value: Boolean): Self = this.set("hasLocalizedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasLocalizedValue: Self = this.set("hasLocalizedValue", js.undefined)
    @scala.inline
    def setMultiValue(value: Boolean): Self = this.set("multiValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiValue: Self = this.set("multiValue", js.undefined)
    @scala.inline
    def setTextDirection(value: TextDirection): Self = this.set("textDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextDirection: Self = this.set("textDirection", js.undefined)
  }
  
}

