package typings.pulumiAws.ecrRepositoryMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ecr.RepositoryEncryptionConfiguration
import typings.pulumiAws.inputMod.ecr.RepositoryImageScanningConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepositoryArgs extends js.Object {
  
  /**
    * Encryption configuration for the repository. See below for schema.
    */
  val encryptionConfigurations: js.UndefOr[Input[js.Array[Input[RepositoryEncryptionConfiguration]]]] = js.native
  
  /**
    * Configuration block that defines image scanning configuration for the repository. By default, image scanning must be manually triggered. See the [ECR User Guide](https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html) for more information about image scanning.
    */
  val imageScanningConfiguration: js.UndefOr[Input[RepositoryImageScanningConfiguration]] = js.native
  
  /**
    * The tag mutability setting for the repository. Must be one of: `MUTABLE` or `IMMUTABLE`. Defaults to `MUTABLE`.
    */
  val imageTagMutability: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name of the repository.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object RepositoryArgs {
  
  @scala.inline
  def apply(): RepositoryArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryArgs]
  }
  
  @scala.inline
  implicit class RepositoryArgsOps[Self <: RepositoryArgs] (val x: Self) extends AnyVal {
    
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
    def setEncryptionConfigurationsVarargs(value: Input[RepositoryEncryptionConfiguration]*): Self = this.set("encryptionConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setEncryptionConfigurations(value: Input[js.Array[Input[RepositoryEncryptionConfiguration]]]): Self = this.set("encryptionConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionConfigurations: Self = this.set("encryptionConfigurations", js.undefined)
    
    @scala.inline
    def setImageScanningConfiguration(value: Input[RepositoryImageScanningConfiguration]): Self = this.set("imageScanningConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageScanningConfiguration: Self = this.set("imageScanningConfiguration", js.undefined)
    
    @scala.inline
    def setImageTagMutability(value: Input[String]): Self = this.set("imageTagMutability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageTagMutability: Self = this.set("imageTagMutability", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
