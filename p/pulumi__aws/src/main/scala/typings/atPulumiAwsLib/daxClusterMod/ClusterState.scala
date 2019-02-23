package typings
package atPulumiAwsLib.daxClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterState extends js.Object {
  /**
    * The ARN of the DAX cluster
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * List of Availability Zones in which the
    * nodes will be created
    */
  val availabilityZones: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The DNS name of the DAX cluster without the port appended
    */
  val clusterAddress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Group identifier. DAX converts this name to
    * lowercase
    */
  val clusterName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The configuration endpoint for this DAX cluster,
    * consisting of a DNS name and a port number
    */
  val configurationEndpoint: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Description for the cluster
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A valid Amazon Resource Name (ARN) that identifies
    * an IAM role. At runtime, DAX will assume this role and use the role's
    * permissions to access DynamoDB on your behalf
    */
  val iamRoleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies the weekly time range for when
    * maintenance on the cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi`
    * (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example:
    * `sun:05:00-sun:09:00`
    */
  val maintenanceWindow: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The compute and memory capacity of the nodes. See
    * [Nodes][1] for supported node types
    */
  val nodeType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * List of node objects including `id`, `address`, `port` and
    * `availability_zone`. Referenceable e.g. as
    * `${aws_dax_cluster.test.nodes.0.address}`
    */
  val nodes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AddressAvailabilityZone]]
    ]
  ] = js.undefined
  /**
    * An Amazon Resource Name (ARN) of an
    * SNS topic to send DAX notifications to. Example:
    * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
    */
  val notificationTopicArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of the parameter group to associate
    * with this DAX cluster
    */
  val parameterGroupName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The port used by the configuration endpoint
    */
  val port: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The number of nodes in the DAX cluster. A
    * replication factor of 1 will create a single-node cluster, without any read
    * replicas
    */
  val replicationFactor: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * One or more VPC security groups associated
    * with the cluster
    */
  val securityGroupIds: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Encrypt at rest options
    */
  val serverSideEncryption: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EnabledBooleanInput]] = js.undefined
  /**
    * Name of the subnet group to be used for the
    * cluster
    */
  val subnetGroupName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

