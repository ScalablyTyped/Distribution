package typings
package atPulumiAwsLib.redshiftGetClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterResult extends js.Object {
  /**
    * Whether major version upgrades can be applied during maintenance period
    */
  val allowVersionUpgrade: scala.Boolean
  /**
    * The backup retention period
    */
  val automatedSnapshotRetentionPeriod: scala.Double
  /**
    * The availability zone of the cluster
    */
  val availabilityZone: java.lang.String
  /**
    * The name of the S3 bucket where the log files are to be stored
    */
  val bucketName: java.lang.String
  /**
    * The name of the parameter group to be associated with this cluster
    */
  val clusterParameterGroupName: java.lang.String
  /**
    * The public key for the cluster
    */
  val clusterPublicKey: java.lang.String
  /**
    * The cluster revision number
    */
  val clusterRevisionNumber: java.lang.String
  /**
    * The security groups associated with the cluster
    */
  val clusterSecurityGroups: js.Array[java.lang.String]
  /**
    * The name of a cluster subnet group to be associated with this cluster
    */
  val clusterSubnetGroupName: java.lang.String
  /**
    * The cluster type
    */
  val clusterType: java.lang.String
  val clusterVersion: java.lang.String
  /**
    * The name of the default database in the cluster
    */
  val databaseName: java.lang.String
  /**
    * The Elastic IP of the cluster
    */
  val elasticIp: java.lang.String
  /**
    * Whether cluster logging is enabled
    */
  val enableLogging: scala.Boolean
  /**
    * Whether the cluster data is encrypted
    */
  val encrypted: scala.Boolean
  /**
    * The cluster endpoint
    */
  val endpoint: java.lang.String
  /**
    * Whether enhanced VPC routing is enabled
    */
  val enhancedVpcRouting: scala.Boolean
  /**
    * The IAM roles associated to the cluster
    */
  val iamRoles: js.Array[java.lang.String]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The KMS encryption key associated to the cluster
    */
  val kmsKeyId: java.lang.String
  /**
    * Username for the master DB user
    */
  val masterUsername: java.lang.String
  /**
    * The cluster node type
    */
  val nodeType: java.lang.String
  /**
    * The number of nodes in the cluster
    */
  val numberOfNodes: scala.Double
  /**
    * The port the cluster responds on
    */
  val port: scala.Double
  /**
    * The maintenance window
    */
  val preferredMaintenanceWindow: java.lang.String
  /**
    * Whether the cluster is publicly accessible
    */
  val publiclyAccessible: scala.Boolean
  /**
    * The folder inside the S3 bucket where the log files are stored
    */
  val s3KeyPrefix: java.lang.String
  /**
    * The VPC Id associated with the cluster
    */
  val vpcId: java.lang.String
  /**
    * The VPC security group Ids associated with the cluster
    */
  val vpcSecurityGroupIds: js.Array[java.lang.String]
}

object GetClusterResult {
  @scala.inline
  def apply(
    allowVersionUpgrade: scala.Boolean,
    automatedSnapshotRetentionPeriod: scala.Double,
    availabilityZone: java.lang.String,
    bucketName: java.lang.String,
    clusterParameterGroupName: java.lang.String,
    clusterPublicKey: java.lang.String,
    clusterRevisionNumber: java.lang.String,
    clusterSecurityGroups: js.Array[java.lang.String],
    clusterSubnetGroupName: java.lang.String,
    clusterType: java.lang.String,
    clusterVersion: java.lang.String,
    databaseName: java.lang.String,
    elasticIp: java.lang.String,
    enableLogging: scala.Boolean,
    encrypted: scala.Boolean,
    endpoint: java.lang.String,
    enhancedVpcRouting: scala.Boolean,
    iamRoles: js.Array[java.lang.String],
    id: java.lang.String,
    kmsKeyId: java.lang.String,
    masterUsername: java.lang.String,
    nodeType: java.lang.String,
    numberOfNodes: scala.Double,
    port: scala.Double,
    preferredMaintenanceWindow: java.lang.String,
    publiclyAccessible: scala.Boolean,
    s3KeyPrefix: java.lang.String,
    vpcId: java.lang.String,
    vpcSecurityGroupIds: js.Array[java.lang.String]
  ): GetClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowVersionUpgrade")(allowVersionUpgrade)
    __obj.updateDynamic("automatedSnapshotRetentionPeriod")(automatedSnapshotRetentionPeriod)
    __obj.updateDynamic("availabilityZone")(availabilityZone)
    __obj.updateDynamic("bucketName")(bucketName)
    __obj.updateDynamic("clusterParameterGroupName")(clusterParameterGroupName)
    __obj.updateDynamic("clusterPublicKey")(clusterPublicKey)
    __obj.updateDynamic("clusterRevisionNumber")(clusterRevisionNumber)
    __obj.updateDynamic("clusterSecurityGroups")(clusterSecurityGroups)
    __obj.updateDynamic("clusterSubnetGroupName")(clusterSubnetGroupName)
    __obj.updateDynamic("clusterType")(clusterType)
    __obj.updateDynamic("clusterVersion")(clusterVersion)
    __obj.updateDynamic("databaseName")(databaseName)
    __obj.updateDynamic("elasticIp")(elasticIp)
    __obj.updateDynamic("enableLogging")(enableLogging)
    __obj.updateDynamic("encrypted")(encrypted)
    __obj.updateDynamic("endpoint")(endpoint)
    __obj.updateDynamic("enhancedVpcRouting")(enhancedVpcRouting)
    __obj.updateDynamic("iamRoles")(iamRoles)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("kmsKeyId")(kmsKeyId)
    __obj.updateDynamic("masterUsername")(masterUsername)
    __obj.updateDynamic("nodeType")(nodeType)
    __obj.updateDynamic("numberOfNodes")(numberOfNodes)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("preferredMaintenanceWindow")(preferredMaintenanceWindow)
    __obj.updateDynamic("publiclyAccessible")(publiclyAccessible)
    __obj.updateDynamic("s3KeyPrefix")(s3KeyPrefix)
    __obj.updateDynamic("vpcId")(vpcId)
    __obj.updateDynamic("vpcSecurityGroupIds")(vpcSecurityGroupIds)
    __obj.asInstanceOf[GetClusterResult]
  }
}

