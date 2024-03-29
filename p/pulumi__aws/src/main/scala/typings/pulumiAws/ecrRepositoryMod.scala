package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ecr.RepositoryEncryptionConfiguration
import typings.pulumiAws.outputMod.ecr.RepositoryImageScanningConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecrRepositoryMod {
  
  @JSImport("@pulumi/aws/ecr/repository", "Repository")
  @js.native
  class Repository protected () extends CustomResource {
    /**
      * Create a Repository resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RepositoryArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: RepositoryArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Full ARN of the repository.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Encryption configuration for the repository. See below for schema.
      */
    val encryptionConfigurations: Output_[js.UndefOr[js.Array[RepositoryEncryptionConfiguration]]] = js.native
    
    /**
      * Configuration block that defines image scanning configuration for the repository. By default, image scanning must be manually triggered. See the [ECR User Guide](https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html) for more information about image scanning.
      */
    val imageScanningConfiguration: Output_[js.UndefOr[RepositoryImageScanningConfiguration]] = js.native
    
    /**
      * The tag mutability setting for the repository. Must be one of: `MUTABLE` or `IMMUTABLE`. Defaults to `MUTABLE`.
      */
    val imageTagMutability: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Name of the repository.
      */
    val name: Output_[String] = js.native
    
    /**
      * The registry ID where the repository was created.
      */
    val registryId: Output_[String] = js.native
    
    /**
      * The URL of the repository (in the form `aws_account_id.dkr.ecr.region.amazonaws.com/repositoryName`).
      */
    val repositoryUrl: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Repository {
    
    @JSImport("@pulumi/aws/ecr/repository", "Repository")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Repository resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Repository = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Repository]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Repository = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Repository]
    inline def get(name: String, id: Input[ID], state: RepositoryState): Repository = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Repository]
    inline def get(name: String, id: Input[ID], state: RepositoryState, opts: CustomResourceOptions): Repository = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Repository]
    
    /**
      * Returns true if the given object is an instance of Repository.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecr/repository.Repository */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ecr/repository.Repository */ Boolean]
  }
  
  trait RepositoryArgs extends StObject {
    
    /**
      * Encryption configuration for the repository. See below for schema.
      */
    val encryptionConfigurations: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ecr.RepositoryEncryptionConfiguration]]
        ]
      ] = js.undefined
    
    /**
      * Configuration block that defines image scanning configuration for the repository. By default, image scanning must be manually triggered. See the [ECR User Guide](https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html) for more information about image scanning.
      */
    val imageScanningConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.ecr.RepositoryImageScanningConfiguration]] = js.undefined
    
    /**
      * The tag mutability setting for the repository. Must be one of: `MUTABLE` or `IMMUTABLE`. Defaults to `MUTABLE`.
      */
    val imageTagMutability: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the repository.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object RepositoryArgs {
    
    inline def apply(): RepositoryArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RepositoryArgs]
    }
    
    extension [Self <: RepositoryArgs](x: Self) {
      
      inline def setEncryptionConfigurations(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ecr.RepositoryEncryptionConfiguration]]
            ]
      ): Self = StObject.set(x, "encryptionConfigurations", value.asInstanceOf[js.Any])
      
      inline def setEncryptionConfigurationsUndefined: Self = StObject.set(x, "encryptionConfigurations", js.undefined)
      
      inline def setEncryptionConfigurationsVarargs(value: Input[typings.pulumiAws.inputMod.ecr.RepositoryEncryptionConfiguration]*): Self = StObject.set(x, "encryptionConfigurations", js.Array(value :_*))
      
      inline def setImageScanningConfiguration(value: Input[typings.pulumiAws.inputMod.ecr.RepositoryImageScanningConfiguration]): Self = StObject.set(x, "imageScanningConfiguration", value.asInstanceOf[js.Any])
      
      inline def setImageScanningConfigurationUndefined: Self = StObject.set(x, "imageScanningConfiguration", js.undefined)
      
      inline def setImageTagMutability(value: Input[String]): Self = StObject.set(x, "imageTagMutability", value.asInstanceOf[js.Any])
      
      inline def setImageTagMutabilityUndefined: Self = StObject.set(x, "imageTagMutability", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait RepositoryState extends StObject {
    
    /**
      * Full ARN of the repository.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Encryption configuration for the repository. See below for schema.
      */
    val encryptionConfigurations: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ecr.RepositoryEncryptionConfiguration]]
        ]
      ] = js.undefined
    
    /**
      * Configuration block that defines image scanning configuration for the repository. By default, image scanning must be manually triggered. See the [ECR User Guide](https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html) for more information about image scanning.
      */
    val imageScanningConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.ecr.RepositoryImageScanningConfiguration]] = js.undefined
    
    /**
      * The tag mutability setting for the repository. Must be one of: `MUTABLE` or `IMMUTABLE`. Defaults to `MUTABLE`.
      */
    val imageTagMutability: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the repository.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The registry ID where the repository was created.
      */
    val registryId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The URL of the repository (in the form `aws_account_id.dkr.ecr.region.amazonaws.com/repositoryName`).
      */
    val repositoryUrl: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object RepositoryState {
    
    inline def apply(): RepositoryState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RepositoryState]
    }
    
    extension [Self <: RepositoryState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setEncryptionConfigurations(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ecr.RepositoryEncryptionConfiguration]]
            ]
      ): Self = StObject.set(x, "encryptionConfigurations", value.asInstanceOf[js.Any])
      
      inline def setEncryptionConfigurationsUndefined: Self = StObject.set(x, "encryptionConfigurations", js.undefined)
      
      inline def setEncryptionConfigurationsVarargs(value: Input[typings.pulumiAws.inputMod.ecr.RepositoryEncryptionConfiguration]*): Self = StObject.set(x, "encryptionConfigurations", js.Array(value :_*))
      
      inline def setImageScanningConfiguration(value: Input[typings.pulumiAws.inputMod.ecr.RepositoryImageScanningConfiguration]): Self = StObject.set(x, "imageScanningConfiguration", value.asInstanceOf[js.Any])
      
      inline def setImageScanningConfigurationUndefined: Self = StObject.set(x, "imageScanningConfiguration", js.undefined)
      
      inline def setImageTagMutability(value: Input[String]): Self = StObject.set(x, "imageTagMutability", value.asInstanceOf[js.Any])
      
      inline def setImageTagMutabilityUndefined: Self = StObject.set(x, "imageTagMutability", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRegistryId(value: Input[String]): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
      
      inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
      
      inline def setRepositoryUrl(value: Input[String]): Self = StObject.set(x, "repositoryUrl", value.asInstanceOf[js.Any])
      
      inline def setRepositoryUrlUndefined: Self = StObject.set(x, "repositoryUrl", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
