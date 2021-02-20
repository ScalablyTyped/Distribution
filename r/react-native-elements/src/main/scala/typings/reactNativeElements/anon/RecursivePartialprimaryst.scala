package typings.reactNativeElements.anon

import typings.reactNativeElements.mod.RecursivePartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements.RecursivePartial<{  primary :string,   secondary :string,   success :string,   error :string,   warning :string}> */
@js.native
trait RecursivePartialprimaryst extends StObject {
  
  var error: js.UndefOr[RecursivePartial[String]] = js.native
  
  var primary: js.UndefOr[RecursivePartial[String]] = js.native
  
  var secondary: js.UndefOr[RecursivePartial[String]] = js.native
  
  var success: js.UndefOr[RecursivePartial[String]] = js.native
  
  var warning: js.UndefOr[RecursivePartial[String]] = js.native
}
object RecursivePartialprimaryst {
  
  @scala.inline
  def apply(): RecursivePartialprimaryst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialprimaryst]
  }
  
  @scala.inline
  implicit class RecursivePartialprimarystMutableBuilder[Self <: RecursivePartialprimaryst] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: RecursivePartial[String]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setPrimary(value: RecursivePartial[String]): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setSecondary(value: RecursivePartial[String]): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
    
    @scala.inline
    def setSuccess(value: RecursivePartial[String]): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setWarning(value: RecursivePartial[String]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
