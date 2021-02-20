package typings.ssUtils.ssutils

import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindFormOptions extends StObject {
  
  var complete: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var error: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var onSubmitDisable: js.UndefOr[String] = js.native
  
  var validate: js.UndefOr[js.Function1[/* form */ HTMLFormElement, Boolean]] = js.native
  
  var validation: js.UndefOr[ValidationOptional] = js.native
}
object BindFormOptions {
  
  @scala.inline
  def apply(): BindFormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindFormOptions]
  }
  
  @scala.inline
  implicit class BindFormOptionsMutableBuilder[Self <: BindFormOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setError(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setOnSubmitDisable(value: String): Self = StObject.set(x, "onSubmitDisable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSubmitDisableUndefined: Self = StObject.set(x, "onSubmitDisable", js.undefined)
    
    @scala.inline
    def setValidate(value: /* form */ HTMLFormElement => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    @scala.inline
    def setValidation(value: ValidationOptional): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
  }
}
