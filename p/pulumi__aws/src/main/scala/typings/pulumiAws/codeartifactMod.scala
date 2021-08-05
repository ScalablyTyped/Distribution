package typings.pulumiAws

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeartifactMod {
  
  @JSImport("@pulumi/aws/codeartifact", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/codeartifact", "Domain")
  @js.native
  class Domain protected ()
    extends typings.pulumiAws.domainMod.Domain {
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
    
    @JSImport("@pulumi/aws/codeartifact", "Domain")
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
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.domainMod.Domain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainMod.Domain]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.domainMod.Domain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainMod.Domain]
    inline def get(name: String, id: Input[ID], state: DomainState): typings.pulumiAws.domainMod.Domain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainMod.Domain]
    inline def get(name: String, id: Input[ID], state: DomainState, opts: CustomResourceOptions): typings.pulumiAws.domainMod.Domain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainMod.Domain]
    
    /**
      * Returns true if the given object is an instance of Domain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codeartifact/domain.Domain */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/codeartifact/domain.Domain */ Boolean]
  }
  
  @JSImport("@pulumi/aws/codeartifact", "DomainPermissions")
  @js.native
  class DomainPermissions protected ()
    extends typings.pulumiAws.domainPermissionsMod.DomainPermissions {
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
    
    @JSImport("@pulumi/aws/codeartifact", "DomainPermissions")
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
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.domainPermissionsMod.DomainPermissions = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainPermissionsMod.DomainPermissions]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.domainPermissionsMod.DomainPermissions = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainPermissionsMod.DomainPermissions]
    inline def get(name: String, id: Input[ID], state: DomainPermissionsState): typings.pulumiAws.domainPermissionsMod.DomainPermissions = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainPermissionsMod.DomainPermissions]
    inline def get(name: String, id: Input[ID], state: DomainPermissionsState, opts: CustomResourceOptions): typings.pulumiAws.domainPermissionsMod.DomainPermissions = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainPermissionsMod.DomainPermissions]
    
    /**
      * Returns true if the given object is an instance of DomainPermissions.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codeartifact/domainPermissions.DomainPermissions */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/codeartifact/domainPermissions.DomainPermissions */ Boolean]
  }
  
  @JSImport("@pulumi/aws/codeartifact", "Repository")
  @js.native
  class Repository protected ()
    extends typings.pulumiAws.repositoryMod.Repository {
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
    
    @JSImport("@pulumi/aws/codeartifact", "Repository")
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
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.repositoryMod.Repository = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.repositoryMod.Repository]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.repositoryMod.Repository = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.repositoryMod.Repository]
    inline def get(name: String, id: Input[ID], state: RepositoryState): typings.pulumiAws.repositoryMod.Repository = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.repositoryMod.Repository]
    inline def get(name: String, id: Input[ID], state: RepositoryState, opts: CustomResourceOptions): typings.pulumiAws.repositoryMod.Repository = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.repositoryMod.Repository]
    
    /**
      * Returns true if the given object is an instance of Repository.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codeartifact/repository.Repository */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/codeartifact/repository.Repository */ Boolean]
  }
  
  @JSImport("@pulumi/aws/codeartifact", "RepositoryPermissionsPolicy")
  @js.native
  class RepositoryPermissionsPolicy protected ()
    extends typings.pulumiAws.repositoryPermissionsPolicyMod.RepositoryPermissionsPolicy {
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
    
    @JSImport("@pulumi/aws/codeartifact", "RepositoryPermissionsPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RepositoryPermissionsPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.repositoryPermissionsPolicyMod.RepositoryPermissionsPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.repositoryPermissionsPolicyMod.RepositoryPermissionsPolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.repositoryPermissionsPolicyMod.RepositoryPermissionsPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.repositoryPermissionsPolicyMod.RepositoryPermissionsPolicy]
    inline def get(name: String, id: Input[ID], state: RepositoryPermissionsPolicyState): typings.pulumiAws.repositoryPermissionsPolicyMod.RepositoryPermissionsPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.repositoryPermissionsPolicyMod.RepositoryPermissionsPolicy]
    inline def get(name: String, id: Input[ID], state: RepositoryPermissionsPolicyState, opts: CustomResourceOptions): typings.pulumiAws.repositoryPermissionsPolicyMod.RepositoryPermissionsPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.repositoryPermissionsPolicyMod.RepositoryPermissionsPolicy]
    
    /**
      * Returns true if the given object is an instance of RepositoryPermissionsPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codeartifact/repositoryPermissionsPolicy.RepositoryPermissionsPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/codeartifact/repositoryPermissionsPolicy.RepositoryPermissionsPolicy */ Boolean]
  }
  
  inline def getAuthorizationToken(args: GetAuthorizationTokenArgs): js.Promise[GetAuthorizationTokenResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthorizationToken")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetAuthorizationTokenResult]]
  inline def getAuthorizationToken(args: GetAuthorizationTokenArgs, opts: InvokeOptions): js.Promise[GetAuthorizationTokenResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAuthorizationToken")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetAuthorizationTokenResult]]
  
  inline def getRepositoryEndpoint(args: GetRepositoryEndpointArgs): js.Promise[GetRepositoryEndpointResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRepositoryEndpoint")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetRepositoryEndpointResult]]
  inline def getRepositoryEndpoint(args: GetRepositoryEndpointArgs, opts: InvokeOptions): js.Promise[GetRepositoryEndpointResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRepositoryEndpoint")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRepositoryEndpointResult]]
}
