package typings.sharepoint.SP.JsGrid

import typings.sharepoint.AnonBLimitToList
import typings.sharepoint.AnonDataValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait ILookupPropertyType extends IPropertyType {
  def DataToLocalized(dataValue: js.Any): String
  def GetImageSource(record: IRecord, dataValue: js.Any): String
  def GetIsLimitedToList(): Boolean
  def GetItems(fnCallback: js.Any): Unit
  def GetSerializableLookupPropType(): AnonBLimitToList
  def GetStyleId(dataValue: js.Any): String
  def LocalizedToData(localized: String): js.Any
}

object ILookupPropertyType {
  @scala.inline
  def apply(
    BeginValidateNormalizeConvert: (Double, String, js.Any, Boolean, js.Function1[/* args */ AnonDataValue, Unit], js.Any) => Unit,
    DataToLocalized: js.Any => String,
    GetImageSource: (IRecord, js.Any) => String,
    GetIsLimitedToList: () => Boolean,
    GetItems: js.Any => Unit,
    GetSerializableLookupPropType: () => AnonBLimitToList,
    GetStyleId: js.Any => String,
    ID: String,
    LocalizedToData: String => js.Any
  ): ILookupPropertyType = {
    val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), DataToLocalized = js.Any.fromFunction1(DataToLocalized), GetImageSource = js.Any.fromFunction2(GetImageSource), GetIsLimitedToList = js.Any.fromFunction0(GetIsLimitedToList), GetItems = js.Any.fromFunction1(GetItems), GetSerializableLookupPropType = js.Any.fromFunction0(GetSerializableLookupPropType), GetStyleId = js.Any.fromFunction1(GetStyleId), ID = ID.asInstanceOf[js.Any], LocalizedToData = js.Any.fromFunction1(LocalizedToData))
    __obj.asInstanceOf[ILookupPropertyType]
  }
}

