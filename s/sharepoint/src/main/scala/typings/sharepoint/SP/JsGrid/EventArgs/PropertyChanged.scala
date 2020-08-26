package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import typings.sharepoint.SP.JsGrid.IPropertyType
import typings.sharepoint.SP.JsGrid.Internal.PropertyUpdate
import typings.sharepoint.SP.JsGrid.ValidationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyChanged extends IEventArgs {
  var changeKey: IChangeKey = js.native
  var fieldKey: String = js.native
  var newProp: PropertyUpdate = js.native
  var oldProp: PropertyUpdate = js.native
  var propType: IPropertyType = js.native
  var recordKey: Double = js.native
  var validationState: ValidationState = js.native
}

object PropertyChanged {
  @scala.inline
  def apply(
    changeKey: IChangeKey,
    fieldKey: String,
    newProp: PropertyUpdate,
    oldProp: PropertyUpdate,
    propType: IPropertyType,
    recordKey: Double,
    validationState: ValidationState
  ): PropertyChanged = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], newProp = newProp.asInstanceOf[js.Any], oldProp = oldProp.asInstanceOf[js.Any], propType = propType.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any], validationState = validationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyChanged]
  }
  @scala.inline
  implicit class PropertyChangedOps[Self <: PropertyChanged] (val x: Self) extends AnyVal {
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
    def setChangeKey(value: IChangeKey): Self = this.set("changeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldKey(value: String): Self = this.set("fieldKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewProp(value: PropertyUpdate): Self = this.set("newProp", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldProp(value: PropertyUpdate): Self = this.set("oldProp", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropType(value: IPropertyType): Self = this.set("propType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecordKey(value: Double): Self = this.set("recordKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidationState(value: ValidationState): Self = this.set("validationState", value.asInstanceOf[js.Any])
  }
  
}

