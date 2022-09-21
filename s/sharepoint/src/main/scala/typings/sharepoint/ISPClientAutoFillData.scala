package typings.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISPClientAutoFillData extends StObject {
  
  var AutoFillDisplayText: js.UndefOr[String] = js.undefined
  
  var AutoFillKey: js.UndefOr[Any] = js.undefined
  
  var AutoFillMenuOptionType: js.UndefOr[Double] = js.undefined
  
  var AutoFillSubDisplayText: js.UndefOr[String] = js.undefined
  
  var AutoFillTitleText: js.UndefOr[String] = js.undefined
}
object ISPClientAutoFillData {
  
  inline def apply(): ISPClientAutoFillData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISPClientAutoFillData]
  }
  
  extension [Self <: ISPClientAutoFillData](x: Self) {
    
    inline def setAutoFillDisplayText(value: String): Self = StObject.set(x, "AutoFillDisplayText", value.asInstanceOf[js.Any])
    
    inline def setAutoFillDisplayTextUndefined: Self = StObject.set(x, "AutoFillDisplayText", js.undefined)
    
    inline def setAutoFillKey(value: Any): Self = StObject.set(x, "AutoFillKey", value.asInstanceOf[js.Any])
    
    inline def setAutoFillKeyUndefined: Self = StObject.set(x, "AutoFillKey", js.undefined)
    
    inline def setAutoFillMenuOptionType(value: Double): Self = StObject.set(x, "AutoFillMenuOptionType", value.asInstanceOf[js.Any])
    
    inline def setAutoFillMenuOptionTypeUndefined: Self = StObject.set(x, "AutoFillMenuOptionType", js.undefined)
    
    inline def setAutoFillSubDisplayText(value: String): Self = StObject.set(x, "AutoFillSubDisplayText", value.asInstanceOf[js.Any])
    
    inline def setAutoFillSubDisplayTextUndefined: Self = StObject.set(x, "AutoFillSubDisplayText", js.undefined)
    
    inline def setAutoFillTitleText(value: String): Self = StObject.set(x, "AutoFillTitleText", value.asInstanceOf[js.Any])
    
    inline def setAutoFillTitleTextUndefined: Self = StObject.set(x, "AutoFillTitleText", js.undefined)
  }
}
