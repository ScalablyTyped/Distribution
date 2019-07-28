package typings.atPulumiAws.redshiftGetClusterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterResult extends js.Object {
  /**
    * Whether major version upgrades can be applied during maintenance period
    */
  val allowVersionUpgrade: Boolean
  /**
    * The backup retention period
    */
  val automatedSnapshotRetentionPeriod: Double
  /**
    * The availability zone of the cluster
    */
  val availabilityZone: String
  /**
    * The name of the S3 bucket where the log files are to be stored
    */
  val bucketName: String
  /**
    * The cluster identifier
    */
  val clusterIdentifier: String
  /**
    * The name of the parameter group to be associated with this cluster
    */
  val clusterParameterGroupName: String
  /**
    * The public key for the cluster
    */
  val clusterPublicKey: String
  /**
    * The cluster revision number
    */
  val clusterRevisionNumber: String
  /**
    * The security groups associated with the cluster
    */
  val clusterSecurityGroups: js.Array[String]
  /**
    * The name of a cluster subnet group to be associated with this cluster
    */
  val clusterSubnetGroupName: String
  /**
    * The cluster type
    */
  val clusterType: String
  val clusterVersion: String
  /**
    * The name of the default database in the cluster
    */
  val databaseName: String
  /**
    * The Elastic IP of the cluster
    */
  val elasticIp: String
  /**
    * Whether cluster logging is enabled
    */
  val enableLogging: Boolean
  /**
    * Whether the cluster data is encrypted
    */
  val encrypted: Boolean
  /**
    * The cluster endpoint
    */
  val endpoint: String
  /**
    * Whether enhanced VPC routing is enabled
    */
  val enhancedVpcRouting: Boolean
  /**
    * The IAM roles associated to the cluster
    */
  val iamRoles: js.Array[String]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The KMS encryption key associated to the cluster
    */
  val kmsKeyId: String
  /**
    * Username for the master DB user
    */
  val masterUsername: String
  /**
    * The cluster node type
    */
  val nodeType: String
  /**
    * The number of nodes in the cluster
    */
  val numberOfNodes: Double
  /**
    * The port the cluster responds on
    */
  val port: Double
  /**
    * The maintenance window
    */
  val preferredMaintenanceWindow: String
  /**
    * Whether the cluster is publicly accessible
    */
  val publiclyAccessible: Boolean
  /**
    * The folder inside the S3 bucket where the log files are stored
    */
  val s3KeyPrefix: String
  /**
    * The tags associated to the cluster
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * The VPC Id associated with the cluster
    */
  val vpcId: String
  /**
    * The VPC security group Ids associated with the cluster
    */
  val vpcSecurityGroupIds: js.Array[String]
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
    val __obj = js.Dynamic.literal(allowVersionUpgrade = allowVersionUpgrade, automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod, availabilityZone = availabilityZone, bucketName = bucketName, clusterIdentifier = clusterIdentifier, clusterParameterGroupName = clusterParameterGroupName, clusterPublicKey = clusterPublicKey, clusterRevisionNumber = clusterRevisionNumber, clusterSecurityGroups = clusterSecurityGroups, clusterSubnetGroupName = clusterSubnetGroupName, clusterType = clusterType, clusterVersion = clusterVersion, databaseName = databaseName, elasticIp = elasticIp, enableLogging = enableLogging, encrypted = encrypted, endpoint = endpoint, enhancedVpcRouting = enhancedVpcRouting, iamRoles = iamRoles, id = id, kmsKeyId = kmsKeyId, masterUsername = masterUsername, nodeType = nodeType, numberOfNodes = numberOfNodes, port = port, preferredMaintenanceWindow = preferredMaintenanceWindow, publiclyAccessible = publiclyAccessible, s3KeyPrefix = s3KeyPrefix, vpcId = vpcId, vpcSecurityGroupIds = vpcSecurityGroupIds)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetClusterResult]
  }
}

