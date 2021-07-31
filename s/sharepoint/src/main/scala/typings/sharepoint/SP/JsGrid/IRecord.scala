package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRecord extends StObject {
  
  /** Update the specified field with the specified value */
  def AddFieldValue(fieldKey: String, value: js.Any): Unit
  
  /** returns raw data value for the specified field */
  def GetDataValue(fieldKey: String): js.Any
  
  /** returns localized text value for the specified field */
  def GetLocalizedValue(fieldKey: String): String
  
  def GetProp(fieldKey: String): IPropertyBase
  
  /** returns true if data value for the specified field is available */
  def HasDataValue(fieldKey: String): Boolean
  
  /** returns true if localized text value for the specified field is available */
  def HasLocalizedValue(fieldKey: String): Boolean
  
  /** Removes value of the specified field.
    Does not refresh the view. */
  def RemoveFieldValue(fieldKey: String): Unit
  
  def SetProp(fieldKey: String, prop: IPropertyBase): Unit
  
  /** True if this is an entry row */
  var bIsNewRow: Boolean
  
  /** returns recordKey */
  def key(): Double
  
  /** Please use SetProp and GetProp */
  var properties: StringDictionary[IPropertyBase]
}
object IRecord {
  
  @scala.inline
  def apply(
    AddFieldValue: (String, js.Any) => Unit,
    GetDataValue: String => js.Any,
    GetLocalizedValue: String => String,
    GetProp: String => IPropertyBase,
    HasDataValue: String => Boolean,
    HasLocalizedValue: String => Boolean,
    RemoveFieldValue: String => Unit,
    SetProp: (String, IPropertyBase) => Unit,
    bIsNewRow: Boolean,
    key: () => Double,
    properties: StringDictionary[IPropertyBase]
  ): IRecord = {
    val __obj = js.Dynamic.literal(AddFieldValue = js.Any.fromFunction2(AddFieldValue), GetDataValue = js.Any.fromFunction1(GetDataValue), GetLocalizedValue = js.Any.fromFunction1(GetLocalizedValue), GetProp = js.Any.fromFunction1(GetProp), HasDataValue = js.Any.fromFunction1(HasDataValue), HasLocalizedValue = js.Any.fromFunction1(HasLocalizedValue), RemoveFieldValue = js.Any.fromFunction1(RemoveFieldValue), SetProp = js.Any.fromFunction2(SetProp), bIsNewRow = bIsNewRow.asInstanceOf[js.Any], key = js.Any.fromFunction0(key), properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRecord]
  }
  
  @scala.inline
  implicit class IRecordMutableBuilder[Self <: IRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddFieldValue(value: (String, js.Any) => Unit): Self = StObject.set(x, "AddFieldValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBIsNewRow(value: Boolean): Self = StObject.set(x, "bIsNewRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDataValue(value: String => js.Any): Self = StObject.set(x, "GetDataValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLocalizedValue(value: String => String): Self = StObject.set(x, "GetLocalizedValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetProp(value: String => IPropertyBase): Self = StObject.set(x, "GetProp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasDataValue(value: String => Boolean): Self = StObject.set(x, "HasDataValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasLocalizedValue(value: String => Boolean): Self = StObject.set(x, "HasLocalizedValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKey(value: () => Double): Self = StObject.set(x, "key", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProperties(value: StringDictionary[IPropertyBase]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveFieldValue(value: String => Unit): Self = StObject.set(x, "RemoveFieldValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetProp(value: (String, IPropertyBase) => Unit): Self = StObject.set(x, "SetProp", js.Any.fromFunction2(value))
  }
}
