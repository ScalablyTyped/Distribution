package typings
package atPulumiAwsLib.neptuneClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterArgs extends js.Object {
  /**
    * Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`.
    */
  val applyImmediately: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * A list of EC2 Availability Zones that instances in the Neptune cluster can be created in.
    */
  val availabilityZones: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The days to retain backups for. Default `1`
    */
  val backupRetentionPeriod: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The cluster identifier. If omitted, Terraform will assign a random, unique identifier.
    */
  val clusterIdentifier: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `cluster_identifier`.
    */
  val clusterIdentifierPrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the database engine to be used for this Neptune cluster. Defaults to `neptune`.
    */
  val engine: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The database engine version.
    */
  val engineVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of your final Neptune snapshot when this Neptune cluster is deleted. If omitted, no final snapshot will be made.
    */
  val finalSnapshotIdentifier: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies whether or mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
    */
  val iamDatabaseAuthenticationEnabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * A List of ARNs for the IAM roles to associate to the Neptune Cluster.
    */
  val iamRoles: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The ARN for the KMS encryption key. When specifying `kms_key_arn`, `storage_encrypted` needs to be set to true.
    */
  val kmsKeyArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A cluster parameter group to associate with the cluster.
    */
  val neptuneClusterParameterGroupName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A Neptune subnet group to associate with this Neptune instance.
    */
  val neptuneSubnetGroupName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The port on which the Neptune accepts connections. Default is `8182`.
    */
  val port: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter. Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per region. e.g. 04:00-09:00
    */
  val preferredBackupWindow: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The weekly time range during which system maintenance can occur, in (UTC) e.g. wed:04:00-wed:04:30
    */
  val preferredMaintenanceWindow: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * ARN of a source Neptune cluster or Neptune instance if this Neptune cluster is to be created as a Read Replica.
    */
  val replicationSourceIdentifier: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Determines whether a final Neptune snapshot is created before the Neptune cluster is deleted. If true is specified, no Neptune snapshot is created. If false is specified, a Neptune snapshot is created before the Neptune cluster is deleted, using the value from `final_snapshot_identifier`. Default is `false`.
    */
  val skipFinalSnapshot: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a Neptune cluster snapshot, or the ARN when specifying a Neptune snapshot.
    */
  val snapshotIdentifier: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies whether the Neptune cluster is encrypted. The default is `false` if not specified.
    */
  val storageEncrypted: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * A mapping of tags to assign to the Neptune cluster.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * List of VPC security groups to associate with the Cluster
    */
  val vpcSecurityGroupIds: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
}

