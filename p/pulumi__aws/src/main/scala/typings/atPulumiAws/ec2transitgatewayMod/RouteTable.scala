package typings.atPulumiAws.ec2transitgatewayMod

import typings.atPulumiAws.ec2transitgatewayRouteTableMod.RouteTableArgs
import typings.atPulumiAws.ec2transitgatewayRouteTableMod.RouteTableState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2transitgateway", "RouteTable")
@js.native
class RouteTable protected ()
  extends typings.atPulumiAws.ec2transitgatewayRouteTableMod.RouteTable {
  /**
    * Create a RouteTable resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RouteTableArgs) = this()
  def this(name: String, args: RouteTableArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ec2transitgateway", "RouteTable")
@js.native
object RouteTable extends js.Object {
  /**
    * Get an existing RouteTable resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.ec2transitgatewayRouteTableMod.RouteTable = js.native
  def get(name: String, id: Input[ID], state: RouteTableState): typings.atPulumiAws.ec2transitgatewayRouteTableMod.RouteTable = js.native
  def get(name: String, id: Input[ID], state: RouteTableState, opts: CustomResourceOptions): typings.atPulumiAws.ec2transitgatewayRouteTableMod.RouteTable = js.native
  /**
    * Returns true if the given object is an instance of RouteTable.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTable.RouteTable */ Boolean = js.native
}

