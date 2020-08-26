package typings.sharepoint.SP.JsGrid.PropertyType

import typings.sharepoint.SP.JsGrid.IPropertyType
import typings.sharepoint.anon.DataValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckBoxBoolean extends IPropertyType {
  def DataToLocalized(dataValue: js.Any): java.lang.String = js.native
  def GetBool(dataValue: js.Any): Boolean = js.native
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
  @scala.inline
  implicit class CheckBoxBooleanOps[Self <: CheckBoxBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataToLocalized(value: js.Any => java.lang.String): Self = this.set("DataToLocalized", js.Any.fromFunction1(value))
    @scala.inline
    def setGetBool(value: js.Any => Boolean): Self = this.set("GetBool", js.Any.fromFunction1(value))
  }
  
}

