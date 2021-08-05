package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rdsSnapshotMod {
  
  @JSImport("@pulumi/aws/rds/snapshot", "Snapshot")
  @js.native
  class Snapshot protected () extends CustomResource {
    /**
      * Create a Snapshot resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotArgs) = this()
    def this(name: String, args: SnapshotArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Specifies the allocated storage size in gigabytes (GB).
      */
    val allocatedStorage: Output_[Double] = js.native
    
    /**
      * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
      */
    val availabilityZone: Output_[String] = js.native
    
    /**
      * The DB Instance Identifier from which to take the snapshot.
      */
    val dbInstanceIdentifier: Output_[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) for the DB snapshot.
      */
    val dbSnapshotArn: Output_[String] = js.native
    
    /**
      * The Identifier for the snapshot.
      */
    val dbSnapshotIdentifier: Output_[String] = js.native
    
    /**
      * Specifies whether the DB snapshot is encrypted.
      */
    val encrypted: Output_[Boolean] = js.native
    
    /**
      * Specifies the name of the database engine.
      */
    val engine: Output_[String] = js.native
    
    /**
      * Specifies the version of the database engine.
      */
    val engineVersion: Output_[String] = js.native
    
    /**
      * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
      */
    val iops: Output_[Double] = js.native
    
    /**
      * The ARN for the KMS encryption key.
      */
    val kmsKeyId: Output_[String] = js.native
    
    /**
      * License model information for the restored DB instance.
      */
    val licenseModel: Output_[String] = js.native
    
    /**
      * Provides the option group name for the DB snapshot.
      */
    val optionGroupName: Output_[String] = js.native
    
    val port: Output_[Double] = js.native
    
    val snapshotType: Output_[String] = js.native
    
    /**
      * The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
      */
    val sourceDbSnapshotIdentifier: Output_[String] = js.native
    
    /**
      * The region that the DB snapshot was created in or copied from.
      */
    val sourceRegion: Output_[String] = js.native
    
    /**
      * Specifies the status of this DB snapshot.
      */
    val status: Output_[String] = js.native
    
    /**
      * Specifies the storage type associated with DB snapshot.
      */
    val storageType: Output_[String] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Specifies the storage type associated with DB snapshot.
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object Snapshot {
    
    @JSImport("@pulumi/aws/rds/snapshot", "Snapshot")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Snapshot resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Snapshot]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snapshot]
    inline def get(name: String, id: Input[ID], state: SnapshotState): Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Snapshot]
    inline def get(name: String, id: Input[ID], state: SnapshotState, opts: CustomResourceOptions): Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snapshot]
    
    /**
      * Returns true if the given object is an instance of Snapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/snapshot.Snapshot */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/snapshot.Snapshot */ Boolean]
  }
  
  trait SnapshotArgs extends StObject {
    
    /**
      * The DB Instance Identifier from which to take the snapshot.
      */
    val dbInstanceIdentifier: Input[String]
    
    /**
      * The Identifier for the snapshot.
      */
    val dbSnapshotIdentifier: Input[String]
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object SnapshotArgs {
    
    inline def apply(dbInstanceIdentifier: Input[String], dbSnapshotIdentifier: Input[String]): SnapshotArgs = {
      val __obj = js.Dynamic.literal(dbInstanceIdentifier = dbInstanceIdentifier.asInstanceOf[js.Any], dbSnapshotIdentifier = dbSnapshotIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapshotArgs]
    }
    
    extension [Self <: SnapshotArgs](x: Self) {
      
      inline def setDbInstanceIdentifier(value: Input[String]): Self = StObject.set(x, "dbInstanceIdentifier", value.asInstanceOf[js.Any])
      
      inline def setDbSnapshotIdentifier(value: Input[String]): Self = StObject.set(x, "dbSnapshotIdentifier", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait SnapshotState extends StObject {
    
    /**
      * Specifies the allocated storage size in gigabytes (GB).
      */
    val allocatedStorage: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The DB Instance Identifier from which to take the snapshot.
      */
    val dbInstanceIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) for the DB snapshot.
      */
    val dbSnapshotArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Identifier for the snapshot.
      */
    val dbSnapshotIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether the DB snapshot is encrypted.
      */
    val encrypted: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Specifies the name of the database engine.
      */
    val engine: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the version of the database engine.
      */
    val engineVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
      */
    val iops: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The ARN for the KMS encryption key.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * License model information for the restored DB instance.
      */
    val licenseModel: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Provides the option group name for the DB snapshot.
      */
    val optionGroupName: js.UndefOr[Input[String]] = js.undefined
    
    val port: js.UndefOr[Input[Double]] = js.undefined
    
    val snapshotType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
      */
    val sourceDbSnapshotIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The region that the DB snapshot was created in or copied from.
      */
    val sourceRegion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the status of this DB snapshot.
      */
    val status: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the storage type associated with DB snapshot.
      */
    val storageType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Specifies the storage type associated with DB snapshot.
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object SnapshotState {
    
    inline def apply(): SnapshotState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnapshotState]
    }
    
    extension [Self <: SnapshotState](x: Self) {
      
      inline def setAllocatedStorage(value: Input[Double]): Self = StObject.set(x, "allocatedStorage", value.asInstanceOf[js.Any])
      
      inline def setAllocatedStorageUndefined: Self = StObject.set(x, "allocatedStorage", js.undefined)
      
      inline def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      inline def setDbInstanceIdentifier(value: Input[String]): Self = StObject.set(x, "dbInstanceIdentifier", value.asInstanceOf[js.Any])
      
      inline def setDbInstanceIdentifierUndefined: Self = StObject.set(x, "dbInstanceIdentifier", js.undefined)
      
      inline def setDbSnapshotArn(value: Input[String]): Self = StObject.set(x, "dbSnapshotArn", value.asInstanceOf[js.Any])
      
      inline def setDbSnapshotArnUndefined: Self = StObject.set(x, "dbSnapshotArn", js.undefined)
      
      inline def setDbSnapshotIdentifier(value: Input[String]): Self = StObject.set(x, "dbSnapshotIdentifier", value.asInstanceOf[js.Any])
      
      inline def setDbSnapshotIdentifierUndefined: Self = StObject.set(x, "dbSnapshotIdentifier", js.undefined)
      
      inline def setEncrypted(value: Input[Boolean]): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      inline def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
      
      inline def setEngine(value: Input[String]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      inline def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      inline def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      inline def setIops(value: Input[Double]): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
      
      inline def setIopsUndefined: Self = StObject.set(x, "iops", js.undefined)
      
      inline def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      inline def setLicenseModel(value: Input[String]): Self = StObject.set(x, "licenseModel", value.asInstanceOf[js.Any])
      
      inline def setLicenseModelUndefined: Self = StObject.set(x, "licenseModel", js.undefined)
      
      inline def setOptionGroupName(value: Input[String]): Self = StObject.set(x, "optionGroupName", value.asInstanceOf[js.Any])
      
      inline def setOptionGroupNameUndefined: Self = StObject.set(x, "optionGroupName", js.undefined)
      
      inline def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setSnapshotType(value: Input[String]): Self = StObject.set(x, "snapshotType", value.asInstanceOf[js.Any])
      
      inline def setSnapshotTypeUndefined: Self = StObject.set(x, "snapshotType", js.undefined)
      
      inline def setSourceDbSnapshotIdentifier(value: Input[String]): Self = StObject.set(x, "sourceDbSnapshotIdentifier", value.asInstanceOf[js.Any])
      
      inline def setSourceDbSnapshotIdentifierUndefined: Self = StObject.set(x, "sourceDbSnapshotIdentifier", js.undefined)
      
      inline def setSourceRegion(value: Input[String]): Self = StObject.set(x, "sourceRegion", value.asInstanceOf[js.Any])
      
      inline def setSourceRegionUndefined: Self = StObject.set(x, "sourceRegion", js.undefined)
      
      inline def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStorageType(value: Input[String]): Self = StObject.set(x, "storageType", value.asInstanceOf[js.Any])
      
      inline def setStorageTypeUndefined: Self = StObject.set(x, "storageType", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
