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
    
    @scala.inline
    implicit class CheckBoxBooleanMutableBuilder[Self <: CheckBoxBoolean] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataToLocalized(value: js.Any => java.lang.String): Self = StObject.set(x, "DataToLocalized", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetBool(value: js.Any => Boolean): Self = StObject.set(x, "GetBool", js.Any.fromFunction1(value))
    }
  }
  
  trait DropDownBoolean
    extends StObject
       with IPropertyType {
    
    def DataToLocalized(dataValue: js.Any): java.lang.String
    
    def GetBool(dataValue: js.Any): Boolean
  }
  object DropDownBoolean {
    
    @scala.inline
    def apply(
      BeginValidateNormalizeConvert: (Double, java.lang.String, js.Any, Boolean, js.Function1[/* args */ DataValue, Unit], js.Any) => Unit,
      DataToLocalized: js.Any => java.lang.String,
      GetBool: js.Any => Boolean,
      ID: java.lang.String
    ): DropDownBoolean = {
      val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), DataToLocalized = js.Any.fromFunction1(DataToLocalized), GetBool = js.Any.fromFunction1(GetBool), ID = ID.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropDownBoolean]
    }
    
    @scala.inline
    implicit class DropDownBooleanMutableBuilder[Self <: DropDownBoolean] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataToLocalized(value: js.Any => java.lang.String): Self = StObject.set(x, "DataToLocalized", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetBool(value: js.Any => Boolean): Self = StObject.set(x, "GetBool", js.Any.fromFunction1(value))
    }
  }
  
  trait HyperLink
    extends StObject
       with IPropertyType {
    
    def DataToLocalized(dataValue: js.Any): java.lang.String
    
    def GetAddress(dataValue: js.Any): java.lang.String
    
    /** Returns string like this: '"http:// site.com, Site title"' */
    def GetCopyValue(record: IRecord, dataValue: js.Any, locValue: java.lang.String): java.lang.String
    
    var bHyperlink: Boolean
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
    implicit class HyperLinkMutableBuilder[Self <: HyperLink] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBHyperlink(value: Boolean): Self = StObject.set(x, "bHyperlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataToLocalized(value: js.Any => java.lang.String): Self = StObject.set(x, "DataToLocalized", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAddress(value: js.Any => java.lang.String): Self = StObject.set(x, "GetAddress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetCopyValue(value: (IRecord, js.Any, java.lang.String) => java.lang.String): Self = StObject.set(x, "GetCopyValue", js.Any.fromFunction3(value))
    }
  }
  
  trait LookupTable
    extends StObject
       with ILookupPropertyType
  object LookupTable {
    
    @scala.inline
    def apply(
      BeginValidateNormalizeConvert: (Double, java.lang.String, js.Any, Boolean, js.Function1[/* args */ DataValue, Unit], js.Any) => Unit,
      DataToLocalized: js.Any => java.lang.String,
      GetImageSource: (IRecord, js.Any) => java.lang.String,
      GetIsLimitedToList: () => Boolean,
      GetItems: js.Any => Unit,
      GetSerializableLookupPropType: () => BLimitToList,
      GetStyleId: js.Any => java.lang.String,
      ID: java.lang.String,
      LocalizedToData: java.lang.String => js.Any
    ): LookupTable = {
      val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), DataToLocalized = js.Any.fromFunction1(DataToLocalized), GetImageSource = js.Any.fromFunction2(GetImageSource), GetIsLimitedToList = js.Any.fromFunction0(GetIsLimitedToList), GetItems = js.Any.fromFunction1(GetItems), GetSerializableLookupPropType = js.Any.fromFunction0(GetSerializableLookupPropType), GetStyleId = js.Any.fromFunction1(GetStyleId), ID = ID.asInstanceOf[js.Any], LocalizedToData = js.Any.fromFunction1(LocalizedToData))
      __obj.asInstanceOf[LookupTable]
    }
  }
  
  trait MultiValuePropType
    extends StObject
       with IMultiValuePropertyType
  object MultiValuePropType {
    
    @scala.inline
    def apply(
      BeginValidateNormalizeConvert: (Double, java.lang.String, js.Any, Boolean, js.Function1[/* args */ DataValue, Unit], js.Any) => Unit,
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
    
    @scala.inline
    def apply(
      BeginValidateNormalizeConvert: (Double, java.lang.String, js.Any, Boolean, js.Function1[/* args */ DataValue, Unit], js.Any) => Unit,
      ID: java.lang.String
    ): String = {
      val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), ID = ID.asInstanceOf[js.Any])
      __obj.asInstanceOf[String]
    }
  }
  
  trait Utils extends StObject
}
