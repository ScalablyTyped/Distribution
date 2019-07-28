package typings.atPulumiAws.rdsGetClusterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterResult extends js.Object {
  val arn: String
  val availabilityZones: js.Array[String]
  val backupRetentionPeriod: Double
  val clusterIdentifier: String
  val clusterMembers: js.Array[String]
  val clusterResourceId: String
  val databaseName: String
  val dbClusterParameterGroupName: String
  val dbSubnetGroupName: String
  val enabledCloudwatchLogsExports: js.Array[String]
  val endpoint: String
  val engine: String
  val engineVersion: String
  val finalSnapshotIdentifier: String
  val hostedZoneId: String
  val iamDatabaseAuthenticationEnabled: Boolean
  val iamRoles: js.Array[String]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val kmsKeyId: String
  val masterUsername: String
  val port: Double
  val preferredBackupWindow: String
  val preferredMaintenanceWindow: String
  val readerEndpoint: String
  val replicationSourceIdentifier: String
  val storageEncrypted: Boolean
  val tags: StringDictionary[js.Any]
  val vpcSecurityGroupIds: js.Array[String]
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
    val __obj = js.Dynamic.literal(arn = arn, availabilityZones = availabilityZones, backupRetentionPeriod = backupRetentionPeriod, clusterIdentifier = clusterIdentifier, clusterMembers = clusterMembers, clusterResourceId = clusterResourceId, databaseName = databaseName, dbClusterParameterGroupName = dbClusterParameterGroupName, dbSubnetGroupName = dbSubnetGroupName, enabledCloudwatchLogsExports = enabledCloudwatchLogsExports, endpoint = endpoint, engine = engine, engineVersion = engineVersion, finalSnapshotIdentifier = finalSnapshotIdentifier, hostedZoneId = hostedZoneId, iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled, iamRoles = iamRoles, id = id, kmsKeyId = kmsKeyId, masterUsername = masterUsername, port = port, preferredBackupWindow = preferredBackupWindow, preferredMaintenanceWindow = preferredMaintenanceWindow, readerEndpoint = readerEndpoint, replicationSourceIdentifier = replicationSourceIdentifier, storageEncrypted = storageEncrypted, tags = tags, vpcSecurityGroupIds = vpcSecurityGroupIds)
  
    __obj.asInstanceOf[GetClusterResult]
  }
}

