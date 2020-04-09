package typings.pulumiAws.inventoryMod

import typings.pulumiAws.outputMod.s3.InventoryDestination
import typings.pulumiAws.outputMod.s3.InventoryFilter
import typings.pulumiAws.outputMod.s3.InventorySchedule
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
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
    * The name of the bucket where the inventory configuration will be stored.
    */
  val bucket: Output_[String] = js.native
  /**
    * Contains information about where to publish the inventory results (documented below).
    */
  val destination: Output_[InventoryDestination] = js.native
  /**
    * Specifies whether the inventory is enabled or disabled.
    */
  val enabled: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria (documented below).
    */
  val filter: Output_[js.UndefOr[InventoryFilter]] = js.native
  /**
    * Object versions to include in the inventory list. Valid values: `All`, `Current`.
    */
  val includedObjectVersions: Output_[String] = js.native
  /**
    * Unique identifier of the inventory configuration for the bucket.
    */
  val name: Output_[String] = js.native
  /**
    * List of optional fields that are included in the inventory results.
    * Valid values: `Size`, `LastModifiedDate`, `StorageClass`, `ETag`, `IsMultipartUploaded`, `ReplicationStatus`, `EncryptionStatus`, `ObjectLockRetainUntilDate`, `ObjectLockMode`, `ObjectLockLegalHoldStatus`, `IntelligentTieringAccessTier`.
    */
  val optionalFields: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Specifies the schedule for generating inventory results (documented below).
    */
  val schedule: Output_[InventorySchedule] = js.native
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

