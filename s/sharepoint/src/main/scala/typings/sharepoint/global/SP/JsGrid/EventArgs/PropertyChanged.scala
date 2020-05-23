package typings.sharepoint.global.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IPropertyType
import typings.sharepoint.SP.JsGrid.Internal.PropertyUpdate
import typings.sharepoint.SP.JsGrid.ValidationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.PropertyChanged")
@js.native
class PropertyChanged protected ()
  extends typings.sharepoint.SP.JsGrid.EventArgs.PropertyChanged {
  def this(
    recordKey: Double,
    fieldKey: String,
    oldProp: PropertyUpdate,
    newProp: PropertyUpdate,
    propType: IPropertyType,
    changeKey: IChangeKey,
    validationState: ValidationState
  ) = this()
  /* CompleteClass */
  override var changeKey: IChangeKey = js.native
  /* CompleteClass */
  override var fieldKey: String = js.native
  /* CompleteClass */
  override var newProp: PropertyUpdate = js.native
  /* CompleteClass */
  override var oldProp: PropertyUpdate = js.native
  /* CompleteClass */
  override var propType: IPropertyType = js.native
  /* CompleteClass */
  override var recordKey: Double = js.native
  /* CompleteClass */
  override var validationState: ValidationState = js.native
}

