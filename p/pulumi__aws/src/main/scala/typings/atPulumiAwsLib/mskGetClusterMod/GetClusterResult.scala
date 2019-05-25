package typings
package atPulumiAwsLib.mskGetClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterResult extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the MSK cluster.
    */
  val arn: java.lang.String
  /**
    * A comma separated list of one or more hostname:port pairs of Kafka brokers suitable to boostrap connectivity to the Kafka cluster.
    */
  val bootstrapBrokers: java.lang.String
  val clusterName: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * Apache Kafka version.
    */
  val kafkaVersion: java.lang.String
  /**
    * Number of broker nodes in the cluster.
    */
  val numberOfBrokerNodes: scala.Double
  /**
    * Map of key-value pairs assigned to the cluster.
    */
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * A comma separated list of one or more IP:port pairs to use to connect to the Apache Zookeeper cluster.
    */
  val zookeeperConnectString: java.lang.String
}

object GetClusterResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    bootstrapBrokers: java.lang.String,
    clusterName: java.lang.String,
    id: java.lang.String,
    kafkaVersion: java.lang.String,
    numberOfBrokerNodes: scala.Double,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    zookeeperConnectString: java.lang.String
  ): GetClusterResult = {
    val __obj = js.Dynamic.literal(arn = arn, bootstrapBrokers = bootstrapBrokers, clusterName = clusterName, id = id, kafkaVersion = kafkaVersion, numberOfBrokerNodes = numberOfBrokerNodes, tags = tags, zookeeperConnectString = zookeeperConnectString)
  
    __obj.asInstanceOf[GetClusterResult]
  }
}

