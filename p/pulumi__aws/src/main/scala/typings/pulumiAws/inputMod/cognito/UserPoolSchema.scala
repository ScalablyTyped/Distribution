package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPoolSchema extends StObject {
  
  /**
    * The attribute data type. Must be one of `Boolean`, `Number`, `String`, `DateTime`.
    */
  var attributeDataType: Input[String] = js.native
  
  /**
    * Specifies whether the attribute type is developer only.
    */
  var developerOnlyAttribute: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Specifies whether the attribute can be changed once it has been created.
    */
  var mutable: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The name of the attribute.
    */
  var name: Input[String] = js.native
  
  /**
    * Specifies the constraints for an attribute of the number type.
    */
  var numberAttributeConstraints: js.UndefOr[Input[UserPoolSchemaNumberAttributeConstraints]] = js.native
  
  /**
    * Specifies whether a user pool attribute is required. If the attribute is required and the user does not provide a value, registration or sign-in will fail.
    */
  var required: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * -Specifies the constraints for an attribute of the string type.
    */
  var stringAttributeConstraints: js.UndefOr[Input[UserPoolSchemaStringAttributeConstraints]] = js.native
}
object UserPoolSchema {
  
  @scala.inline
  def apply(attributeDataType: Input[String], name: Input[String]): UserPoolSchema = {
    val __obj = js.Dynamic.literal(attributeDataType = attributeDataType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolSchema]
  }
  
  @scala.inline
  implicit class UserPoolSchemaMutableBuilder[Self <: UserPoolSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeDataType(value: Input[String]): Self = StObject.set(x, "attributeDataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperOnlyAttribute(value: Input[Boolean]): Self = StObject.set(x, "developerOnlyAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperOnlyAttributeUndefined: Self = StObject.set(x, "developerOnlyAttribute", js.undefined)
    
    @scala.inline
    def setMutable(value: Input[Boolean]): Self = StObject.set(x, "mutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutableUndefined: Self = StObject.set(x, "mutable", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberAttributeConstraints(value: Input[UserPoolSchemaNumberAttributeConstraints]): Self = StObject.set(x, "numberAttributeConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberAttributeConstraintsUndefined: Self = StObject.set(x, "numberAttributeConstraints", js.undefined)
    
    @scala.inline
    def setRequired(value: Input[Boolean]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setStringAttributeConstraints(value: Input[UserPoolSchemaStringAttributeConstraints]): Self = StObject.set(x, "stringAttributeConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringAttributeConstraintsUndefined: Self = StObject.set(x, "stringAttributeConstraints", js.undefined)
  }
}
