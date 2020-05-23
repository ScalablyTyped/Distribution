package typings.sharepoint.SP.JsGrid.PropertyType

import typings.sharepoint.SP.JsGrid.IPropertyType
import typings.sharepoint.SP.JsGrid.IRecord
import typings.sharepoint.anon.DataValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HyperLink extends IPropertyType {
  var bHyperlink: Boolean
  def DataToLocalized(dataValue: js.Any): java.lang.String
  def GetAddress(dataValue: js.Any): java.lang.String
  /** Returns string like this: '"http:// site.com, Site title"' */
  def GetCopyValue(record: IRecord, dataValue: js.Any, locValue: java.lang.String): java.lang.String
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
}

