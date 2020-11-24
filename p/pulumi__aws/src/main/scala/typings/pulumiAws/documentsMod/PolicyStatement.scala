package typings.pulumiAws.documentsMod

import typings.pulumiAws.pulumiAwsStrings.Allow
import typings.pulumiAws.pulumiAwsStrings.Deny
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyStatement extends js.Object {
  
  /**
    * Include a list of actions that the policy allows or denies. Required (either Action or NotAction)
    * Reference: https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_action.html
    */
  var Action: js.UndefOr[Input[js.Array[Input[String]] | String]] = js.native
  
  /**
    * Specify the circumstances under which the policy grants permission.
    */
  var Condition: js.UndefOr[Input[Conditions]] = js.native
  
  /**
    * Indicate whether the policy allows or denies access.
    */
  var Effect: Input[Allow | Deny] = js.native
  
  /**
    * Include a list of actions that are not covered by this policy. Required (either Action or NotAction)
    * Reference: https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_notaction.html
    */
  var NotAction: js.UndefOr[Input[js.Array[Input[String]] | String]] = js.native
  
  /**
    * Indicate the account, user, role, or federated user to which this policy does not apply.
    */
  var NotPrincipal: js.UndefOr[Input[Principal]] = js.native
  
  /**
    * A list of resources that are specifically excluded by this policy.
    */
  var NotResource: js.UndefOr[Input[js.Array[Input[String]] | String]] = js.native
  
  /**
    * Indicate the account, user, role, or federated user to which you would like to allow or deny access. If you are
    * creating a policy to attach to a user or role, you cannot include this element. The principal is implied as that
    * user or role.
    */
  var Principal: js.UndefOr[Input[typings.pulumiAws.documentsMod.Principal]] = js.native
  
  /**
    * A list of resources to which the actions apply.
    */
  var Resource: js.UndefOr[Input[js.Array[Input[String]] | String]] = js.native
  
  /**
    * An optional statement ID to differentiate between your statements.
    */
  var Sid: js.UndefOr[Input[String]] = js.native
}
object PolicyStatement {
  
  @scala.inline
  def apply(Effect: Input[Allow | Deny]): PolicyStatement = {
    val __obj = js.Dynamic.literal(Effect = Effect.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyStatement]
  }
  
  @scala.inline
  implicit class PolicyStatementOps[Self <: PolicyStatement] (val x: Self) extends AnyVal {
    
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
    def setEffect(value: Input[Allow | Deny]): Self = this.set("Effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionVarargs(value: Input[String]*): Self = this.set("Action", js.Array(value :_*))
    
    @scala.inline
    def setAction(value: Input[js.Array[Input[String]] | String]): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("Action", js.undefined)
    
    @scala.inline
    def setCondition(value: Input[Conditions]): Self = this.set("Condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("Condition", js.undefined)
    
    @scala.inline
    def setNotActionVarargs(value: Input[String]*): Self = this.set("NotAction", js.Array(value :_*))
    
    @scala.inline
    def setNotAction(value: Input[js.Array[Input[String]] | String]): Self = this.set("NotAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotAction: Self = this.set("NotAction", js.undefined)
    
    @scala.inline
    def setNotPrincipal(value: Input[Principal]): Self = this.set("NotPrincipal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotPrincipal: Self = this.set("NotPrincipal", js.undefined)
    
    @scala.inline
    def setNotResourceVarargs(value: Input[String]*): Self = this.set("NotResource", js.Array(value :_*))
    
    @scala.inline
    def setNotResource(value: Input[js.Array[Input[String]] | String]): Self = this.set("NotResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotResource: Self = this.set("NotResource", js.undefined)
    
    @scala.inline
    def setPrincipal(value: Input[Principal]): Self = this.set("Principal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipal: Self = this.set("Principal", js.undefined)
    
    @scala.inline
    def setResourceVarargs(value: Input[String]*): Self = this.set("Resource", js.Array(value :_*))
    
    @scala.inline
    def setResource(value: Input[js.Array[Input[String]] | String]): Self = this.set("Resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("Resource", js.undefined)
    
    @scala.inline
    def setSid(value: Input[String]): Self = this.set("Sid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSid: Self = this.set("Sid", js.undefined)
  }
}
