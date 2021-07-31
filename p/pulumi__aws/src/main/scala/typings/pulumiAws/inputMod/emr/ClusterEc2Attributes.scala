package typings.pulumiAws.inputMod.emr

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterEc2Attributes extends StObject {
  
  /**
    * String containing a comma separated list of additional Amazon EC2 security group IDs for the master node
    */
  var additionalMasterSecurityGroups: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * String containing a comma separated list of additional Amazon EC2 security group IDs for the slave nodes as a comma separated string
    */
  var additionalSlaveSecurityGroups: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Identifier of the Amazon EC2 EMR-Managed security group for the master node
    */
  var emrManagedMasterSecurityGroup: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Identifier of the Amazon EC2 EMR-Managed security group for the slave nodes
    */
  var emrManagedSlaveSecurityGroup: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Instance Profile for EC2 instances of the cluster assume this role
    */
  var instanceProfile: Input[String]
  
  /**
    * Amazon EC2 key pair that can be used to ssh to the master node as the user called `hadoop`
    */
  var keyName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Identifier of the Amazon EC2 service-access security group - required when the cluster runs on a private subnet
    */
  var serviceAccessSecurityGroup: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * VPC subnet id where you want the job flow to launch. Cannot specify the `cc1.4xlarge` instance type for nodes of a job flow launched in a Amazon VPC
    */
  var subnetId: js.UndefOr[Input[String]] = js.undefined
}
object ClusterEc2Attributes {
  
  @scala.inline
  def apply(instanceProfile: Input[String]): ClusterEc2Attributes = {
    val __obj = js.Dynamic.literal(instanceProfile = instanceProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterEc2Attributes]
  }
  
  @scala.inline
  implicit class ClusterEc2AttributesMutableBuilder[Self <: ClusterEc2Attributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalMasterSecurityGroups(value: Input[String]): Self = StObject.set(x, "additionalMasterSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalMasterSecurityGroupsUndefined: Self = StObject.set(x, "additionalMasterSecurityGroups", js.undefined)
    
    @scala.inline
    def setAdditionalSlaveSecurityGroups(value: Input[String]): Self = StObject.set(x, "additionalSlaveSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalSlaveSecurityGroupsUndefined: Self = StObject.set(x, "additionalSlaveSecurityGroups", js.undefined)
    
    @scala.inline
    def setEmrManagedMasterSecurityGroup(value: Input[String]): Self = StObject.set(x, "emrManagedMasterSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmrManagedMasterSecurityGroupUndefined: Self = StObject.set(x, "emrManagedMasterSecurityGroup", js.undefined)
    
    @scala.inline
    def setEmrManagedSlaveSecurityGroup(value: Input[String]): Self = StObject.set(x, "emrManagedSlaveSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmrManagedSlaveSecurityGroupUndefined: Self = StObject.set(x, "emrManagedSlaveSecurityGroup", js.undefined)
    
    @scala.inline
    def setInstanceProfile(value: Input[String]): Self = StObject.set(x, "instanceProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyName(value: Input[String]): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNameUndefined: Self = StObject.set(x, "keyName", js.undefined)
    
    @scala.inline
    def setServiceAccessSecurityGroup(value: Input[String]): Self = StObject.set(x, "serviceAccessSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccessSecurityGroupUndefined: Self = StObject.set(x, "serviceAccessSecurityGroup", js.undefined)
    
    @scala.inline
    def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
  }
}
