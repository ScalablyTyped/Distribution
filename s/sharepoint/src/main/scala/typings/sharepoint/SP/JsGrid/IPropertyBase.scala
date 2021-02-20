package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyBase extends StObject {
  
  def Clone(): IPropertyBase = js.native
  
  def GetData(): js.Any = js.native
  
  def GetLocalized(): String = js.native
  
  def HasDataValue(): Boolean = js.native
  
  def HasLocalizedValue(): Boolean = js.native
  
  /** dataValue actually is cloned */
  def Update(dataValue: js.Any, localizedValue: String): Unit = js.native
}
object IPropertyBase {
  
  @scala.inline
  def apply(
    Clone: () => IPropertyBase,
    GetData: () => js.Any,
    GetLocalized: () => String,
    HasDataValue: () => Boolean,
    HasLocalizedValue: () => Boolean,
    Update: (js.Any, String) => Unit
  ): IPropertyBase = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), GetData = js.Any.fromFunction0(GetData), GetLocalized = js.Any.fromFunction0(GetLocalized), HasDataValue = js.Any.fromFunction0(HasDataValue), HasLocalizedValue = js.Any.fromFunction0(HasLocalizedValue), Update = js.Any.fromFunction2(Update))
    __obj.asInstanceOf[IPropertyBase]
  }
  
  @scala.inline
  implicit class IPropertyBaseMutableBuilder[Self <: IPropertyBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IPropertyBase): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetData(value: () => js.Any): Self = StObject.set(x, "GetData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLocalized(value: () => String): Self = StObject.set(x, "GetLocalized", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasDataValue(value: () => Boolean): Self = StObject.set(x, "HasDataValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasLocalizedValue(value: () => Boolean): Self = StObject.set(x, "HasLocalizedValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: (js.Any, String) => Unit): Self = StObject.set(x, "Update", js.Any.fromFunction2(value))
  }
}
