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

