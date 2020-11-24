package typings.pulumiAws.ecrGetRepositoryMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ecr.GetRepositoryEncryptionConfiguration
import typings.pulumiAws.outputMod.ecr.GetRepositoryImageScanningConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRepositoryResult extends js.Object {
  
  /**
    * Full ARN of the repository.
    */
  val arn: String = js.native
  
  /**
    * Encryption configuration for the repository. See Encryption Configuration below.
    */
  val encryptionConfigurations: js.Array[GetRepositoryEncryptionConfiguration] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * Configuration block that defines image scanning configuration for the repository. See Image Scanning Configuration below.
    */
  val imageScanningConfigurations: js.Array[GetRepositoryImageScanningConfiguration] = js.native
  
  /**
    * The tag mutability setting for the repository.
    */
  val imageTagMutability: String = js.native
  
  val name: String = js.native
  
  val registryId: String = js.native
  
  /**
    * The URL of the repository (in the form `aws_account_id.dkr.ecr.region.amazonaws.com/repositoryName`).
    */
  val repositoryUrl: String = js.native
  
  /**
    * A map of tags assigned to the resource.
    */
  val tags: StringDictionary[String] = js.native
}
object GetRepositoryResult {
  
  @scala.inline
  def apply(
    arn: String,
    encryptionConfigurations: js.Array[GetRepositoryEncryptionConfiguration],
    id: String,
    imageScanningConfigurations: js.Array[GetRepositoryImageScanningConfiguration],
    imageTagMutability: String,
    name: String,
    registryId: String,
    repositoryUrl: String,
    tags: StringDictionary[String]
  ): GetRepositoryResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], encryptionConfigurations = encryptionConfigurations.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageScanningConfigurations = imageScanningConfigurations.asInstanceOf[js.Any], imageTagMutability = imageTagMutability.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], registryId = registryId.asInstanceOf[js.Any], repositoryUrl = repositoryUrl.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryResult]
  }
  
  @scala.inline
  implicit class GetRepositoryResultOps[Self <: GetRepositoryResult] (val x: Self) extends AnyVal {
    
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
    def setEncryptionConfigurationsVarargs(value: GetRepositoryEncryptionConfiguration*): Self = this.set("encryptionConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setEncryptionConfigurations(value: js.Array[GetRepositoryEncryptionConfiguration]): Self = this.set("encryptionConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageScanningConfigurationsVarargs(value: GetRepositoryImageScanningConfiguration*): Self = this.set("imageScanningConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setImageScanningConfigurations(value: js.Array[GetRepositoryImageScanningConfiguration]): Self = this.set("imageScanningConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageTagMutability(value: String): Self = this.set("imageTagMutability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryId(value: String): Self = this.set("registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryUrl(value: String): Self = this.set("repositoryUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
}
