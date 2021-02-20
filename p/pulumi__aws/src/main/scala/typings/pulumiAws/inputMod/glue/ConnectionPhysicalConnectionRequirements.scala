package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionPhysicalConnectionRequirements extends StObject {
  
  /**
    * The availability zone of the connection. This field is redundant and implied by `subnetId`, but is currently an api requirement.
    */
  var availabilityZone: js.UndefOr[Input[String]] = js.native
  
  /**
    * The security group ID list used by the connection.
    */
  var securityGroupIdLists: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The subnet ID used by the connection.
    */
  var subnetId: js.UndefOr[Input[String]] = js.native
}
object ConnectionPhysicalConnectionRequirements {
  
  @scala.inline
  def apply(): ConnectionPhysicalConnectionRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionPhysicalConnectionRequirements]
  }
  
  @scala.inline
  implicit class ConnectionPhysicalConnectionRequirementsMutableBuilder[Self <: ConnectionPhysicalConnectionRequirements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdLists(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIdLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdListsUndefined: Self = StObject.set(x, "securityGroupIdLists", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdListsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIdLists", js.Array(value :_*))
    
    @scala.inline
    def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
  }
}
