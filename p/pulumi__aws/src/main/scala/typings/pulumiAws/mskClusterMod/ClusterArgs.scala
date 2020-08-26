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
    * A map of tags to assign to the resource
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object ClusterArgs {
  @scala.inline
  def apply(
    brokerNodeGroupInfo: Input[ClusterBrokerNodeGroupInfo],
    clusterName: Input[String],
    kafkaVersion: Input[String],
    numberOfBrokerNodes: Input[Double]
  ): ClusterArgs = {
    val __obj = js.Dynamic.literal(brokerNodeGroupInfo = brokerNodeGroupInfo.asInstanceOf[js.Any], clusterName = clusterName.asInstanceOf[js.Any], kafkaVersion = kafkaVersion.asInstanceOf[js.Any], numberOfBrokerNodes = numberOfBrokerNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterArgs]
  }
  @scala.inline
  implicit class ClusterArgsOps[Self <: ClusterArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBrokerNodeGroupInfo(value: Input[ClusterBrokerNodeGroupInfo]): Self = this.set("brokerNodeGroupInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setClusterName(value: Input[String]): Self = this.set("clusterName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKafkaVersion(value: Input[String]): Self = this.set("kafkaVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfBrokerNodes(value: Input[Double]): Self = this.set("numberOfBrokerNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientAuthentication(value: Input[ClusterClientAuthentication]): Self = this.set("clientAuthentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientAuthentication: Self = this.set("clientAuthentication", js.undefined)
    @scala.inline
    def setConfigurationInfo(value: Input[ClusterConfigurationInfo]): Self = this.set("configurationInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationInfo: Self = this.set("configurationInfo", js.undefined)
    @scala.inline
    def setEncryptionInfo(value: Input[ClusterEncryptionInfo]): Self = this.set("encryptionInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionInfo: Self = this.set("encryptionInfo", js.undefined)
    @scala.inline
    def setEnhancedMonitoring(value: Input[String]): Self = this.set("enhancedMonitoring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnhancedMonitoring: Self = this.set("enhancedMonitoring", js.undefined)
    @scala.inline
    def setLoggingInfo(value: Input[ClusterLoggingInfo]): Self = this.set("loggingInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingInfo: Self = this.set("loggingInfo", js.undefined)
    @scala.inline
    def setOpenMonitoring(value: Input[ClusterOpenMonitoring]): Self = this.set("openMonitoring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenMonitoring: Self = this.set("openMonitoring", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

