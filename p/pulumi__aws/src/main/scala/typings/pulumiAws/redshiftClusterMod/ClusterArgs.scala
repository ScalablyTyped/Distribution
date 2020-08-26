package typings.pulumiAws.redshiftClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.redshift.ClusterLogging
import typings.pulumiAws.inputMod.redshift.ClusterSnapshotCopy
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterArgs extends js.Object {
  /**
    * If true , major version upgrades can be applied during the maintenance window to the Amazon Redshift engine that is running on the cluster. Default is true
    */
  val allowVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled. Even if automated snapshots are disabled, you can still create manual snapshots when you want with create-cluster-snapshot. Default is 1.
    */
  val automatedSnapshotRetentionPeriod: js.UndefOr[Input[Double]] = js.native
  /**
    * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster. For example, if you have several EC2 instances running in a specific Availability Zone, then you might want the cluster to be provisioned in the same zone in order to decrease network latency.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * The Cluster Identifier. Must be a lower case
    * string.
    */
  val clusterIdentifier: Input[String] = js.native
  /**
    * The name of the parameter group to be associated with this cluster.
    */
  val clusterParameterGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * The public key for the cluster
    */
  val clusterPublicKey: js.UndefOr[Input[String]] = js.native
  /**
    * The specific revision number of the database in the cluster
    */
  val clusterRevisionNumber: js.UndefOr[Input[String]] = js.native
  /**
    * A list of security groups to be associated with this cluster.
    */
  val clusterSecurityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The name of a cluster subnet group to be associated with this cluster. If this parameter is not provided the resulting cluster will be deployed outside virtual private cloud (VPC).
    */
  val clusterSubnetGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * The cluster type to use. Either `single-node` or `multi-node`.
    */
  val clusterType: js.UndefOr[Input[String]] = js.native
  /**
    * The version of the Amazon Redshift engine software that you want to deploy on the cluster.
    * The version selected runs on all the nodes in the cluster.
    */
  val clusterVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the first database to be created when the cluster is created.
    * If you do not provide a name, Amazon Redshift will create a default database called `dev`.
    */
  val databaseName: js.UndefOr[Input[String]] = js.native
  /**
    * The Elastic IP (EIP) address for the cluster.
    */
  val elasticIp: js.UndefOr[Input[String]] = js.native
  /**
    * If true , the data in the cluster is encrypted at rest.
    */
  val encrypted: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The connection endpoint
    */
  val endpoint: js.UndefOr[Input[String]] = js.native
  /**
    * If true , enhanced VPC routing is enabled.
    */
  val enhancedVpcRouting: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The identifier of the final snapshot that is to be created immediately before deleting the cluster. If this parameter is provided, `skipFinalSnapshot` must be false.
    */
  val finalSnapshotIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * A list of IAM Role ARNs to associate with the cluster. A Maximum of 10 can be associated to the cluster at any time.
    */
  val iamRoles: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ARN for the KMS encryption key. When specifying `kmsKeyId`, `encrypted` needs to be set to true.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  /**
    * Logging, documented below.
    */
  val logging: js.UndefOr[Input[ClusterLogging]] = js.native
  /**
    * Password for the master DB user.
    * Note that this may show up in logs, and it will be stored in the state file. Password must contain at least 8 chars and
    * contain at least one uppercase letter, one lowercase letter, and one number.
    */
  val masterPassword: js.UndefOr[Input[String]] = js.native
  /**
    * Username for the master DB user.
    */
  val masterUsername: js.UndefOr[Input[String]] = js.native
  /**
    * The node type to be provisioned for the cluster.
    */
  val nodeType: Input[String] = js.native
  /**
    * The number of compute nodes in the cluster. This parameter is required when the ClusterType parameter is specified as multi-node. Default is 1.
    */
  val numberOfNodes: js.UndefOr[Input[Double]] = js.native
  /**
    * The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you do not own, optional if you own the snapshot.
    */
  val ownerAccount: js.UndefOr[Input[String]] = js.native
  /**
    * The port number on which the cluster accepts incoming connections.
    * The cluster is accessible only via the JDBC and ODBC connection strings. Part of the connection string requires the port on which the cluster will listen for incoming connections. Default port is 5439.
    */
  val port: js.UndefOr[Input[Double]] = js.native
  /**
    * The weekly time range (in UTC) during which automated cluster maintenance can occur.
    * Format: ddd:hh24:mi-ddd:hh24:mi
    */
  val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.native
  /**
    * If true, the cluster can be accessed from a public network. Default is `true`.
    */
  val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Determines whether a final snapshot of the cluster is created before Amazon Redshift deletes the cluster. If true , a final cluster snapshot is not created. If false , a final cluster snapshot is created before the cluster is deleted. Default is false.
    */
  val skipFinalSnapshot: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The name of the cluster the source snapshot was created from.
    */
  val snapshotClusterIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration of automatic copy of snapshots from one region to another. Documented below.
    */
  val snapshotCopy: js.UndefOr[Input[ClusterSnapshotCopy]] = js.native
  /**
    * The name of the snapshot from which to create the new cluster.
    */
  val snapshotIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
    */
  val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object ClusterArgs {
  @scala.inline
  def apply(clusterIdentifier: Input[String], nodeType: Input[String]): ClusterArgs = {
    val __obj = js.Dynamic.literal(clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterArgs]
  }
  @scala.inline
  implicit class ClusterArgsOps[Self <: ClusterArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClusterIdentifier(value: Input[String]): Self = this.set("clusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeType(value: Input[String]): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowVersionUpgrade(value: Input[Boolean]): Self = this.set("allowVersionUpgrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowVersionUpgrade: Self = this.set("allowVersionUpgrade", js.undefined)
    @scala.inline
    def setAutomatedSnapshotRetentionPeriod(value: Input[Double]): Self = this.set("automatedSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomatedSnapshotRetentionPeriod: Self = this.set("automatedSnapshotRetentionPeriod", js.undefined)
    @scala.inline
    def setAvailabilityZone(value: Input[String]): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    @scala.inline
    def setClusterParameterGroupName(value: Input[String]): Self = this.set("clusterParameterGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterParameterGroupName: Self = this.set("clusterParameterGroupName", js.undefined)
    @scala.inline
    def setClusterPublicKey(value: Input[String]): Self = this.set("clusterPublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterPublicKey: Self = this.set("clusterPublicKey", js.undefined)
    @scala.inline
    def setClusterRevisionNumber(value: Input[String]): Self = this.set("clusterRevisionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterRevisionNumber: Self = this.set("clusterRevisionNumber", js.undefined)
    @scala.inline
    def setClusterSecurityGroupsVarargs(value: Input[String]*): Self = this.set("clusterSecurityGroups", js.Array(value :_*))
    @scala.inline
    def setClusterSecurityGroups(value: Input[js.Array[Input[String]]]): Self = this.set("clusterSecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterSecurityGroups: Self = this.set("clusterSecurityGroups", js.undefined)
    @scala.inline
    def setClusterSubnetGroupName(value: Input[String]): Self = this.set("clusterSubnetGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterSubnetGroupName: Self = this.set("clusterSubnetGroupName", js.undefined)
    @scala.inline
    def setClusterType(value: Input[String]): Self = this.set("clusterType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterType: Self = this.set("clusterType", js.undefined)
    @scala.inline
    def setClusterVersion(value: Input[String]): Self = this.set("clusterVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterVersion: Self = this.set("clusterVersion", js.undefined)
    @scala.inline
    def setDatabaseName(value: Input[String]): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseName: Self = this.set("databaseName", js.undefined)
    @scala.inline
    def setElasticIp(value: Input[String]): Self = this.set("elasticIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticIp: Self = this.set("elasticIp", js.undefined)
    @scala.inline
    def setEncrypted(value: Input[Boolean]): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncrypted: Self = this.set("encrypted", js.undefined)
    @scala.inline
    def setEndpoint(value: Input[String]): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setEnhancedVpcRouting(value: Input[Boolean]): Self = this.set("enhancedVpcRouting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnhancedVpcRouting: Self = this.set("enhancedVpcRouting", js.undefined)
    @scala.inline
    def setFinalSnapshotIdentifier(value: Input[String]): Self = this.set("finalSnapshotIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalSnapshotIdentifier: Self = this.set("finalSnapshotIdentifier", js.undefined)
    @scala.inline
    def setIamRolesVarargs(value: Input[String]*): Self = this.set("iamRoles", js.Array(value :_*))
    @scala.inline
    def setIamRoles(value: Input[js.Array[Input[String]]]): Self = this.set("iamRoles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamRoles: Self = this.set("iamRoles", js.undefined)
    @scala.inline
    def setKmsKeyId(value: Input[String]): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    @scala.inline
    def setLogging(value: Input[ClusterLogging]): Self = this.set("logging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    @scala.inline
    def setMasterPassword(value: Input[String]): Self = this.set("masterPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterPassword: Self = this.set("masterPassword", js.undefined)
    @scala.inline
    def setMasterUsername(value: Input[String]): Self = this.set("masterUsername", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterUsername: Self = this.set("masterUsername", js.undefined)
    @scala.inline
    def setNumberOfNodes(value: Input[Double]): Self = this.set("numberOfNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfNodes: Self = this.set("numberOfNodes", js.undefined)
    @scala.inline
    def setOwnerAccount(value: Input[String]): Self = this.set("ownerAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerAccount: Self = this.set("ownerAccount", js.undefined)
    @scala.inline
    def setPort(value: Input[Double]): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setPreferredMaintenanceWindow(value: Input[String]): Self = this.set("preferredMaintenanceWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("preferredMaintenanceWindow", js.undefined)
    @scala.inline
    def setPubliclyAccessible(value: Input[Boolean]): Self = this.set("publiclyAccessible", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubliclyAccessible: Self = this.set("publiclyAccessible", js.undefined)
    @scala.inline
    def setSkipFinalSnapshot(value: Input[Boolean]): Self = this.set("skipFinalSnapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipFinalSnapshot: Self = this.set("skipFinalSnapshot", js.undefined)
    @scala.inline
    def setSnapshotClusterIdentifier(value: Input[String]): Self = this.set("snapshotClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotClusterIdentifier: Self = this.set("snapshotClusterIdentifier", js.undefined)
    @scala.inline
    def setSnapshotCopy(value: Input[ClusterSnapshotCopy]): Self = this.set("snapshotCopy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotCopy: Self = this.set("snapshotCopy", js.undefined)
    @scala.inline
    def setSnapshotIdentifier(value: Input[String]): Self = this.set("snapshotIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotIdentifier: Self = this.set("snapshotIdentifier", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("vpcSecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("vpcSecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcSecurityGroupIds: Self = this.set("vpcSecurityGroupIds", js.undefined)
  }
  
}

