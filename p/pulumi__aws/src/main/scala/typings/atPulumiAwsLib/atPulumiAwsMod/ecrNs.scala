package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ecr")
@js.native
object ecrNs extends js.Object {
  @js.native
  class LifecyclePolicy protected ()
    extends atPulumiAwsLib.ecrMod.LifecyclePolicy {
    /**
      * Create a LifecyclePolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ecrLifecyclePolicyMod.LifecyclePolicyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ecrLifecyclePolicyMod.LifecyclePolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Repository protected ()
    extends atPulumiAwsLib.ecrMod.Repository {
    /**
      * Create a Repository resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ecrRepositoryMod.RepositoryArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ecrRepositoryMod.RepositoryArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class RepositoryPolicy protected ()
    extends atPulumiAwsLib.ecrMod.RepositoryPolicy {
    /**
      * Create a RepositoryPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ecrRepositoryPolicyMod.RepositoryPolicyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ecrRepositoryPolicyMod.RepositoryPolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getCredentials(args: atPulumiAwsLib.ecrGetCredentialsMod.GetCredentialsArgs): js.Promise[atPulumiAwsLib.ecrGetCredentialsMod.GetCredentialsResult] = js.native
  def getCredentials(
    args: atPulumiAwsLib.ecrGetCredentialsMod.GetCredentialsArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ecrGetCredentialsMod.GetCredentialsResult] = js.native
  def getRepository(args: atPulumiAwsLib.ecrGetRepositoryMod.GetRepositoryArgs): js.Promise[atPulumiAwsLib.ecrGetRepositoryMod.GetRepositoryResult] = js.native
  def getRepository(
    args: atPulumiAwsLib.ecrGetRepositoryMod.GetRepositoryArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ecrGetRepositoryMod.GetRepositoryResult] = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ecrLifecyclePolicyMod.LifecyclePolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ecrLifecyclePolicyMod.LifecyclePolicyState
    ): atPulumiAwsLib.ecrLifecyclePolicyMod.LifecyclePolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ecrLifecyclePolicyMod.LifecyclePolicyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ecrLifecyclePolicyMod.LifecyclePolicy = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ecrRepositoryMod.Repository = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ecrRepositoryMod.RepositoryState
    ): atPulumiAwsLib.ecrRepositoryMod.Repository = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ecrRepositoryMod.RepositoryState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ecrRepositoryMod.Repository = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ecrRepositoryPolicyMod.RepositoryPolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ecrRepositoryPolicyMod.RepositoryPolicyState
    ): atPulumiAwsLib.ecrRepositoryPolicyMod.RepositoryPolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ecrRepositoryPolicyMod.RepositoryPolicyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ecrRepositoryPolicyMod.RepositoryPolicy = js.native
  }
  
}

