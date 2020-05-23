package typings.sharepoint.SP.JsGrid.PropertyType

import typings.sharepoint.SP.JsGrid.IPropertyType
import typings.sharepoint.anon.DataValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckBoxBoolean extends IPropertyType {
  def DataToLocalized(dataValue: js.Any): java.lang.String
  def GetBool(dataValue: js.Any): Boolean
}

object CheckBoxBoolean {
  @scala.inline
  def apply(
    BeginValidateNormalizeConvert: (Double, java.lang.String, js.Any, Boolean, js.Function1[/* args */ DataValue, Unit], js.Any) => Unit,
    DataToLocalized: js.Any => java.lang.String,
    GetBool: js.Any => Boolean,
    ID: java.lang.String
  ): CheckBoxBoolean = {
    val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), DataToLocalized = js.Any.fromFunction1(DataToLocalized), GetBool = js.Any.fromFunction1(GetBool), ID = ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckBoxBoolean]
  }
}

