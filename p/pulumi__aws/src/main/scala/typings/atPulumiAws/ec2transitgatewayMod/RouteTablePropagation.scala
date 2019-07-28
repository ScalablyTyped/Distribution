package typings.atPulumiAws.ec2transitgatewayMod

import typings.atPulumiAws.ec2transitgatewayRouteTablePropagationMod.RouteTablePropagationArgs
import typings.atPulumiAws.ec2transitgatewayRouteTablePropagationMod.RouteTablePropagationState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2transitgateway", "RouteTablePropagation")
@js.native
class RouteTablePropagation protected ()
  extends typings.atPulumiAws.ec2transitgatewayRouteTablePropagationMod.RouteTablePropagation {
  /**
    * Create a RouteTablePropagation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RouteTablePropagationArgs) = this()
  def this(name: String, args: RouteTablePropagationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ec2transitgateway", "RouteTablePropagation")
@js.native
object RouteTablePropagation extends js.Object {
  /**
    * Get an existing RouteTablePropagation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.ec2transitgatewayRouteTablePropagationMod.RouteTablePropagation = js.native
  def get(name: String, id: Input[ID], state: RouteTablePropagationState): typings.atPulumiAws.ec2transitgatewayRouteTablePropagationMod.RouteTablePropagation = js.native
  def get(name: String, id: Input[ID], state: RouteTablePropagationState, opts: CustomResourceOptions): typings.atPulumiAws.ec2transitgatewayRouteTablePropagationMod.RouteTablePropagation = js.native
  /**
    * Returns true if the given object is an instance of RouteTablePropagation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTablePropagation.RouteTablePropagation */ Boolean = js.native
}

