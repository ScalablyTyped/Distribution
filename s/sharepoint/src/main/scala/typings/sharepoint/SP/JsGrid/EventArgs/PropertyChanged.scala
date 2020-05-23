package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import typings.sharepoint.SP.JsGrid.IPropertyType
import typings.sharepoint.SP.JsGrid.Internal.PropertyUpdate
import typings.sharepoint.SP.JsGrid.ValidationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyChanged extends IEventArgs {
  var changeKey: IChangeKey
  var fieldKey: String
  var newProp: PropertyUpdate
  var oldProp: PropertyUpdate
  var propType: IPropertyType
  var recordKey: Double
  var validationState: ValidationState
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
}

