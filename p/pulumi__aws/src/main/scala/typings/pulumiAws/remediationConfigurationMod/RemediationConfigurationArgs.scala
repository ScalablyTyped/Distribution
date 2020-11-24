package typings.pulumiAws.remediationConfigurationMod

import typings.pulumiAws.inputMod.cfg.RemediationConfigurationParameter
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemediationConfigurationArgs extends js.Object {
  
  /**
    * The name of the AWS Config rule
    */
  val configRuleName: Input[String] = js.native
  
  /**
    * Can be specified multiple times for each
    * parameter. Each parameter block supports fields documented below.
    */
  val parameters: js.UndefOr[Input[js.Array[Input[RemediationConfigurationParameter]]]] = js.native
  
  /**
    * The type of a resource
    */
  val resourceType: js.UndefOr[Input[String]] = js.native
  
  /**
    * Target ID is the name of the public document
    */
  val targetId: Input[String] = js.native
  
  /**
    * The type of the target. Target executes remediation. For example, SSM document
    */
  val targetType: Input[String] = js.native
  
  /**
    * Version of the target. For example, version of the SSM document
    */
  val targetVersion: js.UndefOr[Input[String]] = js.native
}
object RemediationConfigurationArgs {
  
  @scala.inline
  def apply(configRuleName: Input[String], targetId: Input[String], targetType: Input[String]): RemediationConfigurationArgs = {
    val __obj = js.Dynamic.literal(configRuleName = configRuleName.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemediationConfigurationArgs]
  }
  
  @scala.inline
  implicit class RemediationConfigurationArgsOps[Self <: RemediationConfigurationArgs] (val x: Self) extends AnyVal {
    
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
    def setConfigRuleName(value: Input[String]): Self = this.set("configRuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetId(value: Input[String]): Self = this.set("targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetType(value: Input[String]): Self = this.set("targetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: Input[RemediationConfigurationParameter]*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: Input[js.Array[Input[RemediationConfigurationParameter]]]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setResourceType(value: Input[String]): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    
    @scala.inline
    def setTargetVersion(value: Input[String]): Self = this.set("targetVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetVersion: Self = this.set("targetVersion", js.undefined)
  }
}
