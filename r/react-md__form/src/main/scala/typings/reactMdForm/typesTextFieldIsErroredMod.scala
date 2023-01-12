package typings.reactMdForm

import typings.reactMdForm.typesTextFieldGetErrorMessageMod.ChangeValidationBehavior
import typings.reactMdForm.typesTextFieldGetErrorMessageMod.ErrorMessageOptions
import typings.std.ValidityState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTextFieldIsErroredMod {
  
  @JSImport("@react-md/form/types/text-field/isErrored", "defaultIsErrored")
  @js.native
  val defaultIsErrored: IsErrored = js.native
  
  type IsErrored = js.Function1[/* options */ IsErroredOptions, Boolean]
  
  trait IsErroredOptions
    extends StObject
       with ErrorMessageOptions {
    
    /**
      * The current error message or an empty string.
      */
    var errorMessage: String
  }
  object IsErroredOptions {
    
    inline def apply(
      errorMessage: String,
      isBlurEvent: Boolean,
      validateOnChange: ChangeValidationBehavior,
      validationMessage: String,
      validity: ValidityState,
      value: String
    ): IsErroredOptions = {
      val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], isBlurEvent = isBlurEvent.asInstanceOf[js.Any], validateOnChange = validateOnChange.asInstanceOf[js.Any], validationMessage = validationMessage.asInstanceOf[js.Any], validity = validity.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsErroredOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsErroredOptions] (val x: Self) extends AnyVal {
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    }
  }
}
