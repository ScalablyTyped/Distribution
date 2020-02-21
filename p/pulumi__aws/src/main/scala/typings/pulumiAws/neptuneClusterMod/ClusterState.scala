package typings.pulumiAws.neptuneClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterState extends js.Object {
  /**
    * Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`.
    */
  val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The Neptune Cluster Amazon Resource Name (ARN)
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * A list of EC2 Availability Zones that instances in the Neptune cluster can be created in.
    */
  val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The days to retain backups for. Default `1`
    */
  val backupRetentionPeriod: js.UndefOr[Input[Double]] = js.native
  /**
    * The cluster identifier. If omitted, this provider will assign a random, unique identifier.
    */
  val clusterIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `clusterIdentifier`.
    */
  val clusterIdentifierPrefix: js.UndefOr[Input[String]] = js.native
  /**
    * List of Neptune Instances that are a part of this cluster
    */
  val clusterMembers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The Neptune Cluster Resource ID
    */
  val clusterResourceId: js.UndefOr[Input[String]] = js.native
  val deletionProtection: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A list of the log types this DB cluster is configured to export to Cloudwatch Logs. Currently only supports `audit`.
    */
  val enableCloudwatchLogsExports: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The DNS address of the Neptune instance
    */
  val endpoint: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the database engine to be used for this Neptune cluster. Defaults to `neptune`.
    */
  val engine: js.UndefOr[Input[String]] = js.native
  /**
    * The database engine version.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The name of your final Neptune snapshot when this Neptune cluster is deleted. If omitted, no final snapshot will be made.
    */
  val finalSnapshotIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * The Route53 Hosted Zone ID of the endpoint
    */
  val hostedZoneId: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether or mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
    */
  val iamDatabaseAuthenticationEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A List of ARNs for the IAM roles to associate to the Neptune Cluster.
    */
  val iamRoles: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ARN for the KMS encryption key. When specifying `kmsKeyArn`, `storageEncrypted` needs to be set to true.
    */
  val kmsKeyArn: js.UndefOr[Input[String]] = js.native
  /**
    * A cluster parameter group to associate with the cluster.
    */
  val neptuneClusterParameterGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * A Neptune subnet group to associate with this Neptune instance.
    */
  val neptuneSubnetGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * The port on which the Neptune accepts connections. Default is `8182`.
    */
  val port: js.UndefOr[Input[Double]] = js.native
  /**
    * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter. Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per region. e.g. 04:00-09:00
    */
  val preferredBackupWindow: js.UndefOr[Input[String]] = js.native
  /**
    * The weekly time range during which system maintenance can occur, in (UTC) e.g. wed:04:00-wed:04:30
    */
  val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.native
  /**
    * A read-only endpoint for the Neptune cluster, automatically load-balanced across replicas
    */
  val readerEndpoint: js.UndefOr[Input[String]] = js.native
  /**
    * ARN of a source Neptune cluster or Neptune instance if this Neptune cluster is to be created as a Read Replica.
    */
  val replicationSourceIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * Determines whether a final Neptune snapshot is created before the Neptune cluster is deleted. If true is specified, no Neptune snapshot is created. If false is specified, a Neptune snapshot is created before the Neptune cluster is deleted, using the value from `finalSnapshotIdentifier`. Default is `false`.
    */
  val skipFinalSnapshot: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a Neptune cluster snapshot, or the ARN when specifying a Neptune snapshot.
    */
  val snapshotIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether the Neptune cluster is encrypted. The default is `false` if not specified.
    */
  val storageEncrypted: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A mapping of tags to assign to the Neptune cluster.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * List of VPC security groups to associate with the Cluster
    */
  val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object ClusterState {
  @scala.inline
  def apply(
    applyImmediately: Input[Boolean] = null,
    arn: Input[String] = null,
    availabilityZones: Input[js.Array[Input[String]]] = null,
    backupRetentionPeriod: Input[Double] = null,
    clusterIdentifier: Input[String] = null,
    clusterIdentifierPrefix: Input[String] = null,
    clusterMembers: Input[js.Array[Input[String]]] = null,
    clusterResourceId: Input[String] = null,
    deletionProtection: Input[Boolean] = null,
    enableCloudwatchLogsExports: Input[js.Array[Input[String]]] = null,
    endpoint: Input[String] = null,
    engine: Input[String] = null,
    engineVersion: Input[String] = null,
    finalSnapshotIdentifier: Input[String] = null,
    hostedZoneId: Input[String] = null,
    iamDatabaseAuthenticationEnabled: Input[Boolean] = null,
    iamRoles: Input[js.Array[Input[String]]] = null,
    kmsKeyArn: Input[String] = null,
    neptuneClusterParameterGroupName: Input[String] = null,
    neptuneSubnetGroupName: Input[String] = null,
    port: Input[Double] = null,
    preferredBackupWindow: Input[String] = null,
    preferredMaintenanceWindow: Input[String] = null,
    readerEndpoint: Input[String] = null,
    replicationSourceIdentifier: Input[String] = null,
    skipFinalSnapshot: Input[Boolean] = null,
    snapshotIdentifier: Input[String] = null,
    storageEncrypted: Input[Boolean] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcSecurityGroupIds: Input[js.Array[Input[String]]] = null
  ): ClusterState = {
    val __obj = js.Dynamic.literal()
    if (applyImmediately != null) __obj.updateDynamic("applyImmediately")(applyImmediately.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (availabilityZones != null) __obj.updateDynamic("availabilityZones")(availabilityZones.asInstanceOf[js.Any])
    if (backupRetentionPeriod != null) __obj.updateDynamic("backupRetentionPeriod")(backupRetentionPeriod.asInstanceOf[js.Any])
    if (clusterIdentifier != null) __obj.updateDynamic("clusterIdentifier")(clusterIdentifier.asInstanceOf[js.Any])
    if (clusterIdentifierPrefix != null) __obj.updateDynamic("clusterIdentifierPrefix")(clusterIdentifierPrefix.asInstanceOf[js.Any])
    if (clusterMembers != null) __obj.updateDynamic("clusterMembers")(clusterMembers.asInstanceOf[js.Any])
    if (clusterResourceId != null) __obj.updateDynamic("clusterResourceId")(clusterResourceId.asInstanceOf[js.Any])
    if (deletionProtection != null) __obj.updateDynamic("deletionProtection")(deletionProtection.asInstanceOf[js.Any])
    if (enableCloudwatchLogsExports != null) __obj.updateDynamic("enableCloudwatchLogsExports")(enableCloudwatchLogsExports.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion.asInstanceOf[js.Any])
    if (finalSnapshotIdentifier != null) __obj.updateDynamic("finalSnapshotIdentifier")(finalSnapshotIdentifier.asInstanceOf[js.Any])
    if (hostedZoneId != null) __obj.updateDynamic("hostedZoneId")(hostedZoneId.asInstanceOf[js.Any])
    if (iamDatabaseAuthenticationEnabled != null) __obj.updateDynamic("iamDatabaseAuthenticationEnabled")(iamDatabaseAuthenticationEnabled.asInstanceOf[js.Any])
    if (iamRoles != null) __obj.updateDynamic("iamRoles")(iamRoles.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (neptuneClusterParameterGroupName != null) __obj.updateDynamic("neptuneClusterParameterGroupName")(neptuneClusterParameterGroupName.asInstanceOf[js.Any])
    if (neptuneSubnetGroupName != null) __obj.updateDynamic("neptuneSubnetGroupName")(neptuneSubnetGroupName.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (preferredBackupWindow != null) __obj.updateDynamic("preferredBackupWindow")(preferredBackupWindow.asInstanceOf[js.Any])
    if (preferredMaintenanceWindow != null) __obj.updateDynamic("preferredMaintenanceWindow")(preferredMaintenanceWindow.asInstanceOf[js.Any])
    if (readerEndpoint != null) __obj.updateDynamic("readerEndpoint")(readerEndpoint.asInstanceOf[js.Any])
    if (replicationSourceIdentifier != null) __obj.updateDynamic("replicationSourceIdentifier")(replicationSourceIdentifier.asInstanceOf[js.Any])
    if (skipFinalSnapshot != null) __obj.updateDynamic("skipFinalSnapshot")(skipFinalSnapshot.asInstanceOf[js.Any])
    if (snapshotIdentifier != null) __obj.updateDynamic("snapshotIdentifier")(snapshotIdentifier.asInstanceOf[js.Any])
    if (storageEncrypted != null) __obj.updateDynamic("storageEncrypted")(storageEncrypted.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcSecurityGroupIds != null) __obj.updateDynamic("vpcSecurityGroupIds")(vpcSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterState]
  }
}

