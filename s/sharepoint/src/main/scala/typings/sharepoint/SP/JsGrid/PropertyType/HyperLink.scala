package typings.sharepoint.SP.JsGrid.PropertyType

import typings.sharepoint.SP.JsGrid.IPropertyType
import typings.sharepoint.SP.JsGrid.IRecord
import typings.sharepoint.anon.DataValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperLink extends IPropertyType {
  var bHyperlink: Boolean = js.native
  def DataToLocalized(dataValue: js.Any): java.lang.String = js.native
  def GetAddress(dataValue: js.Any): java.lang.String = js.native
  /** Returns string like this: '"http:// site.com, Site title"' */
  def GetCopyValue(record: IRecord, dataValue: js.Any, locValue: java.lang.String): java.lang.String = js.native
}

object HyperLink {
  @scala.inline
  def apply(
    BeginValidateNormalizeConvert: (Double, java.lang.String, js.Any, Boolean, js.Function1[/* args */ DataValue, Unit], js.Any) => Unit,
    DataToLocalized: js.Any => java.lang.String,
    GetAddress: js.Any => java.lang.String,
    GetCopyValue: (IRecord, js.Any, java.lang.String) => java.lang.String,
    ID: java.lang.String,
    bHyperlink: Boolean
  ): HyperLink = {
    val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), DataToLocalized = js.Any.fromFunction1(DataToLocalized), GetAddress = js.Any.fromFunction1(GetAddress), GetCopyValue = js.Any.fromFunction3(GetCopyValue), ID = ID.asInstanceOf[js.Any], bHyperlink = bHyperlink.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperLink]
  }
  @scala.inline
  implicit class HyperLinkOps[Self <: HyperLink] (val x: Self) extends AnyVal {
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
    def setGetAddress(value: js.Any => java.lang.String): Self = this.set("GetAddress", js.Any.fromFunction1(value))
    @scala.inline
    def setGetCopyValue(value: (IRecord, js.Any, java.lang.String) => java.lang.String): Self = this.set("GetCopyValue", js.Any.fromFunction3(value))
    @scala.inline
    def setBHyperlink(value: Boolean): Self = this.set("bHyperlink", value.asInstanceOf[js.Any])
  }
  
}

