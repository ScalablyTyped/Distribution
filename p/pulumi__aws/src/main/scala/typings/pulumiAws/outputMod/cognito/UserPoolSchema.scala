package typings.pulumiAws.outputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPoolSchema extends js.Object {
  
  /**
    * The attribute data type. Must be one of `Boolean`, `Number`, `String`, `DateTime`.
    */
  var attributeDataType: String = js.native
  
  /**
    * Specifies whether the attribute type is developer only.
    */
  var developerOnlyAttribute: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies whether the attribute can be changed once it has been created.
    */
  var mutable: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the attribute.
    */
  var name: String = js.native
  
  /**
    * Specifies the constraints for an attribute of the number type.
    */
  var numberAttributeConstraints: js.UndefOr[UserPoolSchemaNumberAttributeConstraints] = js.native
  
  /**
    * Specifies whether a user pool attribute is required. If the attribute is required and the user does not provide a value, registration or sign-in will fail.
    */
  var required: js.UndefOr[Boolean] = js.native
  
  /**
    * -Specifies the constraints for an attribute of the string type.
    */
  var stringAttributeConstraints: js.UndefOr[UserPoolSchemaStringAttributeConstraints] = js.native
}
object UserPoolSchema {
  
  @scala.inline
  def apply(attributeDataType: String, name: String): UserPoolSchema = {
    val __obj = js.Dynamic.literal(attributeDataType = attributeDataType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolSchema]
  }
  
  @scala.inline
  implicit class UserPoolSchemaOps[Self <: UserPoolSchema] (val x: Self) extends AnyVal {
    
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
    def setAttributeDataType(value: String): Self = this.set("attributeDataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperOnlyAttribute(value: Boolean): Self = this.set("developerOnlyAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeveloperOnlyAttribute: Self = this.set("developerOnlyAttribute", js.undefined)
    
    @scala.inline
    def setMutable(value: Boolean): Self = this.set("mutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutable: Self = this.set("mutable", js.undefined)
    
    @scala.inline
    def setNumberAttributeConstraints(value: UserPoolSchemaNumberAttributeConstraints): Self = this.set("numberAttributeConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberAttributeConstraints: Self = this.set("numberAttributeConstraints", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setStringAttributeConstraints(value: UserPoolSchemaStringAttributeConstraints): Self = this.set("stringAttributeConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringAttributeConstraints: Self = this.set("stringAttributeConstraints", js.undefined)
  }
}
