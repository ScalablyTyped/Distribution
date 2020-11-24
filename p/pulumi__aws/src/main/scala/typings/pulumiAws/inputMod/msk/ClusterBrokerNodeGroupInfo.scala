package typings.pulumiAws.inputMod.msk

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterBrokerNodeGroupInfo extends js.Object {
  
  /**
    * The distribution of broker nodes across availability zones ([documentation](https://docs.aws.amazon.com/msk/1.0/apireference/clusters.html#clusters-model-brokerazdistribution)). Currently the only valid value is `DEFAULT`.
    */
  var azDistribution: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of subnets to connect to in client VPC ([documentation](https://docs.aws.amazon.com/msk/1.0/apireference/clusters.html#clusters-prop-brokernodegroupinfo-clientsubnets)).
    */
  var clientSubnets: Input[js.Array[Input[String]]] = js.native
  
  /**
    * The size in GiB of the EBS volume for the data drive on each broker node.
    */
  var ebsVolumeSize: Input[Double] = js.native
  
  /**
    * Specify the instance type to use for the kafka brokers. e.g. kafka.m5.large. ([Pricing info](https://aws.amazon.com/msk/pricing/))
    */
  var instanceType: Input[String] = js.native
  
  /**
    * A list of the security groups to associate with the elastic network interfaces to control who can communicate with the cluster.
    */
  var securityGroups: Input[js.Array[Input[String]]] = js.native
}
object ClusterBrokerNodeGroupInfo {
  
  @scala.inline
  def apply(
    clientSubnets: Input[js.Array[Input[String]]],
    ebsVolumeSize: Input[Double],
    instanceType: Input[String],
    securityGroups: Input[js.Array[Input[String]]]
  ): ClusterBrokerNodeGroupInfo = {
    val __obj = js.Dynamic.literal(clientSubnets = clientSubnets.asInstanceOf[js.Any], ebsVolumeSize = ebsVolumeSize.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterBrokerNodeGroupInfo]
  }
  
  @scala.inline
  implicit class ClusterBrokerNodeGroupInfoOps[Self <: ClusterBrokerNodeGroupInfo] (val x: Self) extends AnyVal {
    
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
    def setClientSubnetsVarargs(value: Input[String]*): Self = this.set("clientSubnets", js.Array(value :_*))
    
    @scala.inline
    def setClientSubnets(value: Input[js.Array[Input[String]]]): Self = this.set("clientSubnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsVolumeSize(value: Input[Double]): Self = this.set("ebsVolumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: Input[String]): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsVarargs(value: Input[String]*): Self = this.set("securityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzDistribution(value: Input[String]): Self = this.set("azDistribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAzDistribution: Self = this.set("azDistribution", js.undefined)
  }
}
