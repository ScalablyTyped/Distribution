package typings.atPulumiAws.dynamodbTableItemMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dynamodb/tableItem", "TableItem")
@js.native
class TableItem protected () extends CustomResource {
  /**
    * Create a TableItem resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TableItemArgs) = this()
  def this(name: String, args: TableItemArgs, opts: CustomResourceOptions) = this()
  /**
    * Hash key to use for lookups and identification of the item
    */
  val hashKey: Output[String] = js.native
  /**
    * JSON representation of a map of attribute name/value pairs, one for each attribute.
    * Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item.
    */
  val item: Output[String] = js.native
  /**
    * Range key to use for lookups and identification of the item. Required if there is range key defined in the table.
    */
  val rangeKey: Output[js.UndefOr[String]] = js.native
  /**
    * The name of the table to contain the item.
    */
  val tableName: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/dynamodb/tableItem", "TableItem")
@js.native
object TableItem extends js.Object {
  /**
    * Get an existing TableItem resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): TableItem = js.native
  def get(name: String, id: Input[ID], state: TableItemState): TableItem = js.native
  def get(name: String, id: Input[ID], state: TableItemState, opts: CustomResourceOptions): TableItem = js.native
  /**
    * Returns true if the given object is an instance of TableItem.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dynamodb/tableItem.TableItem */ Boolean = js.native
}

