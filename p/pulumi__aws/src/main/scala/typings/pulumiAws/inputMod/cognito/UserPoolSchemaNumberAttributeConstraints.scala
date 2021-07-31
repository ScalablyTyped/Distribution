package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolSchemaNumberAttributeConstraints extends StObject {
  
  /**
    * The maximum value of an attribute that is of the number data type.
    */
  var maxValue: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The minimum value of an attribute that is of the number data type.
    */
  var minValue: js.UndefOr[Input[String]] = js.undefined
}
object UserPoolSchemaNumberAttributeConstraints {
  
  @scala.inline
  def apply(): UserPoolSchemaNumberAttributeConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolSchemaNumberAttributeConstraints]
  }
  
  @scala.inline
  implicit class UserPoolSchemaNumberAttributeConstraintsMutableBuilder[Self <: UserPoolSchemaNumberAttributeConstraints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxValue(value: Input[String]): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Input[String]): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
  }
}
