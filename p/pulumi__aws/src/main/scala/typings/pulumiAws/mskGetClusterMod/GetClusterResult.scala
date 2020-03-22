package typings.pulumiAws.mskGetClusterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * id is the provider-assigned unique ID for this managed resource.
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
  val tags: StringDictionary[js.Any] = js.native
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
    tags: StringDictionary[js.Any],
    zookeeperConnectString: String
  ): GetClusterResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], bootstrapBrokers = bootstrapBrokers.asInstanceOf[js.Any], bootstrapBrokersTls = bootstrapBrokersTls.asInstanceOf[js.Any], clusterName = clusterName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kafkaVersion = kafkaVersion.asInstanceOf[js.Any], numberOfBrokerNodes = numberOfBrokerNodes.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], zookeeperConnectString = zookeeperConnectString.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetClusterResult]
  }
}

