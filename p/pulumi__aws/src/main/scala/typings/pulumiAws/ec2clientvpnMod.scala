package typings.pulumiAws

import typings.pulumiAws.ec2clientvpnEndpointMod.EndpointArgs
import typings.pulumiAws.ec2clientvpnEndpointMod.EndpointState
import typings.pulumiAws.networkAssociationMod.NetworkAssociationArgs
import typings.pulumiAws.networkAssociationMod.NetworkAssociationState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2clientvpn", JSImport.Namespace)
@js.native
object ec2clientvpnMod extends js.Object {
  @js.native
  class Endpoint protected ()
    extends typings.pulumiAws.ec2clientvpnEndpointMod.Endpoint {
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
    extends typings.pulumiAws.networkAssociationMod.NetworkAssociation {
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.ec2clientvpnEndpointMod.Endpoint = js.native
    def get(name: String, id: Input[ID], state: EndpointState): typings.pulumiAws.ec2clientvpnEndpointMod.Endpoint = js.native
    def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): typings.pulumiAws.ec2clientvpnEndpointMod.Endpoint = js.native
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.networkAssociationMod.NetworkAssociation = js.native
    def get(name: String, id: Input[ID], state: NetworkAssociationState): typings.pulumiAws.networkAssociationMod.NetworkAssociation = js.native
    def get(name: String, id: Input[ID], state: NetworkAssociationState, opts: CustomResourceOptions): typings.pulumiAws.networkAssociationMod.NetworkAssociation = js.native
    /**
      * Returns true if the given object is an instance of NetworkAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2clientvpn/networkAssociation.NetworkAssociation */ Boolean = js.native
  }
  
}

