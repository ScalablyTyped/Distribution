package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.mq.BrokerConfiguration
import typings.pulumiAws.outputMod.mq.BrokerEncryptionOptions
import typings.pulumiAws.outputMod.mq.BrokerInstance
import typings.pulumiAws.outputMod.mq.BrokerLogs
import typings.pulumiAws.outputMod.mq.BrokerMaintenanceWindowStartTime
import typings.pulumiAws.outputMod.mq.BrokerUser
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object brokerMod {
  
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
    val applyImmediately: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The ARN of the broker.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions.
      */
    val autoMinorVersionUpgrade: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The name of the broker.
      */
    val brokerName: Output_[String] = js.native
    
    /**
      * Configuration of the broker. See below.
      */
    val configuration: Output_[BrokerConfiguration] = js.native
    
    /**
      * The deployment mode of the broker. Supported: `SINGLE_INSTANCE` and `ACTIVE_STANDBY_MULTI_AZ`. Defaults to `SINGLE_INSTANCE`.
      */
    val deploymentMode: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Configuration block containing encryption options. See below.
      */
    val encryptionOptions: Output_[js.UndefOr[BrokerEncryptionOptions]] = js.native
    
    /**
      * The type of broker engine. Currently, Amazon MQ supports only `ActiveMQ`.
      */
    val engineType: Output_[String] = js.native
    
    /**
      * The version of the broker engine. See the [AmazonMQ Broker Engine docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) for supported versions.
      */
    val engineVersion: Output_[String] = js.native
    
    /**
      * The broker's instance type. e.g. `mq.t2.micro` or `mq.m4.large`
      */
    val hostInstanceType: Output_[String] = js.native
    
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
    val instances: Output_[js.Array[BrokerInstance]] = js.native
    
    /**
      * Logging configuration of the broker. See below.
      */
    val logs: Output_[js.UndefOr[BrokerLogs]] = js.native
    
    /**
      * Maintenance window start time. See below.
      */
    val maintenanceWindowStartTime: Output_[BrokerMaintenanceWindowStartTime] = js.native
    
    /**
      * Whether to enable connections from applications outside of the VPC that hosts the broker's subnets.
      */
    val publiclyAccessible: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The list of security group IDs assigned to the broker.
      */
    val securityGroups: Output_[js.Array[String]] = js.native
    
    /**
      * The list of subnet IDs in which to launch the broker. A `SINGLE_INSTANCE` deployment requires one subnet. An `ACTIVE_STANDBY_MULTI_AZ` deployment requires two subnets.
      */
    val subnetIds: Output_[js.Array[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The list of all ActiveMQ usernames for the specified broker. See below.
      */
    val users: Output_[js.Array[BrokerUser]] = js.native
  }
  /* static members */
  object Broker {
    
    @JSImport("@pulumi/aws/mq/broker", "Broker")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Broker resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Broker = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Broker]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Broker = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Broker]
    inline def get(name: String, id: Input[ID], state: BrokerState): Broker = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Broker]
    inline def get(name: String, id: Input[ID], state: BrokerState, opts: CustomResourceOptions): Broker = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Broker]
    
    /**
      * Returns true if the given object is an instance of Broker.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mq/broker.Broker */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/mq/broker.Broker */ Boolean]
  }
  
  trait BrokerArgs extends StObject {
    
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
    val configuration: js.UndefOr[Input[typings.pulumiAws.inputMod.mq.BrokerConfiguration]] = js.undefined
    
    /**
      * The deployment mode of the broker. Supported: `SINGLE_INSTANCE` and `ACTIVE_STANDBY_MULTI_AZ`. Defaults to `SINGLE_INSTANCE`.
      */
    val deploymentMode: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block containing encryption options. See below.
      */
    val encryptionOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.mq.BrokerEncryptionOptions]] = js.undefined
    
    /**
      * The type of broker engine. Currently, Amazon MQ supports only `ActiveMQ`.
      */
    val engineType: Input[String]
    
    /**
      * The version of the broker engine. See the [AmazonMQ Broker Engine docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) for supported versions.
      */
    val engineVersion: Input[String]
    
    /**
      * The broker's instance type. e.g. `mq.t2.micro` or `mq.m4.large`
      */
    val hostInstanceType: Input[String]
    
    /**
      * Logging configuration of the broker. See below.
      */
    val logs: js.UndefOr[Input[typings.pulumiAws.inputMod.mq.BrokerLogs]] = js.undefined
    
    /**
      * Maintenance window start time. See below.
      */
    val maintenanceWindowStartTime: js.UndefOr[Input[typings.pulumiAws.inputMod.mq.BrokerMaintenanceWindowStartTime]] = js.undefined
    
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
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The list of all ActiveMQ usernames for the specified broker. See below.
      */
    val users: Input[js.Array[Input[typings.pulumiAws.inputMod.mq.BrokerUser]]]
  }
  object BrokerArgs {
    
    inline def apply(
      brokerName: Input[String],
      engineType: Input[String],
      engineVersion: Input[String],
      hostInstanceType: Input[String],
      securityGroups: Input[js.Array[Input[String]]],
      users: Input[js.Array[Input[typings.pulumiAws.inputMod.mq.BrokerUser]]]
    ): BrokerArgs = {
      val __obj = js.Dynamic.literal(brokerName = brokerName.asInstanceOf[js.Any], engineType = engineType.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], hostInstanceType = hostInstanceType.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrokerArgs]
    }
    
    extension [Self <: BrokerArgs](x: Self) {
      
      inline def setApplyImmediately(value: Input[Boolean]): Self = StObject.set(x, "applyImmediately", value.asInstanceOf[js.Any])
      
      inline def setApplyImmediatelyUndefined: Self = StObject.set(x, "applyImmediately", js.undefined)
      
      inline def setAutoMinorVersionUpgrade(value: Input[Boolean]): Self = StObject.set(x, "autoMinorVersionUpgrade", value.asInstanceOf[js.Any])
      
      inline def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "autoMinorVersionUpgrade", js.undefined)
      
      inline def setBrokerName(value: Input[String]): Self = StObject.set(x, "brokerName", value.asInstanceOf[js.Any])
      
      inline def setConfiguration(value: Input[typings.pulumiAws.inputMod.mq.BrokerConfiguration]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      inline def setDeploymentMode(value: Input[String]): Self = StObject.set(x, "deploymentMode", value.asInstanceOf[js.Any])
      
      inline def setDeploymentModeUndefined: Self = StObject.set(x, "deploymentMode", js.undefined)
      
      inline def setEncryptionOptions(value: Input[typings.pulumiAws.inputMod.mq.BrokerEncryptionOptions]): Self = StObject.set(x, "encryptionOptions", value.asInstanceOf[js.Any])
      
      inline def setEncryptionOptionsUndefined: Self = StObject.set(x, "encryptionOptions", js.undefined)
      
      inline def setEngineType(value: Input[String]): Self = StObject.set(x, "engineType", value.asInstanceOf[js.Any])
      
      inline def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      inline def setHostInstanceType(value: Input[String]): Self = StObject.set(x, "hostInstanceType", value.asInstanceOf[js.Any])
      
      inline def setLogs(value: Input[typings.pulumiAws.inputMod.mq.BrokerLogs]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
      
      inline def setLogsUndefined: Self = StObject.set(x, "logs", js.undefined)
      
      inline def setMaintenanceWindowStartTime(value: Input[typings.pulumiAws.inputMod.mq.BrokerMaintenanceWindowStartTime]): Self = StObject.set(x, "maintenanceWindowStartTime", value.asInstanceOf[js.Any])
      
      inline def setMaintenanceWindowStartTimeUndefined: Self = StObject.set(x, "maintenanceWindowStartTime", js.undefined)
      
      inline def setPubliclyAccessible(value: Input[Boolean]): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
      
      inline def setPubliclyAccessibleUndefined: Self = StObject.set(x, "publiclyAccessible", js.undefined)
      
      inline def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      inline def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      inline def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setUsers(value: Input[js.Array[Input[typings.pulumiAws.inputMod.mq.BrokerUser]]]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersVarargs(value: Input[typings.pulumiAws.inputMod.mq.BrokerUser]*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
  
  trait BrokerState extends StObject {
    
    /**
      * Specifies whether any broker modifications
      * are applied immediately, or during the next maintenance window. Default is `false`.
      */
    val applyImmediately: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The ARN of the broker.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions.
      */
    val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The name of the broker.
      */
    val brokerName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration of the broker. See below.
      */
    val configuration: js.UndefOr[Input[typings.pulumiAws.inputMod.mq.BrokerConfiguration]] = js.undefined
    
    /**
      * The deployment mode of the broker. Supported: `SINGLE_INSTANCE` and `ACTIVE_STANDBY_MULTI_AZ`. Defaults to `SINGLE_INSTANCE`.
      */
    val deploymentMode: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block containing encryption options. See below.
      */
    val encryptionOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.mq.BrokerEncryptionOptions]] = js.undefined
    
    /**
      * The type of broker engine. Currently, Amazon MQ supports only `ActiveMQ`.
      */
    val engineType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The version of the broker engine. See the [AmazonMQ Broker Engine docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) for supported versions.
      */
    val engineVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The broker's instance type. e.g. `mq.t2.micro` or `mq.m4.large`
      */
    val hostInstanceType: js.UndefOr[Input[String]] = js.undefined
    
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
    val instances: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.mq.BrokerInstance]]]] = js.undefined
    
    /**
      * Logging configuration of the broker. See below.
      */
    val logs: js.UndefOr[Input[typings.pulumiAws.inputMod.mq.BrokerLogs]] = js.undefined
    
    /**
      * Maintenance window start time. See below.
      */
    val maintenanceWindowStartTime: js.UndefOr[Input[typings.pulumiAws.inputMod.mq.BrokerMaintenanceWindowStartTime]] = js.undefined
    
    /**
      * Whether to enable connections from applications outside of the VPC that hosts the broker's subnets.
      */
    val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The list of security group IDs assigned to the broker.
      */
    val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The list of subnet IDs in which to launch the broker. A `SINGLE_INSTANCE` deployment requires one subnet. An `ACTIVE_STANDBY_MULTI_AZ` deployment requires two subnets.
      */
    val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The list of all ActiveMQ usernames for the specified broker. See below.
      */
    val users: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.mq.BrokerUser]]]] = js.undefined
  }
  object BrokerState {
    
    inline def apply(): BrokerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrokerState]
    }
    
    extension [Self <: BrokerState](x: Self) {
      
      inline def setApplyImmediately(value: Input[Boolean]): Self = StObject.set(x, "applyImmediately", value.asInstanceOf[js.Any])
      
      inline def setApplyImmediatelyUndefined: Self = StObject.set(x, "applyImmediately", js.undefined)
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setAutoMinorVersionUpgrade(value: Input[Boolean]): Self = StObject.set(x, "autoMinorVersionUpgrade", value.asInstanceOf[js.Any])
      
      inline def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "autoMinorVersionUpgrade", js.undefined)
      
      inline def setBrokerName(value: Input[String]): Self = StObject.set(x, "brokerName", value.asInstanceOf[js.Any])
      
      inline def setBrokerNameUndefined: Self = StObject.set(x, "brokerName", js.undefined)
      
      inline def setConfiguration(value: Input[typings.pulumiAws.inputMod.mq.BrokerConfiguration]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      inline def setDeploymentMode(value: Input[String]): Self = StObject.set(x, "deploymentMode", value.asInstanceOf[js.Any])
      
      inline def setDeploymentModeUndefined: Self = StObject.set(x, "deploymentMode", js.undefined)
      
      inline def setEncryptionOptions(value: Input[typings.pulumiAws.inputMod.mq.BrokerEncryptionOptions]): Self = StObject.set(x, "encryptionOptions", value.asInstanceOf[js.Any])
      
      inline def setEncryptionOptionsUndefined: Self = StObject.set(x, "encryptionOptions", js.undefined)
      
      inline def setEngineType(value: Input[String]): Self = StObject.set(x, "engineType", value.asInstanceOf[js.Any])
      
      inline def setEngineTypeUndefined: Self = StObject.set(x, "engineType", js.undefined)
      
      inline def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      inline def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      inline def setHostInstanceType(value: Input[String]): Self = StObject.set(x, "hostInstanceType", value.asInstanceOf[js.Any])
      
      inline def setHostInstanceTypeUndefined: Self = StObject.set(x, "hostInstanceType", js.undefined)
      
      inline def setInstances(value: Input[js.Array[Input[typings.pulumiAws.inputMod.mq.BrokerInstance]]]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
      
      inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
      
      inline def setInstancesVarargs(value: Input[typings.pulumiAws.inputMod.mq.BrokerInstance]*): Self = StObject.set(x, "instances", js.Array(value :_*))
      
      inline def setLogs(value: Input[typings.pulumiAws.inputMod.mq.BrokerLogs]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
      
      inline def setLogsUndefined: Self = StObject.set(x, "logs", js.undefined)
      
      inline def setMaintenanceWindowStartTime(value: Input[typings.pulumiAws.inputMod.mq.BrokerMaintenanceWindowStartTime]): Self = StObject.set(x, "maintenanceWindowStartTime", value.asInstanceOf[js.Any])
      
      inline def setMaintenanceWindowStartTimeUndefined: Self = StObject.set(x, "maintenanceWindowStartTime", js.undefined)
      
      inline def setPubliclyAccessible(value: Input[Boolean]): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
      
      inline def setPubliclyAccessibleUndefined: Self = StObject.set(x, "publiclyAccessible", js.undefined)
      
      inline def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
      
      inline def setSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      inline def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      inline def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setUsers(value: Input[js.Array[Input[typings.pulumiAws.inputMod.mq.BrokerUser]]]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
      
      inline def setUsersVarargs(value: Input[typings.pulumiAws.inputMod.mq.BrokerUser]*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
}
