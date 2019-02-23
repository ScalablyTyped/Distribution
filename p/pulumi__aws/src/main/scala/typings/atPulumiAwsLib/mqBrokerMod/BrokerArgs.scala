package typings
package atPulumiAwsLib.mqBrokerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrokerArgs extends js.Object {
  /**
    * Specifies whether any broker modifications
    * are applied immediately, or during the next maintenance window. Default is `false`.
    */
  val applyImmediately: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions.
    */
  val autoMinorVersionUpgrade: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The name of the broker.
    */
  val brokerName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Configuration of the broker. See below.
    */
  val configuration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_IdRevisionInput]] = js.undefined
  /**
    * The deployment mode of the broker. Supported: `SINGLE_INSTANCE` and `ACTIVE_STANDBY_MULTI_AZ`. Defaults to `SINGLE_INSTANCE`.
    */
  val deploymentMode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of broker engine. Currently, Amazon MQ supports only `ActiveMQ`.
    */
  val engineType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The version of the broker engine. Currently, Amazon MQ supports only `5.15.0` or `5.15.6`.
    */
  val engineVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The broker's instance type. e.g. `mq.t2.micro` or `mq.m4.large`
    */
  val hostInstanceType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Logging configuration of the broker. See below.
    */
  val logs: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AuditGeneral]] = js.undefined
  /**
    * Maintenance window start time. See below.
    */
  val maintenanceWindowStartTime: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DayOfWeekTimeOfDay]] = js.undefined
  /**
    * Whether to enable connections from applications outside of the VPC that hosts the broker's subnets.
    */
  val publiclyAccessible: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The list of security group IDs assigned to the broker.
    */
  val securityGroups: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  /**
    * The list of subnet IDs in which to launch the broker. A `SINGLE_INSTANCE` deployment requires one subnet. An `ACTIVE_STANDBY_MULTI_AZ` deployment requires two subnets.
    */
  val subnetIds: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The list of all ActiveMQ usernames for the specified broker. See below.
    */
  val users: atPulumiPulumiLib.outputMod.Input[
    js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ConsoleAccessGroups]]
  ]
}

