package typings.pulumiAws

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mskClusterMod {
  
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
  object Cluster {
    
    @JSImport("@pulumi/aws/msk/cluster", "Cluster")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Cluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Cluster]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Cluster]
    inline def get(name: String, id: Input[ID], state: ClusterState): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Cluster]
    inline def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Cluster]
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/msk/cluster.Cluster */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/msk/cluster.Cluster */ Boolean]
  }
  
  trait ClusterArgs extends StObject {
    
    /**
      * Configuration block for the broker nodes of the Kafka cluster.
      */
    val brokerNodeGroupInfo: Input[typings.pulumiAws.inputMod.msk.ClusterBrokerNodeGroupInfo]
    
    /**
      * Configuration block for specifying a client authentication. See below.
      */
    val clientAuthentication: js.UndefOr[Input[typings.pulumiAws.inputMod.msk.ClusterClientAuthentication]] = js.undefined
    
    /**
      * Name of the MSK cluster.
      */
    val clusterName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block for specifying a MSK Configuration to attach to Kafka brokers. See below.
      */
    val configurationInfo: js.UndefOr[Input[typings.pulumiAws.inputMod.msk.ClusterConfigurationInfo]] = js.undefined
    
    /**
      * Configuration block for specifying encryption. See below.
      */
    val encryptionInfo: js.UndefOr[Input[typings.pulumiAws.inputMod.msk.ClusterEncryptionInfo]] = js.undefined
    
    /**
      * Specify the desired enhanced MSK CloudWatch monitoring level.  See [Monitoring Amazon MSK with Amazon CloudWatch](https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html)
      */
    val enhancedMonitoring: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specify the desired Kafka software version.
      */
    val kafkaVersion: Input[String]
    
    /**
      * Configuration block for streaming broker logs to Cloudwatch/S3/Kinesis Firehose. See below.
      */
    val loggingInfo: js.UndefOr[Input[typings.pulumiAws.inputMod.msk.ClusterLoggingInfo]] = js.undefined
    
    /**
      * The desired total number of broker nodes in the kafka cluster.  It must be a multiple of the number of specified client subnets.
      */
    val numberOfBrokerNodes: Input[Double]
    
    /**
      * Configuration block for JMX and Node monitoring for the MSK cluster. See below.
      */
    val openMonitoring: js.UndefOr[Input[typings.pulumiAws.inputMod.msk.ClusterOpenMonitoring]] = js.undefined
    
    /**
      * A map of tags to assign to the resource
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object ClusterArgs {
    
    inline def apply(
      brokerNodeGroupInfo: Input[typings.pulumiAws.inputMod.msk.ClusterBrokerNodeGroupInfo],
      kafkaVersion: Input[String],
      numberOfBrokerNodes: Input[Double]
    ): ClusterArgs = {
      val __obj = js.Dynamic.literal(brokerNodeGroupInfo = brokerNodeGroupInfo.asInstanceOf[js.Any], kafkaVersion = kafkaVersion.asInstanceOf[js.Any], numberOfBrokerNodes = numberOfBrokerNodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterArgs]
    }
    
    extension [Self <: ClusterArgs](x: Self) {
      
      inline def setBrokerNodeGroupInfo(value: Input[typings.pulumiAws.inputMod.msk.ClusterBrokerNodeGroupInfo]): Self = StObject.set(x, "brokerNodeGroupInfo", value.asInstanceOf[js.Any])
      
      inline def setClientAuthentication(value: Input[typings.pulumiAws.inputMod.msk.ClusterClientAuthentication]): Self = StObject.set(x, "clientAuthentication", value.asInstanceOf[js.Any])
      
      inline def setClientAuthenticationUndefined: Self = StObject.set(x, "clientAuthentication", js.undefined)
      
      inline def setClusterName(value: Input[String]): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
      
      inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
      
      inline def setConfigurationInfo(value: Input[typings.pulumiAws.inputMod.msk.ClusterConfigurationInfo]): Self = StObject.set(x, "configurationInfo", value.asInstanceOf[js.Any])
      
      inline def setConfigurationInfoUndefined: Self = StObject.set(x, "configurationInfo", js.undefined)
      
      inline def setEncryptionInfo(value: Input[typings.pulumiAws.inputMod.msk.ClusterEncryptionInfo]): Self = StObject.set(x, "encryptionInfo", value.asInstanceOf[js.Any])
      
      inline def setEncryptionInfoUndefined: Self = StObject.set(x, "encryptionInfo", js.undefined)
      
      inline def setEnhancedMonitoring(value: Input[String]): Self = StObject.set(x, "enhancedMonitoring", value.asInstanceOf[js.Any])
      
      inline def setEnhancedMonitoringUndefined: Self = StObject.set(x, "enhancedMonitoring", js.undefined)
      
      inline def setKafkaVersion(value: Input[String]): Self = StObject.set(x, "kafkaVersion", value.asInstanceOf[js.Any])
      
      inline def setLoggingInfo(value: Input[typings.pulumiAws.inputMod.msk.ClusterLoggingInfo]): Self = StObject.set(x, "loggingInfo", value.asInstanceOf[js.Any])
      
      inline def setLoggingInfoUndefined: Self = StObject.set(x, "loggingInfo", js.undefined)
      
      inline def setNumberOfBrokerNodes(value: Input[Double]): Self = StObject.set(x, "numberOfBrokerNodes", value.asInstanceOf[js.Any])
      
      inline def setOpenMonitoring(value: Input[typings.pulumiAws.inputMod.msk.ClusterOpenMonitoring]): Self = StObject.set(x, "openMonitoring", value.asInstanceOf[js.Any])
      
      inline def setOpenMonitoringUndefined: Self = StObject.set(x, "openMonitoring", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait ClusterState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the MSK Configuration to use in the cluster.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A comma separated list of one or more hostname:port pairs of kafka brokers suitable to bootstrap connectivity to the kafka cluster. Only contains value if `clientBroker` encryption in transit is set to `PLAINTEXT` or `TLS_PLAINTEXT`.
      */
    val bootstrapBrokers: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A comma separated list of one or more DNS names (or IPs) and TLS port pairs kafka brokers suitable to bootstrap connectivity to the kafka cluster. Only contains value if `clientBroker` encryption in transit is set to `TLS_PLAINTEXT` or `TLS`.
      */
    val bootstrapBrokersTls: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block for the broker nodes of the Kafka cluster.
      */
    val brokerNodeGroupInfo: js.UndefOr[Input[typings.pulumiAws.inputMod.msk.ClusterBrokerNodeGroupInfo]] = js.undefined
    
    /**
      * Configuration block for specifying a client authentication. See below.
      */
    val clientAuthentication: js.UndefOr[Input[typings.pulumiAws.inputMod.msk.ClusterClientAuthentication]] = js.undefined
    
    /**
      * Name of the MSK cluster.
      */
    val clusterName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block for specifying a MSK Configuration to attach to Kafka brokers. See below.
      */
    val configurationInfo: js.UndefOr[Input[typings.pulumiAws.inputMod.msk.ClusterConfigurationInfo]] = js.undefined
    
    /**
      * Current version of the MSK Cluster used for updates, e.g. `K13V1IB3VIYZZH`
      * * `encryption_info.0.encryption_at_rest_kms_key_arn` - The ARN of the KMS key used for encryption at rest of the broker data volumes.
      */
    val currentVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block for specifying encryption. See below.
      */
    val encryptionInfo: js.UndefOr[Input[typings.pulumiAws.inputMod.msk.ClusterEncryptionInfo]] = js.undefined
    
    /**
      * Specify the desired enhanced MSK CloudWatch monitoring level.  See [Monitoring Amazon MSK with Amazon CloudWatch](https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html)
      */
    val enhancedMonitoring: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specify the desired Kafka software version.
      */
    val kafkaVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block for streaming broker logs to Cloudwatch/S3/Kinesis Firehose. See below.
      */
    val loggingInfo: js.UndefOr[Input[typings.pulumiAws.inputMod.msk.ClusterLoggingInfo]] = js.undefined
    
    /**
      * The desired total number of broker nodes in the kafka cluster.  It must be a multiple of the number of specified client subnets.
      */
    val numberOfBrokerNodes: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Configuration block for JMX and Node monitoring for the MSK cluster. See below.
      */
    val openMonitoring: js.UndefOr[Input[typings.pulumiAws.inputMod.msk.ClusterOpenMonitoring]] = js.undefined
    
    /**
      * A map of tags to assign to the resource
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A comma separated list of one or more hostname:port pairs to use to connect to the Apache Zookeeper cluster.
      */
    val zookeeperConnectString: js.UndefOr[Input[String]] = js.undefined
  }
  object ClusterState {
    
    inline def apply(): ClusterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterState]
    }
    
    extension [Self <: ClusterState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setBootstrapBrokers(value: Input[String]): Self = StObject.set(x, "bootstrapBrokers", value.asInstanceOf[js.Any])
      
      inline def setBootstrapBrokersTls(value: Input[String]): Self = StObject.set(x, "bootstrapBrokersTls", value.asInstanceOf[js.Any])
      
      inline def setBootstrapBrokersTlsUndefined: Self = StObject.set(x, "bootstrapBrokersTls", js.undefined)
      
      inline def setBootstrapBrokersUndefined: Self = StObject.set(x, "bootstrapBrokers", js.undefined)
      
      inline def setBrokerNodeGroupInfo(value: Input[typings.pulumiAws.inputMod.msk.ClusterBrokerNodeGroupInfo]): Self = StObject.set(x, "brokerNodeGroupInfo", value.asInstanceOf[js.Any])
      
      inline def setBrokerNodeGroupInfoUndefined: Self = StObject.set(x, "brokerNodeGroupInfo", js.undefined)
      
      inline def setClientAuthentication(value: Input[typings.pulumiAws.inputMod.msk.ClusterClientAuthentication]): Self = StObject.set(x, "clientAuthentication", value.asInstanceOf[js.Any])
      
      inline def setClientAuthenticationUndefined: Self = StObject.set(x, "clientAuthentication", js.undefined)
      
      inline def setClusterName(value: Input[String]): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
      
      inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
      
      inline def setConfigurationInfo(value: Input[typings.pulumiAws.inputMod.msk.ClusterConfigurationInfo]): Self = StObject.set(x, "configurationInfo", value.asInstanceOf[js.Any])
      
      inline def setConfigurationInfoUndefined: Self = StObject.set(x, "configurationInfo", js.undefined)
      
      inline def setCurrentVersion(value: Input[String]): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
      
      inline def setCurrentVersionUndefined: Self = StObject.set(x, "currentVersion", js.undefined)
      
      inline def setEncryptionInfo(value: Input[typings.pulumiAws.inputMod.msk.ClusterEncryptionInfo]): Self = StObject.set(x, "encryptionInfo", value.asInstanceOf[js.Any])
      
      inline def setEncryptionInfoUndefined: Self = StObject.set(x, "encryptionInfo", js.undefined)
      
      inline def setEnhancedMonitoring(value: Input[String]): Self = StObject.set(x, "enhancedMonitoring", value.asInstanceOf[js.Any])
      
      inline def setEnhancedMonitoringUndefined: Self = StObject.set(x, "enhancedMonitoring", js.undefined)
      
      inline def setKafkaVersion(value: Input[String]): Self = StObject.set(x, "kafkaVersion", value.asInstanceOf[js.Any])
      
      inline def setKafkaVersionUndefined: Self = StObject.set(x, "kafkaVersion", js.undefined)
      
      inline def setLoggingInfo(value: Input[typings.pulumiAws.inputMod.msk.ClusterLoggingInfo]): Self = StObject.set(x, "loggingInfo", value.asInstanceOf[js.Any])
      
      inline def setLoggingInfoUndefined: Self = StObject.set(x, "loggingInfo", js.undefined)
      
      inline def setNumberOfBrokerNodes(value: Input[Double]): Self = StObject.set(x, "numberOfBrokerNodes", value.asInstanceOf[js.Any])
      
      inline def setNumberOfBrokerNodesUndefined: Self = StObject.set(x, "numberOfBrokerNodes", js.undefined)
      
      inline def setOpenMonitoring(value: Input[typings.pulumiAws.inputMod.msk.ClusterOpenMonitoring]): Self = StObject.set(x, "openMonitoring", value.asInstanceOf[js.Any])
      
      inline def setOpenMonitoringUndefined: Self = StObject.set(x, "openMonitoring", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setZookeeperConnectString(value: Input[String]): Self = StObject.set(x, "zookeeperConnectString", value.asInstanceOf[js.Any])
      
      inline def setZookeeperConnectStringUndefined: Self = StObject.set(x, "zookeeperConnectString", js.undefined)
    }
  }
}
