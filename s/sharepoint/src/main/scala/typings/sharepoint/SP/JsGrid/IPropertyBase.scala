package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyBase extends js.Object {
  
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
  implicit class IPropertyBaseOps[Self <: IPropertyBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClone(value: () => IPropertyBase): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetData(value: () => js.Any): Self = this.set("GetData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLocalized(value: () => String): Self = this.set("GetLocalized", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasDataValue(value: () => Boolean): Self = this.set("HasDataValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasLocalizedValue(value: () => Boolean): Self = this.set("HasLocalizedValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: (js.Any, String) => Unit): Self = this.set("Update", js.Any.fromFunction2(value))
  }
}
