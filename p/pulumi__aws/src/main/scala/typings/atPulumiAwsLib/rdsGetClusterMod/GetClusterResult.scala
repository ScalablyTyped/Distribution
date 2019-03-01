package typings
package atPulumiAwsLib.rdsGetClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterResult extends js.Object {
  val arn: java.lang.String
  val availabilityZones: js.Array[java.lang.String]
  val backupRetentionPeriod: scala.Double
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arn")(arn)
    __obj.updateDynamic("availabilityZones")(availabilityZones)
    __obj.updateDynamic("backupRetentionPeriod")(backupRetentionPeriod)
    __obj.updateDynamic("clusterMembers")(clusterMembers)
    __obj.updateDynamic("clusterResourceId")(clusterResourceId)
    __obj.updateDynamic("databaseName")(databaseName)
    __obj.updateDynamic("dbClusterParameterGroupName")(dbClusterParameterGroupName)
    __obj.updateDynamic("dbSubnetGroupName")(dbSubnetGroupName)
    __obj.updateDynamic("enabledCloudwatchLogsExports")(enabledCloudwatchLogsExports)
    __obj.updateDynamic("endpoint")(endpoint)
    __obj.updateDynamic("engine")(engine)
    __obj.updateDynamic("engineVersion")(engineVersion)
    __obj.updateDynamic("finalSnapshotIdentifier")(finalSnapshotIdentifier)
    __obj.updateDynamic("iamDatabaseAuthenticationEnabled")(iamDatabaseAuthenticationEnabled)
    __obj.updateDynamic("iamRoles")(iamRoles)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("kmsKeyId")(kmsKeyId)
    __obj.updateDynamic("masterUsername")(masterUsername)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("preferredBackupWindow")(preferredBackupWindow)
    __obj.updateDynamic("preferredMaintenanceWindow")(preferredMaintenanceWindow)
    __obj.updateDynamic("readerEndpoint")(readerEndpoint)
    __obj.updateDynamic("replicationSourceIdentifier")(replicationSourceIdentifier)
    __obj.updateDynamic("storageEncrypted")(storageEncrypted)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("vpcSecurityGroupIds")(vpcSecurityGroupIds)
    __obj.asInstanceOf[GetClusterResult]
  }
}

