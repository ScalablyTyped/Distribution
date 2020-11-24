package typings.pulumiAws.stackSetMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackSetState extends js.Object {
  
  /**
    * Amazon Resource Number (ARN) of the IAM Role in the administrator account.
    */
  val administrationRoleArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the StackSet.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of capabilities. Valid values: `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, `CAPABILITY_AUTO_EXPAND`.
    */
  val capabilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Description of the StackSet.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name of the IAM Role in all target accounts for StackSet operations. Defaults to `AWSCloudFormationStackSetExecutionRole`.
    */
  val executionRoleName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name of the StackSet. The name must be unique in the region where you create your StackSet. The name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start with an alphabetic character and cannot be longer than 128 characters.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of input parameters for the StackSet template. All template parameters, including those with a `Default`, must be configured or ignored with `lifecycle` configuration block `ignoreChanges` argument. All `NoEcho` template parameters must be ignored with the `lifecycle` configuration block `ignoreChanges` argument.
    */
  val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Unique identifier of the StackSet.
    */
  val stackSetId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of tags to associate with this StackSet and the Stacks created from it. AWS CloudFormation also propagates these tags to supported resources that are created in the Stacks. A maximum number of 50 tags can be specified.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * String containing the CloudFormation template body. Maximum size: 51,200 bytes. Conflicts with `templateUrl`.
    */
  val templateBody: js.UndefOr[Input[String]] = js.native
  
  /**
    * String containing the location of a file containing the CloudFormation template body. The URL must point to a template that is located in an Amazon S3 bucket. Maximum location file size: 460,800 bytes. Conflicts with `templateBody`.
    */
  val templateUrl: js.UndefOr[Input[String]] = js.native
}
object StackSetState {
  
  @scala.inline
  def apply(): StackSetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSetState]
  }
  
  @scala.inline
  implicit class StackSetStateOps[Self <: StackSetState] (val x: Self) extends AnyVal {
    
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
    def setAdministrationRoleArn(value: Input[String]): Self = this.set("administrationRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdministrationRoleArn: Self = this.set("administrationRoleArn", js.undefined)
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCapabilitiesVarargs(value: Input[String]*): Self = this.set("capabilities", js.Array(value :_*))
    
    @scala.inline
    def setCapabilities(value: Input[js.Array[Input[String]]]): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapabilities: Self = this.set("capabilities", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExecutionRoleName(value: Input[String]): Self = this.set("executionRoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionRoleName: Self = this.set("executionRoleName", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParameters(value: Input[StringDictionary[Input[String]]]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setStackSetId(value: Input[String]): Self = this.set("stackSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackSetId: Self = this.set("stackSetId", js.undefined)
    
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
  }
}
