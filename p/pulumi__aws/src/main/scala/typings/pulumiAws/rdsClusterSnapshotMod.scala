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

object rdsClusterSnapshotMod {
  
  @JSImport("@pulumi/aws/rds/clusterSnapshot", "ClusterSnapshot")
  @js.native
  class ClusterSnapshot protected () extends CustomResource {
    /**
      * Create a ClusterSnapshot resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterSnapshotArgs) = this()
    def this(name: String, args: ClusterSnapshotArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Specifies the allocated storage size in gigabytes (GB).
      */
    val allocatedStorage: Output_[Double] = js.native
    
    /**
      * List of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
      */
    val availabilityZones: Output_[js.Array[String]] = js.native
    
    /**
      * The DB Cluster Identifier from which to take the snapshot.
      */
    val dbClusterIdentifier: Output_[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) for the DB Cluster Snapshot.
      */
    val dbClusterSnapshotArn: Output_[String] = js.native
    
    /**
      * The Identifier for the snapshot.
      */
    val dbClusterSnapshotIdentifier: Output_[String] = js.native
    
    /**
      * Specifies the name of the database engine.
      */
    val engine: Output_[String] = js.native
    
    /**
      * Version of the database engine for this DB cluster snapshot.
      */
    val engineVersion: Output_[String] = js.native
    
    /**
      * If storageEncrypted is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
      */
    val kmsKeyId: Output_[String] = js.native
    
    /**
      * License model information for the restored DB cluster.
      */
    val licenseModel: Output_[String] = js.native
    
    /**
      * Port that the DB cluster was listening on at the time of the snapshot.
      */
    val port: Output_[Double] = js.native
    
    val snapshotType: Output_[String] = js.native
    
    val sourceDbClusterSnapshotArn: Output_[String] = js.native
    
    /**
      * The status of this DB Cluster Snapshot.
      */
    val status: Output_[String] = js.native
    
    /**
      * Specifies whether the DB cluster snapshot is encrypted.
      */
    val storageEncrypted: Output_[Boolean] = js.native
    
