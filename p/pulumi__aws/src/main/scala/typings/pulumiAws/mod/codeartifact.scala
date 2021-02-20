package typings.pulumiAws.mod

import typings.pulumiAws.domainMod.DomainArgs
import typings.pulumiAws.domainMod.DomainState
import typings.pulumiAws.domainPermissionsMod.DomainPermissionsArgs
import typings.pulumiAws.domainPermissionsMod.DomainPermissionsState
import typings.pulumiAws.getAuthorizationTokenMod.GetAuthorizationTokenArgs
import typings.pulumiAws.getAuthorizationTokenMod.GetAuthorizationTokenResult
import typings.pulumiAws.getRepositoryEndpointMod.GetRepositoryEndpointArgs
import typings.pulumiAws.getRepositoryEndpointMod.GetRepositoryEndpointResult
import typings.pulumiAws.repositoryMod.RepositoryArgs
import typings.pulumiAws.repositoryMod.RepositoryState
import typings.pulumiAws.repositoryPermissionsPolicyMod.RepositoryPermissionsPolicyArgs
import typings.pulumiAws.repositoryPermissionsPolicyMod.RepositoryPermissionsPolicyState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeartifact {
  
  @JSImport("@pulumi/aws", "codeartifact.Domain")
  @js.native
  class Domain protected ()
    extends typings.pulumiAws.codeartifactMod.Domain {
    /**
      * Create a Domain resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainArgs) = this()
    def this(name: String, args: DomainArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Domain {
    
    /**
      * Get an existing Domain resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "codeartifact.Domain.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.domainMod.Domain = js.native
    @JSImport("@pulumi/aws", "codeartifact.Domain.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.domainMod.Domain = js.native
    @JSImport("@pulumi/aws", "codeartifact.Domain.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainState): typings.pulumiAws.domainMod.Domain = js.native
    @JSImport("@pulumi/aws", "codeartifact.Domain.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainState, opts: CustomResourceOptions): typings.pulumiAws.domainMod.Domain = js.native
    
    /**
      * Returns true if the given object is an instance of Domain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "codeartifact.Domain.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codeartifact/domain.Domain */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "codeartifact.DomainPermissions")
  @js.native
  class DomainPermissions protected ()
    extends typings.pulumiAws.codeartifactMod.DomainPermissions {
    /**
      * Create a DomainPermissions resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainPermissionsArgs) = this()
    def this(name: String, args: DomainPermissionsArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object DomainPermissions {
    
    /**
      * Get an existing DomainPermissions resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "codeartifact.DomainPermissions.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.domainPermissionsMod.DomainPermissions = js.native
    @JSImport("@pulumi/aws", "codeartifact.DomainPermissions.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.domainPermissionsMod.DomainPermissions = js.native
    @JSImport("@pulumi/aws", "codeartifact.DomainPermissions.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainPermissionsState): typings.pulumiAws.domainPermissionsMod.DomainPermissions = js.native
    @JSImport("@pulumi/aws", "codeartifact.DomainPermissions.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainPermissionsState, opts: CustomResourceOptions): typings.pulumiAws.domainPermissionsMod.DomainPermissions = js.native
    
    /**
      * Returns true if the given object is an instance of DomainPermissions.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "codeartifact.DomainPermissions.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codeartifact/domainPermissions.DomainPermissions */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "codeartifact.Repository")
  @js.native
  class Repository protected ()
    extends typings.pulumiAws.codeartifactMod.Repository {
    /**
      * Create a Repository resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RepositoryArgs) = this()
    def this(name: String, args: RepositoryArgs, opts: CustomResourceOptions) = this()
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
    @JSImport("@pulumi/aws", "codeartifact.Repository.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.repositoryMod.Repository = js.native
    @JSImport("@pulumi/aws", "codeartifact.Repository.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.repositoryMod.Repository = js.native
    @JSImport("@pulumi/aws", "codeartifact.Repository.get")
    @js.native
    def get(name: String, id: Input[ID], state: RepositoryState): typings.pulumiAws.repositoryMod.Repository = js.native
    @JSImport("@pulumi/aws", "codeartifact.Repository.get")
    @js.native
    def get(name: String, id: Input[ID], state: RepositoryState, opts: CustomResourceOptions): typings.pulumiAws.repositoryMod.Repository = js.native
    
    /**
      * Returns true if the given object is an instance of Repository.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "codeartifact.Repository.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codeartifact/repository.Repository */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "codeartifact.RepositoryPermissionsPolicy")
  @js.native
  class RepositoryPermissionsPolicy protected ()
    extends typings.pulumiAws.codeartifactMod.RepositoryPermissionsPolicy {
    /**
      * Create a RepositoryPermissionsPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RepositoryPermissionsPolicyArgs) = this()
    def this(name: String, args: RepositoryPermissionsPolicyArgs, opts: CustomResourceOptions) = this()
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
    @JSImport("@pulumi/aws", "codeartifact.RepositoryPermissionsPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.repositoryPermissionsPolicyMod.RepositoryPermissionsPolicy = js.native
    @JSImport("@pulumi/aws", "codeartifact.RepositoryPermissionsPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.repositoryPermissionsPolicyMod.RepositoryPermissionsPolicy = js.native
    @JSImport("@pulumi/aws", "codeartifact.RepositoryPermissionsPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: RepositoryPermissionsPolicyState): typings.pulumiAws.repositoryPermissionsPolicyMod.RepositoryPermissionsPolicy = js.native
    @JSImport("@pulumi/aws", "codeartifact.RepositoryPermissionsPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: RepositoryPermissionsPolicyState, opts: CustomResourceOptions): typings.pulumiAws.repositoryPermissionsPolicyMod.RepositoryPermissionsPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of RepositoryPermissionsPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "codeartifact.RepositoryPermissionsPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codeartifact/repositoryPermissionsPolicy.RepositoryPermissionsPolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "codeartifact.getAuthorizationToken")
  @js.native
  def getAuthorizationToken(args: GetAuthorizationTokenArgs): js.Promise[GetAuthorizationTokenResult] = js.native
  @JSImport("@pulumi/aws", "codeartifact.getAuthorizationToken")
  @js.native
  def getAuthorizationToken(args: GetAuthorizationTokenArgs, opts: InvokeOptions): js.Promise[GetAuthorizationTokenResult] = js.native
  
  @JSImport("@pulumi/aws", "codeartifact.getRepositoryEndpoint")
  @js.native
  def getRepositoryEndpoint(args: GetRepositoryEndpointArgs): js.Promise[GetRepositoryEndpointResult] = js.native
  @JSImport("@pulumi/aws", "codeartifact.getRepositoryEndpoint")
  @js.native
  def getRepositoryEndpoint(args: GetRepositoryEndpointArgs, opts: InvokeOptions): js.Promise[GetRepositoryEndpointResult] = js.native
}
