package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mskGetClusterMod {
  
  @JSImport("@pulumi/aws/msk/getCluster", "getCluster")
  @js.native
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] = js.native
  @JSImport("@pulumi/aws/msk/getCluster", "getCluster")
  @js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] = js.native
  
  @js.native
  trait GetClusterArgs extends StObject {
    
    /**
      * Name of the cluster.
      */
    val clusterName: String = js.native
    
    /**
      * Map of key-value pairs assigned to the cluster.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetClusterArgs {
    
    @scala.inline
    def apply(clusterName: String): GetClusterArgs = {
      val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterArgs]
    }
    
    @scala.inline
    implicit class GetClusterArgsMutableBuilder[Self <: GetClusterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetClusterResult extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the MSK cluster.
      */
    val arn: String = js.native
    
    /**
      * A comma separated list of one or more hostname:port pairs of Kafka brokers suitable to boostrap connectivity to the Kafka cluster.
      */
    val bootstrapBrokers: String = js.native
    
    /**
      * A comma separated list of one or more DNS names (or IPs) and TLS port pairs kafka brokers suitable to boostrap connectivity to the kafka cluster.
      */
    val bootstrapBrokersTls: String = js.native
    
    val clusterName: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * Apache Kafka version.
      */
    val kafkaVersion: String = js.native
    
    /**
      * Number of broker nodes in the cluster.
      */
    val numberOfBrokerNodes: Double = js.native
    
    /**
      * Map of key-value pairs assigned to the cluster.
      */
    val tags: StringDictionary[String] = js.native
    
    /**
      * A comma separated list of one or more hostname:port pairs to use to connect to the Apache Zookeeper cluster.
      */
    val zookeeperConnectString: String = js.native
  }
  object GetClusterResult {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class GetClusterResultMutableBuilder[Self <: GetClusterResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBootstrapBrokers(value: String): Self = StObject.set(x, "bootstrapBrokers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBootstrapBrokersTls(value: String): Self = StObject.set(x, "bootstrapBrokersTls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKafkaVersion(value: String): Self = StObject.set(x, "kafkaVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfBrokerNodes(value: Double): Self = StObject.set(x, "numberOfBrokerNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZookeeperConnectString(value: String): Self = StObject.set(x, "zookeeperConnectString", value.asInstanceOf[js.Any])
    }
  }
}
