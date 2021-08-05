package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridField extends StObject {
  
  def CompareSingleDataEqual(dataValue1: js.Any, dataValue2: js.Any): Boolean
  
  def GetDefaultCellStyleId(): js.Any
  
  def GetEditMode(): EditMode
  
  def GetIsMultiValue(): Boolean
  
  def GetMultiValuePropType(): js.Any
  
  def GetPropType(): js.Any
  
  def GetSingleValuePropType(): js.Any
  
  def SetEditMode(mode: EditMode): Unit
  
  def SetIsMultiValue(listSeparator: js.Any): Unit
  
  def SetSingleValuePropType(svPropType: js.Any): Unit
  
  var csrInfo: js.Any
  
  var dateOnly: Boolean
  
  var hasDataValue: Boolean
  
  var hasLocalizedValue: Boolean
  
  var key: String
  
  var textDirection: TextDirection
}
object GridField {
  
  inline def apply(
    CompareSingleDataEqual: (js.Any, js.Any) => Boolean,
    GetDefaultCellStyleId: () => js.Any,
    GetEditMode: () => EditMode,
    GetIsMultiValue: () => Boolean,
    GetMultiValuePropType: () => js.Any,
    GetPropType: () => js.Any,
    GetSingleValuePropType: () => js.Any,
    SetEditMode: EditMode => Unit,
    SetIsMultiValue: js.Any => Unit,
    SetSingleValuePropType: js.Any => Unit,
    csrInfo: js.Any,
    dateOnly: Boolean,
    hasDataValue: Boolean,
    hasLocalizedValue: Boolean,
    key: String,
    textDirection: TextDirection
  ): GridField = {
    val __obj = js.Dynamic.literal(CompareSingleDataEqual = js.Any.fromFunction2(CompareSingleDataEqual), GetDefaultCellStyleId = js.Any.fromFunction0(GetDefaultCellStyleId), GetEditMode = js.Any.fromFunction0(GetEditMode), GetIsMultiValue = js.Any.fromFunction0(GetIsMultiValue), GetMultiValuePropType = js.Any.fromFunction0(GetMultiValuePropType), GetPropType = js.Any.fromFunction0(GetPropType), GetSingleValuePropType = js.Any.fromFunction0(GetSingleValuePropType), SetEditMode = js.Any.fromFunction1(SetEditMode), SetIsMultiValue = js.Any.fromFunction1(SetIsMultiValue), SetSingleValuePropType = js.Any.fromFunction1(SetSingleValuePropType), csrInfo = csrInfo.asInstanceOf[js.Any], dateOnly = dateOnly.asInstanceOf[js.Any], hasDataValue = hasDataValue.asInstanceOf[js.Any], hasLocalizedValue = hasLocalizedValue.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], textDirection = textDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridField]
  }
  
  extension [Self <: GridField](x: Self) {
    
    inline def setCompareSingleDataEqual(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "CompareSingleDataEqual", js.Any.fromFunction2(value))
    
    inline def setCsrInfo(value: js.Any): Self = StObject.set(x, "csrInfo", value.asInstanceOf[js.Any])
    
    inline def setDateOnly(value: Boolean): Self = StObject.set(x, "dateOnly", value.asInstanceOf[js.Any])
    
    inline def setGetDefaultCellStyleId(value: () => js.Any): Self = StObject.set(x, "GetDefaultCellStyleId", js.Any.fromFunction0(value))
    
    inline def setGetEditMode(value: () => EditMode): Self = StObject.set(x, "GetEditMode", js.Any.fromFunction0(value))
    
    inline def setGetIsMultiValue(value: () => Boolean): Self = StObject.set(x, "GetIsMultiValue", js.Any.fromFunction0(value))
    
    inline def setGetMultiValuePropType(value: () => js.Any): Self = StObject.set(x, "GetMultiValuePropType", js.Any.fromFunction0(value))
    
    inline def setGetPropType(value: () => js.Any): Self = StObject.set(x, "GetPropType", js.Any.fromFunction0(value))
    
    inline def setGetSingleValuePropType(value: () => js.Any): Self = StObject.set(x, "GetSingleValuePropType", js.Any.fromFunction0(value))
    
    inline def setHasDataValue(value: Boolean): Self = StObject.set(x, "hasDataValue", value.asInstanceOf[js.Any])
    
    inline def setHasLocalizedValue(value: Boolean): Self = StObject.set(x, "hasLocalizedValue", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setSetEditMode(value: EditMode => Unit): Self = StObject.set(x, "SetEditMode", js.Any.fromFunction1(value))
    
    inline def setSetIsMultiValue(value: js.Any => Unit): Self = StObject.set(x, "SetIsMultiValue", js.Any.fromFunction1(value))
    
    inline def setSetSingleValuePropType(value: js.Any => Unit): Self = StObject.set(x, "SetSingleValuePropType", js.Any.fromFunction1(value))
    
    inline def setTextDirection(value: TextDirection): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
  }
}
