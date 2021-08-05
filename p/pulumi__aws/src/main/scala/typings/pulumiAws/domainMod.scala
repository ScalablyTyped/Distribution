package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domainMod {
  
  @JSImport("@pulumi/aws/codeartifact/domain", "Domain")
  @js.native
  class Domain protected () extends CustomResource {
    /**
      * Create a Domain resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainArgs) = this()
    def this(name: String, args: DomainArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of Domain.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The total size of all assets in the domain.
      */
    val assetSizeBytes: Output_[Double] = js.native
    
    /**
      * A timestamp that represents the date and time the domain was created in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
      */
    val createdTime: Output_[String] = js.native
    
    /**
      * The name of the domain to create. All domain names in an AWS Region that are in the same AWS account must be unique. The domain name is used as the prefix in DNS hostnames. Do not use sensitive information in a domain name because it is publicly discoverable.
      */
    val domain: Output_[String] = js.native
    
    /**
      * The encryption key for the domain. This is used to encrypt content stored in a domain. The KMS Key Amazon Resource Name (ARN).
      */
    val encryptionKey: Output_[String] = js.native
    
    /**
      * The AWS account ID that owns the domain.
      */
    val owner: Output_[String] = js.native
    
    /**
      * The number of repositories in the domain.
      */
    val repositoryCount: Output_[Double] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Domain {
    
    @JSImport("@pulumi/aws/codeartifact/domain", "Domain")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Domain resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Domain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Domain]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Domain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Domain]
    inline def get(name: String, id: Input[ID], state: DomainState): Domain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Domain]
    inline def get(name: String, id: Input[ID], state: DomainState, opts: CustomResourceOptions): Domain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Domain]
    
    /**
      * Returns true if the given object is an instance of Domain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codeartifact/domain.Domain */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/codeartifact/domain.Domain */ Boolean]
  }
  
  trait DomainArgs extends StObject {
    
    /**
      * The name of the domain to create. All domain names in an AWS Region that are in the same AWS account must be unique. The domain name is used as the prefix in DNS hostnames. Do not use sensitive information in a domain name because it is publicly discoverable.
      */
    val domain: Input[String]
    
    /**
      * The encryption key for the domain. This is used to encrypt content stored in a domain. The KMS Key Amazon Resource Name (ARN).
      */
    val encryptionKey: Input[String]
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object DomainArgs {
    
    inline def apply(domain: Input[String], encryptionKey: Input[String]): DomainArgs = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], encryptionKey = encryptionKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainArgs]
    }
    
    extension [Self <: DomainArgs](x: Self) {
      
      inline def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setEncryptionKey(value: Input[String]): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait DomainState extends StObject {
    
    /**
      * The ARN of Domain.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The total size of all assets in the domain.
      */
    val assetSizeBytes: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * A timestamp that represents the date and time the domain was created in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
      */
    val createdTime: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the domain to create. All domain names in an AWS Region that are in the same AWS account must be unique. The domain name is used as the prefix in DNS hostnames. Do not use sensitive information in a domain name because it is publicly discoverable.
      */
    val domain: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The encryption key for the domain. This is used to encrypt content stored in a domain. The KMS Key Amazon Resource Name (ARN).
      */
    val encryptionKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The AWS account ID that owns the domain.
      */
    val owner: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of repositories in the domain.
      */
    val repositoryCount: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object DomainState {
    
    inline def apply(): DomainState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainState]
    }
    
    extension [Self <: DomainState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setAssetSizeBytes(value: Input[Double]): Self = StObject.set(x, "assetSizeBytes", value.asInstanceOf[js.Any])
      
      inline def setAssetSizeBytesUndefined: Self = StObject.set(x, "assetSizeBytes", js.undefined)
      
      inline def setCreatedTime(value: Input[String]): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
      
      inline def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
      
      inline def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setEncryptionKey(value: Input[String]): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
      
      inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
      
      inline def setOwner(value: Input[String]): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
      
      inline def setRepositoryCount(value: Input[Double]): Self = StObject.set(x, "repositoryCount", value.asInstanceOf[js.Any])
      
      inline def setRepositoryCountUndefined: Self = StObject.set(x, "repositoryCount", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
