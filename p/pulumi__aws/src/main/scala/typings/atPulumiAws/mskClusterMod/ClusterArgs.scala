package typings.atPulumiAws.mskClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.msk.ClusterBrokerNodeGroupInfo
import typings.atPulumiAws.typesInputMod.msk.ClusterClientAuthentication
import typings.atPulumiAws.typesInputMod.msk.ClusterConfigurationInfo
import typings.atPulumiAws.typesInputMod.msk.ClusterEncryptionInfo
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterArgs extends js.Object {
  /**
    * Configuration block for the broker nodes of the Kafka cluster.
    */
  val brokerNodeGroupInfo: Input[ClusterBrokerNodeGroupInfo]
  /**
    * Configuration block for specifying a client authentication. See below.
    */
  val clientAuthentication: js.UndefOr[Input[ClusterClientAuthentication]] = js.undefined
  /**
    * Name of the MSK cluster.
    */
  val clusterName: Input[String]
  /**
    * Configuration block for specifying a MSK Configuration to attach to Kafka brokers. See below.
    */
  val configurationInfo: js.UndefOr[Input[ClusterConfigurationInfo]] = js.undefined
  /**
    * Configuration block for specifying encryption. See below.
    */
  val encryptionInfo: js.UndefOr[Input[ClusterEncryptionInfo]] = js.undefined
  /**
    * Specify the desired enhanced MSK CloudWatch monitoring level.  See [Monitoring Amazon MSK with Amazon CloudWatch](https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html)
    */
  val enhancedMonitoring: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specify the desired Kafka software version.
    */
  val kafkaVersion: Input[String]
  /**
    * The desired total number of broker nodes in the kafka cluster.  It must be a multiple of the number of specified client subnets.
    */
  val numberOfBrokerNodes: Input[Double]
  /**
    * A mapping of tags to assign to the resource
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object ClusterArgs {
  @scala.inline
  def apply(
    brokerNodeGroupInfo: Input[ClusterBrokerNodeGroupInfo],
    clusterName: Input[String],
    kafkaVersion: Input[String],
    numberOfBrokerNodes: Input[Double],
    clientAuthentication: Input[ClusterClientAuthentication] = null,
    configurationInfo: Input[ClusterConfigurationInfo] = null,
    encryptionInfo: Input[ClusterEncryptionInfo] = null,
    enhancedMonitoring: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): ClusterArgs = {
    val __obj = js.Dynamic.literal(brokerNodeGroupInfo = brokerNodeGroupInfo.asInstanceOf[js.Any], clusterName = clusterName.asInstanceOf[js.Any], kafkaVersion = kafkaVersion.asInstanceOf[js.Any], numberOfBrokerNodes = numberOfBrokerNodes.asInstanceOf[js.Any])
    if (clientAuthentication != null) __obj.updateDynamic("clientAuthentication")(clientAuthentication.asInstanceOf[js.Any])
    if (configurationInfo != null) __obj.updateDynamic("configurationInfo")(configurationInfo.asInstanceOf[js.Any])
    if (encryptionInfo != null) __obj.updateDynamic("encryptionInfo")(encryptionInfo.asInstanceOf[js.Any])
    if (enhancedMonitoring != null) __obj.updateDynamic("enhancedMonitoring")(enhancedMonitoring.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterArgs]
  }
}

