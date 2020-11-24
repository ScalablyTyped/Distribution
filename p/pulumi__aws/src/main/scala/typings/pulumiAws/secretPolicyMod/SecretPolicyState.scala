package typings.pulumiAws.secretPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecretPolicyState extends js.Object {
  
  /**
    * Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
    */
  val blockPublicPolicy: js.UndefOr[Input[Boolean]] = js.native
  
  val policy: js.UndefOr[Input[String]] = js.native
  
  /**
    * Secret ARN.
    */
  val secretArn: js.UndefOr[Input[String]] = js.native
}
object SecretPolicyState {
  
  @scala.inline
  def apply(): SecretPolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretPolicyState]
  }
  
  @scala.inline
  implicit class SecretPolicyStateOps[Self <: SecretPolicyState] (val x: Self) extends AnyVal {
    
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
    def setBlockPublicPolicy(value: Input[Boolean]): Self = this.set("blockPublicPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockPublicPolicy: Self = this.set("blockPublicPolicy", js.undefined)
    
    @scala.inline
    def setPolicy(value: Input[String]): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    
    @scala.inline
    def setSecretArn(value: Input[String]): Self = this.set("secretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretArn: Self = this.set("secretArn", js.undefined)
  }
}
