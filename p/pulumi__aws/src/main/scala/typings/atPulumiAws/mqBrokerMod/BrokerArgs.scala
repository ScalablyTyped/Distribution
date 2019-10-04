package typings.atPulumiAws.mqBrokerMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.mqNs.BrokerConfiguration
import typings.atPulumiAws.typesInputMod.mqNs.BrokerEncryptionOptions
import typings.atPulumiAws.typesInputMod.mqNs.BrokerLogs
import typings.atPulumiAws.typesInputMod.mqNs.BrokerMaintenanceWindowStartTime
import typings.atPulumiAws.typesInputMod.mqNs.BrokerUser
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrokerArgs extends js.Object {
  /**
    * Specifies whether any broker modifications
    * are applied immediately, or during the next maintenance window. Default is `false`.
    */
  val applyImmediately: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions.
    */
  val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The name of the broker.
    */
  val brokerName: Input[String]
  /**
    * Configuration of the broker. See below.
    */
  val configuration: js.UndefOr[Input[BrokerConfiguration]] = js.undefined
  /**
    * The deployment mode of the broker. Supported: `SINGLE_INSTANCE` and `ACTIVE_STANDBY_MULTI_AZ`. Defaults to `SINGLE_INSTANCE`.
    */
  val deploymentMode: js.UndefOr[Input[String]] = js.undefined
  /**
    * Configuration block containing encryption options. See below.
    */
  val encryptionOptions: js.UndefOr[Input[BrokerEncryptionOptions]] = js.undefined
  /**
    * The type of broker engine. Currently, Amazon MQ supports only `ActiveMQ`.
    */
  val engineType: Input[String]
  /**
    * The version of the broker engine. Currently, See the [AmazonMQ Broker Engine docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) for supported versions.
    */
  val engineVersion: Input[String]
  /**
    * The broker's instance type. e.g. `mq.t2.micro` or `mq.m4.large`
    */
  val hostInstanceType: Input[String]
  /**
    * Logging configuration of the broker. See below.
    */
  val logs: js.UndefOr[Input[BrokerLogs]] = js.undefined
  /**
    * Maintenance window start time. See below.
    */
  val maintenanceWindowStartTime: js.UndefOr[Input[BrokerMaintenanceWindowStartTime]] = js.undefined
  /**
    * Whether to enable connections from applications outside of the VPC that hosts the broker's subnets.
    */
  val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The list of security group IDs assigned to the broker.
    */
  val securityGroups: Input[js.Array[Input[String]]]
  /**
    * The list of subnet IDs in which to launch the broker. A `SINGLE_INSTANCE` deployment requires one subnet. An `ACTIVE_STANDBY_MULTI_AZ` deployment requires two subnets.
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The list of all ActiveMQ usernames for the specified broker. See below.
    */
  val users: Input[js.Array[Input[BrokerUser]]]
}

object BrokerArgs {
  @scala.inline
  def apply(
    brokerName: Input[String],
    engineType: Input[String],
    engineVersion: Input[String],
    hostInstanceType: Input[String],
    securityGroups: Input[js.Array[Input[String]]],
    users: Input[js.Array[Input[BrokerUser]]],
    applyImmediately: Input[Boolean] = null,
    autoMinorVersionUpgrade: Input[Boolean] = null,
    configuration: Input[BrokerConfiguration] = null,
    deploymentMode: Input[String] = null,
    encryptionOptions: Input[BrokerEncryptionOptions] = null,
    logs: Input[BrokerLogs] = null,
    maintenanceWindowStartTime: Input[BrokerMaintenanceWindowStartTime] = null,
    publiclyAccessible: Input[Boolean] = null,
    subnetIds: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): BrokerArgs = {
    val __obj = js.Dynamic.literal(brokerName = brokerName.asInstanceOf[js.Any], engineType = engineType.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], hostInstanceType = hostInstanceType.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    if (applyImmediately != null) __obj.updateDynamic("applyImmediately")(applyImmediately.asInstanceOf[js.Any])
    if (autoMinorVersionUpgrade != null) __obj.updateDynamic("autoMinorVersionUpgrade")(autoMinorVersionUpgrade.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (deploymentMode != null) __obj.updateDynamic("deploymentMode")(deploymentMode.asInstanceOf[js.Any])
    if (encryptionOptions != null) __obj.updateDynamic("encryptionOptions")(encryptionOptions.asInstanceOf[js.Any])
    if (logs != null) __obj.updateDynamic("logs")(logs.asInstanceOf[js.Any])
    if (maintenanceWindowStartTime != null) __obj.updateDynamic("maintenanceWindowStartTime")(maintenanceWindowStartTime.asInstanceOf[js.Any])
    if (publiclyAccessible != null) __obj.updateDynamic("publiclyAccessible")(publiclyAccessible.asInstanceOf[js.Any])
    if (subnetIds != null) __obj.updateDynamic("subnetIds")(subnetIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerArgs]
  }
}

