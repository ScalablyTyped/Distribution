package typings.atPulumiAws.atPulumiAwsMod.dynamodb

import typings.atPulumiAws.dynamodbGlobalTableMod.GlobalTableArgs
import typings.atPulumiAws.dynamodbGlobalTableMod.GlobalTableState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "dynamodb.GlobalTable")
@js.native
class GlobalTable protected ()
  extends typings.atPulumiAws.dynamodbMod.GlobalTable {
  /**
    * Create a GlobalTable resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: GlobalTableArgs) = this()
  def this(name: String, args: GlobalTableArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "dynamodb.GlobalTable")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.dynamodbGlobalTableMod.GlobalTable = js.native
  def get(name: String, id: Input[ID], state: GlobalTableState): typings.atPulumiAws.dynamodbGlobalTableMod.GlobalTable = js.native
  def get(name: String, id: Input[ID], state: GlobalTableState, opts: CustomResourceOptions): typings.atPulumiAws.dynamodbGlobalTableMod.GlobalTable = js.native
  /**
    * Returns true if the given object is an instance of GlobalTable.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dynamodb/globalTable.GlobalTable */ Boolean = js.native
}

