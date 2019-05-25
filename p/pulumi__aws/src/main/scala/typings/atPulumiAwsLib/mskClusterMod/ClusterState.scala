package typings
package atPulumiAwsLib.mskClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the MSK cluster.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A comma separated list of one or more hostname:port pairs of kafka brokers suitable to boostrap connectivity to the kafka cluster.
    * * `encryption_info.0.encryption_at_rest_kms_key_arn` - The ARN of the KMS key used for encryption at rest of the broker data volumes.
    */
  val bootstrapBrokers: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Nested data for configuring the broker nodes of the Kafka cluster.
    */
  val brokerNodeGroupInfo: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AzDistributionClientSubnets]
  ] = js.undefined
  /**
    * Name of the MSK cluster.
    */
  val clusterName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Nested data for specifying encryption at rest info.  See below.
    */
  val encryptionInfo: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EncryptionAtRestKmsKeyArnInput]
  ] = js.undefined
  /**
    * Specify the desired enhanced MSK CloudWatch monitoring level.  See [Monitoring Amazon MSK with Amazon CloudWatch](https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html)
    */
  val enhancedMonitoring: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specify the desired Kafka software version.
    */
  val kafkaVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The desired total number of broker nodes in the kafka cluster.  It must be a multiple of the number of specified client subnets.
    */
  val numberOfBrokerNodes: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * A mapping of tags to assign to the resource
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * A comma separated list of one or more IP:port pairs to use to connect to the Apache Zookeeper cluster.
    */
  val zookeeperConnectString: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ClusterState {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    bootstrapBrokers: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    brokerNodeGroupInfo: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AzDistributionClientSubnets] = null,
    clusterName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    encryptionInfo: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EncryptionAtRestKmsKeyArnInput] = null,
    enhancedMonitoring: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    kafkaVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    numberOfBrokerNodes: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    zookeeperConnectString: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ClusterState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (bootstrapBrokers != null) __obj.updateDynamic("bootstrapBrokers")(bootstrapBrokers.asInstanceOf[js.Any])
    if (brokerNodeGroupInfo != null) __obj.updateDynamic("brokerNodeGroupInfo")(brokerNodeGroupInfo.asInstanceOf[js.Any])
    if (clusterName != null) __obj.updateDynamic("clusterName")(clusterName.asInstanceOf[js.Any])
    if (encryptionInfo != null) __obj.updateDynamic("encryptionInfo")(encryptionInfo.asInstanceOf[js.Any])
    if (enhancedMonitoring != null) __obj.updateDynamic("enhancedMonitoring")(enhancedMonitoring.asInstanceOf[js.Any])
    if (kafkaVersion != null) __obj.updateDynamic("kafkaVersion")(kafkaVersion.asInstanceOf[js.Any])
    if (numberOfBrokerNodes != null) __obj.updateDynamic("numberOfBrokerNodes")(numberOfBrokerNodes.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (zookeeperConnectString != null) __obj.updateDynamic("zookeeperConnectString")(zookeeperConnectString.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterState]
  }
}

