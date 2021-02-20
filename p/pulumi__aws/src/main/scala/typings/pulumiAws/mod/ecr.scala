package typings.pulumiAws.mod

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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecr {
  
  @JSImport("@pulumi/aws", "ecr.LifecyclePolicy")
  @js.native
  class LifecyclePolicy protected ()
    extends typings.pulumiAws.ecrMod.LifecyclePolicy {
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
    
    /**
      * Get an existing LifecyclePolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "ecr.LifecyclePolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.ecrLifecyclePolicyMod.LifecyclePolicy = js.native
    @JSImport("@pulumi/aws", "ecr.LifecyclePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.ecrLifecyclePolicyMod.LifecyclePolicy = js.native
    @JSImport("@pulumi/aws", "ecr.LifecyclePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LifecyclePolicyState): typings.pulumiAws.ecrLifecyclePolicyMod.LifecyclePolicy = js.native
    @JSImport("@pulumi/aws", "ecr.LifecyclePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LifecyclePolicyState, opts: CustomResourceOptions): typings.pulumiAws.ecrLifecyclePolicyMod.LifecyclePolicy = js.native
    
    /**
      * Returns true if the given object is an instance of LifecyclePolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ecr.LifecyclePolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecr/lifecyclePolicy.LifecyclePolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "ecr.Repository")
  @js.native
  class Repository protected ()
    extends typings.pulumiAws.ecrMod.Repository {
    /**
      * Create a Repository resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RepositoryArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
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
    @JSImport("@pulumi/aws", "ecr.Repository.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.ecrRepositoryMod.Repository = js.native
    @JSImport("@pulumi/aws", "ecr.Repository.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.ecrRepositoryMod.Repository = js.native
    @JSImport("@pulumi/aws", "ecr.Repository.get")
    @js.native
    def get(name: String, id: Input[ID], state: RepositoryState): typings.pulumiAws.ecrRepositoryMod.Repository = js.native
    @JSImport("@pulumi/aws", "ecr.Repository.get")
    @js.native
    def get(name: String, id: Input[ID], state: RepositoryState, opts: CustomResourceOptions): typings.pulumiAws.ecrRepositoryMod.Repository = js.native
    
    /**
      * Returns true if the given object is an instance of Repository.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ecr.Repository.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecr/repository.Repository */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "ecr.RepositoryPolicy")
  @js.native
  class RepositoryPolicy protected ()
    extends typings.pulumiAws.ecrMod.RepositoryPolicy {
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
    
    /**
      * Get an existing RepositoryPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "ecr.RepositoryPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.repositoryPolicyMod.RepositoryPolicy = js.native
    @JSImport("@pulumi/aws", "ecr.RepositoryPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.repositoryPolicyMod.RepositoryPolicy = js.native
    @JSImport("@pulumi/aws", "ecr.RepositoryPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: RepositoryPolicyState): typings.pulumiAws.repositoryPolicyMod.RepositoryPolicy = js.native
    @JSImport("@pulumi/aws", "ecr.RepositoryPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: RepositoryPolicyState, opts: CustomResourceOptions): typings.pulumiAws.repositoryPolicyMod.RepositoryPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of RepositoryPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ecr.RepositoryPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecr/repositoryPolicy.RepositoryPolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "ecr.getAuthorizationToken")
  @js.native
  def getAuthorizationToken(): js.Promise[GetAuthorizationTokenResult] = js.native
  @JSImport("@pulumi/aws", "ecr.getAuthorizationToken")
  @js.native
  def getAuthorizationToken(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetAuthorizationTokenResult] = js.native
  @JSImport("@pulumi/aws", "ecr.getAuthorizationToken")
  @js.native
  def getAuthorizationToken(args: GetAuthorizationTokenArgs): js.Promise[GetAuthorizationTokenResult] = js.native
  @JSImport("@pulumi/aws", "ecr.getAuthorizationToken")
  @js.native
  def getAuthorizationToken(args: GetAuthorizationTokenArgs, opts: InvokeOptions): js.Promise[GetAuthorizationTokenResult] = js.native
  
  @JSImport("@pulumi/aws", "ecr.getCredentials")
  @js.native
  def getCredentials(args: GetCredentialsArgs): js.Promise[GetCredentialsResult] = js.native
  @JSImport("@pulumi/aws", "ecr.getCredentials")
  @js.native
  def getCredentials(args: GetCredentialsArgs, opts: InvokeOptions): js.Promise[GetCredentialsResult] = js.native
  
  @JSImport("@pulumi/aws", "ecr.getImage")
  @js.native
  def getImage(args: GetImageArgs): js.Promise[GetImageResult] = js.native
  @JSImport("@pulumi/aws", "ecr.getImage")
  @js.native
  def getImage(args: GetImageArgs, opts: InvokeOptions): js.Promise[GetImageResult] = js.native
  
  @JSImport("@pulumi/aws", "ecr.getRepository")
  @js.native
  def getRepository(args: GetRepositoryArgs): js.Promise[GetRepositoryResult] = js.native
  @JSImport("@pulumi/aws", "ecr.getRepository")
  @js.native
  def getRepository(args: GetRepositoryArgs, opts: InvokeOptions): js.Promise[GetRepositoryResult] = js.native
}
