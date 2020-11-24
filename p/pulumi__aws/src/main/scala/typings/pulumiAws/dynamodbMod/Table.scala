package typings.pulumiAws.dynamodbMod

import typings.pulumiAws.tableMod.TableArgs
import typings.pulumiAws.tableMod.TableState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/dynamodb", "Table")
@js.native
class Table protected ()
  extends typings.pulumiAws.tableMod.Table {
  /**
    * Create a Table resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TableArgs) = this()
  def this(name: String, args: TableArgs, opts: CustomResourceOptions) = this()
}
/* static members */
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.tableMod.Table = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.tableMod.Table = js.native
  def get(name: String, id: Input[ID], state: TableState): typings.pulumiAws.tableMod.Table = js.native
  def get(name: String, id: Input[ID], state: TableState, opts: CustomResourceOptions): typings.pulumiAws.tableMod.Table = js.native
  
  /**
    * Returns true if the given object is an instance of Table.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dynamodb/table.Table */ Boolean = js.native
}
