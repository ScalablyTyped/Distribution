package typings.pulumiAws.mskClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.msk.ClusterBrokerNodeGroupInfo
import typings.pulumiAws.inputMod.msk.ClusterClientAuthentication
import typings.pulumiAws.inputMod.msk.ClusterConfigurationInfo
import typings.pulumiAws.inputMod.msk.ClusterEncryptionInfo
import typings.pulumiAws.inputMod.msk.ClusterLoggingInfo
import typings.pulumiAws.inputMod.msk.ClusterOpenMonitoring
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterArgs extends js.Object {
  /**
    * Configuration block for the broker nodes of the Kafka cluster.
    */
  val brokerNodeGroupInfo: Input[ClusterBrokerNodeGroupInfo] = js.native
  /**
    * Configuration block for specifying a client authentication. See below.
    */
  val clientAuthentication: js.UndefOr[Input[ClusterClientAuthentication]] = js.native
  /**
    * Name of the MSK cluster.
    */
  val clusterName: Input[String] = js.native
  /**
    * Configuration block for specifying a MSK Configuration to attach to Kafka brokers. See below.
    */
  val configurationInfo: js.UndefOr[Input[ClusterConfigurationInfo]] = js.native
  /**
    * Configuration block for specifying encryption. See below.
    */
  val encryptionInfo: js.UndefOr[Input[ClusterEncryptionInfo]] = js.native
  /**
    * Specify the desired enhanced MSK CloudWatch monitoring level.  See [Monitoring Amazon MSK with Amazon CloudWatch](https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html)
    */
  val enhancedMonitoring: js.UndefOr[Input[String]] = js.native
  /**
    * Specify the desired Kafka software version.
    */
  val kafkaVersion: Input[String] = js.native
  /**
    * Configuration block for streaming broker logs to Cloudwatch/S3/Kinesis Firehose. See below.
    */
  val loggingInfo: js.UndefOr[Input[ClusterLoggingInfo]] = js.native
  /**
    * The desired total number of broker nodes in the kafka cluster.  It must be a multiple of the number of specified client subnets.
    */
  val numberOfBrokerNodes: Input[Double] = js.native
  /**
    * Configuration block for JMX and Node monitoring for the MSK cluster. See below.
    */
  val openMonitoring: js.UndefOr[Input[ClusterOpenMonitoring]] = js.native
  /**
    * A mapping of tags to assign to the resource
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
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
    loggingInfo: Input[ClusterLoggingInfo] = null,
    openMonitoring: Input[ClusterOpenMonitoring] = null,
    tags: Input[StringDictionary[_]] = null
  ): ClusterArgs = {
    val __obj = js.Dynamic.literal(brokerNodeGroupInfo = brokerNodeGroupInfo.asInstanceOf[js.Any], clusterName = clusterName.asInstanceOf[js.Any], kafkaVersion = kafkaVersion.asInstanceOf[js.Any], numberOfBrokerNodes = numberOfBrokerNodes.asInstanceOf[js.Any])
    if (clientAuthentication != null) __obj.updateDynamic("clientAuthentication")(clientAuthentication.asInstanceOf[js.Any])
    if (configurationInfo != null) __obj.updateDynamic("configurationInfo")(configurationInfo.asInstanceOf[js.Any])
    if (encryptionInfo != null) __obj.updateDynamic("encryptionInfo")(encryptionInfo.asInstanceOf[js.Any])
    if (enhancedMonitoring != null) __obj.updateDynamic("enhancedMonitoring")(enhancedMonitoring.asInstanceOf[js.Any])
    if (loggingInfo != null) __obj.updateDynamic("loggingInfo")(loggingInfo.asInstanceOf[js.Any])
    if (openMonitoring != null) __obj.updateDynamic("openMonitoring")(openMonitoring.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterArgs]
  }
}

