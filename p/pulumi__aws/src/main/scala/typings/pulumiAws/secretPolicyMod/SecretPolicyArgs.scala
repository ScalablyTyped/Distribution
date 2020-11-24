package typings.pulumiAws.secretPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecretPolicyArgs extends js.Object {
  
  /**
    * Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
    */
  val blockPublicPolicy: js.UndefOr[Input[Boolean]] = js.native
  
  val policy: Input[String] = js.native
  
  /**
    * Secret ARN.
    */
  val secretArn: Input[String] = js.native
}
object SecretPolicyArgs {
  
  @scala.inline
  def apply(policy: Input[String], secretArn: Input[String]): SecretPolicyArgs = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretPolicyArgs]
  }
  
  @scala.inline
  implicit class SecretPolicyArgsOps[Self <: SecretPolicyArgs] (val x: Self) extends AnyVal {
    
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
    def setPolicy(value: Input[String]): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretArn(value: Input[String]): Self = this.set("secretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockPublicPolicy(value: Input[Boolean]): Self = this.set("blockPublicPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockPublicPolicy: Self = this.set("blockPublicPolicy", js.undefined)
  }
}
