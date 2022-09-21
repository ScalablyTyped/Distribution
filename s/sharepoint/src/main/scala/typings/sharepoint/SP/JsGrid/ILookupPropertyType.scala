package typings.sharepoint.SP.JsGrid

import typings.sharepoint.anon.BLimitToList
import typings.sharepoint.anon.DataValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILookupPropertyType
  extends StObject
     with IPropertyType {
  
  def DataToLocalized(dataValue: Any): String
  
  def GetImageSource(record: IRecord, dataValue: Any): String
  
  def GetIsLimitedToList(): Boolean
  
  def GetItems(fnCallback: Any): Unit
  
  def GetSerializableLookupPropType(): BLimitToList
  
  def GetStyleId(dataValue: Any): String
  
  def LocalizedToData(localized: String): Any
}
object ILookupPropertyType {
  
  inline def apply(
    BeginValidateNormalizeConvert: (Double, String, Any, Boolean, js.Function1[/* args */ DataValue, Unit], Any) => Unit,
    DataToLocalized: Any => String,
    GetImageSource: (IRecord, Any) => String,
    GetIsLimitedToList: () => Boolean,
    GetItems: Any => Unit,
    GetSerializableLookupPropType: () => BLimitToList,
    GetStyleId: Any => String,
    ID: String,
    LocalizedToData: String => Any
  ): ILookupPropertyType = {
    val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), DataToLocalized = js.Any.fromFunction1(DataToLocalized), GetImageSource = js.Any.fromFunction2(GetImageSource), GetIsLimitedToList = js.Any.fromFunction0(GetIsLimitedToList), GetItems = js.Any.fromFunction1(GetItems), GetSerializableLookupPropType = js.Any.fromFunction0(GetSerializableLookupPropType), GetStyleId = js.Any.fromFunction1(GetStyleId), ID = ID.asInstanceOf[js.Any], LocalizedToData = js.Any.fromFunction1(LocalizedToData))
    __obj.asInstanceOf[ILookupPropertyType]
  }
  
  extension [Self <: ILookupPropertyType](x: Self) {
    
    inline def setDataToLocalized(value: Any => String): Self = StObject.set(x, "DataToLocalized", js.Any.fromFunction1(value))
    
    inline def setGetImageSource(value: (IRecord, Any) => String): Self = StObject.set(x, "GetImageSource", js.Any.fromFunction2(value))
    
    inline def setGetIsLimitedToList(value: () => Boolean): Self = StObject.set(x, "GetIsLimitedToList", js.Any.fromFunction0(value))
    
    inline def setGetItems(value: Any => Unit): Self = StObject.set(x, "GetItems", js.Any.fromFunction1(value))
    
    inline def setGetSerializableLookupPropType(value: () => BLimitToList): Self = StObject.set(x, "GetSerializableLookupPropType", js.Any.fromFunction0(value))
    
    inline def setGetStyleId(value: Any => String): Self = StObject.set(x, "GetStyleId", js.Any.fromFunction1(value))
    
    inline def setLocalizedToData(value: String => Any): Self = StObject.set(x, "LocalizedToData", js.Any.fromFunction1(value))
  }
}
