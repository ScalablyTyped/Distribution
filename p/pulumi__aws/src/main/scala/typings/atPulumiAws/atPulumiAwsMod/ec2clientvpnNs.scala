package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.ec2clientvpnEndpointMod.EndpointArgs
import typings.atPulumiAws.ec2clientvpnEndpointMod.EndpointState
import typings.atPulumiAws.ec2clientvpnNetworkAssociationMod.NetworkAssociationArgs
import typings.atPulumiAws.ec2clientvpnNetworkAssociationMod.NetworkAssociationState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2clientvpn")
@js.native
object ec2clientvpnNs extends js.Object {
  @js.native
  class Endpoint protected ()
    extends typings.atPulumiAws.ec2clientvpnMod.Endpoint {
    /**
      * Create a Endpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EndpointArgs) = this()
    def this(name: String, args: EndpointArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class NetworkAssociation protected ()
    extends typings.atPulumiAws.ec2clientvpnMod.NetworkAssociation {
    /**
      * Create a NetworkAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NetworkAssociationArgs) = this()
    def this(name: String, args: NetworkAssociationArgs, opts: CustomResourceOptions) = this()
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ec2clientvpnEndpointMod.Endpoint = js.native
    def get(name: String, id: Input[ID], state: EndpointState): typings.atPulumiAws.ec2clientvpnEndpointMod.Endpoint = js.native
    def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): typings.atPulumiAws.ec2clientvpnEndpointMod.Endpoint = js.native
    /**
      * Returns true if the given object is an instance of Endpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2clientvpn/endpoint.Endpoint */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ec2clientvpnNetworkAssociationMod.NetworkAssociation = js.native
    def get(name: String, id: Input[ID], state: NetworkAssociationState): typings.atPulumiAws.ec2clientvpnNetworkAssociationMod.NetworkAssociation = js.native
    def get(name: String, id: Input[ID], state: NetworkAssociationState, opts: CustomResourceOptions): typings.atPulumiAws.ec2clientvpnNetworkAssociationMod.NetworkAssociation = js.native
    /**
      * Returns true if the given object is an instance of NetworkAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2clientvpn/networkAssociation.NetworkAssociation */ Boolean = js.native
  }
  
}

