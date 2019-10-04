package typings.atPulumiAws.typesOutputMod.mskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterBrokerNodeGroupInfo extends js.Object {
  /**
    * The distribution of broker nodes across availability zones ([documentation](https://docs.aws.amazon.com/msk/1.0/apireference/clusters.html#clusters-model-brokerazdistribution)). Currently the only valid value is `DEFAULT`.
    */
  var azDistribution: js.UndefOr[String] = js.undefined
  /**
    * A list of subnets to connect to in client VPC ([documentation](https://docs.aws.amazon.com/msk/1.0/apireference/clusters.html#clusters-prop-brokernodegroupinfo-clientsubnets)).
    */
  var clientSubnets: js.Array[String]
  /**
    * The size in GiB of the EBS volume for the data drive on each broker node.
    */
  var ebsVolumeSize: Double
  /**
    * Specify the instance type to use for the kafka brokers. e.g. kafka.m5.large. ([Pricing info](https://aws.amazon.com/msk/pricing/))
    */
  var instanceType: String
  /**
    * A list of the security groups to associate with the elastic network interfaces to control who can communicate with the cluster.
    */
  var securityGroups: js.Array[String]
}

object ClusterBrokerNodeGroupInfo {
  @scala.inline
  def apply(
    clientSubnets: js.Array[String],
    ebsVolumeSize: Double,
    instanceType: String,
    securityGroups: js.Array[String],
    azDistribution: String = null
  ): ClusterBrokerNodeGroupInfo = {
    val __obj = js.Dynamic.literal(clientSubnets = clientSubnets, ebsVolumeSize = ebsVolumeSize, instanceType = instanceType, securityGroups = securityGroups)
    if (azDistribution != null) __obj.updateDynamic("azDistribution")(azDistribution)
    __obj.asInstanceOf[ClusterBrokerNodeGroupInfo]
  }
}

