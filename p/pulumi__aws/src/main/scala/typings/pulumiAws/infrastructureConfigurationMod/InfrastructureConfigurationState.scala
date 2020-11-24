package typings.pulumiAws.infrastructureConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.imagebuilder.InfrastructureConfigurationLogging
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfrastructureConfigurationState extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of the configuration.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Date when the configuration was created.
    */
  val dateCreated: js.UndefOr[Input[String]] = js.native
  
  /**
    * Date when the configuration was updated.
    */
  val dateUpdated: js.UndefOr[Input[String]] = js.native
  
  /**
    * Description for the configuration.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name of IAM Instance Profile.
    */
  val instanceProfileName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Set of EC2 Instance Types.
    */
  val instanceTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Name of EC2 Key Pair.
    */
  val keyPair: js.UndefOr[Input[String]] = js.native
  
  /**
    * Configuration block with logging settings. Detailed below.
    */
  val logging: js.UndefOr[Input[InfrastructureConfigurationLogging]] = js.native
  
  /**
    * Name for the configuration.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of resource tags to assign to infrastructure created by the configuration.
    */
  val resourceTags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Set of EC2 Security Group identifiers.
    */
  val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Amazon Resource Name (ARN) of SNS Topic.
    */
  val snsTopicArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * EC2 Subnet identifier. Also requires `securityGroupIds` argument.
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of resource tags to assign to the configuration.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Enable if the instance should be terminated when the pipeline fails. Defaults to `false`.
    */
  val terminateInstanceOnFailure: js.UndefOr[Input[Boolean]] = js.native
}
object InfrastructureConfigurationState {
  
  @scala.inline
  def apply(): InfrastructureConfigurationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfrastructureConfigurationState]
  }
  
  @scala.inline
  implicit class InfrastructureConfigurationStateOps[Self <: InfrastructureConfigurationState] (val x: Self) extends AnyVal {
    
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
    def setDateCreated(value: Input[String]): Self = this.set("dateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateCreated: Self = this.set("dateCreated", js.undefined)
    
    @scala.inline
    def setDateUpdated(value: Input[String]): Self = this.set("dateUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateUpdated: Self = this.set("dateUpdated", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setInstanceProfileName(value: Input[String]): Self = this.set("instanceProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceProfileName: Self = this.set("instanceProfileName", js.undefined)
    
    @scala.inline
    def setInstanceTypesVarargs(value: Input[String]*): Self = this.set("instanceTypes", js.Array(value :_*))
    
    @scala.inline
    def setInstanceTypes(value: Input[js.Array[Input[String]]]): Self = this.set("instanceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceTypes: Self = this.set("instanceTypes", js.undefined)
    
    @scala.inline
    def setKeyPair(value: Input[String]): Self = this.set("keyPair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPair: Self = this.set("keyPair", js.undefined)
    
    @scala.inline
    def setLogging(value: Input[InfrastructureConfigurationLogging]): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResourceTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("resourceTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceTags: Self = this.set("resourceTags", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("securityGroupIds", js.undefined)
    
    @scala.inline
    def setSnsTopicArn(value: Input[String]): Self = this.set("snsTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnsTopicArn: Self = this.set("snsTopicArn", js.undefined)
    
    @scala.inline
    def setSubnetId(value: Input[String]): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetId: Self = this.set("subnetId", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTerminateInstanceOnFailure(value: Input[Boolean]): Self = this.set("terminateInstanceOnFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminateInstanceOnFailure: Self = this.set("terminateInstanceOnFailure", js.undefined)
  }
}
