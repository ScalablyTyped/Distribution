package typings.pulumiAws.defaultRouteTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.DefaultRouteTableRoute
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/defaultRouteTable", "DefaultRouteTable")
@js.native
class DefaultRouteTable protected () extends CustomResource {
  /**
    * Create a DefaultRouteTable resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DefaultRouteTableArgs) = this()
  def this(name: String, args: DefaultRouteTableArgs, opts: CustomResourceOptions) = this()
  /**
    * The ID of the Default Routing Table.
    */
  val defaultRouteTableId: Output_[String] = js.native
  /**
    * The ID of the AWS account that owns the route table
    */
  val ownerId: Output_[String] = js.native
  /**
    * A list of virtual gateways for propagation.
    */
  val propagatingVgws: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * A list of route objects. Their keys are documented below.
    * This argument is processed in [attribute-as-blocks mode](https://www.terraform.io/docs/configuration/attr-as-blocks.html).
    */
  val routes: Output_[js.Array[DefaultRouteTableRoute]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  val vpcId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/defaultRouteTable", "DefaultRouteTable")
@js.native
object DefaultRouteTable extends js.Object {
  /**
    * Get an existing DefaultRouteTable resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): DefaultRouteTable = js.native
  def get(name: String, id: Input[ID], state: DefaultRouteTableState): DefaultRouteTable = js.native
  def get(name: String, id: Input[ID], state: DefaultRouteTableState, opts: CustomResourceOptions): DefaultRouteTable = js.native
  /**
    * Returns true if the given object is an instance of DefaultRouteTable.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultRouteTable.DefaultRouteTable */ Boolean = js.native
}

