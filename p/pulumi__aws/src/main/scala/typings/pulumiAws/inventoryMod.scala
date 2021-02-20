package typings.pulumiAws

import typings.pulumiAws.outputMod.s3.InventoryDestination
import typings.pulumiAws.outputMod.s3.InventoryFilter
import typings.pulumiAws.outputMod.s3.InventorySchedule
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inventoryMod {
  
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
      * The name of the source bucket that inventory lists the objects for.
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
  object Inventory {
    
    /**
      * Get an existing Inventory resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/s3/inventory", "Inventory.get")
    @js.native
    def get(name: String, id: Input[ID]): Inventory = js.native
    @JSImport("@pulumi/aws/s3/inventory", "Inventory.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Inventory = js.native
    @JSImport("@pulumi/aws/s3/inventory", "Inventory.get")
    @js.native
    def get(name: String, id: Input[ID], state: InventoryState): Inventory = js.native
    @JSImport("@pulumi/aws/s3/inventory", "Inventory.get")
    @js.native
    def get(name: String, id: Input[ID], state: InventoryState, opts: CustomResourceOptions): Inventory = js.native
    
    /**
      * Returns true if the given object is an instance of Inventory.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/s3/inventory", "Inventory.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/inventory.Inventory */ Boolean = js.native
  }
  
  @js.native
  trait InventoryArgs extends StObject {
    
    /**
      * The name of the source bucket that inventory lists the objects for.
      */
    val bucket: Input[String] = js.native
    
    /**
      * Contains information about where to publish the inventory results (documented below).
      */
    val destination: Input[typings.pulumiAws.inputMod.s3.InventoryDestination] = js.native
    
    /**
      * Specifies whether the inventory is enabled or disabled.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria (documented below).
      */
    val filter: js.UndefOr[Input[typings.pulumiAws.inputMod.s3.InventoryFilter]] = js.native
    
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
    val schedule: Input[typings.pulumiAws.inputMod.s3.InventorySchedule] = js.native
  }
  object InventoryArgs {
    
    @scala.inline
    def apply(
      bucket: Input[String],
      destination: Input[typings.pulumiAws.inputMod.s3.InventoryDestination],
      includedObjectVersions: Input[String],
      schedule: Input[typings.pulumiAws.inputMod.s3.InventorySchedule]
    ): InventoryArgs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], includedObjectVersions = includedObjectVersions.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
      __obj.asInstanceOf[InventoryArgs]
    }
    
    @scala.inline
    implicit class InventoryArgsMutableBuilder[Self <: InventoryArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestination(value: Input[typings.pulumiAws.inputMod.s3.InventoryDestination]): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFilter(value: Input[typings.pulumiAws.inputMod.s3.InventoryFilter]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setIncludedObjectVersions(value: Input[String]): Self = StObject.set(x, "includedObjectVersions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOptionalFields(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "optionalFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalFieldsUndefined: Self = StObject.set(x, "optionalFields", js.undefined)
      
      @scala.inline
      def setOptionalFieldsVarargs(value: Input[String]*): Self = StObject.set(x, "optionalFields", js.Array(value :_*))
      
      @scala.inline
      def setSchedule(value: Input[typings.pulumiAws.inputMod.s3.InventorySchedule]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InventoryState extends StObject {
    
    /**
      * The name of the source bucket that inventory lists the objects for.
      */
    val bucket: js.UndefOr[Input[String]] = js.native
    
    /**
      * Contains information about where to publish the inventory results (documented below).
      */
    val destination: js.UndefOr[Input[typings.pulumiAws.inputMod.s3.InventoryDestination]] = js.native
    
    /**
      * Specifies whether the inventory is enabled or disabled.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria (documented below).
      */
    val filter: js.UndefOr[Input[typings.pulumiAws.inputMod.s3.InventoryFilter]] = js.native
    
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
    val schedule: js.UndefOr[Input[typings.pulumiAws.inputMod.s3.InventorySchedule]] = js.native
  }
  object InventoryState {
    
    @scala.inline
    def apply(): InventoryState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InventoryState]
    }
    
    @scala.inline
    implicit class InventoryStateMutableBuilder[Self <: InventoryState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      @scala.inline
      def setDestination(value: Input[typings.pulumiAws.inputMod.s3.InventoryDestination]): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFilter(value: Input[typings.pulumiAws.inputMod.s3.InventoryFilter]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setIncludedObjectVersions(value: Input[String]): Self = StObject.set(x, "includedObjectVersions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludedObjectVersionsUndefined: Self = StObject.set(x, "includedObjectVersions", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOptionalFields(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "optionalFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalFieldsUndefined: Self = StObject.set(x, "optionalFields", js.undefined)
      
      @scala.inline
      def setOptionalFieldsVarargs(value: Input[String]*): Self = StObject.set(x, "optionalFields", js.Array(value :_*))
      
      @scala.inline
      def setSchedule(value: Input[typings.pulumiAws.inputMod.s3.InventorySchedule]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    }
  }
}
