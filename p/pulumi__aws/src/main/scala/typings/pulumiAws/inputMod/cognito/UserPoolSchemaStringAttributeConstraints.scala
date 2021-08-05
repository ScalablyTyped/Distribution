package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolSchemaStringAttributeConstraints extends StObject {
  
  /**
    * The maximum length of an attribute value of the string type.
    */
  var maxLength: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The minimum length of an attribute value of the string type.
    */
  var minLength: js.UndefOr[Input[String]] = js.undefined
}
object UserPoolSchemaStringAttributeConstraints {
  
  inline def apply(): UserPoolSchemaStringAttributeConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolSchemaStringAttributeConstraints]
  }
  
  extension [Self <: UserPoolSchemaStringAttributeConstraints](x: Self) {
    
    inline def setMaxLength(value: Input[String]): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMinLength(value: Input[String]): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
  }
}
