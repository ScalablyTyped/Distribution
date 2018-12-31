package typings
package atPulumiAwsLib.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dynamodb", "Table")
@js.native
class Table protected ()
  extends atPulumiAwsLib.dynamodbDynamodbMixinsMod.dynamodbTableMod.Table {
  /**
    * Create a Table resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.dynamodbTableMod.TableArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.dynamodbTableMod.TableArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

@JSImport("@pulumi/aws/dynamodb", "Table")
@js.native
object Table extends js.Object {
  /**
    * Get an existing Table resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.dynamodbDynamodbMixinsMod.dynamodbTableMod.Table = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.dynamodbTableMod.TableState
  ): atPulumiAwsLib.dynamodbDynamodbMixinsMod.dynamodbTableMod.Table = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.dynamodbTableMod.TableState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.dynamodbDynamodbMixinsMod.dynamodbTableMod.Table = js.native
}

