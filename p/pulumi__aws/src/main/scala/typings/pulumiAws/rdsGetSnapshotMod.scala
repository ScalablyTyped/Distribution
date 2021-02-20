package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rdsGetSnapshotMod {
  
  @JSImport("@pulumi/aws/rds/getSnapshot", "getSnapshot")
  @js.native
  def getSnapshot(): js.Promise[GetSnapshotResult] = js.native
  @JSImport("@pulumi/aws/rds/getSnapshot", "getSnapshot")
  @js.native
  def getSnapshot(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetSnapshotResult] = js.native
  @JSImport("@pulumi/aws/rds/getSnapshot", "getSnapshot")
  @js.native
  def getSnapshot(args: GetSnapshotArgs): js.Promise[GetSnapshotResult] = js.native
  @JSImport("@pulumi/aws/rds/getSnapshot", "getSnapshot")
  @js.native
  def getSnapshot(args: GetSnapshotArgs, opts: InvokeOptions): js.Promise[GetSnapshotResult] = js.native
  
  @js.native
  trait GetSnapshotArgs extends StObject {
    
    /**
      * Returns the list of snapshots created by the specific db_instance
      */
    val dbInstanceIdentifier: js.UndefOr[String] = js.native
    
    /**
      * Returns information on a specific snapshot_id.
      */
    val dbSnapshotIdentifier: js.UndefOr[String] = js.native
    
    /**
      * Set this value to true to include manual DB snapshots that are public and can be
      * copied or restored by any AWS account, otherwise set this value to false. The default is `false`.
      */
    val includePublic: js.UndefOr[Boolean] = js.native
    
    /**
      * Set this value to true to include shared manual DB snapshots from other
      * AWS accounts that this AWS account has been given permission to copy or restore, otherwise set this value to false.
      * The default is `false`.
      */
    val includeShared: js.UndefOr[Boolean] = js.native
    
    /**
      * If more than one result is returned, use the most
      * recent Snapshot.
      */
    val mostRecent: js.UndefOr[Boolean] = js.native
    
    /**
      * The type of snapshots to be returned. If you don't specify a SnapshotType
      * value, then both automated and manual snapshots are returned. Shared and public DB snapshots are not
      * included in the returned results by default. Possible values are, `automated`, `manual`, `shared` and `public`.
      */
    val snapshotType: js.UndefOr[String] = js.native
  }
  object GetSnapshotArgs {
    
    @scala.inline
    def apply(): GetSnapshotArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSnapshotArgs]
    }
    
    @scala.inline
    implicit class GetSnapshotArgsMutableBuilder[Self <: GetSnapshotArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDbInstanceIdentifier(value: String): Self = StObject.set(x, "dbInstanceIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbInstanceIdentifierUndefined: Self = StObject.set(x, "dbInstanceIdentifier", js.undefined)
      
      @scala.inline
      def setDbSnapshotIdentifier(value: String): Self = StObject.set(x, "dbSnapshotIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbSnapshotIdentifierUndefined: Self = StObject.set(x, "dbSnapshotIdentifier", js.undefined)
      
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
    }
  }
  
  @js.native
  trait GetSnapshotResult extends StObject {
    
    /**
      * Specifies the allocated storage size in gigabytes (GB).
      */
    val allocatedStorage: Double = js.native
    
    /**
      * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
      */
    val availabilityZone: String = js.native
    
    val dbInstanceIdentifier: js.UndefOr[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) for the DB snapshot.
      */
    val dbSnapshotArn: String = js.native
    
    val dbSnapshotIdentifier: js.UndefOr[String] = js.native
    
    /**
      * Specifies whether the DB snapshot is encrypted.
      */
    val encrypted: Boolean = js.native
    
    /**
      * Specifies the name of the database engine.
      */
    val engine: String = js.native
    
    /**
      * Specifies the version of the database engine.
      */
    val engineVersion: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val includePublic: js.UndefOr[Boolean] = js.native
    
    val includeShared: js.UndefOr[Boolean] = js.native
    
    /**
      * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
      */
    val iops: Double = js.native
    
    /**
      * The ARN for the KMS encryption key.
      */
    val kmsKeyId: String = js.native
    
    /**
      * License model information for the restored DB instance.
      */
    val licenseModel: String = js.native
    
    val mostRecent: js.UndefOr[Boolean] = js.native
    
    /**
      * Provides the option group name for the DB snapshot.
      */
    val optionGroupName: String = js.native
    
    val port: Double = js.native
    
    /**
      * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
      */
    val snapshotCreateTime: String = js.native
    
    val snapshotType: js.UndefOr[String] = js.native
    
    /**
      * The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
      */
    val sourceDbSnapshotIdentifier: String = js.native
    
    /**
      * The region that the DB snapshot was created in or copied from.
      */
    val sourceRegion: String = js.native
    
    /**
      * Specifies the status of this DB snapshot.
      */
    val status: String = js.native
    
    /**
      * Specifies the storage type associated with DB snapshot.
      */
    val storageType: String = js.native
    
    /**
      * Specifies the ID of the VPC associated with the DB snapshot.
      */
    val vpcId: String = js.native
  }
  object GetSnapshotResult {
    
    @scala.inline
    def apply(
      allocatedStorage: Double,
      availabilityZone: String,
      dbSnapshotArn: String,
      encrypted: Boolean,
      engine: String,
      engineVersion: String,
      id: String,
      iops: Double,
      kmsKeyId: String,
      licenseModel: String,
      optionGroupName: String,
      port: Double,
      snapshotCreateTime: String,
      sourceDbSnapshotIdentifier: String,
      sourceRegion: String,
      status: String,
      storageType: String,
      vpcId: String
    ): GetSnapshotResult = {
      val __obj = js.Dynamic.literal(allocatedStorage = allocatedStorage.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], dbSnapshotArn = dbSnapshotArn.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], licenseModel = licenseModel.asInstanceOf[js.Any], optionGroupName = optionGroupName.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], snapshotCreateTime = snapshotCreateTime.asInstanceOf[js.Any], sourceDbSnapshotIdentifier = sourceDbSnapshotIdentifier.asInstanceOf[js.Any], sourceRegion = sourceRegion.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], storageType = storageType.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSnapshotResult]
    }
    
    @scala.inline
    implicit class GetSnapshotResultMutableBuilder[Self <: GetSnapshotResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllocatedStorage(value: Double): Self = StObject.set(x, "allocatedStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbInstanceIdentifier(value: String): Self = StObject.set(x, "dbInstanceIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbInstanceIdentifierUndefined: Self = StObject.set(x, "dbInstanceIdentifier", js.undefined)
      
      @scala.inline
      def setDbSnapshotArn(value: String): Self = StObject.set(x, "dbSnapshotArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbSnapshotIdentifier(value: String): Self = StObject.set(x, "dbSnapshotIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbSnapshotIdentifierUndefined: Self = StObject.set(x, "dbSnapshotIdentifier", js.undefined)
      
      @scala.inline
      def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
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
      def setIops(value: Double): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseModel(value: String): Self = StObject.set(x, "licenseModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMostRecent(value: Boolean): Self = StObject.set(x, "mostRecent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMostRecentUndefined: Self = StObject.set(x, "mostRecent", js.undefined)
      
      @scala.inline
      def setOptionGroupName(value: String): Self = StObject.set(x, "optionGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotCreateTime(value: String): Self = StObject.set(x, "snapshotCreateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotType(value: String): Self = StObject.set(x, "snapshotType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotTypeUndefined: Self = StObject.set(x, "snapshotType", js.undefined)
      
      @scala.inline
      def setSourceDbSnapshotIdentifier(value: String): Self = StObject.set(x, "sourceDbSnapshotIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceRegion(value: String): Self = StObject.set(x, "sourceRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageType(value: String): Self = StObject.set(x, "storageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
}
