package typings.atPulumiAws.mqBrokerMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.mqNs.BrokerConfiguration
import typings.atPulumiAws.typesOutputMod.mqNs.BrokerEncryptionOptions
import typings.atPulumiAws.typesOutputMod.mqNs.BrokerInstance
import typings.atPulumiAws.typesOutputMod.mqNs.BrokerLogs
import typings.atPulumiAws.typesOutputMod.mqNs.BrokerMaintenanceWindowStartTime
import typings.atPulumiAws.typesOutputMod.mqNs.BrokerUser
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/mq/broker", "Broker")
@js.native
class Broker protected () extends CustomResource {
  /**
    * Create a Broker resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: BrokerArgs) = this()
  def this(name: String, args: BrokerArgs, opts: CustomResourceOptions) = this()
  /**
    * Specifies whether any broker modifications
    * are applied immediately, or during the next maintenance window. Default is `false`.
    */
  val applyImmediately: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The ARN of the broker.
    */
  val arn: Output[String] = js.native
  /**
    * Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions.
    */
  val autoMinorVersionUpgrade: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The name of the broker.
    */
  val brokerName: Output[String] = js.native
  /**
    * Configuration of the broker. See below.
    */
  val configuration: Output[BrokerConfiguration] = js.native
  /**
    * The deployment mode of the broker. Supported: `SINGLE_INSTANCE` and `ACTIVE_STANDBY_MULTI_AZ`. Defaults to `SINGLE_INSTANCE`.
    */
  val deploymentMode: Output[js.UndefOr[String]] = js.native
  /**
    * Configuration block containing encryption options. See below.
    */
  val encryptionOptions: Output[js.UndefOr[BrokerEncryptionOptions]] = js.native
  /**
    * The type of broker engine. Currently, Amazon MQ supports only `ActiveMQ`.
    */
  val engineType: Output[String] = js.native
  /**
    * The version of the broker engine. Currently, See the [AmazonMQ Broker Engine docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) for supported versions.
    */
  val engineVersion: Output[String] = js.native
  /**
    * The broker's instance type. e.g. `mq.t2.micro` or `mq.m4.large`
    */
  val hostInstanceType: Output[String] = js.native
  /**
    * A list of information about allocated brokers (both active & standby).
    * * `instances.0.console_url` - The URL of the broker's [ActiveMQ Web Console](http://activemq.apache.org/web-console.html).
    * * `instances.0.ip_address` - The IP Address of the broker.
    * * `instances.0.endpoints` - The broker's wire-level protocol endpoints in the following order & format referenceable e.g. as `instances.0.endpoints.0` (SSL):
    * * `ssl://broker-id.mq.us-west-2.amazonaws.com:61617`
    * * `amqp+ssl://broker-id.mq.us-west-2.amazonaws.com:5671`
    * * `stomp+ssl://broker-id.mq.us-west-2.amazonaws.com:61614`
    * * `mqtt+ssl://broker-id.mq.us-west-2.amazonaws.com:8883`
    * * `wss://broker-id.mq.us-west-2.amazonaws.com:61619`
    */
  val instances: Output[js.Array[BrokerInstance]] = js.native
  /**
    * Logging configuration of the broker. See below.
    */
  val logs: Output[js.UndefOr[BrokerLogs]] = js.native
  /**
    * Maintenance window start time. See below.
    */
  val maintenanceWindowStartTime: Output[BrokerMaintenanceWindowStartTime] = js.native
  /**
    * Whether to enable connections from applications outside of the VPC that hosts the broker's subnets.
    */
  val publiclyAccessible: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The list of security group IDs assigned to the broker.
    */
  val securityGroups: Output[js.Array[String]] = js.native
  /**
    * The list of subnet IDs in which to launch the broker. A `SINGLE_INSTANCE` deployment requires one subnet. An `ACTIVE_STANDBY_MULTI_AZ` deployment requires two subnets.
    */
  val subnetIds: Output[js.Array[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The list of all ActiveMQ usernames for the specified broker. See below.
    */
  val users: Output[js.Array[BrokerUser]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/mq/broker", "Broker")
@js.native
object Broker extends js.Object {
  /**
    * Get an existing Broker resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Broker = js.native
  def get(name: String, id: Input[ID], state: BrokerState): Broker = js.native
  def get(name: String, id: Input[ID], state: BrokerState, opts: CustomResourceOptions): Broker = js.native
  /**
    * Returns true if the given object is an instance of Broker.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mq/broker.Broker */ Boolean = js.native
}

