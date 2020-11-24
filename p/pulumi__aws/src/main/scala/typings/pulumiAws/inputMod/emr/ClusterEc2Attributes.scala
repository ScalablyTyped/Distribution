package typings.pulumiAws.inputMod.emr

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterEc2Attributes extends js.Object {
  
  /**
    * String containing a comma separated list of additional Amazon EC2 security group IDs for the master node
    */
  var additionalMasterSecurityGroups: js.UndefOr[Input[String]] = js.native
  
  /**
    * String containing a comma separated list of additional Amazon EC2 security group IDs for the slave nodes as a comma separated string
    */
  var additionalSlaveSecurityGroups: js.UndefOr[Input[String]] = js.native
  
  /**
    * Identifier of the Amazon EC2 EMR-Managed security group for the master node
    */
  var emrManagedMasterSecurityGroup: js.UndefOr[Input[String]] = js.native
  
  /**
    * Identifier of the Amazon EC2 EMR-Managed security group for the slave nodes
    */
  var emrManagedSlaveSecurityGroup: js.UndefOr[Input[String]] = js.native
  
  /**
    * Instance Profile for EC2 instances of the cluster assume this role
    */
  var instanceProfile: Input[String] = js.native
  
  /**
    * Amazon EC2 key pair that can be used to ssh to the master node as the user called `hadoop`
    */
  var keyName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Identifier of the Amazon EC2 service-access security group - required when the cluster runs on a private subnet
    */
  var serviceAccessSecurityGroup: js.UndefOr[Input[String]] = js.native
  
  /**
    * VPC subnet id where you want the job flow to launch. Cannot specify the `cc1.4xlarge` instance type for nodes of a job flow launched in a Amazon VPC
    */
  var subnetId: js.UndefOr[Input[String]] = js.native
}
object ClusterEc2Attributes {
  
  @scala.inline
  def apply(instanceProfile: Input[String]): ClusterEc2Attributes = {
    val __obj = js.Dynamic.literal(instanceProfile = instanceProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterEc2Attributes]
  }
  
  @scala.inline
  implicit class ClusterEc2AttributesOps[Self <: ClusterEc2Attributes] (val x: Self) extends AnyVal {
    
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
    def setInstanceProfile(value: Input[String]): Self = this.set("instanceProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalMasterSecurityGroups(value: Input[String]): Self = this.set("additionalMasterSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalMasterSecurityGroups: Self = this.set("additionalMasterSecurityGroups", js.undefined)
    
    @scala.inline
    def setAdditionalSlaveSecurityGroups(value: Input[String]): Self = this.set("additionalSlaveSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalSlaveSecurityGroups: Self = this.set("additionalSlaveSecurityGroups", js.undefined)
    
    @scala.inline
    def setEmrManagedMasterSecurityGroup(value: Input[String]): Self = this.set("emrManagedMasterSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmrManagedMasterSecurityGroup: Self = this.set("emrManagedMasterSecurityGroup", js.undefined)
    
    @scala.inline
    def setEmrManagedSlaveSecurityGroup(value: Input[String]): Self = this.set("emrManagedSlaveSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmrManagedSlaveSecurityGroup: Self = this.set("emrManagedSlaveSecurityGroup", js.undefined)
    
    @scala.inline
    def setKeyName(value: Input[String]): Self = this.set("keyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyName: Self = this.set("keyName", js.undefined)
    
    @scala.inline
    def setServiceAccessSecurityGroup(value: Input[String]): Self = this.set("serviceAccessSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccessSecurityGroup: Self = this.set("serviceAccessSecurityGroup", js.undefined)
    
    @scala.inline
    def setSubnetId(value: Input[String]): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetId: Self = this.set("subnetId", js.undefined)
  }
}
