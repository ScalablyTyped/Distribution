package typings.reactNativeElements.anon

import typings.reactNativeElements.mod.RecursivePartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements.RecursivePartial<{  primary :string,   secondary :string,   success :string,   error :string,   warning :string}> */
trait RecursivePartialprimaryst extends StObject {
  
  var error: js.UndefOr[RecursivePartial[String]] = js.undefined
  
  var primary: js.UndefOr[RecursivePartial[String]] = js.undefined
  
  var secondary: js.UndefOr[RecursivePartial[String]] = js.undefined
  
  var success: js.UndefOr[RecursivePartial[String]] = js.undefined
  
  var warning: js.UndefOr[RecursivePartial[String]] = js.undefined
}
object RecursivePartialprimaryst {
  
  inline def apply(): RecursivePartialprimaryst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialprimaryst]
  }
  
  extension [Self <: RecursivePartialprimaryst](x: Self) {
    
    inline def setError(value: RecursivePartial[String]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setPrimary(value: RecursivePartial[String]): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setSecondary(value: RecursivePartial[String]): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
    
    inline def setSuccess(value: RecursivePartial[String]): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setWarning(value: RecursivePartial[String]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
