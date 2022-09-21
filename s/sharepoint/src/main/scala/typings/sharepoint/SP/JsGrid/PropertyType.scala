package typings.sharepoint.SP.JsGrid

import typings.sharepoint.anon.BDelayInit
import typings.sharepoint.anon.BLimitToList
import typings.sharepoint.anon.DataValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyType extends StObject
object PropertyType {
  
  trait CheckBoxBoolean
    extends StObject
       with IPropertyType {
    
    def DataToLocalized(dataValue: Any): java.lang.String
    
    def GetBool(dataValue: Any): Boolean
  }
  object CheckBoxBoolean {
    
    inline def apply(
      BeginValidateNormalizeConvert: (Double, java.lang.String, Any, Boolean, js.Function1[/* args */ DataValue, Unit], Any) => Unit,
      DataToLocalized: Any => java.lang.String,
      GetBool: Any => Boolean,
      ID: java.lang.String
    ): CheckBoxBoolean = {
      val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), DataToLocalized = js.Any.fromFunction1(DataToLocalized), GetBool = js.Any.fromFunction1(GetBool), ID = ID.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckBoxBoolean]
    }
    
    extension [Self <: CheckBoxBoolean](x: Self) {
      
      inline def setDataToLocalized(value: Any => java.lang.String): Self = StObject.set(x, "DataToLocalized", js.Any.fromFunction1(value))
      
      inline def setGetBool(value: Any => Boolean): Self = StObject.set(x, "GetBool", js.Any.fromFunction1(value))
    }
  }
  
  trait DropDownBoolean
    extends StObject
       with IPropertyType {
    
    def DataToLocalized(dataValue: Any): java.lang.String
    
    def GetBool(dataValue: Any): Boolean
  }
  object DropDownBoolean {
    
    inline def apply(
      BeginValidateNormalizeConvert: (Double, java.lang.String, Any, Boolean, js.Function1[/* args */ DataValue, Unit], Any) => Unit,
      DataToLocalized: Any => java.lang.String,
      GetBool: Any => Boolean,
      ID: java.lang.String
    ): DropDownBoolean = {
      val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), DataToLocalized = js.Any.fromFunction1(DataToLocalized), GetBool = js.Any.fromFunction1(GetBool), ID = ID.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropDownBoolean]
    }
    
    extension [Self <: DropDownBoolean](x: Self) {
      
      inline def setDataToLocalized(value: Any => java.lang.String): Self = StObject.set(x, "DataToLocalized", js.Any.fromFunction1(value))
      
      inline def setGetBool(value: Any => Boolean): Self = StObject.set(x, "GetBool", js.Any.fromFunction1(value))
    }
  }
  
  trait HyperLink
    extends StObject
       with IPropertyType {
    
    def DataToLocalized(dataValue: Any): java.lang.String
    
    def GetAddress(dataValue: Any): java.lang.String
    
    /** Returns string like this: '"http:// site.com, Site title"' */
    def GetCopyValue(record: IRecord, dataValue: Any, locValue: java.lang.String): java.lang.String
    
    var bHyperlink: Boolean
  }
  object HyperLink {
    
    inline def apply(
      BeginValidateNormalizeConvert: (Double, java.lang.String, Any, Boolean, js.Function1[/* args */ DataValue, Unit], Any) => Unit,
      DataToLocalized: Any => java.lang.String,
      GetAddress: Any => java.lang.String,
      GetCopyValue: (IRecord, Any, java.lang.String) => java.lang.String,
      ID: java.lang.String,
      bHyperlink: Boolean
    ): HyperLink = {
      val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), DataToLocalized = js.Any.fromFunction1(DataToLocalized), GetAddress = js.Any.fromFunction1(GetAddress), GetCopyValue = js.Any.fromFunction3(GetCopyValue), ID = ID.asInstanceOf[js.Any], bHyperlink = bHyperlink.asInstanceOf[js.Any])
      __obj.asInstanceOf[HyperLink]
    }
    
    extension [Self <: HyperLink](x: Self) {
      
      inline def setBHyperlink(value: Boolean): Self = StObject.set(x, "bHyperlink", value.asInstanceOf[js.Any])
      
      inline def setDataToLocalized(value: Any => java.lang.String): Self = StObject.set(x, "DataToLocalized", js.Any.fromFunction1(value))
      
      inline def setGetAddress(value: Any => java.lang.String): Self = StObject.set(x, "GetAddress", js.Any.fromFunction1(value))
      
      inline def setGetCopyValue(value: (IRecord, Any, java.lang.String) => java.lang.String): Self = StObject.set(x, "GetCopyValue", js.Any.fromFunction3(value))
    }
  }
  
  trait LookupTable
    extends StObject
       with ILookupPropertyType
  object LookupTable {
    
    inline def apply(
      BeginValidateNormalizeConvert: (Double, java.lang.String, Any, Boolean, js.Function1[/* args */ DataValue, Unit], Any) => Unit,
      DataToLocalized: Any => java.lang.String,
      GetImageSource: (IRecord, Any) => java.lang.String,
      GetIsLimitedToList: () => Boolean,
      GetItems: Any => Unit,
      GetSerializableLookupPropType: () => BLimitToList,
      GetStyleId: Any => java.lang.String,
      ID: java.lang.String,
      LocalizedToData: java.lang.String => Any
    ): LookupTable = {
      val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), DataToLocalized = js.Any.fromFunction1(DataToLocalized), GetImageSource = js.Any.fromFunction2(GetImageSource), GetIsLimitedToList = js.Any.fromFunction0(GetIsLimitedToList), GetItems = js.Any.fromFunction1(GetItems), GetSerializableLookupPropType = js.Any.fromFunction0(GetSerializableLookupPropType), GetStyleId = js.Any.fromFunction1(GetStyleId), ID = ID.asInstanceOf[js.Any], LocalizedToData = js.Any.fromFunction1(LocalizedToData))
      __obj.asInstanceOf[LookupTable]
    }
  }
  
  trait MultiValuePropType
    extends StObject
       with IMultiValuePropertyType
  object MultiValuePropType {
    
    inline def apply(
      BeginValidateNormalizeConvert: (Double, java.lang.String, Any, Boolean, js.Function1[/* args */ DataValue, Unit], Any) => Unit,
      GetSerializableMultiValuePropType: () => BDelayInit,
      ID: java.lang.String,
      InitSingleValuePropType: () => Unit,
      LocStrArrayToLocStr: js.Array[java.lang.String] => java.lang.String,
      LocStrToLocStrArray: java.lang.String => js.Array[java.lang.String],
      bMultiValue: Boolean,
      separator: java.lang.String,
      singleValuePropType: java.lang.String
    ): MultiValuePropType = {
      val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), GetSerializableMultiValuePropType = js.Any.fromFunction0(GetSerializableMultiValuePropType), ID = ID.asInstanceOf[js.Any], InitSingleValuePropType = js.Any.fromFunction0(InitSingleValuePropType), LocStrArrayToLocStr = js.Any.fromFunction1(LocStrArrayToLocStr), LocStrToLocStrArray = js.Any.fromFunction1(LocStrToLocStrArray), bMultiValue = bMultiValue.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], singleValuePropType = singleValuePropType.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiValuePropType]
    }
  }
  
  trait String
    extends StObject
       with IPropertyType
  object String {
    
    inline def apply(
      BeginValidateNormalizeConvert: (Double, java.lang.String, Any, Boolean, js.Function1[/* args */ DataValue, Unit], Any) => Unit,
      ID: java.lang.String
    ): String = {
      val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), ID = ID.asInstanceOf[js.Any])
      __obj.asInstanceOf[String]
    }
  }
  
  trait Utils extends StObject
}
