package typings.sharepoint.SP.JsGrid

import typings.sharepoint.AnonDataValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IPropertyType extends js.Object {
  var ID: String
  def BeginValidateNormalizeConvert(
    recordKey: Double,
    fieldKey: String,
    newValue: js.Any,
    bIsLocalized: Boolean,
    fnCallback: js.Function1[/* args */ AnonDataValue, Unit],
    fnError: js.Any
  ): Unit
}

object IPropertyType {
  @scala.inline
  def apply(
    BeginValidateNormalizeConvert: (Double, String, js.Any, Boolean, js.Function1[/* args */ AnonDataValue, Unit], js.Any) => Unit,
    ID: String
  ): IPropertyType = {
    val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), ID = ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyType]
  }
}

