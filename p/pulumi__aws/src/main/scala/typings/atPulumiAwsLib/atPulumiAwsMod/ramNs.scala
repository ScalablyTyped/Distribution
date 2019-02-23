package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ram")
@js.native
object ramNs extends js.Object {
  @js.native
  class PrincipalAssociation protected ()
    extends atPulumiAwsLib.ramMod.PrincipalAssociation {
    /**
      * Create a PrincipalAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ramPrincipalAssociationMod.PrincipalAssociationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ramPrincipalAssociationMod.PrincipalAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ResourceAssociation protected ()
    extends atPulumiAwsLib.ramMod.ResourceAssociation {
    /**
      * Create a ResourceAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ramResourceAssociationMod.ResourceAssociationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ramResourceAssociationMod.ResourceAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ResourceShare protected ()
    extends atPulumiAwsLib.ramMod.ResourceShare {
    /**
      * Create a ResourceShare resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ramResourceShareMod.ResourceShareArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ramResourceShareMod.ResourceShareArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object PrincipalAssociation extends js.Object {
    /**
      * Get an existing PrincipalAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ramPrincipalAssociationMod.PrincipalAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ramPrincipalAssociationMod.PrincipalAssociationState
    ): atPulumiAwsLib.ramPrincipalAssociationMod.PrincipalAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ramPrincipalAssociationMod.PrincipalAssociationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ramPrincipalAssociationMod.PrincipalAssociation = js.native
  }
  
  /* static members */
  @js.native
  object ResourceAssociation extends js.Object {
    /**
      * Get an existing ResourceAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ramResourceAssociationMod.ResourceAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ramResourceAssociationMod.ResourceAssociationState
    ): atPulumiAwsLib.ramResourceAssociationMod.ResourceAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ramResourceAssociationMod.ResourceAssociationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ramResourceAssociationMod.ResourceAssociation = js.native
  }
  
  /* static members */
  @js.native
  object ResourceShare extends js.Object {
    /**
      * Get an existing ResourceShare resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ramResourceShareMod.ResourceShare = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ramResourceShareMod.ResourceShareState
    ): atPulumiAwsLib.ramResourceShareMod.ResourceShare = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ramResourceShareMod.ResourceShareState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ramResourceShareMod.ResourceShare = js.native
  }
  
}

