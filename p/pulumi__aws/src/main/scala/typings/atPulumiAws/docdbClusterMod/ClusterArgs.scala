package typings.atPulumiAws.docdbClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterArgs extends js.Object {
  /**
    * Specifies whether any cluster modifications
    * are applied immediately, or during the next maintenance window. Default is
    * `false`.
    */
  val applyImmediately: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A list of EC2 Availability Zones that
    * instances in the DB cluster can be created in.
    */
  val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The days to retain backups for. Default `1`
    */
  val backupRetentionPeriod: js.UndefOr[Input[Double]] = js.undefined
  val clusterIdentifier: js.UndefOr[Input[String]] = js.undefined
  /**
    * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `cluster_identifer`.
    */
  val clusterIdentifierPrefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * List of DocDB Instances that are a part of this cluster
    */
  val clusterMembers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * A cluster parameter group to associate with the cluster.
    */
  val dbClusterParameterGroupName: js.UndefOr[Input[String]] = js.undefined
  /**
    * A DB subnet group to associate with this DB instance.
    */
  val dbSubnetGroupName: js.UndefOr[Input[String]] = js.undefined
  /**
    * List of log types to export to cloudwatch. If omitted, no logs will be exported.
    * The following log types are supported: `audit`.
    */
  val enabledCloudwatchLogsExports: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The name of the database engine to be used for this DB cluster. Defaults to `docdb`. Valid Values: `docdb`
    */
  val engine: js.UndefOr[Input[String]] = js.undefined
  /**
    * The database engine version. Updating this argument results in an outage.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of your final DB snapshot
    * when this DB cluster is deleted. If omitted, no final snapshot will be
    * made.
    */
  val finalSnapshotIdentifier: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ARN for the KMS encryption key. When specifying `kms_key_id`, `storage_encrypted` needs to be set to true.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Password for the master DB user. Note that this may
    * show up in logs, and it will be stored in the state file. Please refer to the DocDB Naming Constraints.
    */
  val masterPassword: js.UndefOr[Input[String]] = js.undefined
  /**
    * Username for the master DB user.
    */
  val masterUsername: js.UndefOr[Input[String]] = js.undefined
  /**
    * The port on which the DB accepts connections
    */
  val port: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.Time in UTC
    * Default: A 30-minute window selected at random from an 8-hour block of time per region. e.g. 04:00-09:00
    */
  val preferredBackupWindow: js.UndefOr[Input[String]] = js.undefined
  val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.undefined
  /**
    * Determines whether a final DB snapshot is created before the DB cluster is deleted. If true is specified, no DB snapshot is created. If false is specified, a DB snapshot is created before the DB cluster is deleted, using the value from `final_snapshot_identifier`. Default is `false`.
    */
  val skipFinalSnapshot: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a DB cluster snapshot, or the ARN when specifying a DB snapshot.
    */
  val snapshotIdentifier: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies whether the DB cluster is encrypted. The default is `false`.
    */
  val storageEncrypted: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A mapping of tags to assign to the DB cluster.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * List of VPC security groups to associate
    * with the Cluster
    */
  val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object ClusterArgs {
  @scala.inline
  def apply(
    applyImmediately: Input[Boolean] = null,
    availabilityZones: Input[js.Array[Input[String]]] = null,
    backupRetentionPeriod: Input[Double] = null,
    clusterIdentifier: Input[String] = null,
    clusterIdentifierPrefix: Input[String] = null,
    clusterMembers: Input[js.Array[Input[String]]] = null,
    dbClusterParameterGroupName: Input[String] = null,
    dbSubnetGroupName: Input[String] = null,
    enabledCloudwatchLogsExports: Input[js.Array[Input[String]]] = null,
    engine: Input[String] = null,
    engineVersion: Input[String] = null,
    finalSnapshotIdentifier: Input[String] = null,
    kmsKeyId: Input[String] = null,
    masterPassword: Input[String] = null,
    masterUsername: Input[String] = null,
    port: Input[Double] = null,
    preferredBackupWindow: Input[String] = null,
    preferredMaintenanceWindow: Input[String] = null,
    skipFinalSnapshot: Input[Boolean] = null,
    snapshotIdentifier: Input[String] = null,
    storageEncrypted: Input[Boolean] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcSecurityGroupIds: Input[js.Array[Input[String]]] = null
  ): ClusterArgs = {
    val __obj = js.Dynamic.literal()
    if (applyImmediately != null) __obj.updateDynamic("applyImmediately")(applyImmediately.asInstanceOf[js.Any])
    if (availabilityZones != null) __obj.updateDynamic("availabilityZones")(availabilityZones.asInstanceOf[js.Any])
    if (backupRetentionPeriod != null) __obj.updateDynamic("backupRetentionPeriod")(backupRetentionPeriod.asInstanceOf[js.Any])
    if (clusterIdentifier != null) __obj.updateDynamic("clusterIdentifier")(clusterIdentifier.asInstanceOf[js.Any])
    if (clusterIdentifierPrefix != null) __obj.updateDynamic("clusterIdentifierPrefix")(clusterIdentifierPrefix.asInstanceOf[js.Any])
    if (clusterMembers != null) __obj.updateDynamic("clusterMembers")(clusterMembers.asInstanceOf[js.Any])
    if (dbClusterParameterGroupName != null) __obj.updateDynamic("dbClusterParameterGroupName")(dbClusterParameterGroupName.asInstanceOf[js.Any])
    if (dbSubnetGroupName != null) __obj.updateDynamic("dbSubnetGroupName")(dbSubnetGroupName.asInstanceOf[js.Any])
    if (enabledCloudwatchLogsExports != null) __obj.updateDynamic("enabledCloudwatchLogsExports")(enabledCloudwatchLogsExports.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion.asInstanceOf[js.Any])
    if (finalSnapshotIdentifier != null) __obj.updateDynamic("finalSnapshotIdentifier")(finalSnapshotIdentifier.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (masterPassword != null) __obj.updateDynamic("masterPassword")(masterPassword.asInstanceOf[js.Any])
    if (masterUsername != null) __obj.updateDynamic("masterUsername")(masterUsername.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (preferredBackupWindow != null) __obj.updateDynamic("preferredBackupWindow")(preferredBackupWindow.asInstanceOf[js.Any])
    if (preferredMaintenanceWindow != null) __obj.updateDynamic("preferredMaintenanceWindow")(preferredMaintenanceWindow.asInstanceOf[js.Any])
    if (skipFinalSnapshot != null) __obj.updateDynamic("skipFinalSnapshot")(skipFinalSnapshot.asInstanceOf[js.Any])
    if (snapshotIdentifier != null) __obj.updateDynamic("snapshotIdentifier")(snapshotIdentifier.asInstanceOf[js.Any])
    if (storageEncrypted != null) __obj.updateDynamic("storageEncrypted")(storageEncrypted.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcSecurityGroupIds != null) __obj.updateDynamic("vpcSecurityGroupIds")(vpcSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterArgs]
  }
}

