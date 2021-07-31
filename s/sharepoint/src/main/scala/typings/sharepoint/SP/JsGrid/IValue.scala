package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IValue extends StObject {
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var localized: js.UndefOr[String] = js.undefined
}
object IValue {
  
  @scala.inline
  def apply(): IValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IValue]
  }
  
  @scala.inline
  implicit class IValueMutableBuilder[Self <: IValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setLocalized(value: String): Self = StObject.set(x, "localized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizedUndefined: Self = StObject.set(x, "localized", js.undefined)
  }
}
