package typings.atPulumiAws.redshiftClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.redshiftNs.ClusterLogging
import typings.atPulumiAws.typesInputMod.redshiftNs.ClusterSnapshotCopy
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterState extends js.Object {
  /**
    * If true , major version upgrades can be applied during the maintenance window to the Amazon Redshift engine that is running on the cluster. Default is true
    */
  val allowVersionUpgrade: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Amazon Resource Name (ARN) of cluster
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled. Even if automated snapshots are disabled, you can still create manual snapshots when you want with create-cluster-snapshot. Default is 1.
    */
  val automatedSnapshotRetentionPeriod: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster. For example, if you have several EC2 instances running in a specific Availability Zone, then you might want the cluster to be provisioned in the same zone in order to decrease network latency.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Cluster Identifier. Must be a lower case
    * string.
    */
  val clusterIdentifier: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the parameter group to be associated with this cluster.
    */
  val clusterParameterGroupName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The public key for the cluster
    */
  val clusterPublicKey: js.UndefOr[Input[String]] = js.undefined
  /**
    * The specific revision number of the database in the cluster
    */
  val clusterRevisionNumber: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of security groups to be associated with this cluster.
    */
  val clusterSecurityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The name of a cluster subnet group to be associated with this cluster. If this parameter is not provided the resulting cluster will be deployed outside virtual private cloud (VPC).
    */
  val clusterSubnetGroupName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The cluster type to use. Either `single-node` or `multi-node`.
    */
  val clusterType: js.UndefOr[Input[String]] = js.undefined
  /**
    * The version of the Amazon Redshift engine software that you want to deploy on the cluster.
    * The version selected runs on all the nodes in the cluster.
    */
  val clusterVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the first database to be created when the cluster is created.
    * If you do not provide a name, Amazon Redshift will create a default database called `dev`.
    */
  val databaseName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The DNS name of the cluster
    */
  val dnsName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Elastic IP (EIP) address for the cluster.
    */
  val elasticIp: js.UndefOr[Input[String]] = js.undefined
  /**
    * If true , the data in the cluster is encrypted at rest.
    */
  val encrypted: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The connection endpoint
    */
  val endpoint: js.UndefOr[Input[String]] = js.undefined
  /**
    * If true , enhanced VPC routing is enabled.
    */
  val enhancedVpcRouting: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The identifier of the final snapshot that is to be created immediately before deleting the cluster. If this parameter is provided, `skipFinalSnapshot` must be false.
    */
  val finalSnapshotIdentifier: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of IAM Role ARNs to associate with the cluster. A Maximum of 10 can be associated to the cluster at any time.
    */
  val iamRoles: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The ARN for the KMS encryption key. When specifying `kmsKeyId`, `encrypted` needs to be set to true.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Logging, documented below.
    */
  val logging: js.UndefOr[Input[ClusterLogging]] = js.undefined
  /**
    * Password for the master DB user.
    * Note that this may show up in logs, and it will be stored in the state file. Password must contain at least 8 chars and
    * contain at least one uppercase letter, one lowercase letter, and one number.
    */
  val masterPassword: js.UndefOr[Input[String]] = js.undefined
  /**
    * Username for the master DB user.
    */
  val masterUsername: js.UndefOr[Input[String]] = js.undefined
  /**
    * The node type to be provisioned for the cluster.
    */
  val nodeType: js.UndefOr[Input[String]] = js.undefined
  /**
    * The number of compute nodes in the cluster. This parameter is required when the ClusterType parameter is specified as multi-node. Default is 1.
    */
  val numberOfNodes: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you do not own, optional if you own the snapshot.
    */
  val ownerAccount: js.UndefOr[Input[String]] = js.undefined
  /**
    * The port number on which the cluster accepts incoming connections.
    * The cluster is accessible only via the JDBC and ODBC connection strings. Part of the connection string requires the port on which the cluster will listen for incoming connections. Default port is 5439.
    */
  val port: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The weekly time range (in UTC) during which automated cluster maintenance can occur.
    * Format: ddd:hh24:mi-ddd:hh24:mi
    */
  val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.undefined
  /**
    * If true, the cluster can be accessed from a public network. Default is `true`.
    */
  val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Determines whether a final snapshot of the cluster is created before Amazon Redshift deletes the cluster. If true , a final cluster snapshot is not created. If false , a final cluster snapshot is created before the cluster is deleted. Default is false.
    */
  val skipFinalSnapshot: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The name of the cluster the source snapshot was created from.
    */
  val snapshotClusterIdentifier: js.UndefOr[Input[String]] = js.undefined
  /**
    * Configuration of automatic copy of snapshots from one region to another. Documented below.
    */
  val snapshotCopy: js.UndefOr[Input[ClusterSnapshotCopy]] = js.undefined
  /**
    * The name of the snapshot from which to create the new cluster.
    */
  val snapshotIdentifier: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
    */
  val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object ClusterState {
  @scala.inline
  def apply(
    allowVersionUpgrade: Input[Boolean] = null,
    arn: Input[String] = null,
    automatedSnapshotRetentionPeriod: Input[Double] = null,
    availabilityZone: Input[String] = null,
    clusterIdentifier: Input[String] = null,
    clusterParameterGroupName: Input[String] = null,
    clusterPublicKey: Input[String] = null,
    clusterRevisionNumber: Input[String] = null,
    clusterSecurityGroups: Input[js.Array[Input[String]]] = null,
    clusterSubnetGroupName: Input[String] = null,
    clusterType: Input[String] = null,
    clusterVersion: Input[String] = null,
    databaseName: Input[String] = null,
    dnsName: Input[String] = null,
    elasticIp: Input[String] = null,
    encrypted: Input[Boolean] = null,
    endpoint: Input[String] = null,
    enhancedVpcRouting: Input[Boolean] = null,
    finalSnapshotIdentifier: Input[String] = null,
    iamRoles: Input[js.Array[Input[String]]] = null,
    kmsKeyId: Input[String] = null,
    logging: Input[ClusterLogging] = null,
    masterPassword: Input[String] = null,
    masterUsername: Input[String] = null,
    nodeType: Input[String] = null,
    numberOfNodes: Input[Double] = null,
    ownerAccount: Input[String] = null,
    port: Input[Double] = null,
    preferredMaintenanceWindow: Input[String] = null,
    publiclyAccessible: Input[Boolean] = null,
    skipFinalSnapshot: Input[Boolean] = null,
    snapshotClusterIdentifier: Input[String] = null,
    snapshotCopy: Input[ClusterSnapshotCopy] = null,
    snapshotIdentifier: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcSecurityGroupIds: Input[js.Array[Input[String]]] = null
  ): ClusterState = {
    val __obj = js.Dynamic.literal()
    if (allowVersionUpgrade != null) __obj.updateDynamic("allowVersionUpgrade")(allowVersionUpgrade.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (automatedSnapshotRetentionPeriod != null) __obj.updateDynamic("automatedSnapshotRetentionPeriod")(automatedSnapshotRetentionPeriod.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (clusterIdentifier != null) __obj.updateDynamic("clusterIdentifier")(clusterIdentifier.asInstanceOf[js.Any])
    if (clusterParameterGroupName != null) __obj.updateDynamic("clusterParameterGroupName")(clusterParameterGroupName.asInstanceOf[js.Any])
    if (clusterPublicKey != null) __obj.updateDynamic("clusterPublicKey")(clusterPublicKey.asInstanceOf[js.Any])
    if (clusterRevisionNumber != null) __obj.updateDynamic("clusterRevisionNumber")(clusterRevisionNumber.asInstanceOf[js.Any])
    if (clusterSecurityGroups != null) __obj.updateDynamic("clusterSecurityGroups")(clusterSecurityGroups.asInstanceOf[js.Any])
    if (clusterSubnetGroupName != null) __obj.updateDynamic("clusterSubnetGroupName")(clusterSubnetGroupName.asInstanceOf[js.Any])
    if (clusterType != null) __obj.updateDynamic("clusterType")(clusterType.asInstanceOf[js.Any])
    if (clusterVersion != null) __obj.updateDynamic("clusterVersion")(clusterVersion.asInstanceOf[js.Any])
    if (databaseName != null) __obj.updateDynamic("databaseName")(databaseName.asInstanceOf[js.Any])
    if (dnsName != null) __obj.updateDynamic("dnsName")(dnsName.asInstanceOf[js.Any])
    if (elasticIp != null) __obj.updateDynamic("elasticIp")(elasticIp.asInstanceOf[js.Any])
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (enhancedVpcRouting != null) __obj.updateDynamic("enhancedVpcRouting")(enhancedVpcRouting.asInstanceOf[js.Any])
    if (finalSnapshotIdentifier != null) __obj.updateDynamic("finalSnapshotIdentifier")(finalSnapshotIdentifier.asInstanceOf[js.Any])
    if (iamRoles != null) __obj.updateDynamic("iamRoles")(iamRoles.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (masterPassword != null) __obj.updateDynamic("masterPassword")(masterPassword.asInstanceOf[js.Any])
    if (masterUsername != null) __obj.updateDynamic("masterUsername")(masterUsername.asInstanceOf[js.Any])
    if (nodeType != null) __obj.updateDynamic("nodeType")(nodeType.asInstanceOf[js.Any])
    if (numberOfNodes != null) __obj.updateDynamic("numberOfNodes")(numberOfNodes.asInstanceOf[js.Any])
    if (ownerAccount != null) __obj.updateDynamic("ownerAccount")(ownerAccount.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (preferredMaintenanceWindow != null) __obj.updateDynamic("preferredMaintenanceWindow")(preferredMaintenanceWindow.asInstanceOf[js.Any])
    if (publiclyAccessible != null) __obj.updateDynamic("publiclyAccessible")(publiclyAccessible.asInstanceOf[js.Any])
    if (skipFinalSnapshot != null) __obj.updateDynamic("skipFinalSnapshot")(skipFinalSnapshot.asInstanceOf[js.Any])
    if (snapshotClusterIdentifier != null) __obj.updateDynamic("snapshotClusterIdentifier")(snapshotClusterIdentifier.asInstanceOf[js.Any])
    if (snapshotCopy != null) __obj.updateDynamic("snapshotCopy")(snapshotCopy.asInstanceOf[js.Any])
    if (snapshotIdentifier != null) __obj.updateDynamic("snapshotIdentifier")(snapshotIdentifier.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcSecurityGroupIds != null) __obj.updateDynamic("vpcSecurityGroupIds")(vpcSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterState]
  }
}

