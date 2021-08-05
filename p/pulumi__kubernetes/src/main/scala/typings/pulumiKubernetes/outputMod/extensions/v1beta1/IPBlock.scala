package typings.pulumiKubernetes.outputMod.extensions.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DEPRECATED 1.9 - This group version of IPBlock is deprecated by networking/v1/IPBlock. IPBlock describes a particular CIDR (Ex. "192.168.1.1/24") that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The except entry describes CIDRs that should not be included within this rule.
  */
trait IPBlock extends StObject {
  
  /**
    * CIDR is a string representing the IP Block Valid examples are "192.168.1.1/24"
    */
  var cidr: String
  
  /**
    * Except is a slice of CIDRs that should not be included within an IP Block Valid examples are "192.168.1.1/24" Except values will be rejected if they are outside the CIDR range
    */
  var except: js.Array[String]
}
object IPBlock {
  
  inline def apply(cidr: String, except: js.Array[String]): IPBlock = {
    val __obj = js.Dynamic.literal(cidr = cidr.asInstanceOf[js.Any], except = except.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPBlock]
  }
  
  extension [Self <: IPBlock](x: Self) {
    
    inline def setCidr(value: String): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
    
    inline def setExcept(value: js.Array[String]): Self = StObject.set(x, "except", value.asInstanceOf[js.Any])
    
    inline def setExceptVarargs(value: String*): Self = StObject.set(x, "except", js.Array(value :_*))
  }
}
