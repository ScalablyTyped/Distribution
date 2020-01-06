package typings.atPulumiAws.s3InventoryMod

import typings.atPulumiAws.typesInputMod.s3.InventoryDestination
import typings.atPulumiAws.typesInputMod.s3.InventoryFilter
import typings.atPulumiAws.typesInputMod.s3.InventorySchedule
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryArgs extends js.Object {
  /**
    * The S3 bucket configuration where inventory results are published (documented below).
    */
  val bucket: Input[String] = js.native
  /**
    * Contains information about where to publish the inventory results (documented below).
    */
  val destination: Input[InventoryDestination] = js.native
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
  val includedObjectVersions: Input[String] = js.native
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
  val schedule: Input[InventorySchedule] = js.native
}

object InventoryArgs {
  @scala.inline
  def apply(
    bucket: Input[String],
    destination: Input[InventoryDestination],
    includedObjectVersions: Input[String],
    schedule: Input[InventorySchedule],
    enabled: Input[Boolean] = null,
    filter: Input[InventoryFilter] = null,
    name: Input[String] = null,
    optionalFields: Input[js.Array[Input[String]]] = null
  ): InventoryArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], includedObjectVersions = includedObjectVersions.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (optionalFields != null) __obj.updateDynamic("optionalFields")(optionalFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryArgs]
  }
}

