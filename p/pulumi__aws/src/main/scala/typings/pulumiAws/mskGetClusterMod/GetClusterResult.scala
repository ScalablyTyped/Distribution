package typings.pulumiAws.mskGetClusterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetClusterResult extends js.Object {
  
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
  implicit class GetClusterResultOps[Self <: GetClusterResult] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootstrapBrokers(value: String): Self = this.set("bootstrapBrokers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootstrapBrokersTls(value: String): Self = this.set("bootstrapBrokersTls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterName(value: String): Self = this.set("clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKafkaVersion(value: String): Self = this.set("kafkaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfBrokerNodes(value: Double): Self = this.set("numberOfBrokerNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZookeeperConnectString(value: String): Self = this.set("zookeeperConnectString", value.asInstanceOf[js.Any])
  }
}
