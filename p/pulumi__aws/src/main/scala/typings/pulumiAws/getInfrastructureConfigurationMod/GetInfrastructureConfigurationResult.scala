package typings.pulumiAws.getInfrastructureConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.imagebuilder.GetInfrastructureConfigurationLogging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInfrastructureConfigurationResult extends js.Object {
  
  val arn: String = js.native
  
  /**
    * Date the infrastructure configuration was updated.
    */
  val dateCreated: String = js.native
  
  val dateUpdated: String = js.native
  
  /**
    * Description of the infrastructure configuration.
    */
  val description: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * Name of the IAM Instance Profile associated with the configuration.
    */
  val instanceProfileName: String = js.native
  
  /**
    * Set of EC2 Instance Types associated with the configuration.
    */
  val instanceTypes: js.Array[String] = js.native
  
  /**
    * Name of the EC2 Key Pair associated with the configuration.
    */
  val keyPair: String = js.native
  
  /**
    * Nested list of logging settings.
    */
  val loggings: js.Array[GetInfrastructureConfigurationLogging] = js.native
  
  /**
    * Name of the infrastructure configuration.
    */
  val name: String = js.native
  
  /**
    * Key-value map of resource tags for the infrastructure created by the infrastructure configuration.
    */
  val resourceTags: StringDictionary[String] = js.native
  
  /**
    * Set of EC2 Security Group identifiers associated with the configuration.
    */
  val securityGroupIds: js.Array[String] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the SNS Topic associated with the configuration.
    */
  val snsTopicArn: String = js.native
  
  /**
    * Identifier of the EC2 Subnet associated with the configuration.
    */
  val subnetId: String = js.native
  
  /**
    * Key-value map of resource tags for the infrastructure configuration.
    */
  val tags: StringDictionary[String] = js.native
  
  /**
    * Whether instances are terminated on failure.
    */
  val terminateInstanceOnFailure: Boolean = js.native
}
object GetInfrastructureConfigurationResult {
  
  @scala.inline
  def apply(
    arn: String,
    dateCreated: String,
    dateUpdated: String,
    description: String,
    id: String,
    instanceProfileName: String,
    instanceTypes: js.Array[String],
    keyPair: String,
    loggings: js.Array[GetInfrastructureConfigurationLogging],
    name: String,
    resourceTags: StringDictionary[String],
    securityGroupIds: js.Array[String],
    snsTopicArn: String,
    subnetId: String,
    tags: StringDictionary[String],
    terminateInstanceOnFailure: Boolean
  ): GetInfrastructureConfigurationResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceProfileName = instanceProfileName.asInstanceOf[js.Any], instanceTypes = instanceTypes.asInstanceOf[js.Any], keyPair = keyPair.asInstanceOf[js.Any], loggings = loggings.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceTags = resourceTags.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any], snsTopicArn = snsTopicArn.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], terminateInstanceOnFailure = terminateInstanceOnFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInfrastructureConfigurationResult]
  }
  
  @scala.inline
  implicit class GetInfrastructureConfigurationResultOps[Self <: GetInfrastructureConfigurationResult] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCreated(value: String): Self = this.set("dateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUpdated(value: String): Self = this.set("dateUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceProfileName(value: String): Self = this.set("instanceProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypesVarargs(value: String*): Self = this.set("instanceTypes", js.Array(value :_*))
    
    @scala.inline
    def setInstanceTypes(value: js.Array[String]): Self = this.set("instanceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPair(value: String): Self = this.set("keyPair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingsVarargs(value: GetInfrastructureConfigurationLogging*): Self = this.set("loggings", js.Array(value :_*))
    
    @scala.inline
    def setLoggings(value: js.Array[GetInfrastructureConfigurationLogging]): Self = this.set("loggings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTags(value: StringDictionary[String]): Self = this.set("resourceTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = this.set("securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: js.Array[String]): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsTopicArn(value: String): Self = this.set("snsTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetId(value: String): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminateInstanceOnFailure(value: Boolean): Self = this.set("terminateInstanceOnFailure", value.asInstanceOf[js.Any])
  }
}
