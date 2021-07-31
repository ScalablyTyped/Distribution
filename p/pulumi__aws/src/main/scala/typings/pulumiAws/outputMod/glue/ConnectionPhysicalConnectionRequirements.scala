package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionPhysicalConnectionRequirements extends StObject {
  
  /**
    * The availability zone of the connection. This field is redundant and implied by `subnetId`, but is currently an api requirement.
    */
  var availabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The security group ID list used by the connection.
    */
  var securityGroupIdLists: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The subnet ID used by the connection.
    */
  var subnetId: js.UndefOr[String] = js.undefined
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
    def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdLists(value: js.Array[String]): Self = StObject.set(x, "securityGroupIdLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdListsUndefined: Self = StObject.set(x, "securityGroupIdLists", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdListsVarargs(value: String*): Self = StObject.set(x, "securityGroupIdLists", js.Array(value :_*))
    
    @scala.inline
    def setSubnetId(value: String): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
  }
}
