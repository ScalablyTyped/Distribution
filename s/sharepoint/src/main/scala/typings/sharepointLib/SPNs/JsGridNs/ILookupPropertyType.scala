package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait ILookupPropertyType extends IPropertyType {
  def DataToLocalized(dataValue: js.Any): java.lang.String
  def GetImageSource(record: IRecord, dataValue: js.Any): java.lang.String
  def GetIsLimitedToList(): scala.Boolean
  def GetItems(fnCallback: js.Any): scala.Unit
  def GetSerializableLookupPropType(): sharepointLib.Anon_BLimitToList
  def GetStyleId(dataValue: js.Any): java.lang.String
  def LocalizedToData(localized: java.lang.String): js.Any
}

object ILookupPropertyType {
  @scala.inline
  def apply(
    BeginValidateNormalizeConvert: (scala.Double, java.lang.String, js.Any, scala.Boolean, js.Function1[/* args */ sharepointLib.Anon_DataValue, scala.Unit], js.Any) => scala.Unit,
    DataToLocalized: js.Any => java.lang.String,
    GetImageSource: (IRecord, js.Any) => java.lang.String,
    GetIsLimitedToList: () => scala.Boolean,
    GetItems: js.Any => scala.Unit,
    GetSerializableLookupPropType: () => sharepointLib.Anon_BLimitToList,
    GetStyleId: js.Any => java.lang.String,
    ID: java.lang.String,
    LocalizedToData: java.lang.String => js.Any
  ): ILookupPropertyType = {
    val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), DataToLocalized = js.Any.fromFunction1(DataToLocalized), GetImageSource = js.Any.fromFunction2(GetImageSource), GetIsLimitedToList = js.Any.fromFunction0(GetIsLimitedToList), GetItems = js.Any.fromFunction1(GetItems), GetSerializableLookupPropType = js.Any.fromFunction0(GetSerializableLookupPropType), GetStyleId = js.Any.fromFunction1(GetStyleId), ID = ID, LocalizedToData = js.Any.fromFunction1(LocalizedToData))
  
    __obj.asInstanceOf[ILookupPropertyType]
  }
}

