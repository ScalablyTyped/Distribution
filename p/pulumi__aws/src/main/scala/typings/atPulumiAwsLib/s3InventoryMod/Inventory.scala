package typings
package atPulumiAwsLib.s3InventoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3/inventory", "Inventory")
@js.native
class Inventory protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Inventory resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: InventoryArgs) = this()
  def this(name: java.lang.String, args: InventoryArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The S3 bucket configuration where inventory results are published (documented below).
    */
  val bucket: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Destination bucket where inventory list files are written (documented below).
    */
  val destination: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_BucketAnonAccountId] = js.native
  /**
    * Specifies whether the inventory is enabled or disabled.
    */
  val enabled: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Object filtering that accepts a prefix (documented below).
    */
  val filter: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_PrefixString]] = js.native
  /**
    * Object filtering that accepts a prefix (documented below). Can be `All` or `Current`.
    */
  val includedObjectVersions: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Unique identifier of the inventory configuration for the bucket.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Contains the optional fields that are included in the inventory results.
    */
  val optionalFields: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * Contains the frequency for generating inventory results (documented below).
    */
  val schedule: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_Frequency] = js.native
}

/* static members */
@JSImport("@pulumi/aws/s3/inventory", "Inventory")
@js.native
object Inventory extends js.Object {
  /**
    * Get an existing Inventory resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.s3InventoryMod.Inventory = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.s3InventoryMod.InventoryState
  ): atPulumiAwsLib.s3InventoryMod.Inventory = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.s3InventoryMod.InventoryState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.s3InventoryMod.Inventory = js.native
}

