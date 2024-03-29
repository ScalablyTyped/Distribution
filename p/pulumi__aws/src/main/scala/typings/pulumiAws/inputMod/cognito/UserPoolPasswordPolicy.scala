package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolPasswordPolicy extends StObject {
  
  /**
    * The minimum length of the password policy that you have set.
    */
  var minimumLength: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Whether you have required users to use at least one lowercase letter in their password.
    */
  var requireLowercase: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Whether you have required users to use at least one number in their password.
    */
  var requireNumbers: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Whether you have required users to use at least one symbol in their password.
    */
  var requireSymbols: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Whether you have required users to use at least one uppercase letter in their password.
    */
  var requireUppercase: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * In the password policy you have set, refers to the number of days a temporary password is valid. If the user does not sign-in during this time, their password will need to be reset by an administrator.
    */
  var temporaryPasswordValidityDays: js.UndefOr[Input[Double]] = js.undefined
}
object UserPoolPasswordPolicy {
  
  inline def apply(): UserPoolPasswordPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolPasswordPolicy]
  }
  
  extension [Self <: UserPoolPasswordPolicy](x: Self) {
    
    inline def setMinimumLength(value: Input[Double]): Self = StObject.set(x, "minimumLength", value.asInstanceOf[js.Any])
    
    inline def setMinimumLengthUndefined: Self = StObject.set(x, "minimumLength", js.undefined)
    
    inline def setRequireLowercase(value: Input[Boolean]): Self = StObject.set(x, "requireLowercase", value.asInstanceOf[js.Any])
    
    inline def setRequireLowercaseUndefined: Self = StObject.set(x, "requireLowercase", js.undefined)
    
    inline def setRequireNumbers(value: Input[Boolean]): Self = StObject.set(x, "requireNumbers", value.asInstanceOf[js.Any])
    
    inline def setRequireNumbersUndefined: Self = StObject.set(x, "requireNumbers", js.undefined)
    
    inline def setRequireSymbols(value: Input[Boolean]): Self = StObject.set(x, "requireSymbols", value.asInstanceOf[js.Any])
    
    inline def setRequireSymbolsUndefined: Self = StObject.set(x, "requireSymbols", js.undefined)
    
    inline def setRequireUppercase(value: Input[Boolean]): Self = StObject.set(x, "requireUppercase", value.asInstanceOf[js.Any])
    
    inline def setRequireUppercaseUndefined: Self = StObject.set(x, "requireUppercase", js.undefined)
    
    inline def setTemporaryPasswordValidityDays(value: Input[Double]): Self = StObject.set(x, "temporaryPasswordValidityDays", value.asInstanceOf[js.Any])
    
    inline def setTemporaryPasswordValidityDaysUndefined: Self = StObject.set(x, "temporaryPasswordValidityDays", js.undefined)
  }
}
