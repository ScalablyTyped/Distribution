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
    BeginValidateNormalizeConvert: js.Function6[
      scala.Double, 
      java.lang.String, 
      js.Any, 
      scala.Boolean, 
      js.Function1[/* args */ sharepointLib.Anon_DataValue, scala.Unit], 
      js.Any, 
      scala.Unit
    ],
    DataToLocalized: js.Function1[js.Any, java.lang.String],
    GetImageSource: js.Function2[IRecord, js.Any, java.lang.String],
    GetIsLimitedToList: js.Function0[scala.Boolean],
    GetItems: js.Function1[js.Any, scala.Unit],
    GetSerializableLookupPropType: js.Function0[sharepointLib.Anon_BLimitToList],
    GetStyleId: js.Function1[js.Any, java.lang.String],
    ID: java.lang.String,
    LocalizedToData: js.Function1[java.lang.String, js.Any]
  ): ILookupPropertyType = {
    val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = BeginValidateNormalizeConvert, DataToLocalized = DataToLocalized, GetImageSource = GetImageSource, GetIsLimitedToList = GetIsLimitedToList, GetItems = GetItems, GetSerializableLookupPropType = GetSerializableLookupPropType, GetStyleId = GetStyleId, ID = ID, LocalizedToData = LocalizedToData)
  
    __obj.asInstanceOf[ILookupPropertyType]
  }
}

