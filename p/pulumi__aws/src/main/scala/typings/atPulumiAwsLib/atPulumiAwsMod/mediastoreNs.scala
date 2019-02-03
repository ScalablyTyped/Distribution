package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "mediastore")
@js.native
object mediastoreNs extends js.Object {
  @js.native
  class Container protected ()
    extends atPulumiAwsLib.mediastoreMod.Container {
    /**
      * Create a Container resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.mediastoreContainerMod.ContainerArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.mediastoreContainerMod.ContainerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ContainerPolicy protected ()
    extends atPulumiAwsLib.mediastoreMod.ContainerPolicy {
    /**
      * Create a ContainerPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.mediastoreContainerPolicyMod.ContainerPolicyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.mediastoreContainerPolicyMod.ContainerPolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Container extends js.Object {
    /**
      * Get an existing Container resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.mediastoreContainerMod.Container = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.mediastoreContainerMod.ContainerState
    ): atPulumiAwsLib.mediastoreContainerMod.Container = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.mediastoreContainerMod.ContainerState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.mediastoreContainerMod.Container = js.native
  }
  
  /* static members */
  @js.native
  object ContainerPolicy extends js.Object {
    /**
      * Get an existing ContainerPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.mediastoreContainerPolicyMod.ContainerPolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.mediastoreContainerPolicyMod.ContainerPolicyState
    ): atPulumiAwsLib.mediastoreContainerPolicyMod.ContainerPolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.mediastoreContainerPolicyMod.ContainerPolicyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.mediastoreContainerPolicyMod.ContainerPolicy = js.native
  }
  
}

