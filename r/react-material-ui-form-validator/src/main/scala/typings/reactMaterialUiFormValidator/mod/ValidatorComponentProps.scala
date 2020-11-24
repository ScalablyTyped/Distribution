package typings.reactMaterialUiFormValidator.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidatorComponentProps
  extends /* key */ StringDictionary[js.Any] {
  
  var errorMessages: js.UndefOr[js.Array[_] | String] = js.native
  
  var name: String = js.native
  
  var validatorListener: js.UndefOr[js.Function1[/* isValid */ Boolean, Unit]] = js.native
  
  var validators: js.UndefOr[js.Array[_]] = js.native
  
  var value: js.Any = js.native
  
  var withRequiredValidator: js.UndefOr[Boolean] = js.native
}
object ValidatorComponentProps {
  
  @scala.inline
  def apply(name: String, value: js.Any): ValidatorComponentProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorComponentProps]
  }
  
  @scala.inline
  implicit class ValidatorComponentPropsOps[Self <: ValidatorComponentProps] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessagesVarargs(value: js.Any*): Self = this.set("errorMessages", js.Array(value :_*))
    
    @scala.inline
    def setErrorMessages(value: js.Array[_] | String): Self = this.set("errorMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessages: Self = this.set("errorMessages", js.undefined)
    
    @scala.inline
    def setValidatorListener(value: /* isValid */ Boolean => Unit): Self = this.set("validatorListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValidatorListener: Self = this.set("validatorListener", js.undefined)
    
    @scala.inline
    def setValidatorsVarargs(value: js.Any*): Self = this.set("validators", js.Array(value :_*))
    
    @scala.inline
    def setValidators(value: js.Array[_]): Self = this.set("validators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidators: Self = this.set("validators", js.undefined)
    
    @scala.inline
    def setWithRequiredValidator(value: Boolean): Self = this.set("withRequiredValidator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithRequiredValidator: Self = this.set("withRequiredValidator", js.undefined)
  }
}
