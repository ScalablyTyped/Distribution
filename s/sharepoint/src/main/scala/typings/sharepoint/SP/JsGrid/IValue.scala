package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IValue extends StObject {
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var localized: js.UndefOr[String] = js.undefined
}
object IValue {
  
  inline def apply(): IValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IValue]
  }
  
  extension [Self <: IValue](x: Self) {
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setLocalized(value: String): Self = StObject.set(x, "localized", value.asInstanceOf[js.Any])
    
    inline def setLocalizedUndefined: Self = StObject.set(x, "localized", js.undefined)
  }
}
