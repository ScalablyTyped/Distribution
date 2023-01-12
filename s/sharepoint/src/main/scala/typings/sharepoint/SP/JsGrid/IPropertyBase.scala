package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyBase extends StObject {
  
  def Clone(): IPropertyBase
  
  def GetData(): Any
  
  def GetLocalized(): String
  
  def HasDataValue(): Boolean
  
  def HasLocalizedValue(): Boolean
  
  /** dataValue actually is cloned */
  def Update(dataValue: Any, localizedValue: String): Unit
}
object IPropertyBase {
  
  inline def apply(
    Clone: () => IPropertyBase,
    GetData: () => Any,
    GetLocalized: () => String,
    HasDataValue: () => Boolean,
    HasLocalizedValue: () => Boolean,
    Update: (Any, String) => Unit
  ): IPropertyBase = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), GetData = js.Any.fromFunction0(GetData), GetLocalized = js.Any.fromFunction0(GetLocalized), HasDataValue = js.Any.fromFunction0(HasDataValue), HasLocalizedValue = js.Any.fromFunction0(HasLocalizedValue), Update = js.Any.fromFunction2(Update))
    __obj.asInstanceOf[IPropertyBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPropertyBase] (val x: Self) extends AnyVal {
    
    inline def setClone(value: () => IPropertyBase): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setGetData(value: () => Any): Self = StObject.set(x, "GetData", js.Any.fromFunction0(value))
    
    inline def setGetLocalized(value: () => String): Self = StObject.set(x, "GetLocalized", js.Any.fromFunction0(value))
    
    inline def setHasDataValue(value: () => Boolean): Self = StObject.set(x, "HasDataValue", js.Any.fromFunction0(value))
    
    inline def setHasLocalizedValue(value: () => Boolean): Self = StObject.set(x, "HasLocalizedValue", js.Any.fromFunction0(value))
    
    inline def setUpdate(value: (Any, String) => Unit): Self = StObject.set(x, "Update", js.Any.fromFunction2(value))
  }
}
