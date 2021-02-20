package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ecr.GetRepositoryEncryptionConfiguration
import typings.pulumiAws.outputMod.ecr.GetRepositoryImageScanningConfiguration
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecrGetRepositoryMod {
  
  @JSImport("@pulumi/aws/ecr/getRepository", "getRepository")
  @js.native
  def getRepository(args: GetRepositoryArgs): js.Promise[GetRepositoryResult] = js.native
  @JSImport("@pulumi/aws/ecr/getRepository", "getRepository")
  @js.native
  def getRepository(args: GetRepositoryArgs, opts: InvokeOptions): js.Promise[GetRepositoryResult] = js.native
  
  @js.native
  trait GetRepositoryArgs extends StObject {
    
    /**
      * The name of the ECR Repository.
      */
    val name: String = js.native
    
    /**
      * The registry ID where the repository was created.
      */
    val registryId: js.UndefOr[String] = js.native
    
    /**
      * A map of tags assigned to the resource.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetRepositoryArgs {
    
    @scala.inline
    def apply(name: String): GetRepositoryArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRepositoryArgs]
    }
    
    @scala.inline
    implicit class GetRepositoryArgsMutableBuilder[Self <: GetRepositoryArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistryId(value: String): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetRepositoryResult extends StObject {
    
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
    implicit class GetRepositoryResultMutableBuilder[Self <: GetRepositoryResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionConfigurations(value: js.Array[GetRepositoryEncryptionConfiguration]): Self = StObject.set(x, "encryptionConfigurations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionConfigurationsVarargs(value: GetRepositoryEncryptionConfiguration*): Self = StObject.set(x, "encryptionConfigurations", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageScanningConfigurations(value: js.Array[GetRepositoryImageScanningConfiguration]): Self = StObject.set(x, "imageScanningConfigurations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageScanningConfigurationsVarargs(value: GetRepositoryImageScanningConfiguration*): Self = StObject.set(x, "imageScanningConfigurations", js.Array(value :_*))
      
      @scala.inline
      def setImageTagMutability(value: String): Self = StObject.set(x, "imageTagMutability", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistryId(value: String): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryUrl(value: String): Self = StObject.set(x, "repositoryUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
