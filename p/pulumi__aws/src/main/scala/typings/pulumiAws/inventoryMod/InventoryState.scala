package typings.pulumiAws.inventoryMod

import typings.pulumiAws.inputMod.s3.InventoryDestination
import typings.pulumiAws.inputMod.s3.InventoryFilter
import typings.pulumiAws.inputMod.s3.InventorySchedule
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryState extends js.Object {
  
  /**
    * The name of the source bucket that inventory lists the objects for.
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
  def apply(): InventoryState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryState]
  }
  
  @scala.inline
  implicit class InventoryStateOps[Self <: InventoryState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucket(value: Input[String]): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    
    @scala.inline
    def setDestination(value: Input[InventoryDestination]): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFilter(value: Input[InventoryFilter]): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setIncludedObjectVersions(value: Input[String]): Self = this.set("includedObjectVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludedObjectVersions: Self = this.set("includedObjectVersions", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOptionalFieldsVarargs(value: Input[String]*): Self = this.set("optionalFields", js.Array(value :_*))
    
    @scala.inline
    def setOptionalFields(value: Input[js.Array[Input[String]]]): Self = this.set("optionalFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalFields: Self = this.set("optionalFields", js.undefined)
    
    @scala.inline
    def setSchedule(value: Input[InventorySchedule]): Self = this.set("schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
  }
}
