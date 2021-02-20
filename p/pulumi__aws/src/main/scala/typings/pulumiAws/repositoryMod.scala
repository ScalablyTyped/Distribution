package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.codeartifact.RepositoryExternalConnections
import typings.pulumiAws.outputMod.codeartifact.RepositoryUpstream
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repositoryMod {
  
  @JSImport("@pulumi/aws/codeartifact/repository", "Repository")
  @js.native
  class Repository protected () extends CustomResource {
    /**
      * Create a Repository resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RepositoryArgs) = this()
    def this(name: String, args: RepositoryArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The account number of the AWS account that manages the repository.
      */
    val administratorAccount: Output_[String] = js.native
    
    /**
      * The ARN of the repository.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The description of the repository.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The domain that contains the created repository.
      */
    val domain: Output_[String] = js.native
    
    /**
      * The account number of the AWS account that owns the domain.
      */
    val domainOwner: Output_[String] = js.native
    
    /**
      * An array of external connections associated with the repository. Only one external connection can be set per repository. see External Connections.
      */
    val externalConnections: Output_[js.UndefOr[RepositoryExternalConnections]] = js.native
    
    /**
      * The name of the repository to create.
      */
    val repository: Output_[String] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * A list of upstream repositories to associate with the repository. The order of the upstream repositories in the list determines their priority order when AWS CodeArtifact looks for a requested package version. see Upstream
      */
    val upstreams: Output_[js.UndefOr[js.Array[RepositoryUpstream]]] = js.native
  }
  /* static members */
  object Repository {
    
    /**
      * Get an existing Repository resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/codeartifact/repository", "Repository.get")
    @js.native
    def get(name: String, id: Input[ID]): Repository = js.native
    @JSImport("@pulumi/aws/codeartifact/repository", "Repository.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Repository = js.native
    @JSImport("@pulumi/aws/codeartifact/repository", "Repository.get")
    @js.native
    def get(name: String, id: Input[ID], state: RepositoryState): Repository = js.native
    @JSImport("@pulumi/aws/codeartifact/repository", "Repository.get")
    @js.native
    def get(name: String, id: Input[ID], state: RepositoryState, opts: CustomResourceOptions): Repository = js.native
    
    /**
      * Returns true if the given object is an instance of Repository.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/codeartifact/repository", "Repository.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codeartifact/repository.Repository */ Boolean = js.native
  }
  
  @js.native
  trait RepositoryArgs extends StObject {
    
    /**
      * The description of the repository.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The domain that contains the created repository.
      */
    val domain: Input[String] = js.native
    
    /**
      * The account number of the AWS account that owns the domain.
      */
    val domainOwner: js.UndefOr[Input[String]] = js.native
    
    /**
      * An array of external connections associated with the repository. Only one external connection can be set per repository. see External Connections.
      */
    val externalConnections: js.UndefOr[Input[typings.pulumiAws.inputMod.codeartifact.RepositoryExternalConnections]] = js.native
    
    /**
      * The name of the repository to create.
      */
    val repository: Input[String] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * A list of upstream repositories to associate with the repository. The order of the upstream repositories in the list determines their priority order when AWS CodeArtifact looks for a requested package version. see Upstream
      */
    val upstreams: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.codeartifact.RepositoryUpstream]]]
      ] = js.native
  }
  object RepositoryArgs {
    
    @scala.inline
    def apply(domain: Input[String], repository: Input[String]): RepositoryArgs = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryArgs]
    }
    
    @scala.inline
    implicit class RepositoryArgsMutableBuilder[Self <: RepositoryArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainOwner(value: Input[String]): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
      
      @scala.inline
      def setExternalConnections(value: Input[typings.pulumiAws.inputMod.codeartifact.RepositoryExternalConnections]): Self = StObject.set(x, "externalConnections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalConnectionsUndefined: Self = StObject.set(x, "externalConnections", js.undefined)
      
      @scala.inline
      def setRepository(value: Input[String]): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUpstreams(value: Input[js.Array[Input[typings.pulumiAws.inputMod.codeartifact.RepositoryUpstream]]]): Self = StObject.set(x, "upstreams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpstreamsUndefined: Self = StObject.set(x, "upstreams", js.undefined)
      
      @scala.inline
      def setUpstreamsVarargs(value: Input[typings.pulumiAws.inputMod.codeartifact.RepositoryUpstream]*): Self = StObject.set(x, "upstreams", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RepositoryState extends StObject {
    
    /**
      * The account number of the AWS account that manages the repository.
      */
    val administratorAccount: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the repository.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The description of the repository.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The domain that contains the created repository.
      */
    val domain: js.UndefOr[Input[String]] = js.native
    
    /**
      * The account number of the AWS account that owns the domain.
      */
    val domainOwner: js.UndefOr[Input[String]] = js.native
    
    /**
      * An array of external connections associated with the repository. Only one external connection can be set per repository. see External Connections.
      */
    val externalConnections: js.UndefOr[Input[typings.pulumiAws.inputMod.codeartifact.RepositoryExternalConnections]] = js.native
    
    /**
      * The name of the repository to create.
      */
    val repository: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * A list of upstream repositories to associate with the repository. The order of the upstream repositories in the list determines their priority order when AWS CodeArtifact looks for a requested package version. see Upstream
      */
    val upstreams: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.codeartifact.RepositoryUpstream]]]
      ] = js.native
  }
  object RepositoryState {
    
    @scala.inline
    def apply(): RepositoryState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RepositoryState]
    }
    
    @scala.inline
    implicit class RepositoryStateMutableBuilder[Self <: RepositoryState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdministratorAccount(value: Input[String]): Self = StObject.set(x, "administratorAccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdministratorAccountUndefined: Self = StObject.set(x, "administratorAccount", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainOwner(value: Input[String]): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setExternalConnections(value: Input[typings.pulumiAws.inputMod.codeartifact.RepositoryExternalConnections]): Self = StObject.set(x, "externalConnections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalConnectionsUndefined: Self = StObject.set(x, "externalConnections", js.undefined)
      
      @scala.inline
      def setRepository(value: Input[String]): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUpstreams(value: Input[js.Array[Input[typings.pulumiAws.inputMod.codeartifact.RepositoryUpstream]]]): Self = StObject.set(x, "upstreams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpstreamsUndefined: Self = StObject.set(x, "upstreams", js.undefined)
      
      @scala.inline
      def setUpstreamsVarargs(value: Input[typings.pulumiAws.inputMod.codeartifact.RepositoryUpstream]*): Self = StObject.set(x, "upstreams", js.Array(value :_*))
    }
  }
}