    /**
      * A map of tags to assign to the DB cluster.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The VPC ID associated with the DB cluster snapshot.
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object ClusterSnapshot {
    
    @JSImport("@pulumi/aws/rds/clusterSnapshot", "ClusterSnapshot")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterSnapshot resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ClusterSnapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ClusterSnapshot]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ClusterSnapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClusterSnapshot]
    inline def get(name: String, id: Input[ID], state: ClusterSnapshotState): ClusterSnapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ClusterSnapshot]
    inline def get(name: String, id: Input[ID], state: ClusterSnapshotState, opts: CustomResourceOptions): ClusterSnapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClusterSnapshot]
    
    /**
      * Returns true if the given object is an instance of ClusterSnapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterSnapshot.ClusterSnapshot */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/clusterSnapshot.ClusterSnapshot */ Boolean]
  }
  
  trait ClusterSnapshotArgs extends StObject {
    
    /**
      * The DB Cluster Identifier from which to take the snapshot.
      */
    val dbClusterIdentifier: Input[String]
    
    /**
      * The Identifier for the snapshot.
      */
    val dbClusterSnapshotIdentifier: Input[String]
    
    /**
      * A map of tags to assign to the DB cluster.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object ClusterSnapshotArgs {
    
    inline def apply(dbClusterIdentifier: Input[String], dbClusterSnapshotIdentifier: Input[String]): ClusterSnapshotArgs = {
      val __obj = js.Dynamic.literal(dbClusterIdentifier = dbClusterIdentifier.asInstanceOf[js.Any], dbClusterSnapshotIdentifier = dbClusterSnapshotIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterSnapshotArgs]
    }
    
    extension [Self <: ClusterSnapshotArgs](x: Self) {
      
      inline def setDbClusterIdentifier(value: Input[String]): Self = StObject.set(x, "dbClusterIdentifier", value.asInstanceOf[js.Any])
      
      inline def setDbClusterSnapshotIdentifier(value: Input[String]): Self = StObject.set(x, "dbClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait ClusterSnapshotState extends StObject {
    
    /**
      * Specifies the allocated storage size in gigabytes (GB).
      */
    val allocatedStorage: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * List of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
      */
    val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The DB Cluster Identifier from which to take the snapshot.
      */
    val dbClusterIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) for the DB Cluster Snapshot.
      */
    val dbClusterSnapshotArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Identifier for the snapshot.
      */
    val dbClusterSnapshotIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the name of the database engine.
      */
    val engine: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Version of the database engine for this DB cluster snapshot.
      */
    val engineVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If storageEncrypted is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * License model information for the restored DB cluster.
      */
    val licenseModel: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Port that the DB cluster was listening on at the time of the snapshot.
      */
    val port: js.UndefOr[Input[Double]] = js.undefined
    
    val snapshotType: js.UndefOr[Input[String]] = js.undefined
    
    val sourceDbClusterSnapshotArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The status of this DB Cluster Snapshot.
      */
    val status: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether the DB cluster snapshot is encrypted.
      */
    val storageEncrypted: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A map of tags to assign to the DB cluster.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The VPC ID associated with the DB cluster snapshot.
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object ClusterSnapshotState {
    
    inline def apply(): ClusterSnapshotState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterSnapshotState]
    }
    
    extension [Self <: ClusterSnapshotState](x: Self) {
      
      inline def setAllocatedStorage(value: Input[Double]): Self = StObject.set(x, "allocatedStorage", value.asInstanceOf[js.Any])
      
      inline def setAllocatedStorageUndefined: Self = StObject.set(x, "allocatedStorage", js.undefined)
      
      inline def setAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "availabilityZones", js.undefined)
      
      inline def setAvailabilityZonesVarargs(value: Input[String]*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      inline def setDbClusterIdentifier(value: Input[String]): Self = StObject.set(x, "dbClusterIdentifier", value.asInstanceOf[js.Any])
      
      inline def setDbClusterIdentifierUndefined: Self = StObject.set(x, "dbClusterIdentifier", js.undefined)
      
      inline def setDbClusterSnapshotArn(value: Input[String]): Self = StObject.set(x, "dbClusterSnapshotArn", value.asInstanceOf[js.Any])
      
      inline def setDbClusterSnapshotArnUndefined: Self = StObject.set(x, "dbClusterSnapshotArn", js.undefined)
      
      inline def setDbClusterSnapshotIdentifier(value: Input[String]): Self = StObject.set(x, "dbClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
      
      inline def setDbClusterSnapshotIdentifierUndefined: Self = StObject.set(x, "dbClusterSnapshotIdentifier", js.undefined)
      
      inline def setEngine(value: Input[String]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      inline def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      inline def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      inline def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      inline def setLicenseModel(value: Input[String]): Self = StObject.set(x, "licenseModel", value.asInstanceOf[js.Any])
      
      inline def setLicenseModelUndefined: Self = StObject.set(x, "licenseModel", js.undefined)
      
      inline def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setSnapshotType(value: Input[String]): Self = StObject.set(x, "snapshotType", value.asInstanceOf[js.Any])
      
      inline def setSnapshotTypeUndefined: Self = StObject.set(x, "snapshotType", js.undefined)
      
      inline def setSourceDbClusterSnapshotArn(value: Input[String]): Self = StObject.set(x, "sourceDbClusterSnapshotArn", value.asInstanceOf[js.Any])
      
      inline def setSourceDbClusterSnapshotArnUndefined: Self = StObject.set(x, "sourceDbClusterSnapshotArn", js.undefined)
      
      inline def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStorageEncrypted(value: Input[Boolean]): Self = StObject.set(x, "storageEncrypted", value.asInstanceOf[js.Any])
      
      inline def setStorageEncryptedUndefined: Self = StObject.set(x, "storageEncrypted", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
