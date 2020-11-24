package typings.pulumiAws.lifecyclePolicyMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.dlm.LifecyclePolicyPolicyDetails
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecyclePolicyArgs extends js.Object {
  
  /**
    * A description for the DLM lifecycle policy.
    */
  val description: Input[String] = js.native
  
  /**
    * The ARN of an IAM role that is able to be assumed by the DLM service.
    */
  val executionRoleArn: Input[String] = js.native
  
  /**
    * See the `policyDetails` configuration block. Max of 1.
    */
  val policyDetails: Input[LifecyclePolicyPolicyDetails] = js.native
  
  /**
    * Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
    */
  val state: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object LifecyclePolicyArgs {
  
  @scala.inline
  def apply(
    description: Input[String],
    executionRoleArn: Input[String],
    policyDetails: Input[LifecyclePolicyPolicyDetails]
  ): LifecyclePolicyArgs = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], executionRoleArn = executionRoleArn.asInstanceOf[js.Any], policyDetails = policyDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyArgs]
  }
  
  @scala.inline
  implicit class LifecyclePolicyArgsOps[Self <: LifecyclePolicyArgs] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionRoleArn(value: Input[String]): Self = this.set("executionRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyDetails(value: Input[LifecyclePolicyPolicyDetails]): Self = this.set("policyDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: Input[String]): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
