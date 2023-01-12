package typings.sharepoint.SP.JsGrid

import typings.sharepoint.anon.BDelayInit
import typings.sharepoint.anon.DataValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMultiValuePropertyType
  extends StObject
     with IPropertyType {
  
  def GetSerializableMultiValuePropType(): BDelayInit
  
  def InitSingleValuePropType(): Unit
  
  def LocStrArrayToLocStr(locStrArray: js.Array[String]): String
  
  def LocStrToLocStrArray(locStr: String): js.Array[String]
  
  var bMultiValue: Boolean
  
  var separator: String
  
  var singleValuePropType: String
}
object IMultiValuePropertyType {
  
  inline def apply(
    BeginValidateNormalizeConvert: (Double, String, Any, Boolean, js.Function1[/* args */ DataValue, Unit], Any) => Unit,
    GetSerializableMultiValuePropType: () => BDelayInit,
    ID: String,
    InitSingleValuePropType: () => Unit,
    LocStrArrayToLocStr: js.Array[String] => String,
    LocStrToLocStrArray: String => js.Array[String],
    bMultiValue: Boolean,
    separator: String,
    singleValuePropType: String
  ): IMultiValuePropertyType = {
    val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), GetSerializableMultiValuePropType = js.Any.fromFunction0(GetSerializableMultiValuePropType), ID = ID.asInstanceOf[js.Any], InitSingleValuePropType = js.Any.fromFunction0(InitSingleValuePropType), LocStrArrayToLocStr = js.Any.fromFunction1(LocStrArrayToLocStr), LocStrToLocStrArray = js.Any.fromFunction1(LocStrToLocStrArray), bMultiValue = bMultiValue.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], singleValuePropType = singleValuePropType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMultiValuePropertyType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMultiValuePropertyType] (val x: Self) extends AnyVal {
    
    inline def setBMultiValue(value: Boolean): Self = StObject.set(x, "bMultiValue", value.asInstanceOf[js.Any])
    
    inline def setGetSerializableMultiValuePropType(value: () => BDelayInit): Self = StObject.set(x, "GetSerializableMultiValuePropType", js.Any.fromFunction0(value))
    
    inline def setInitSingleValuePropType(value: () => Unit): Self = StObject.set(x, "InitSingleValuePropType", js.Any.fromFunction0(value))
    
    inline def setLocStrArrayToLocStr(value: js.Array[String] => String): Self = StObject.set(x, "LocStrArrayToLocStr", js.Any.fromFunction1(value))
    
    inline def setLocStrToLocStrArray(value: String => js.Array[String]): Self = StObject.set(x, "LocStrToLocStrArray", js.Any.fromFunction1(value))
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSingleValuePropType(value: String): Self = StObject.set(x, "singleValuePropType", value.asInstanceOf[js.Any])
  }
}
