package typings.atPulumiAws.s3InventoryMod

import typings.atPulumiAws.typesOutputMod.s3Ns.InventoryDestination
import typings.atPulumiAws.typesOutputMod.s3Ns.InventoryFilter
import typings.atPulumiAws.typesOutputMod.s3Ns.InventorySchedule
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3/inventory", "Inventory")
@js.native
class Inventory protected () extends CustomResource {
  /**
    * Create a Inventory resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: InventoryArgs) = this()
  def this(name: String, args: InventoryArgs, opts: CustomResourceOptions) = this()
  /**
    * The S3 bucket configuration where inventory results are published (documented below).
    */
  val bucket: Output[String] = js.native
  /**
    * Destination bucket where inventory list files are written (documented below).
    */
  val destination: Output[InventoryDestination] = js.native
  /**
    * Specifies whether the inventory is enabled or disabled.
    */
  val enabled: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Object filtering that accepts a prefix (documented below).
    */
  val filter: Output[js.UndefOr[InventoryFilter]] = js.native
  /**
    * Object filtering that accepts a prefix (documented below). Can be `All` or `Current`.
    */
  val includedObjectVersions: Output[String] = js.native
  /**
    * Unique identifier of the inventory configuration for the bucket.
    */
  val name: Output[String] = js.native
  /**
    * Contains the optional fields that are included in the inventory results.
    */
  val optionalFields: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Contains the frequency for generating inventory results (documented below).
    */
  val schedule: Output[InventorySchedule] = js.native
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
  def get(name: String, id: Input[ID]): Inventory = js.native
  def get(name: String, id: Input[ID], state: InventoryState): Inventory = js.native
  def get(name: String, id: Input[ID], state: InventoryState, opts: CustomResourceOptions): Inventory = js.native
  /**
    * Returns true if the given object is an instance of Inventory.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/inventory.Inventory */ Boolean = js.native
}

