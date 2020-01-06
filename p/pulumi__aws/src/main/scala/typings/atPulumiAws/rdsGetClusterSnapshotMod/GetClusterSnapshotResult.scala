package typings.atPulumiAws.rdsGetClusterSnapshotMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterSnapshotResult extends js.Object {
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
    * id is the provider-assigned unique ID for this managed resource.
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
    * A mapping of tags for the resource.
    */
  val tags: StringDictionary[js.Any] = js.native
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
    tags: StringDictionary[js.Any],
    vpcId: String,
    dbClusterIdentifier: String = null,
    dbClusterSnapshotIdentifier: String = null,
    includePublic: js.UndefOr[Boolean] = js.undefined,
    includeShared: js.UndefOr[Boolean] = js.undefined,
    mostRecent: js.UndefOr[Boolean] = js.undefined,
    snapshotType: String = null
  ): GetClusterSnapshotResult = {
    val __obj = js.Dynamic.literal(allocatedStorage = allocatedStorage.asInstanceOf[js.Any], availabilityZones = availabilityZones.asInstanceOf[js.Any], dbClusterSnapshotArn = dbClusterSnapshotArn.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], licenseModel = licenseModel.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], snapshotCreateTime = snapshotCreateTime.asInstanceOf[js.Any], sourceDbClusterSnapshotArn = sourceDbClusterSnapshotArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], storageEncrypted = storageEncrypted.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    if (dbClusterIdentifier != null) __obj.updateDynamic("dbClusterIdentifier")(dbClusterIdentifier.asInstanceOf[js.Any])
    if (dbClusterSnapshotIdentifier != null) __obj.updateDynamic("dbClusterSnapshotIdentifier")(dbClusterSnapshotIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(includePublic)) __obj.updateDynamic("includePublic")(includePublic.asInstanceOf[js.Any])
    if (!js.isUndefined(includeShared)) __obj.updateDynamic("includeShared")(includeShared.asInstanceOf[js.Any])
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent.asInstanceOf[js.Any])
    if (snapshotType != null) __obj.updateDynamic("snapshotType")(snapshotType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterSnapshotResult]
  }
}

