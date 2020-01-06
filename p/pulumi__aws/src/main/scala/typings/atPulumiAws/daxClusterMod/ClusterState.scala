package typings.atPulumiAws.daxClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.dax.ClusterNode
import typings.atPulumiAws.typesInputMod.dax.ClusterServerSideEncryption
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterState extends js.Object {
  /**
    * The ARN of the DAX cluster
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * List of Availability Zones in which the
    * nodes will be created
    */
  val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The DNS name of the DAX cluster without the port appended
    */
  val clusterAddress: js.UndefOr[Input[String]] = js.native
  /**
    * Group identifier. DAX converts this name to
    * lowercase
    */
  val clusterName: js.UndefOr[Input[String]] = js.native
  /**
    * The configuration endpoint for this DAX cluster,
    * consisting of a DNS name and a port number
    */
  val configurationEndpoint: js.UndefOr[Input[String]] = js.native
  /**
    * Description for the cluster
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A valid Amazon Resource Name (ARN) that identifies
    * an IAM role. At runtime, DAX will assume this role and use the role's
    * permissions to access DynamoDB on your behalf
    */
  val iamRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the weekly time range for when
    * maintenance on the cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi`
    * (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example:
    * `sun:05:00-sun:09:00`
    */
  val maintenanceWindow: js.UndefOr[Input[String]] = js.native
  /**
    * The compute and memory capacity of the nodes. See
    * [Nodes][1] for supported node types
    */
  val nodeType: js.UndefOr[Input[String]] = js.native
  /**
    * List of node objects including `id`, `address`, `port` and
    * `availabilityZone`. Referenceable e.g. as
    * `${aws_dax_cluster.test.nodes.0.address}`
    */
  val nodes: js.UndefOr[Input[js.Array[Input[ClusterNode]]]] = js.native
  /**
    * An Amazon Resource Name (ARN) of an
    * SNS topic to send DAX notifications to. Example:
    * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
    */
  val notificationTopicArn: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the parameter group to associate
    * with this DAX cluster
    */
  val parameterGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * The port used by the configuration endpoint
    */
  val port: js.UndefOr[Input[Double]] = js.native
  /**
    * The number of nodes in the DAX cluster. A
    * replication factor of 1 will create a single-node cluster, without any read
    * replicas
    */
  val replicationFactor: js.UndefOr[Input[Double]] = js.native
  /**
    * One or more VPC security groups associated
    * with the cluster
    */
  val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Encrypt at rest options
    */
  val serverSideEncryption: js.UndefOr[Input[ClusterServerSideEncryption]] = js.native
  /**
    * Name of the subnet group to be used for the
    * cluster
    */
  val subnetGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ClusterState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    availabilityZones: Input[js.Array[Input[String]]] = null,
    clusterAddress: Input[String] = null,
    clusterName: Input[String] = null,
    configurationEndpoint: Input[String] = null,
    description: Input[String] = null,
    iamRoleArn: Input[String] = null,
    maintenanceWindow: Input[String] = null,
    nodeType: Input[String] = null,
    nodes: Input[js.Array[Input[ClusterNode]]] = null,
    notificationTopicArn: Input[String] = null,
    parameterGroupName: Input[String] = null,
    port: Input[Double] = null,
    replicationFactor: Input[Double] = null,
    securityGroupIds: Input[js.Array[Input[String]]] = null,
    serverSideEncryption: Input[ClusterServerSideEncryption] = null,
    subnetGroupName: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): ClusterState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (availabilityZones != null) __obj.updateDynamic("availabilityZones")(availabilityZones.asInstanceOf[js.Any])
    if (clusterAddress != null) __obj.updateDynamic("clusterAddress")(clusterAddress.asInstanceOf[js.Any])
    if (clusterName != null) __obj.updateDynamic("clusterName")(clusterName.asInstanceOf[js.Any])
    if (configurationEndpoint != null) __obj.updateDynamic("configurationEndpoint")(configurationEndpoint.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (iamRoleArn != null) __obj.updateDynamic("iamRoleArn")(iamRoleArn.asInstanceOf[js.Any])
    if (maintenanceWindow != null) __obj.updateDynamic("maintenanceWindow")(maintenanceWindow.asInstanceOf[js.Any])
    if (nodeType != null) __obj.updateDynamic("nodeType")(nodeType.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (notificationTopicArn != null) __obj.updateDynamic("notificationTopicArn")(notificationTopicArn.asInstanceOf[js.Any])
    if (parameterGroupName != null) __obj.updateDynamic("parameterGroupName")(parameterGroupName.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (replicationFactor != null) __obj.updateDynamic("replicationFactor")(replicationFactor.asInstanceOf[js.Any])
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds.asInstanceOf[js.Any])
    if (serverSideEncryption != null) __obj.updateDynamic("serverSideEncryption")(serverSideEncryption.asInstanceOf[js.Any])
    if (subnetGroupName != null) __obj.updateDynamic("subnetGroupName")(subnetGroupName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterState]
  }
}

