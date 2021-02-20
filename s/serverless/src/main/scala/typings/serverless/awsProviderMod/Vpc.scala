package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vpc extends StObject {
  
  var securityGroupIds: js.Array[String] = js.native
  
  var subnetIds: js.Array[String] | String = js.native
}
object Vpc {
  
  @scala.inline
  def apply(securityGroupIds: js.Array[String], subnetIds: js.Array[String] | String): Vpc = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vpc]
  }
  
  @scala.inline
  implicit class VpcMutableBuilder[Self <: Vpc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: js.Array[String] | String): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
  }
}
