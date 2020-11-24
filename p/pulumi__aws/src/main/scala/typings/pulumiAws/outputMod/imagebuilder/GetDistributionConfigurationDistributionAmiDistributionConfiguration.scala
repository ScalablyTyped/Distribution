package typings.pulumiAws.outputMod.imagebuilder

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDistributionConfigurationDistributionAmiDistributionConfiguration extends js.Object {
  
  /**
    * Key-value map of tags to apply to distributed AMI.
    */
  var amiTags: StringDictionary[String] = js.native
  
  /**
    * Description to apply to distributed AMI.
    */
  var description: String = js.native
  
  /**
    * Amazon Resource Name (ARN) of Key Management Service (KMS) Key to encrypt AMI.
    */
  var kmsKeyId: String = js.native
  
  /**
    * Nested list of EC2 launch permissions.
    */
  var launchPermissions: js.Array[
    GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission
  ] = js.native
  
  /**
    * Name of the distribution configuration.
    */
  var name: String = js.native
  
  /**
    * Set of target AWS Account identifiers.
    */
  var targetAccountIds: js.Array[String] = js.native
}
object GetDistributionConfigurationDistributionAmiDistributionConfiguration {
  
  @scala.inline
  def apply(
    amiTags: StringDictionary[String],
    description: String,
    kmsKeyId: String,
    launchPermissions: js.Array[
      GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission
    ],
    name: String,
    targetAccountIds: js.Array[String]
  ): GetDistributionConfigurationDistributionAmiDistributionConfiguration = {
    val __obj = js.Dynamic.literal(amiTags = amiTags.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], launchPermissions = launchPermissions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], targetAccountIds = targetAccountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDistributionConfigurationDistributionAmiDistributionConfiguration]
  }
  
  @scala.inline
  implicit class GetDistributionConfigurationDistributionAmiDistributionConfigurationOps[Self <: GetDistributionConfigurationDistributionAmiDistributionConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAmiTags(value: StringDictionary[String]): Self = this.set("amiTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchPermissionsVarargs(value: GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission*): Self = this.set("launchPermissions", js.Array(value :_*))
    
    @scala.inline
    def setLaunchPermissions(
      value: js.Array[
          GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission
        ]
    ): Self = this.set("launchPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetAccountIdsVarargs(value: String*): Self = this.set("targetAccountIds", js.Array(value :_*))
    
    @scala.inline
    def setTargetAccountIds(value: js.Array[String]): Self = this.set("targetAccountIds", value.asInstanceOf[js.Any])
  }
}
