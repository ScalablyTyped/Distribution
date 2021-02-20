package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getClusterSnapshotMod {
  
  @JSImport("@pulumi/aws/rds/getClusterSnapshot", "getClusterSnapshot")
  @js.native
  def getClusterSnapshot(): js.Promise[GetClusterSnapshotResult] = js.native
  @JSImport("@pulumi/aws/rds/getClusterSnapshot", "getClusterSnapshot")
  @js.native
  def getClusterSnapshot(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetClusterSnapshotResult] = js.native
  @JSImport("@pulumi/aws/rds/getClusterSnapshot", "getClusterSnapshot")
  @js.native
  def getClusterSnapshot(args: GetClusterSnapshotArgs): js.Promise[GetClusterSnapshotResult] = js.native
  @JSImport("@pulumi/aws/rds/getClusterSnapshot", "getClusterSnapshot")
  @js.native
  def getClusterSnapshot(args: GetClusterSnapshotArgs, opts: InvokeOptions): js.Promise[GetClusterSnapshotResult] = js.native
  
  @js.native
  trait GetClusterSnapshotArgs extends StObject {
    
    /**
      * Returns the list of snapshots created by the specific db_cluster
      */
    val dbClusterIdentifier: js.UndefOr[String] = js.native
    
    /**
      * Returns information on a specific snapshot_id.
      */
    val dbClusterSnapshotIdentifier: js.UndefOr[String] = js.native
    
    /**
      * Set this value to true to include manual DB Cluster Snapshots that are public and can be
      * copied or restored by any AWS account, otherwise set this value to false. The default is `false`.
      */
    val includePublic: js.UndefOr[Boolean] = js.native
    
    /**
      * Set this value to true to include shared manual DB Cluster Snapshots from other
      * AWS accounts that this AWS account has been given permission to copy or restore, otherwise set this value to false.
      * The default is `false`.
      */
    val includeShared: js.UndefOr[Boolean] = js.native
    
    /**
      * If more than one result is returned, use the most recent Snapshot.
      */
    val mostRecent: js.UndefOr[Boolean] = js.native
    
    /**
      * The type of snapshots to be returned. If you don't specify a SnapshotType
      * value, then both automated and manual DB cluster snapshots are returned. Shared and public DB Cluster Snapshots are not
      * included in the returned results by default. Possible values are, `automated`, `manual`, `shared` and `public`.
      */
    val snapshotType: js.UndefOr[String] = js.native
    
    /**
      * A map of tags for the resource.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetClusterSnapshotArgs {
    
    @scala.inline
    def apply(): GetClusterSnapshotArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetClusterSnapshotArgs]
    }
    
    @scala.inline
    implicit class GetClusterSnapshotArgsMutableBuilder[Self <: GetClusterSnapshotArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDbClusterIdentifier(value: String): Self = StObject.set(x, "dbClusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbClusterIdentifierUndefined: Self = StObject.set(x, "dbClusterIdentifier", js.undefined)
      
      @scala.inline
      def setDbClusterSnapshotIdentifier(value: String): Self = StObject.set(x, "dbClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbClusterSnapshotIdentifierUndefined: Self = StObject.set(x, "dbClusterSnapshotIdentifier", js.undefined)
      
      @scala.inline
      def setIncludePublic(value: Boolean): Self = StObject.set(x, "includePublic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludePublicUndefined: Self = StObject.set(x, "includePublic", js.undefined)
      
      @scala.inline
      def setIncludeShared(value: Boolean): Self = StObject.set(x, "includeShared", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeSharedUndefined: Self = StObject.set(x, "includeShared", js.undefined)
      
      @scala.inline
      def setMostRecent(value: Boolean): Self = StObject.set(x, "mostRecent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMostRecentUndefined: Self = StObject.set(x, "mostRecent", js.undefined)
      
      @scala.inline
      def setSnapshotType(value: String): Self = StObject.set(x, "snapshotType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotTypeUndefined: Self = StObject.set(x, "snapshotType", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetClusterSnapshotResult extends StObject {
    
    /**
      * Specifies the allocated storage size in gigabytes (GB).
      */
    val allocatedStorage: Double = js.native
    
    /**
      * List of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
      */
    val availabilityZones: js.Array[String] = js.native
    
    /**
      * Specifies the DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
      */
    val dbClusterIdentifier: js.UndefOr[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) for the DB Cluster Snapshot.
      */
    val dbClusterSnapshotArn: String = js.native
    
    val dbClusterSnapshotIdentifier: js.UndefOr[String] = js.native
    
    /**
      * Specifies the name of the database engine.
      */
    val engine: String = js.native
    
    /**
      * Version of the database engine for this DB cluster snapshot.
      */
    val engineVersion: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val includePublic: js.UndefOr[Boolean] = js.native
    
    val includeShared: js.UndefOr[Boolean] = js.native
    
    /**
      * If storageEncrypted is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
      */
    val kmsKeyId: String = js.native
    
    /**
      * License model information for the restored DB cluster.
      */
    val licenseModel: String = js.native
    
    val mostRecent: js.UndefOr[Boolean] = js.native
    
    /**
      * Port that the DB cluster was listening on at the time of the snapshot.
      */
    val port: Double = js.native
    
    /**
      * Time when the snapshot was taken, in Universal Coordinated Time (UTC).
      */
    val snapshotCreateTime: String = js.native
    
    val snapshotType: js.UndefOr[String] = js.native
    
    val sourceDbClusterSnapshotArn: String = js.native
    
    /**
      * The status of this DB Cluster Snapshot.
      */
    val status: String = js.native
    
    /**
      * Specifies whether the DB cluster snapshot is encrypted.
      */
    val storageEncrypted: Boolean = js.native
    
    /**
      * A map of tags for the resource.
      */
    val tags: StringDictionary[String] = js.native
    
    /**
      * The VPC ID associated with the DB cluster snapshot.
      */
    val vpcId: String = js.native
  }
  object GetClusterSnapshotResult {
    
    @scala.inline
    def apply(
      allocatedStorage: Double,
      availabilityZones: js.Array[String],
      dbClusterSnapshotArn: String,
      engine: String,
      engineVersion: String,
      id: String,
      kmsKeyId: String,
      licenseModel: String,
      port: Double,
      snapshotCreateTime: String,
      sourceDbClusterSnapshotArn: String,
      status: String,
      storageEncrypted: Boolean,
      tags: StringDictionary[String],
      vpcId: String
    ): GetClusterSnapshotResult = {
      val __obj = js.Dynamic.literal(allocatedStorage = allocatedStorage.asInstanceOf[js.Any], availabilityZones = availabilityZones.asInstanceOf[js.Any], dbClusterSnapshotArn = dbClusterSnapshotArn.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], licenseModel = licenseModel.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], snapshotCreateTime = snapshotCreateTime.asInstanceOf[js.Any], sourceDbClusterSnapshotArn = sourceDbClusterSnapshotArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], storageEncrypted = storageEncrypted.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterSnapshotResult]
    }
    
    @scala.inline
    implicit class GetClusterSnapshotResultMutableBuilder[Self <: GetClusterSnapshotResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllocatedStorage(value: Double): Self = StObject.set(x, "allocatedStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZones(value: js.Array[String]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      @scala.inline
      def setDbClusterIdentifier(value: String): Self = StObject.set(x, "dbClusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbClusterIdentifierUndefined: Self = StObject.set(x, "dbClusterIdentifier", js.undefined)
      
      @scala.inline
      def setDbClusterSnapshotArn(value: String): Self = StObject.set(x, "dbClusterSnapshotArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbClusterSnapshotIdentifier(value: String): Self = StObject.set(x, "dbClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbClusterSnapshotIdentifierUndefined: Self = StObject.set(x, "dbClusterSnapshotIdentifier", js.undefined)
      
      @scala.inline
      def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersion(value: String): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludePublic(value: Boolean): Self = StObject.set(x, "includePublic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludePublicUndefined: Self = StObject.set(x, "includePublic", js.undefined)
      
      @scala.inline
      def setIncludeShared(value: Boolean): Self = StObject.set(x, "includeShared", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeSharedUndefined: Self = StObject.set(x, "includeShared", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseModel(value: String): Self = StObject.set(x, "licenseModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMostRecent(value: Boolean): Self = StObject.set(x, "mostRecent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMostRecentUndefined: Self = StObject.set(x, "mostRecent", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotCreateTime(value: String): Self = StObject.set(x, "snapshotCreateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotType(value: String): Self = StObject.set(x, "snapshotType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotTypeUndefined: Self = StObject.set(x, "snapshotType", js.undefined)
      
      @scala.inline
      def setSourceDbClusterSnapshotArn(value: String): Self = StObject.set(x, "sourceDbClusterSnapshotArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageEncrypted(value: Boolean): Self = StObject.set(x, "storageEncrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
}
