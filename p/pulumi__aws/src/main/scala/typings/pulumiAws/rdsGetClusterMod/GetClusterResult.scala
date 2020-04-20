package typings.pulumiAws.rdsGetClusterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterResult extends js.Object {
  val arn: String = js.native
  val availabilityZones: js.Array[String] = js.native
  val backupRetentionPeriod: Double = js.native
  val clusterIdentifier: String = js.native
  val clusterMembers: js.Array[String] = js.native
  val clusterResourceId: String = js.native
  val databaseName: String = js.native
  val dbClusterParameterGroupName: String = js.native
  val dbSubnetGroupName: String = js.native
  val enabledCloudwatchLogsExports: js.Array[String] = js.native
  val endpoint: String = js.native
  val engine: String = js.native
  val engineVersion: String = js.native
  val finalSnapshotIdentifier: String = js.native
  val hostedZoneId: String = js.native
  val iamDatabaseAuthenticationEnabled: Boolean = js.native
  val iamRoles: js.Array[String] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val kmsKeyId: String = js.native
  val masterUsername: String = js.native
  val port: Double = js.native
  val preferredBackupWindow: String = js.native
  val preferredMaintenanceWindow: String = js.native
  val readerEndpoint: String = js.native
  val replicationSourceIdentifier: String = js.native
  val storageEncrypted: Boolean = js.native
  val tags: StringDictionary[js.Any] = js.native
  val vpcSecurityGroupIds: js.Array[String] = js.native
}

object GetClusterResult {
  @scala.inline
  def apply(
    arn: String,
    availabilityZones: js.Array[String],
    backupRetentionPeriod: Double,
    clusterIdentifier: String,
    clusterMembers: js.Array[String],
    clusterResourceId: String,
    databaseName: String,
    dbClusterParameterGroupName: String,
    dbSubnetGroupName: String,
    enabledCloudwatchLogsExports: js.Array[String],
    endpoint: String,
    engine: String,
    engineVersion: String,
    finalSnapshotIdentifier: String,
    hostedZoneId: String,
    iamDatabaseAuthenticationEnabled: Boolean,
    iamRoles: js.Array[String],
    id: String,
    kmsKeyId: String,
    masterUsername: String,
    port: Double,
    preferredBackupWindow: String,
    preferredMaintenanceWindow: String,
    readerEndpoint: String,
    replicationSourceIdentifier: String,
    storageEncrypted: Boolean,
    tags: StringDictionary[js.Any],
    vpcSecurityGroupIds: js.Array[String]
  ): GetClusterResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], availabilityZones = availabilityZones.asInstanceOf[js.Any], backupRetentionPeriod = backupRetentionPeriod.asInstanceOf[js.Any], clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any], clusterMembers = clusterMembers.asInstanceOf[js.Any], clusterResourceId = clusterResourceId.asInstanceOf[js.Any], databaseName = databaseName.asInstanceOf[js.Any], dbClusterParameterGroupName = dbClusterParameterGroupName.asInstanceOf[js.Any], dbSubnetGroupName = dbSubnetGroupName.asInstanceOf[js.Any], enabledCloudwatchLogsExports = enabledCloudwatchLogsExports.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], finalSnapshotIdentifier = finalSnapshotIdentifier.asInstanceOf[js.Any], hostedZoneId = hostedZoneId.asInstanceOf[js.Any], iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled.asInstanceOf[js.Any], iamRoles = iamRoles.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], masterUsername = masterUsername.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], preferredBackupWindow = preferredBackupWindow.asInstanceOf[js.Any], preferredMaintenanceWindow = preferredMaintenanceWindow.asInstanceOf[js.Any], readerEndpoint = readerEndpoint.asInstanceOf[js.Any], replicationSourceIdentifier = replicationSourceIdentifier.asInstanceOf[js.Any], storageEncrypted = storageEncrypted.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcSecurityGroupIds = vpcSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterResult]
  }
}

