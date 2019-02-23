package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2clientvpn")
@js.native
object ec2clientvpnNs extends js.Object {
  @js.native
  class Endpoint protected ()
    extends atPulumiAwsLib.ec2clientvpnMod.Endpoint {
    /**
      * Create a Endpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2clientvpnEndpointMod.EndpointArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2clientvpnEndpointMod.EndpointArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class NetworkAssociation protected ()
    extends atPulumiAwsLib.ec2clientvpnMod.NetworkAssociation {
    /**
      * Create a NetworkAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2clientvpnNetworkAssociationMod.NetworkAssociationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2clientvpnNetworkAssociationMod.NetworkAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Endpoint extends js.Object {
    /**
      * Get an existing Endpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2clientvpnEndpointMod.Endpoint = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2clientvpnEndpointMod.EndpointState
    ): atPulumiAwsLib.ec2clientvpnEndpointMod.Endpoint = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2clientvpnEndpointMod.EndpointState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2clientvpnEndpointMod.Endpoint = js.native
  }
  
  /* static members */
  @js.native
  object NetworkAssociation extends js.Object {
    /**
      * Get an existing NetworkAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2clientvpnNetworkAssociationMod.NetworkAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2clientvpnNetworkAssociationMod.NetworkAssociationState
    ): atPulumiAwsLib.ec2clientvpnNetworkAssociationMod.NetworkAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2clientvpnNetworkAssociationMod.NetworkAssociationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2clientvpnNetworkAssociationMod.NetworkAssociation = js.native
  }
  
}

