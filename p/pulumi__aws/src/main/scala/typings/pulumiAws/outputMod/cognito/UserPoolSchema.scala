package typings.pulumiAws.outputMod.cognito

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolSchema extends StObject {
  
  /**
    * The attribute data type. Must be one of `Boolean`, `Number`, `String`, `DateTime`.
    */
  var attributeDataType: String
  
  /**
    * Specifies whether the attribute type is developer only.
    */
  var developerOnlyAttribute: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the attribute can be changed once it has been created.
    */
  var mutable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the attribute.
    */
  var name: String
  
  /**
    * Specifies the constraints for an attribute of the number type.
    */
  var numberAttributeConstraints: js.UndefOr[UserPoolSchemaNumberAttributeConstraints] = js.undefined
  
  /**
    * Specifies whether a user pool attribute is required. If the attribute is required and the user does not provide a value, registration or sign-in will fail.
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * -Specifies the constraints for an attribute of the string type.
    */
  var stringAttributeConstraints: js.UndefOr[UserPoolSchemaStringAttributeConstraints] = js.undefined
}
object UserPoolSchema {
  
  inline def apply(attributeDataType: String, name: String): UserPoolSchema = {
    val __obj = js.Dynamic.literal(attributeDataType = attributeDataType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolSchema]
  }
  
  extension [Self <: UserPoolSchema](x: Self) {
    
    inline def setAttributeDataType(value: String): Self = StObject.set(x, "attributeDataType", value.asInstanceOf[js.Any])
    
    inline def setDeveloperOnlyAttribute(value: Boolean): Self = StObject.set(x, "developerOnlyAttribute", value.asInstanceOf[js.Any])
    
    inline def setDeveloperOnlyAttributeUndefined: Self = StObject.set(x, "developerOnlyAttribute", js.undefined)
    
    inline def setMutable(value: Boolean): Self = StObject.set(x, "mutable", value.asInstanceOf[js.Any])
    
    inline def setMutableUndefined: Self = StObject.set(x, "mutable", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNumberAttributeConstraints(value: UserPoolSchemaNumberAttributeConstraints): Self = StObject.set(x, "numberAttributeConstraints", value.asInstanceOf[js.Any])
    
    inline def setNumberAttributeConstraintsUndefined: Self = StObject.set(x, "numberAttributeConstraints", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setStringAttributeConstraints(value: UserPoolSchemaStringAttributeConstraints): Self = StObject.set(x, "stringAttributeConstraints", value.asInstanceOf[js.Any])
    
    inline def setStringAttributeConstraintsUndefined: Self = StObject.set(x, "stringAttributeConstraints", js.undefined)
  }
}
