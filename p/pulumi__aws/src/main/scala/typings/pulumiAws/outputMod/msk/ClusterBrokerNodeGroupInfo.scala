package typings.pulumiAws.outputMod.msk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterBrokerNodeGroupInfo extends StObject {
  
  /**
    * The distribution of broker nodes across availability zones ([documentation](https://docs.aws.amazon.com/msk/1.0/apireference/clusters.html#clusters-model-brokerazdistribution)). Currently the only valid value is `DEFAULT`.
    */
  var azDistribution: js.UndefOr[String] = js.native
  
  /**
    * A list of subnets to connect to in client VPC ([documentation](https://docs.aws.amazon.com/msk/1.0/apireference/clusters.html#clusters-prop-brokernodegroupinfo-clientsubnets)).
    */
  var clientSubnets: js.Array[String] = js.native
  
  /**
    * The size in GiB of the EBS volume for the data drive on each broker node.
    */
  var ebsVolumeSize: Double = js.native
  
  /**
    * Specify the instance type to use for the kafka brokers. e.g. kafka.m5.large. ([Pricing info](https://aws.amazon.com/msk/pricing/))
    */
  var instanceType: String = js.native
  
  /**
    * A list of the security groups to associate with the elastic network interfaces to control who can communicate with the cluster.
    */
  var securityGroups: js.Array[String] = js.native
}
object ClusterBrokerNodeGroupInfo {
  
  @scala.inline
  def apply(
    clientSubnets: js.Array[String],
    ebsVolumeSize: Double,
    instanceType: String,
    securityGroups: js.Array[String]
  ): ClusterBrokerNodeGroupInfo = {
    val __obj = js.Dynamic.literal(clientSubnets = clientSubnets.asInstanceOf[js.Any], ebsVolumeSize = ebsVolumeSize.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterBrokerNodeGroupInfo]
  }
  
  @scala.inline
  implicit class ClusterBrokerNodeGroupInfoMutableBuilder[Self <: ClusterBrokerNodeGroupInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAzDistribution(value: String): Self = StObject.set(x, "azDistribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzDistributionUndefined: Self = StObject.set(x, "azDistribution", js.undefined)
    
    @scala.inline
    def setClientSubnets(value: js.Array[String]): Self = StObject.set(x, "clientSubnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSubnetsVarargs(value: String*): Self = StObject.set(x, "clientSubnets", js.Array(value :_*))
    
    @scala.inline
    def setEbsVolumeSize(value: Double): Self = StObject.set(x, "ebsVolumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroups(value: js.Array[String]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
  }
}
