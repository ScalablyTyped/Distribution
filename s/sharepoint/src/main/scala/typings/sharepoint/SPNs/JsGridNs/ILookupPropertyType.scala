package typings.sharepoint.SPNs.JsGridNs

import typings.sharepoint.Anon_BLimitToList
import typings.sharepoint.Anon_DataValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait ILookupPropertyType extends IPropertyType {
  def DataToLocalized(dataValue: js.Any): String
  def GetImageSource(record: IRecord, dataValue: js.Any): String
  def GetIsLimitedToList(): Boolean
  def GetItems(fnCallback: js.Any): Unit
  def GetSerializableLookupPropType(): Anon_BLimitToList
  def GetStyleId(dataValue: js.Any): String
  def LocalizedToData(localized: String): js.Any
}

object ILookupPropertyType {
  @scala.inline
  def apply(
    BeginValidateNormalizeConvert: (Double, String, js.Any, Boolean, js.Function1[/* args */ Anon_DataValue, Unit], js.Any) => Unit,
    DataToLocalized: js.Any => String,
    GetImageSource: (IRecord, js.Any) => String,
    GetIsLimitedToList: () => Boolean,
    GetItems: js.Any => Unit,
    GetSerializableLookupPropType: () => Anon_BLimitToList,
    GetStyleId: js.Any => String,
    ID: String,
    LocalizedToData: String => js.Any
  ): ILookupPropertyType = {
    val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), DataToLocalized = js.Any.fromFunction1(DataToLocalized), GetImageSource = js.Any.fromFunction2(GetImageSource), GetIsLimitedToList = js.Any.fromFunction0(GetIsLimitedToList), GetItems = js.Any.fromFunction1(GetItems), GetSerializableLookupPropType = js.Any.fromFunction0(GetSerializableLookupPropType), GetStyleId = js.Any.fromFunction1(GetStyleId), ID = ID, LocalizedToData = js.Any.fromFunction1(LocalizedToData))
  
    __obj.asInstanceOf[ILookupPropertyType]
  }
}

