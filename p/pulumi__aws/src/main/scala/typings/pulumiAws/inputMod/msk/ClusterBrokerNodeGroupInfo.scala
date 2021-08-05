package typings.pulumiAws.inputMod.msk

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterBrokerNodeGroupInfo extends StObject {
  
  /**
    * The distribution of broker nodes across availability zones ([documentation](https://docs.aws.amazon.com/msk/1.0/apireference/clusters.html#clusters-model-brokerazdistribution)). Currently the only valid value is `DEFAULT`.
    */
  var azDistribution: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * A list of subnets to connect to in client VPC ([documentation](https://docs.aws.amazon.com/msk/1.0/apireference/clusters.html#clusters-prop-brokernodegroupinfo-clientsubnets)).
    */
  var clientSubnets: Input[js.Array[Input[String]]]
  
  /**
    * The size in GiB of the EBS volume for the data drive on each broker node.
    */
  var ebsVolumeSize: Input[Double]
  
  /**
    * Specify the instance type to use for the kafka brokers. e.g. kafka.m5.large. ([Pricing info](https://aws.amazon.com/msk/pricing/))
    */
  var instanceType: Input[String]
  
  /**
    * A list of the security groups to associate with the elastic network interfaces to control who can communicate with the cluster.
    */
  var securityGroups: Input[js.Array[Input[String]]]
}
object ClusterBrokerNodeGroupInfo {
  
  inline def apply(
    clientSubnets: Input[js.Array[Input[String]]],
    ebsVolumeSize: Input[Double],
    instanceType: Input[String],
    securityGroups: Input[js.Array[Input[String]]]
  ): ClusterBrokerNodeGroupInfo = {
    val __obj = js.Dynamic.literal(clientSubnets = clientSubnets.asInstanceOf[js.Any], ebsVolumeSize = ebsVolumeSize.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterBrokerNodeGroupInfo]
  }
  
  extension [Self <: ClusterBrokerNodeGroupInfo](x: Self) {
    
    inline def setAzDistribution(value: Input[String]): Self = StObject.set(x, "azDistribution", value.asInstanceOf[js.Any])
    
    inline def setAzDistributionUndefined: Self = StObject.set(x, "azDistribution", js.undefined)
    
    inline def setClientSubnets(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "clientSubnets", value.asInstanceOf[js.Any])
    
    inline def setClientSubnetsVarargs(value: Input[String]*): Self = StObject.set(x, "clientSubnets", js.Array(value :_*))
    
    inline def setEbsVolumeSize(value: Input[Double]): Self = StObject.set(x, "ebsVolumeSize", value.asInstanceOf[js.Any])
    
    inline def setInstanceType(value: Input[String]): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
  }
}
