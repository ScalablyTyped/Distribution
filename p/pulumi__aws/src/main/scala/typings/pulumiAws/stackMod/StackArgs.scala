package typings.pulumiAws.stackMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackArgs extends js.Object {
  
  /**
    * A list of capabilities.
    * Valid values: `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, or `CAPABILITY_AUTO_EXPAND`
    */
  val capabilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Set to true to disable rollback of the stack if stack creation failed.
    * Conflicts with `onFailure`.
    */
  val disableRollback: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The ARN of an IAM role that AWS CloudFormation assumes to create the stack. If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
    */
  val iamRoleArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Stack name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of SNS topic ARNs to publish stack related events.
    */
  val notificationArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Action to be taken if stack creation fails. This must be
    * one of: `DO_NOTHING`, `ROLLBACK`, or `DELETE`. Conflicts with `disableRollback`.
    */
  val onFailure: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of Parameter structures that specify input parameters for the stack.
    */
  val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Structure containing the stack policy body.
    * Conflicts w/ `policyUrl`.
    */
  val policyBody: js.UndefOr[Input[String]] = js.native
  
  /**
    * Location of a file containing the stack policy.
    * Conflicts w/ `policyBody`.
    */
  val policyUrl: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of tags to associate with this stack.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Structure containing the template body (max size: 51,200 bytes).
    */
  val templateBody: js.UndefOr[Input[String]] = js.native
  
  /**
    * Location of a file containing the template body (max size: 460,800 bytes).
    */
  val templateUrl: js.UndefOr[Input[String]] = js.native
  
  /**
    * The amount of time that can pass before the stack status becomes `CREATE_FAILED`.
    */
  val timeoutInMinutes: js.UndefOr[Input[Double]] = js.native
}
object StackArgs {
  
  @scala.inline
  def apply(): StackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackArgs]
  }
  
  @scala.inline
  implicit class StackArgsOps[Self <: StackArgs] (val x: Self) extends AnyVal {
    
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
    def setCapabilitiesVarargs(value: Input[String]*): Self = this.set("capabilities", js.Array(value :_*))
    
    @scala.inline
    def setCapabilities(value: Input[js.Array[Input[String]]]): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapabilities: Self = this.set("capabilities", js.undefined)
    
    @scala.inline
    def setDisableRollback(value: Input[Boolean]): Self = this.set("disableRollback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableRollback: Self = this.set("disableRollback", js.undefined)
    
    @scala.inline
    def setIamRoleArn(value: Input[String]): Self = this.set("iamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamRoleArn: Self = this.set("iamRoleArn", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotificationArnsVarargs(value: Input[String]*): Self = this.set("notificationArns", js.Array(value :_*))
    
    @scala.inline
    def setNotificationArns(value: Input[js.Array[Input[String]]]): Self = this.set("notificationArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationArns: Self = this.set("notificationArns", js.undefined)
    
    @scala.inline
    def setOnFailure(value: Input[String]): Self = this.set("onFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFailure: Self = this.set("onFailure", js.undefined)
    
    @scala.inline
    def setParameters(value: Input[StringDictionary[Input[String]]]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setPolicyBody(value: Input[String]): Self = this.set("policyBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyBody: Self = this.set("policyBody", js.undefined)
    
    @scala.inline
    def setPolicyUrl(value: Input[String]): Self = this.set("policyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyUrl: Self = this.set("policyUrl", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTemplateBody(value: Input[String]): Self = this.set("templateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateBody: Self = this.set("templateBody", js.undefined)
    
    @scala.inline
    def setTemplateUrl(value: Input[String]): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateUrl: Self = this.set("templateUrl", js.undefined)
    
    @scala.inline
    def setTimeoutInMinutes(value: Input[Double]): Self = this.set("timeoutInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutInMinutes: Self = this.set("timeoutInMinutes", js.undefined)
  }
}
