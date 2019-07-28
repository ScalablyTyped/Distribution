package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.ecrGetCredentialsMod.GetCredentialsArgs
import typings.atPulumiAws.ecrGetCredentialsMod.GetCredentialsResult
import typings.atPulumiAws.ecrGetImageMod.GetImageArgs
import typings.atPulumiAws.ecrGetImageMod.GetImageResult
import typings.atPulumiAws.ecrGetRepositoryMod.GetRepositoryArgs
import typings.atPulumiAws.ecrGetRepositoryMod.GetRepositoryResult
import typings.atPulumiAws.ecrLifecyclePolicyMod.LifecyclePolicyArgs
import typings.atPulumiAws.ecrLifecyclePolicyMod.LifecyclePolicyState
import typings.atPulumiAws.ecrRepositoryMod.RepositoryArgs
import typings.atPulumiAws.ecrRepositoryMod.RepositoryState
import typings.atPulumiAws.ecrRepositoryPolicyMod.RepositoryPolicyArgs
import typings.atPulumiAws.ecrRepositoryPolicyMod.RepositoryPolicyState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ecr")
@js.native
object ecrNs extends js.Object {
  @js.native
  class LifecyclePolicy protected ()
    extends typings.atPulumiAws.ecrMod.LifecyclePolicy {
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
  
  @js.native
  class Repository protected ()
    extends typings.atPulumiAws.ecrMod.Repository {
    /**
      * Create a Repository resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RepositoryArgs) = this()
    def this(name: String, args: RepositoryArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class RepositoryPolicy protected ()
    extends typings.atPulumiAws.ecrMod.RepositoryPolicy {
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
  
  def getCredentials(args: GetCredentialsArgs): js.Promise[GetCredentialsResult] with GetCredentialsResult = js.native
  def getCredentials(args: GetCredentialsArgs, opts: InvokeOptions): js.Promise[GetCredentialsResult] with GetCredentialsResult = js.native
  def getImage(args: GetImageArgs): js.Promise[GetImageResult] with GetImageResult = js.native
  def getImage(args: GetImageArgs, opts: InvokeOptions): js.Promise[GetImageResult] with GetImageResult = js.native
  def getRepository(args: GetRepositoryArgs): js.Promise[GetRepositoryResult] with GetRepositoryResult = js.native
  def getRepository(args: GetRepositoryArgs, opts: InvokeOptions): js.Promise[GetRepositoryResult] with GetRepositoryResult = js.native
  /* static members */
  @js.native
  object LifecyclePolicy extends js.Object {
    /**
      * Get an existing LifecyclePolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ecrLifecyclePolicyMod.LifecyclePolicy = js.native
    def get(name: String, id: Input[ID], state: LifecyclePolicyState): typings.atPulumiAws.ecrLifecyclePolicyMod.LifecyclePolicy = js.native
    def get(name: String, id: Input[ID], state: LifecyclePolicyState, opts: CustomResourceOptions): typings.atPulumiAws.ecrLifecyclePolicyMod.LifecyclePolicy = js.native
    /**
      * Returns true if the given object is an instance of LifecyclePolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecr/lifecyclePolicy.LifecyclePolicy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Repository extends js.Object {
    /**
      * Get an existing Repository resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ecrRepositoryMod.Repository = js.native
    def get(name: String, id: Input[ID], state: RepositoryState): typings.atPulumiAws.ecrRepositoryMod.Repository = js.native
    def get(name: String, id: Input[ID], state: RepositoryState, opts: CustomResourceOptions): typings.atPulumiAws.ecrRepositoryMod.Repository = js.native
    /**
      * Returns true if the given object is an instance of Repository.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecr/repository.Repository */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object RepositoryPolicy extends js.Object {
    /**
      * Get an existing RepositoryPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ecrRepositoryPolicyMod.RepositoryPolicy = js.native
    def get(name: String, id: Input[ID], state: RepositoryPolicyState): typings.atPulumiAws.ecrRepositoryPolicyMod.RepositoryPolicy = js.native
    def get(name: String, id: Input[ID], state: RepositoryPolicyState, opts: CustomResourceOptions): typings.atPulumiAws.ecrRepositoryPolicyMod.RepositoryPolicy = js.native
    /**
      * Returns true if the given object is an instance of RepositoryPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecr/repositoryPolicy.RepositoryPolicy */ Boolean = js.native
  }
  
}

