package typings
package atPulumiAwsLib.rdsGetClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterResult extends js.Object {
  val arn: java.lang.String
  val availabilityZones: js.Array[java.lang.String]
  val backupRetentionPeriod: scala.Double
  val clusterIdentifier: java.lang.String
  val clusterMembers: js.Array[java.lang.String]
  val clusterResourceId: java.lang.String
  val databaseName: java.lang.String
  val dbClusterParameterGroupName: java.lang.String
  val dbSubnetGroupName: java.lang.String
  val enabledCloudwatchLogsExports: js.Array[java.lang.String]
  val endpoint: java.lang.String
  val engine: java.lang.String
  val engineVersion: java.lang.String
  val finalSnapshotIdentifier: java.lang.String
  val iamDatabaseAuthenticationEnabled: scala.Boolean
  val iamRoles: js.Array[java.lang.String]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val kmsKeyId: java.lang.String
  val masterUsername: java.lang.String
  val port: scala.Double
  val preferredBackupWindow: java.lang.String
  val preferredMaintenanceWindow: java.lang.String
  val readerEndpoint: java.lang.String
  val replicationSourceIdentifier: java.lang.String
  val storageEncrypted: scala.Boolean
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  val vpcSecurityGroupIds: js.Array[java.lang.String]
}

object GetClusterResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    availabilityZones: js.Array[java.lang.String],
    backupRetentionPeriod: scala.Double,
    clusterIdentifier: java.lang.String,
    clusterMembers: js.Array[java.lang.String],
    clusterResourceId: java.lang.String,
    databaseName: java.lang.String,
    dbClusterParameterGroupName: java.lang.String,
    dbSubnetGroupName: java.lang.String,
    enabledCloudwatchLogsExports: js.Array[java.lang.String],
    endpoint: java.lang.String,
    engine: java.lang.String,
    engineVersion: java.lang.String,
    finalSnapshotIdentifier: java.lang.String,
    iamDatabaseAuthenticationEnabled: scala.Boolean,
    iamRoles: js.Array[java.lang.String],
    id: java.lang.String,
    kmsKeyId: java.lang.String,
    masterUsername: java.lang.String,
    port: scala.Double,
    preferredBackupWindow: java.lang.String,
    preferredMaintenanceWindow: java.lang.String,
    readerEndpoint: java.lang.String,
    replicationSourceIdentifier: java.lang.String,
    storageEncrypted: scala.Boolean,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    vpcSecurityGroupIds: js.Array[java.lang.String]
  ): GetClusterResult = {
    val __obj = js.Dynamic.literal(arn = arn, availabilityZones = availabilityZones, backupRetentionPeriod = backupRetentionPeriod, clusterIdentifier = clusterIdentifier, clusterMembers = clusterMembers, clusterResourceId = clusterResourceId, databaseName = databaseName, dbClusterParameterGroupName = dbClusterParameterGroupName, dbSubnetGroupName = dbSubnetGroupName, enabledCloudwatchLogsExports = enabledCloudwatchLogsExports, endpoint = endpoint, engine = engine, engineVersion = engineVersion, finalSnapshotIdentifier = finalSnapshotIdentifier, iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled, iamRoles = iamRoles, id = id, kmsKeyId = kmsKeyId, masterUsername = masterUsername, port = port, preferredBackupWindow = preferredBackupWindow, preferredMaintenanceWindow = preferredMaintenanceWindow, readerEndpoint = readerEndpoint, replicationSourceIdentifier = replicationSourceIdentifier, storageEncrypted = storageEncrypted, tags = tags, vpcSecurityGroupIds = vpcSecurityGroupIds)
  
    __obj.asInstanceOf[GetClusterResult]
  }
}

