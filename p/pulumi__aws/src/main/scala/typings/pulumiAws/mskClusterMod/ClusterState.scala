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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterState extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of the MSK Configuration to use in the cluster.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * A comma separated list of one or more hostname:port pairs of kafka brokers suitable to bootstrap connectivity to the kafka cluster. Only contains value if `clientBroker` encryption in transit is set to `PLAINTEXT` or `TLS_PLAINTEXT`.
    */
  val bootstrapBrokers: js.UndefOr[Input[String]] = js.native
  
  /**
    * A comma separated list of one or more DNS names (or IPs) and TLS port pairs kafka brokers suitable to bootstrap connectivity to the kafka cluster. Only contains value if `clientBroker` encryption in transit is set to `TLS_PLAINTEXT` or `TLS`.
    */
  val bootstrapBrokersTls: js.UndefOr[Input[String]] = js.native
  
  /**
    * Configuration block for the broker nodes of the Kafka cluster.
    */
  val brokerNodeGroupInfo: js.UndefOr[Input[ClusterBrokerNodeGroupInfo]] = js.native
  
  /**
    * Configuration block for specifying a client authentication. See below.
    */
  val clientAuthentication: js.UndefOr[Input[ClusterClientAuthentication]] = js.native
  
  /**
    * Name of the MSK cluster.
    */
  val clusterName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Configuration block for specifying a MSK Configuration to attach to Kafka brokers. See below.
    */
  val configurationInfo: js.UndefOr[Input[ClusterConfigurationInfo]] = js.native
  
  /**
    * Current version of the MSK Cluster used for updates, e.g. `K13V1IB3VIYZZH`
    * * `encryption_info.0.encryption_at_rest_kms_key_arn` - The ARN of the KMS key used for encryption at rest of the broker data volumes.
    */
  val currentVersion: js.UndefOr[Input[String]] = js.native
  
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
  val kafkaVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * Configuration block for streaming broker logs to Cloudwatch/S3/Kinesis Firehose. See below.
    */
  val loggingInfo: js.UndefOr[Input[ClusterLoggingInfo]] = js.native
  
  /**
    * The desired total number of broker nodes in the kafka cluster.  It must be a multiple of the number of specified client subnets.
    */
  val numberOfBrokerNodes: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Configuration block for JMX and Node monitoring for the MSK cluster. See below.
    */
  val openMonitoring: js.UndefOr[Input[ClusterOpenMonitoring]] = js.native
  
  /**
    * A map of tags to assign to the resource
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * A comma separated list of one or more hostname:port pairs to use to connect to the Apache Zookeeper cluster.
    */
  val zookeeperConnectString: js.UndefOr[Input[String]] = js.native
}
object ClusterState {
  
  @scala.inline
  def apply(): ClusterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterState]
  }
  
  @scala.inline
  implicit class ClusterStateOps[Self <: ClusterState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setBootstrapBrokers(value: Input[String]): Self = this.set("bootstrapBrokers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootstrapBrokers: Self = this.set("bootstrapBrokers", js.undefined)
    
    @scala.inline
    def setBootstrapBrokersTls(value: Input[String]): Self = this.set("bootstrapBrokersTls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootstrapBrokersTls: Self = this.set("bootstrapBrokersTls", js.undefined)
    
    @scala.inline
    def setBrokerNodeGroupInfo(value: Input[ClusterBrokerNodeGroupInfo]): Self = this.set("brokerNodeGroupInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrokerNodeGroupInfo: Self = this.set("brokerNodeGroupInfo", js.undefined)
    
    @scala.inline
    def setClientAuthentication(value: Input[ClusterClientAuthentication]): Self = this.set("clientAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientAuthentication: Self = this.set("clientAuthentication", js.undefined)
    
    @scala.inline
    def setClusterName(value: Input[String]): Self = this.set("clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterName: Self = this.set("clusterName", js.undefined)
    
    @scala.inline
    def setConfigurationInfo(value: Input[ClusterConfigurationInfo]): Self = this.set("configurationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationInfo: Self = this.set("configurationInfo", js.undefined)
    
    @scala.inline
    def setCurrentVersion(value: Input[String]): Self = this.set("currentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentVersion: Self = this.set("currentVersion", js.undefined)
    
    @scala.inline
    def setEncryptionInfo(value: Input[ClusterEncryptionInfo]): Self = this.set("encryptionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionInfo: Self = this.set("encryptionInfo", js.undefined)
    
    @scala.inline
    def setEnhancedMonitoring(value: Input[String]): Self = this.set("enhancedMonitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnhancedMonitoring: Self = this.set("enhancedMonitoring", js.undefined)
    
    @scala.inline
    def setKafkaVersion(value: Input[String]): Self = this.set("kafkaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKafkaVersion: Self = this.set("kafkaVersion", js.undefined)
    
    @scala.inline
    def setLoggingInfo(value: Input[ClusterLoggingInfo]): Self = this.set("loggingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggingInfo: Self = this.set("loggingInfo", js.undefined)
    
    @scala.inline
    def setNumberOfBrokerNodes(value: Input[Double]): Self = this.set("numberOfBrokerNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfBrokerNodes: Self = this.set("numberOfBrokerNodes", js.undefined)
    
    @scala.inline
    def setOpenMonitoring(value: Input[ClusterOpenMonitoring]): Self = this.set("openMonitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenMonitoring: Self = this.set("openMonitoring", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setZookeeperConnectString(value: Input[String]): Self = this.set("zookeeperConnectString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZookeeperConnectString: Self = this.set("zookeeperConnectString", js.undefined)
  }
}
