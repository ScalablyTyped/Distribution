package typings.pulumiAws.redshiftGetClusterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterResult extends js.Object {
  /**
    * Whether major version upgrades can be applied during maintenance period
    */
  val allowVersionUpgrade: Boolean = js.native
  /**
    * The backup retention period
    */
  val automatedSnapshotRetentionPeriod: Double = js.native
  /**
    * The availability zone of the cluster
    */
  val availabilityZone: String = js.native
  /**
    * The name of the S3 bucket where the log files are to be stored
    */
  val bucketName: String = js.native
  /**
    * The cluster identifier
    */
  val clusterIdentifier: String = js.native
  /**
    * The name of the parameter group to be associated with this cluster
    */
  val clusterParameterGroupName: String = js.native
  /**
    * The public key for the cluster
    */
  val clusterPublicKey: String = js.native
  /**
    * The cluster revision number
    */
  val clusterRevisionNumber: String = js.native
  /**
    * The security groups associated with the cluster
    */
  val clusterSecurityGroups: js.Array[String] = js.native
  /**
    * The name of a cluster subnet group to be associated with this cluster
    */
  val clusterSubnetGroupName: String = js.native
  /**
    * The cluster type
    */
  val clusterType: String = js.native
  val clusterVersion: String = js.native
  /**
    * The name of the default database in the cluster
    */
  val databaseName: String = js.native
  /**
    * The Elastic IP of the cluster
    */
  val elasticIp: String = js.native
  /**
    * Whether cluster logging is enabled
    */
  val enableLogging: Boolean = js.native
  /**
    * Whether the cluster data is encrypted
    */
  val encrypted: Boolean = js.native
  /**
    * The cluster endpoint
    */
  val endpoint: String = js.native
  /**
    * Whether enhanced VPC routing is enabled
    */
  val enhancedVpcRouting: Boolean = js.native
  /**
    * The IAM roles associated to the cluster
    */
  val iamRoles: js.Array[String] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The KMS encryption key associated to the cluster
    */
  val kmsKeyId: String = js.native
  /**
    * Username for the master DB user
    */
  val masterUsername: String = js.native
  /**
    * The cluster node type
    */
  val nodeType: String = js.native
  /**
    * The number of nodes in the cluster
    */
  val numberOfNodes: Double = js.native
  /**
    * The port the cluster responds on
    */
  val port: Double = js.native
  /**
    * The maintenance window
    */
  val preferredMaintenanceWindow: String = js.native
  /**
    * Whether the cluster is publicly accessible
    */
  val publiclyAccessible: Boolean = js.native
  /**
    * The folder inside the S3 bucket where the log files are stored
    */
  val s3KeyPrefix: String = js.native
  /**
    * The tags associated to the cluster
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The VPC Id associated with the cluster
    */
  val vpcId: String = js.native
  /**
    * The VPC security group Ids associated with the cluster
    */
  val vpcSecurityGroupIds: js.Array[String] = js.native
}

object GetClusterResult {
  @scala.inline
  def apply(
    allowVersionUpgrade: Boolean,
    automatedSnapshotRetentionPeriod: Double,
    availabilityZone: String,
    bucketName: String,
    clusterIdentifier: String,
    clusterParameterGroupName: String,
    clusterPublicKey: String,
    clusterRevisionNumber: String,
    clusterSecurityGroups: js.Array[String],
    clusterSubnetGroupName: String,
    clusterType: String,
    clusterVersion: String,
    databaseName: String,
    elasticIp: String,
    enableLogging: Boolean,
    encrypted: Boolean,
    endpoint: String,
    enhancedVpcRouting: Boolean,
    iamRoles: js.Array[String],
    id: String,
    kmsKeyId: String,
    masterUsername: String,
    nodeType: String,
    numberOfNodes: Double,
    port: Double,
    preferredMaintenanceWindow: String,
    publiclyAccessible: Boolean,
    s3KeyPrefix: String,
    vpcId: String,
    vpcSecurityGroupIds: js.Array[String],
    tags: StringDictionary[js.Any] = null
  ): GetClusterResult = {
    val __obj = js.Dynamic.literal(allowVersionUpgrade = allowVersionUpgrade.asInstanceOf[js.Any], automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], bucketName = bucketName.asInstanceOf[js.Any], clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any], clusterParameterGroupName = clusterParameterGroupName.asInstanceOf[js.Any], clusterPublicKey = clusterPublicKey.asInstanceOf[js.Any], clusterRevisionNumber = clusterRevisionNumber.asInstanceOf[js.Any], clusterSecurityGroups = clusterSecurityGroups.asInstanceOf[js.Any], clusterSubnetGroupName = clusterSubnetGroupName.asInstanceOf[js.Any], clusterType = clusterType.asInstanceOf[js.Any], clusterVersion = clusterVersion.asInstanceOf[js.Any], databaseName = databaseName.asInstanceOf[js.Any], elasticIp = elasticIp.asInstanceOf[js.Any], enableLogging = enableLogging.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], enhancedVpcRouting = enhancedVpcRouting.asInstanceOf[js.Any], iamRoles = iamRoles.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], masterUsername = masterUsername.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], numberOfNodes = numberOfNodes.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], preferredMaintenanceWindow = preferredMaintenanceWindow.asInstanceOf[js.Any], publiclyAccessible = publiclyAccessible.asInstanceOf[js.Any], s3KeyPrefix = s3KeyPrefix.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any], vpcSecurityGroupIds = vpcSecurityGroupIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterResult]
  }
}

