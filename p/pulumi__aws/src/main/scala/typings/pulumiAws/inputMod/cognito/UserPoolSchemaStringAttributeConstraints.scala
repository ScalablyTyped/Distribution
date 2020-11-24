package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPoolSchemaStringAttributeConstraints extends js.Object {
  
  /**
    * The maximum length of an attribute value of the string type.
    */
  var maxLength: js.UndefOr[Input[String]] = js.native
  
  /**
    * The minimum length of an attribute value of the string type.
    */
  var minLength: js.UndefOr[Input[String]] = js.native
}
object UserPoolSchemaStringAttributeConstraints {
  
  @scala.inline
  def apply(): UserPoolSchemaStringAttributeConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolSchemaStringAttributeConstraints]
  }
  
  @scala.inline
  implicit class UserPoolSchemaStringAttributeConstraintsOps[Self <: UserPoolSchemaStringAttributeConstraints] (val x: Self) extends AnyVal {
    
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
    def setMaxLength(value: Input[String]): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setMinLength(value: Input[String]): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
  }
}
