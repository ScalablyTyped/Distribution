package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mskGetClusterMod {
  
  @JSImport("@pulumi/aws/msk/getCluster", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCluster")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetClusterResult]]
  inline def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCluster")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetClusterResult]]
  
  trait GetClusterArgs extends StObject {
    
    /**
      * Name of the cluster.
      */
    val clusterName: String
    
    /**
      * Map of key-value pairs assigned to the cluster.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetClusterArgs {
    
    inline def apply(clusterName: String): GetClusterArgs = {
      val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterArgs]
    }
    
    extension [Self <: GetClusterArgs](x: Self) {
      
      inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetClusterResult extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the MSK cluster.
      */
    val arn: String
    
    /**
      * A comma separated list of one or more hostname:port pairs of Kafka brokers suitable to boostrap connectivity to the Kafka cluster.
      */
    val bootstrapBrokers: String
    
    /**
      * A comma separated list of one or more DNS names (or IPs) and TLS port pairs kafka brokers suitable to boostrap connectivity to the kafka cluster.
      */
    val bootstrapBrokersTls: String
    
    val clusterName: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * Apache Kafka version.
      */
    val kafkaVersion: String
    
    /**
      * Number of broker nodes in the cluster.
      */
    val numberOfBrokerNodes: Double
    
    /**
      * Map of key-value pairs assigned to the cluster.
      */
    val tags: StringDictionary[String]
    
    /**
      * A comma separated list of one or more hostname:port pairs to use to connect to the Apache Zookeeper cluster.
      */
    val zookeeperConnectString: String
  }
  object GetClusterResult {
    
    inline def apply(
      arn: String,
      bootstrapBrokers: String,
      bootstrapBrokersTls: String,
      clusterName: String,
      id: String,
      kafkaVersion: String,
      numberOfBrokerNodes: Double,
      tags: StringDictionary[String],
      zookeeperConnectString: String
    ): GetClusterResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], bootstrapBrokers = bootstrapBrokers.asInstanceOf[js.Any], bootstrapBrokersTls = bootstrapBrokersTls.asInstanceOf[js.Any], clusterName = clusterName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kafkaVersion = kafkaVersion.asInstanceOf[js.Any], numberOfBrokerNodes = numberOfBrokerNodes.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], zookeeperConnectString = zookeeperConnectString.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterResult]
    }
    
    extension [Self <: GetClusterResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setBootstrapBrokers(value: String): Self = StObject.set(x, "bootstrapBrokers", value.asInstanceOf[js.Any])
      
      inline def setBootstrapBrokersTls(value: String): Self = StObject.set(x, "bootstrapBrokersTls", value.asInstanceOf[js.Any])
      
      inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKafkaVersion(value: String): Self = StObject.set(x, "kafkaVersion", value.asInstanceOf[js.Any])
      
      inline def setNumberOfBrokerNodes(value: Double): Self = StObject.set(x, "numberOfBrokerNodes", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setZookeeperConnectString(value: String): Self = StObject.set(x, "zookeeperConnectString", value.asInstanceOf[js.Any])
    }
  }
}
