package typings.pulumiAws.lifecyclePolicyMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.dlm.LifecyclePolicyPolicyDetails
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecyclePolicyState extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of the DLM Lifecycle Policy.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * A description for the DLM lifecycle policy.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of an IAM role that is able to be assumed by the DLM service.
    */
  val executionRoleArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * See the `policyDetails` configuration block. Max of 1.
    */
  val policyDetails: js.UndefOr[Input[LifecyclePolicyPolicyDetails]] = js.native
  
  /**
    * Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
    */
  val state: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object LifecyclePolicyState {
  
  @scala.inline
  def apply(): LifecyclePolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecyclePolicyState]
  }
  
  @scala.inline
  implicit class LifecyclePolicyStateOps[Self <: LifecyclePolicyState] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExecutionRoleArn(value: Input[String]): Self = this.set("executionRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionRoleArn: Self = this.set("executionRoleArn", js.undefined)
    
    @scala.inline
    def setPolicyDetails(value: Input[LifecyclePolicyPolicyDetails]): Self = this.set("policyDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyDetails: Self = this.set("policyDetails", js.undefined)
    
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
