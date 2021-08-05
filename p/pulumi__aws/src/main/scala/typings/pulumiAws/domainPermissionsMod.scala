package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domainPermissionsMod {
  
  @JSImport("@pulumi/aws/codeartifact/domainPermissions", "DomainPermissions")
  @js.native
  class DomainPermissions protected () extends CustomResource {
    /**
      * Create a DomainPermissions resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainPermissionsArgs) = this()
    def this(name: String, args: DomainPermissionsArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the domain on which to set the resource policy.
      */
    val domain: Output_[String] = js.native
    
    /**
      * The account number of the AWS account that owns the domain.
      */
    val domainOwner: Output_[String] = js.native
    
    /**
      * A JSON policy string to be set as the access control resource policy on the provided domain.
      */
    val policyDocument: Output_[String] = js.native
    
    /**
      * The current revision of the resource policy to be set. This revision is used for optimistic locking, which prevents others from overwriting your changes to the domain's resource policy.
      */
    val policyRevision: Output_[String] = js.native
    
    /**
      * The ARN of the resource associated with the resource policy.
      */
    val resourceArn: Output_[String] = js.native
  }
  /* static members */
  object DomainPermissions {
    
    @JSImport("@pulumi/aws/codeartifact/domainPermissions", "DomainPermissions")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DomainPermissions resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): DomainPermissions = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[DomainPermissions]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): DomainPermissions = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DomainPermissions]
    inline def get(name: String, id: Input[ID], state: DomainPermissionsState): DomainPermissions = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[DomainPermissions]
    inline def get(name: String, id: Input[ID], state: DomainPermissionsState, opts: CustomResourceOptions): DomainPermissions = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DomainPermissions]
    
    /**
      * Returns true if the given object is an instance of DomainPermissions.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codeartifact/domainPermissions.DomainPermissions */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/codeartifact/domainPermissions.DomainPermissions */ Boolean]
  }
  
  trait DomainPermissionsArgs extends StObject {
    
    /**
      * The name of the domain on which to set the resource policy.
      */
    val domain: Input[String]
    
    /**
      * The account number of the AWS account that owns the domain.
      */
    val domainOwner: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A JSON policy string to be set as the access control resource policy on the provided domain.
      */
    val policyDocument: Input[String]
    
    /**
      * The current revision of the resource policy to be set. This revision is used for optimistic locking, which prevents others from overwriting your changes to the domain's resource policy.
      */
    val policyRevision: js.UndefOr[Input[String]] = js.undefined
  }
  object DomainPermissionsArgs {
    
    inline def apply(domain: Input[String], policyDocument: Input[String]): DomainPermissionsArgs = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], policyDocument = policyDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainPermissionsArgs]
    }
    
    extension [Self <: DomainPermissionsArgs](x: Self) {
      
      inline def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainOwner(value: Input[String]): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
      
      inline def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
      
      inline def setPolicyDocument(value: Input[String]): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
      
      inline def setPolicyRevision(value: Input[String]): Self = StObject.set(x, "policyRevision", value.asInstanceOf[js.Any])
      
      inline def setPolicyRevisionUndefined: Self = StObject.set(x, "policyRevision", js.undefined)
    }
  }
  
  trait DomainPermissionsState extends StObject {
    
    /**
      * The name of the domain on which to set the resource policy.
      */
    val domain: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The account number of the AWS account that owns the domain.
      */
    val domainOwner: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A JSON policy string to be set as the access control resource policy on the provided domain.
      */
    val policyDocument: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The current revision of the resource policy to be set. This revision is used for optimistic locking, which prevents others from overwriting your changes to the domain's resource policy.
      */
    val policyRevision: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the resource associated with the resource policy.
      */
    val resourceArn: js.UndefOr[Input[String]] = js.undefined
  }
  object DomainPermissionsState {
    
    inline def apply(): DomainPermissionsState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainPermissionsState]
    }
    
    extension [Self <: DomainPermissionsState](x: Self) {
      
      inline def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainOwner(value: Input[String]): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
      
      inline def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setPolicyDocument(value: Input[String]): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
      
      inline def setPolicyDocumentUndefined: Self = StObject.set(x, "policyDocument", js.undefined)
      
      inline def setPolicyRevision(value: Input[String]): Self = StObject.set(x, "policyRevision", value.asInstanceOf[js.Any])
      
      inline def setPolicyRevisionUndefined: Self = StObject.set(x, "policyRevision", js.undefined)
      
      inline def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
      
      inline def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
    }
  }
}
