package typings.pulumiAws.brokerMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.mq.BrokerConfiguration
import typings.pulumiAws.inputMod.mq.BrokerEncryptionOptions
import typings.pulumiAws.inputMod.mq.BrokerLogs
import typings.pulumiAws.inputMod.mq.BrokerMaintenanceWindowStartTime
import typings.pulumiAws.inputMod.mq.BrokerUser
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrokerArgs extends js.Object {
  
  /**
    * Specifies whether any broker modifications
    * are applied immediately, or during the next maintenance window. Default is `false`.
    */
  val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions.
    */
  val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The name of the broker.
    */
  val brokerName: Input[String] = js.native
  
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
  val engineType: Input[String] = js.native
  
  /**
    * The version of the broker engine. See the [AmazonMQ Broker Engine docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) for supported versions.
    */
  val engineVersion: Input[String] = js.native
  
  /**
    * The broker's instance type. e.g. `mq.t2.micro` or `mq.m4.large`
    */
  val hostInstanceType: Input[String] = js.native
  
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
  val securityGroups: Input[js.Array[Input[String]]] = js.native
  
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
  val users: Input[js.Array[Input[BrokerUser]]] = js.native
}
object BrokerArgs {
  
  @scala.inline
  def apply(
    brokerName: Input[String],
    engineType: Input[String],
    engineVersion: Input[String],
    hostInstanceType: Input[String],
    securityGroups: Input[js.Array[Input[String]]],
    users: Input[js.Array[Input[BrokerUser]]]
  ): BrokerArgs = {
    val __obj = js.Dynamic.literal(brokerName = brokerName.asInstanceOf[js.Any], engineType = engineType.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], hostInstanceType = hostInstanceType.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerArgs]
  }
  
  @scala.inline
  implicit class BrokerArgsOps[Self <: BrokerArgs] (val x: Self) extends AnyVal {
    
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
    def setBrokerName(value: Input[String]): Self = this.set("brokerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineType(value: Input[String]): Self = this.set("engineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersion(value: Input[String]): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostInstanceType(value: Input[String]): Self = this.set("hostInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsVarargs(value: Input[String]*): Self = this.set("securityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: Input[BrokerUser]*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: Input[js.Array[Input[BrokerUser]]]): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyImmediately(value: Input[Boolean]): Self = this.set("applyImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyImmediately: Self = this.set("applyImmediately", js.undefined)
    
    @scala.inline
    def setAutoMinorVersionUpgrade(value: Input[Boolean]): Self = this.set("autoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoMinorVersionUpgrade: Self = this.set("autoMinorVersionUpgrade", js.undefined)
    
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
    def setSubnetIdsVarargs(value: Input[String]*): Self = this.set("subnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetIds: Self = this.set("subnetIds", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
