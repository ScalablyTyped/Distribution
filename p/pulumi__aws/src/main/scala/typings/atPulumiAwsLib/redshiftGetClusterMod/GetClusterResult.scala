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

