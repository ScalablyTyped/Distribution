package typings.pulumiAws.inventoryMod

import typings.pulumiAws.inputMod.s3.InventoryDestination
import typings.pulumiAws.inputMod.s3.InventoryFilter
import typings.pulumiAws.inputMod.s3.InventorySchedule
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryState extends js.Object {
  /**
    * The name of the bucket where the inventory configuration will be stored.
    */
  val bucket: js.UndefOr[Input[String]] = js.native
  /**
    * Contains information about where to publish the inventory results (documented below).
    */
  val destination: js.UndefOr[Input[InventoryDestination]] = js.native
  /**
    * Specifies whether the inventory is enabled or disabled.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria (documented below).
    */
  val filter: js.UndefOr[Input[InventoryFilter]] = js.native
  /**
    * Object versions to include in the inventory list. Valid values: `All`, `Current`.
    */
  val includedObjectVersions: js.UndefOr[Input[String]] = js.native
  /**
    * Unique identifier of the inventory configuration for the bucket.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * List of optional fields that are included in the inventory results.
    * Valid values: `Size`, `LastModifiedDate`, `StorageClass`, `ETag`, `IsMultipartUploaded`, `ReplicationStatus`, `EncryptionStatus`, `ObjectLockRetainUntilDate`, `ObjectLockMode`, `ObjectLockLegalHoldStatus`, `IntelligentTieringAccessTier`.
    */
  val optionalFields: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Specifies the schedule for generating inventory results (documented below).
    */
  val schedule: js.UndefOr[Input[InventorySchedule]] = js.native
}

object InventoryState {
  @scala.inline
  def apply(
    bucket: Input[String] = null,
    destination: Input[InventoryDestination] = null,
    enabled: Input[Boolean] = null,
    filter: Input[InventoryFilter] = null,
    includedObjectVersions: Input[String] = null,
    name: Input[String] = null,
    optionalFields: Input[js.Array[Input[String]]] = null,
    schedule: Input[InventorySchedule] = null
  ): InventoryState = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (includedObjectVersions != null) __obj.updateDynamic("includedObjectVersions")(includedObjectVersions.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (optionalFields != null) __obj.updateDynamic("optionalFields")(optionalFields.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryState]
  }
}

