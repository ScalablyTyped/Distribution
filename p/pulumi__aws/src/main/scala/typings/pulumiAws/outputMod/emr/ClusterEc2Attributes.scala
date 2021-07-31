package typings.pulumiAws.outputMod.emr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterEc2Attributes extends StObject {
  
  /**
    * String containing a comma separated list of additional Amazon EC2 security group IDs for the master node
    */
  var additionalMasterSecurityGroups: js.UndefOr[String] = js.undefined
  
  /**
    * String containing a comma separated list of additional Amazon EC2 security group IDs for the slave nodes as a comma separated string
    */
  var additionalSlaveSecurityGroups: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of the Amazon EC2 EMR-Managed security group for the master node
    */
  var emrManagedMasterSecurityGroup: String
  
  /**
    * Identifier of the Amazon EC2 EMR-Managed security group for the slave nodes
    */
  var emrManagedSlaveSecurityGroup: String
  
  /**
    * Instance Profile for EC2 instances of the cluster assume this role
    */
  var instanceProfile: String
  
  /**
    * Amazon EC2 key pair that can be used to ssh to the master node as the user called `hadoop`
    */
  var keyName: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of the Amazon EC2 service-access security group - required when the cluster runs on a private subnet
    */
  var serviceAccessSecurityGroup: String
  
  /**
    * VPC subnet id where you want the job flow to launch. Cannot specify the `cc1.4xlarge` instance type for nodes of a job flow launched in a Amazon VPC
    */
  var subnetId: js.UndefOr[String] = js.undefined
}
object ClusterEc2Attributes {
  
  @scala.inline
  def apply(
    emrManagedMasterSecurityGroup: String,
    emrManagedSlaveSecurityGroup: String,
    instanceProfile: String,
    serviceAccessSecurityGroup: String
  ): ClusterEc2Attributes = {
    val __obj = js.Dynamic.literal(emrManagedMasterSecurityGroup = emrManagedMasterSecurityGroup.asInstanceOf[js.Any], emrManagedSlaveSecurityGroup = emrManagedSlaveSecurityGroup.asInstanceOf[js.Any], instanceProfile = instanceProfile.asInstanceOf[js.Any], serviceAccessSecurityGroup = serviceAccessSecurityGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterEc2Attributes]
  }
  
  @scala.inline
  implicit class ClusterEc2AttributesMutableBuilder[Self <: ClusterEc2Attributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalMasterSecurityGroups(value: String): Self = StObject.set(x, "additionalMasterSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalMasterSecurityGroupsUndefined: Self = StObject.set(x, "additionalMasterSecurityGroups", js.undefined)
    
    @scala.inline
    def setAdditionalSlaveSecurityGroups(value: String): Self = StObject.set(x, "additionalSlaveSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalSlaveSecurityGroupsUndefined: Self = StObject.set(x, "additionalSlaveSecurityGroups", js.undefined)
    
    @scala.inline
    def setEmrManagedMasterSecurityGroup(value: String): Self = StObject.set(x, "emrManagedMasterSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmrManagedSlaveSecurityGroup(value: String): Self = StObject.set(x, "emrManagedSlaveSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceProfile(value: String): Self = StObject.set(x, "instanceProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyName(value: String): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNameUndefined: Self = StObject.set(x, "keyName", js.undefined)
    
    @scala.inline
    def setServiceAccessSecurityGroup(value: String): Self = StObject.set(x, "serviceAccessSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetId(value: String): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
  }
}
