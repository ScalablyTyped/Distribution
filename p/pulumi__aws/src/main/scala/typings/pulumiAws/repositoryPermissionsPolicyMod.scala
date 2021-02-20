package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repositoryPermissionsPolicyMod {
  
  @JSImport("@pulumi/aws/codeartifact/repositoryPermissionsPolicy", "RepositoryPermissionsPolicy")
  @js.native
  class RepositoryPermissionsPolicy protected () extends CustomResource {
    /**
      * Create a RepositoryPermissionsPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RepositoryPermissionsPolicyArgs) = this()
    def this(name: String, args: RepositoryPermissionsPolicyArgs, opts: CustomResourceOptions) = this()
    
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
      * The name of the repository to set the resource policy on.
      */
    val repository: Output_[String] = js.native
    
    /**
      * The ARN of the resource associated with the resource policy.
      */
    val resourceArn: Output_[String] = js.native
  }
  /* static members */
  object RepositoryPermissionsPolicy {
    
    /**
      * Get an existing RepositoryPermissionsPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/codeartifact/repositoryPermissionsPolicy", "RepositoryPermissionsPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): RepositoryPermissionsPolicy = js.native
    @JSImport("@pulumi/aws/codeartifact/repositoryPermissionsPolicy", "RepositoryPermissionsPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RepositoryPermissionsPolicy = js.native
    @JSImport("@pulumi/aws/codeartifact/repositoryPermissionsPolicy", "RepositoryPermissionsPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: RepositoryPermissionsPolicyState): RepositoryPermissionsPolicy = js.native
    @JSImport("@pulumi/aws/codeartifact/repositoryPermissionsPolicy", "RepositoryPermissionsPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: RepositoryPermissionsPolicyState, opts: CustomResourceOptions): RepositoryPermissionsPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of RepositoryPermissionsPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/codeartifact/repositoryPermissionsPolicy", "RepositoryPermissionsPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codeartifact/repositoryPermissionsPolicy.RepositoryPermissionsPolicy */ Boolean = js.native
  }
  
  @js.native
  trait RepositoryPermissionsPolicyArgs extends StObject {
    
    /**
      * The name of the domain on which to set the resource policy.
      */
    val domain: Input[String] = js.native
    
    /**
      * The account number of the AWS account that owns the domain.
      */
    val domainOwner: js.UndefOr[Input[String]] = js.native
    
    /**
      * A JSON policy string to be set as the access control resource policy on the provided domain.
      */
    val policyDocument: Input[String] = js.native
    
    /**
      * The current revision of the resource policy to be set. This revision is used for optimistic locking, which prevents others from overwriting your changes to the domain's resource policy.
      */
    val policyRevision: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the repository to set the resource policy on.
      */
    val repository: Input[String] = js.native
  }
  object RepositoryPermissionsPolicyArgs {
    
    @scala.inline
    def apply(domain: Input[String], policyDocument: Input[String], repository: Input[String]): RepositoryPermissionsPolicyArgs = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], policyDocument = policyDocument.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryPermissionsPolicyArgs]
    }
    
    @scala.inline
    implicit class RepositoryPermissionsPolicyArgsMutableBuilder[Self <: RepositoryPermissionsPolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainOwner(value: Input[String]): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
      
      @scala.inline
      def setPolicyDocument(value: Input[String]): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyRevision(value: Input[String]): Self = StObject.set(x, "policyRevision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyRevisionUndefined: Self = StObject.set(x, "policyRevision", js.undefined)
      
      @scala.inline
      def setRepository(value: Input[String]): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RepositoryPermissionsPolicyState extends StObject {
    
    /**
      * The name of the domain on which to set the resource policy.
      */
    val domain: js.UndefOr[Input[String]] = js.native
    
    /**
      * The account number of the AWS account that owns the domain.
      */
    val domainOwner: js.UndefOr[Input[String]] = js.native
    
    /**
      * A JSON policy string to be set as the access control resource policy on the provided domain.
      */
    val policyDocument: js.UndefOr[Input[String]] = js.native
    
    /**
      * The current revision of the resource policy to be set. This revision is used for optimistic locking, which prevents others from overwriting your changes to the domain's resource policy.
      */
    val policyRevision: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the repository to set the resource policy on.
      */
    val repository: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the resource associated with the resource policy.
      */
    val resourceArn: js.UndefOr[Input[String]] = js.native
  }
  object RepositoryPermissionsPolicyState {
    
    @scala.inline
    def apply(): RepositoryPermissionsPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RepositoryPermissionsPolicyState]
    }
    
    @scala.inline
    implicit class RepositoryPermissionsPolicyStateMutableBuilder[Self <: RepositoryPermissionsPolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainOwner(value: Input[String]): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setPolicyDocument(value: Input[String]): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyDocumentUndefined: Self = StObject.set(x, "policyDocument", js.undefined)
      
      @scala.inline
      def setPolicyRevision(value: Input[String]): Self = StObject.set(x, "policyRevision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyRevisionUndefined: Self = StObject.set(x, "policyRevision", js.undefined)
      
      @scala.inline
      def setRepository(value: Input[String]): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      @scala.inline
      def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
    }
  }
}
