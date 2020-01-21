package typings.pulumiAws.globalTableMod

import typings.pulumiAws.outputMod.dynamodb.GlobalTableReplica
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dynamodb/globalTable", "GlobalTable")
@js.native
class GlobalTable protected () extends CustomResource {
  /**
    * Create a GlobalTable resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: GlobalTableArgs) = this()
  def this(name: String, args: GlobalTableArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the DynamoDB Global Table
    */
  val arn: Output_[String] = js.native
  /**
    * The name of the global table. Must match underlying DynamoDB Table names in all regions.
    */
  val name: Output_[String] = js.native
  /**
    * Underlying DynamoDB Table. At least 1 replica must be defined. See below.
    */
  val replicas: Output_[js.Array[GlobalTableReplica]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/dynamodb/globalTable", "GlobalTable")
@js.native
object GlobalTable extends js.Object {
  /**
    * Get an existing GlobalTable resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): GlobalTable = js.native
  def get(name: String, id: Input[ID], state: GlobalTableState): GlobalTable = js.native
  def get(name: String, id: Input[ID], state: GlobalTableState, opts: CustomResourceOptions): GlobalTable = js.native
  /**
    * Returns true if the given object is an instance of GlobalTable.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dynamodb/globalTable.GlobalTable */ Boolean = js.native
}

