package typings.pulumiAws.brokerMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.mq.BrokerConfiguration
import typings.pulumiAws.inputMod.mq.BrokerEncryptionOptions
import typings.pulumiAws.inputMod.mq.BrokerInstance
import typings.pulumiAws.inputMod.mq.BrokerLogs
import typings.pulumiAws.inputMod.mq.BrokerMaintenanceWindowStartTime
import typings.pulumiAws.inputMod.mq.BrokerUser
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerState extends js.Object {
  /**
    * Specifies whether any broker modifications
    * are applied immediately, or during the next maintenance window. Default is `false`.
    */
  val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ARN of the broker.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions.
    */
  val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The name of the broker.
    */
  val brokerName: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration of the broker. See below.
    */
  val configuration: js.UndefOr[Input[BrokerConfiguration]] = js.native
  /**
    * The deployment mode of the broker. Supported: `SINGLE_INSTANCE` and `ACTIVE_STANDBY_MULTI_AZ`. Defaults to `SINGLE_INSTANCE`.
    */
  val deploymentMode: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block containing encryption options. See below.
    */
  val encryptionOptions: js.UndefOr[Input[BrokerEncryptionOptions]] = js.native
  /**
    * The type of broker engine. Currently, Amazon MQ supports only `ActiveMQ`.
    */
  val engineType: js.UndefOr[Input[String]] = js.native
  /**
    * The version of the broker engine. See the [AmazonMQ Broker Engine docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) for supported versions.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The broker's instance type. e.g. `mq.t2.micro` or `mq.m4.large`
    */
  val hostInstanceType: js.UndefOr[Input[String]] = js.native
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
  val instances: js.UndefOr[Input[js.Array[Input[BrokerInstance]]]] = js.native
  /**
    * Logging configuration of the broker. See below.
    */
  val logs: js.UndefOr[Input[BrokerLogs]] = js.native
  /**
    * Maintenance window start time. See below.
    */
  val maintenanceWindowStartTime: js.UndefOr[Input[BrokerMaintenanceWindowStartTime]] = js.native
  /**
    * Whether to enable connections from applications outside of the VPC that hosts the broker's subnets.
    */
  val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The list of security group IDs assigned to the broker.
    */
  val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The list of subnet IDs in which to launch the broker. A `SINGLE_INSTANCE` deployment requires one subnet. An `ACTIVE_STANDBY_MULTI_AZ` deployment requires two subnets.
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The list of all ActiveMQ usernames for the specified broker. See below.
    */
  val users: js.UndefOr[Input[js.Array[Input[BrokerUser]]]] = js.native
}

object BrokerState {
  @scala.inline
  def apply(): BrokerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerState]
  }
  @scala.inline
  implicit class BrokerStateOps[Self <: BrokerState] (val x: Self) extends AnyVal {
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
    def setApplyImmediately(value: Input[Boolean]): Self = this.set("applyImmediately", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyImmediately: Self = this.set("applyImmediately", js.undefined)
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setAutoMinorVersionUpgrade(value: Input[Boolean]): Self = this.set("autoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMinorVersionUpgrade: Self = this.set("autoMinorVersionUpgrade", js.undefined)
    @scala.inline
    def setBrokerName(value: Input[String]): Self = this.set("brokerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrokerName: Self = this.set("brokerName", js.undefined)
    @scala.inline
    def setConfiguration(value: Input[BrokerConfiguration]): Self = this.set("configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    @scala.inline
    def setDeploymentMode(value: Input[String]): Self = this.set("deploymentMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentMode: Self = this.set("deploymentMode", js.undefined)
    @scala.inline
    def setEncryptionOptions(value: Input[BrokerEncryptionOptions]): Self = this.set("encryptionOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionOptions: Self = this.set("encryptionOptions", js.undefined)
    @scala.inline
    def setEngineType(value: Input[String]): Self = this.set("engineType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineType: Self = this.set("engineType", js.undefined)
    @scala.inline
    def setEngineVersion(value: Input[String]): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("engineVersion", js.undefined)
    @scala.inline
    def setHostInstanceType(value: Input[String]): Self = this.set("hostInstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostInstanceType: Self = this.set("hostInstanceType", js.undefined)
    @scala.inline
    def setInstancesVarargs(value: Input[BrokerInstance]*): Self = this.set("instances", js.Array(value :_*))
    @scala.inline
    def setInstances(value: Input[js.Array[Input[BrokerInstance]]]): Self = this.set("instances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstances: Self = this.set("instances", js.undefined)
    @scala.inline
    def setLogs(value: Input[BrokerLogs]): Self = this.set("logs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogs: Self = this.set("logs", js.undefined)
    @scala.inline
    def setMaintenanceWindowStartTime(value: Input[BrokerMaintenanceWindowStartTime]): Self = this.set("maintenanceWindowStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintenanceWindowStartTime: Self = this.set("maintenanceWindowStartTime", js.undefined)
    @scala.inline
    def setPubliclyAccessible(value: Input[Boolean]): Self = this.set("publiclyAccessible", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubliclyAccessible: Self = this.set("publiclyAccessible", js.undefined)
    @scala.inline
    def setSecurityGroupsVarargs(value: Input[String]*): Self = this.set("securityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroups: Self = this.set("securityGroups", js.undefined)
    @scala.inline
    def setSubnetIdsVarargs(value: Input[String]*): Self = this.set("subnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetIds: Self = this.set("subnetIds", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setUsersVarargs(value: Input[BrokerUser]*): Self = this.set("users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: Input[js.Array[Input[BrokerUser]]]): Self = this.set("users", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
  }
  
}

