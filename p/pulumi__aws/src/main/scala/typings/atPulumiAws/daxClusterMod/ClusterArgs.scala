package typings.atPulumiAws.daxClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.daxNs.ClusterServerSideEncryption
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterArgs extends js.Object {
  /**
    * List of Availability Zones in which the
    * nodes will be created
    */
  val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Group identifier. DAX converts this name to
    * lowercase
    */
  val clusterName: Input[String]
  /**
    * Description for the cluster
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * A valid Amazon Resource Name (ARN) that identifies
    * an IAM role. At runtime, DAX will assume this role and use the role's
    * permissions to access DynamoDB on your behalf
    */
  val iamRoleArn: Input[String]
  /**
    * Specifies the weekly time range for when
    * maintenance on the cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi`
    * (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example:
    * `sun:05:00-sun:09:00`
    */
  val maintenanceWindow: js.UndefOr[Input[String]] = js.undefined
  /**
    * The compute and memory capacity of the nodes. See
    * [Nodes][1] for supported node types
    */
  val nodeType: Input[String]
  /**
    * An Amazon Resource Name (ARN) of an
    * SNS topic to send DAX notifications to. Example:
    * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
    */
  val notificationTopicArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name of the parameter group to associate
    * with this DAX cluster
    */
  val parameterGroupName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The number of nodes in the DAX cluster. A
    * replication factor of 1 will create a single-node cluster, without any read
    * replicas
    */
  val replicationFactor: Input[Double]
  /**
    * One or more VPC security groups associated
    * with the cluster
    */
  val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Encrypt at rest options
    */
  val serverSideEncryption: js.UndefOr[Input[ClusterServerSideEncryption]] = js.undefined
  /**
    * Name of the subnet group to be used for the
    * cluster
    */
  val subnetGroupName: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object ClusterArgs {
  @scala.inline
  def apply(
    clusterName: Input[String],
    iamRoleArn: Input[String],
    nodeType: Input[String],
    replicationFactor: Input[Double],
    availabilityZones: Input[js.Array[Input[String]]] = null,
    description: Input[String] = null,
    maintenanceWindow: Input[String] = null,
    notificationTopicArn: Input[String] = null,
    parameterGroupName: Input[String] = null,
    securityGroupIds: Input[js.Array[Input[String]]] = null,
    serverSideEncryption: Input[ClusterServerSideEncryption] = null,
    subnetGroupName: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): ClusterArgs = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], iamRoleArn = iamRoleArn.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], replicationFactor = replicationFactor.asInstanceOf[js.Any])
    if (availabilityZones != null) __obj.updateDynamic("availabilityZones")(availabilityZones.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (maintenanceWindow != null) __obj.updateDynamic("maintenanceWindow")(maintenanceWindow.asInstanceOf[js.Any])
    if (notificationTopicArn != null) __obj.updateDynamic("notificationTopicArn")(notificationTopicArn.asInstanceOf[js.Any])
    if (parameterGroupName != null) __obj.updateDynamic("parameterGroupName")(parameterGroupName.asInstanceOf[js.Any])
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds.asInstanceOf[js.Any])
    if (serverSideEncryption != null) __obj.updateDynamic("serverSideEncryption")(serverSideEncryption.asInstanceOf[js.Any])
    if (subnetGroupName != null) __obj.updateDynamic("subnetGroupName")(subnetGroupName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterArgs]
  }
}

