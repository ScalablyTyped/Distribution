package typings.atPulumiAws.mskGetClusterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterResult extends js.Object {
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
    * id is the provider-assigned unique ID for this managed resource.
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
  val tags: StringDictionary[js.Any]
  /**
    * A comma separated list of one or more IP:port pairs to use to connect to the Apache Zookeeper cluster.
    */
  val zookeeperConnectString: String
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
    val __obj = js.Dynamic.literal(arn = arn, bootstrapBrokers = bootstrapBrokers, bootstrapBrokersTls = bootstrapBrokersTls, clusterName = clusterName, id = id, kafkaVersion = kafkaVersion, numberOfBrokerNodes = numberOfBrokerNodes, tags = tags, zookeeperConnectString = zookeeperConnectString)
  
    __obj.asInstanceOf[GetClusterResult]
  }
}

