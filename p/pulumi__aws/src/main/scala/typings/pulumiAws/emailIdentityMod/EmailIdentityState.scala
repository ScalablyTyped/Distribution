package typings.pulumiAws.emailIdentityMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailIdentityState extends js.Object {
  
  /**
    * The ARN of the email identity.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The email address to assign to SES
    */
  val email: js.UndefOr[Input[String]] = js.native
}
object EmailIdentityState {
  
  @scala.inline
  def apply(): EmailIdentityState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailIdentityState]
  }
  
  @scala.inline
  implicit class EmailIdentityStateOps[Self <: EmailIdentityState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setEmail(value: Input[String]): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
  }
}
