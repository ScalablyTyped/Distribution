package typings
package atPulumiAwsLib.mskClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/msk/cluster", "Cluster")
@js.native
class Cluster protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Cluster resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ClusterArgs) = this()
  def this(name: java.lang.String, args: ClusterArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of the MSK Configuration to use in the cluster.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A comma separated list of one or more hostname:port pairs of kafka brokers suitable to boostrap connectivity to the kafka cluster.
    */
  val bootstrapBrokers: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A comma separated list of one or more DNS names (or IPs) and TLS port pairs kafka brokers suitable to boostrap connectivity to the kafka cluster.
    */
  val bootstrapBrokersTls: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Configuration block for the broker nodes of the Kafka cluster.
    */
  val brokerNodeGroupInfo: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_AzDistribution] = js.native
  /**
    * Configuration block for specifying a client authentication. See below.
    */
  val clientAuthentication: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_Tls]] = js.native
  /**
    * Name of the MSK cluster.
    */
  val clusterName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Configuration block for specifying a MSK Configuration to attach to Kafka brokers. See below.
    */
  val configurationInfo: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_ArnRevision]] = js.native
  /**
    * Current version of the MSK Cluster used for updates, e.g. `K13V1IB3VIYZZH`
    * * `encryption_info.0.encryption_at_rest_kms_key_arn` - The ARN of the KMS key used for encryption at rest of the broker data volumes.
    */
  val currentVersion: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Configuration block for specifying encryption. See below.
    */
  val encryptionInfo: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_EncryptionAtRestKmsKeyArn]] = js.native
  /**
    * Specify the desired enhanced MSK CloudWatch monitoring level.  See [Monitoring Amazon MSK with Amazon CloudWatch](https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html)
    */
  val enhancedMonitoring: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Specify the desired Kafka software version.
    */
  val kafkaVersion: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The desired total number of broker nodes in the kafka cluster.  It must be a multiple of the number of specified client subnets.
    */
  val numberOfBrokerNodes: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * A mapping of tags to assign to the resource
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * A comma separated list of one or more IP:port pairs to use to connect to the Apache Zookeeper cluster.
    */
  val zookeeperConnectString: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
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
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.mskClusterMod.Cluster = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.mskClusterMod.ClusterState
  ): atPulumiAwsLib.mskClusterMod.Cluster = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.mskClusterMod.ClusterState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.mskClusterMod.Cluster = js.native
  /**
    * Returns true if the given object is an instance of Cluster.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/msk/cluster.Cluster */ scala.Boolean = js.native
}

