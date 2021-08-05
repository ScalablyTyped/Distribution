package typings.pulumiAws

import typings.pulumiAws.ecrGetAuthorizationTokenMod.GetAuthorizationTokenArgs
import typings.pulumiAws.ecrGetAuthorizationTokenMod.GetAuthorizationTokenResult
import typings.pulumiAws.ecrGetRepositoryMod.GetRepositoryArgs
import typings.pulumiAws.ecrGetRepositoryMod.GetRepositoryResult
import typings.pulumiAws.ecrLifecyclePolicyMod.LifecyclePolicyArgs
import typings.pulumiAws.ecrLifecyclePolicyMod.LifecyclePolicyState
import typings.pulumiAws.ecrRepositoryMod.RepositoryArgs
import typings.pulumiAws.ecrRepositoryMod.RepositoryState
import typings.pulumiAws.getCredentialsMod.GetCredentialsArgs
import typings.pulumiAws.getCredentialsMod.GetCredentialsResult
import typings.pulumiAws.getImageMod.GetImageArgs
import typings.pulumiAws.getImageMod.GetImageResult
import typings.pulumiAws.repositoryPolicyMod.RepositoryPolicyArgs
import typings.pulumiAws.repositoryPolicyMod.RepositoryPolicyState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecrMod {
  
  @JSImport("@pulumi/aws/ecr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/ecr", "LifecyclePolicy")
  @js.native
  class LifecyclePolicy protected ()
    extends typings.pulumiAws.ecrLifecyclePolicyMod.LifecyclePolicy {
    /**
      * Create a LifecyclePolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LifecyclePolicyArgs) = this()
    def this(name: String, args: LifecyclePolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LifecyclePolicy {
    
    @JSImport("@pulumi/aws/ecr", "LifecyclePolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LifecyclePolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.ecrLifecyclePolicyMod.LifecyclePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ecrLifecyclePolicyMod.LifecyclePolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.ecrLifecyclePolicyMod.LifecyclePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ecrLifecyclePolicyMod.LifecyclePolicy]
    inline def get(name: String, id: Input[ID], state: LifecyclePolicyState): typings.pulumiAws.ecrLifecyclePolicyMod.LifecyclePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ecrLifecyclePolicyMod.LifecyclePolicy]
    inline def get(name: String, id: Input[ID], state: LifecyclePolicyState, opts: CustomResourceOptions): typings.pulumiAws.ecrLifecyclePolicyMod.LifecyclePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ecrLifecyclePolicyMod.LifecyclePolicy]
    
    /**
      * Returns true if the given object is an instance of LifecyclePolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecr/lifecyclePolicy.LifecyclePolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ecr/lifecyclePolicy.LifecyclePolicy */ Boolean]
  }
  
  @JSImport("@pulumi/aws/ecr", "Repository")
  @js.native
  class Repository protected ()
    extends typings.pulumiAws.ecrRepositoryMod.Repository {
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
  }
  /* static members */
  object Repository {
    
    @JSImport("@pulumi/aws/ecr", "Repository")
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
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.ecrRepositoryMod.Repository = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ecrRepositoryMod.Repository]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.ecrRepositoryMod.Repository = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ecrRepositoryMod.Repository]
    inline def get(name: String, id: Input[ID], state: RepositoryState): typings.pulumiAws.ecrRepositoryMod.Repository = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ecrRepositoryMod.Repository]
    inline def get(name: String, id: Input[ID], state: RepositoryState, opts: CustomResourceOptions): typings.pulumiAws.ecrRepositoryMod.Repository = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ecrRepositoryMod.Repository]
    
    /**
      * Returns true if the given object is an instance of Repository.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecr/repository.Repository */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ecr/repository.Repository */ Boolean]
  }
  
  @JSImport("@pulumi/aws/ecr", "RepositoryPolicy")
  @js.native
  class RepositoryPolicy protected ()
    extends typings.pulumiAws.repositoryPolicyMod.RepositoryPolicy {
    /**
      * Create a RepositoryPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RepositoryPolicyArgs) = this()
    def this(name: String, args: RepositoryPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RepositoryPolicy {
    
    @JSImport("@pulumi/aws/ecr", "RepositoryPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RepositoryPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.repositoryPolicyMod.RepositoryPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.repositoryPolicyMod.RepositoryPolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.repositoryPolicyMod.RepositoryPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.repositoryPolicyMod.RepositoryPolicy]
    inline def get(name: String, id: Input[ID], state: RepositoryPolicyState): typings.pulumiAws.repositoryPolicyMod.RepositoryPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.repositoryPolicyMod.RepositoryPolicy]
    inline def get(name: String, id: Input[ID], state: RepositoryPolicyState, opts: CustomResourceOptions): typings.pulumiAws.repositoryPolicyMod.RepositoryPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.repositoryPolicyMod.RepositoryPolicy]
    
    /**
      * Returns true if the given object is an instance of RepositoryPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecr/repositoryPolicy.RepositoryPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ecr/repositoryPolicy.RepositoryPolicy */ Boolean]
  }
  
  inline def getAuthorizationToken(): js.Promise[GetAuthorizationTokenResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthorizationToken")().asInstanceOf[js.Promise[GetAuthorizationTokenResult]]
  inline def getAuthorizationToken(args: Unit, opts: InvokeOptions): js.Promise[GetAuthorizationTokenResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAuthorizationToken")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetAuthorizationTokenResult]]
  inline def getAuthorizationToken(args: GetAuthorizationTokenArgs): js.Promise[GetAuthorizationTokenResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthorizationToken")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetAuthorizationTokenResult]]
  inline def getAuthorizationToken(args: GetAuthorizationTokenArgs, opts: InvokeOptions): js.Promise[GetAuthorizationTokenResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAuthorizationToken")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetAuthorizationTokenResult]]
  
  inline def getCredentials(args: GetCredentialsArgs): js.Promise[GetCredentialsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCredentials")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetCredentialsResult]]
  inline def getCredentials(args: GetCredentialsArgs, opts: InvokeOptions): js.Promise[GetCredentialsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCredentials")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetCredentialsResult]]
  
  inline def getImage(args: GetImageArgs): js.Promise[GetImageResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getImage")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetImageResult]]
  inline def getImage(args: GetImageArgs, opts: InvokeOptions): js.Promise[GetImageResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImage")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetImageResult]]
  
  inline def getRepository(args: GetRepositoryArgs): js.Promise[GetRepositoryResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRepository")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetRepositoryResult]]
  inline def getRepository(args: GetRepositoryArgs, opts: InvokeOptions): js.Promise[GetRepositoryResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRepository")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRepositoryResult]]
}
