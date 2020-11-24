package typings.pulumiAws.mskClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.msk.ClusterBrokerNodeGroupInfo
import typings.pulumiAws.outputMod.msk.ClusterClientAuthentication
import typings.pulumiAws.outputMod.msk.ClusterConfigurationInfo
import typings.pulumiAws.outputMod.msk.ClusterEncryptionInfo
import typings.pulumiAws.outputMod.msk.ClusterLoggingInfo
import typings.pulumiAws.outputMod.msk.ClusterOpenMonitoring
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/msk/cluster", "Cluster")
@js.native
class Cluster protected () extends CustomResource {
  /**
    * Create a Cluster resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ClusterArgs) = this()
  def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Amazon Resource Name (ARN) of the MSK Configuration to use in the cluster.
    */
  val arn: Output_[String] = js.native
  
  /**
    * A comma separated list of one or more hostname:port pairs of kafka brokers suitable to bootstrap connectivity to the kafka cluster. Only contains value if `clientBroker` encryption in transit is set to `PLAINTEXT` or `TLS_PLAINTEXT`.
    */
  val bootstrapBrokers: Output_[String] = js.native
  
  /**
    * A comma separated list of one or more DNS names (or IPs) and TLS port pairs kafka brokers suitable to bootstrap connectivity to the kafka cluster. Only contains value if `clientBroker` encryption in transit is set to `TLS_PLAINTEXT` or `TLS`.
    */
  val bootstrapBrokersTls: Output_[String] = js.native
  
  /**
    * Configuration block for the broker nodes of the Kafka cluster.
    */
  val brokerNodeGroupInfo: Output_[ClusterBrokerNodeGroupInfo] = js.native
  
  /**
    * Configuration block for specifying a client authentication. See below.
    */
  val clientAuthentication: Output_[js.UndefOr[ClusterClientAuthentication]] = js.native
  
  /**
    * Name of the MSK cluster.
    */
  val clusterName: Output_[String] = js.native
  
  /**
    * Configuration block for specifying a MSK Configuration to attach to Kafka brokers. See below.
    */
  val configurationInfo: Output_[js.UndefOr[ClusterConfigurationInfo]] = js.native
  
  /**
    * Current version of the MSK Cluster used for updates, e.g. `K13V1IB3VIYZZH`
    * * `encryption_info.0.encryption_at_rest_kms_key_arn` - The ARN of the KMS key used for encryption at rest of the broker data volumes.
    */
  val currentVersion: Output_[String] = js.native
  
  /**
    * Configuration block for specifying encryption. See below.
    */
  val encryptionInfo: Output_[js.UndefOr[ClusterEncryptionInfo]] = js.native
  
  /**
    * Specify the desired enhanced MSK CloudWatch monitoring level.  See [Monitoring Amazon MSK with Amazon CloudWatch](https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html)
    */
  val enhancedMonitoring: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Specify the desired Kafka software version.
    */
  val kafkaVersion: Output_[String] = js.native
  
  /**
    * Configuration block for streaming broker logs to Cloudwatch/S3/Kinesis Firehose. See below.
    */
  val loggingInfo: Output_[js.UndefOr[ClusterLoggingInfo]] = js.native
  
  /**
    * The desired total number of broker nodes in the kafka cluster.  It must be a multiple of the number of specified client subnets.
    */
  val numberOfBrokerNodes: Output_[Double] = js.native
  
  /**
    * Configuration block for JMX and Node monitoring for the MSK cluster. See below.
    */
  val openMonitoring: Output_[js.UndefOr[ClusterOpenMonitoring]] = js.native
  
  /**
    * A map of tags to assign to the resource
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * A comma separated list of one or more hostname:port pairs to use to connect to the Apache Zookeeper cluster.
    */
  val zookeeperConnectString: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/msk/cluster", "Cluster")
@js.native
object Cluster extends js.Object {
  
  /**
    * Get an existing Cluster resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Cluster = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Cluster = js.native
  def get(name: String, id: Input[ID], state: ClusterState): Cluster = js.native
  def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): Cluster = js.native
  
  /**
    * Returns true if the given object is an instance of Cluster.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/msk/cluster.Cluster */ Boolean = js.native
}
