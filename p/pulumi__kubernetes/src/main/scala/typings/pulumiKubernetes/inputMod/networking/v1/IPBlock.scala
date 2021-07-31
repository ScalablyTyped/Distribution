package typings.pulumiKubernetes.inputMod.networking.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IPBlock describes a particular CIDR (Ex. "192.168.1.1/24","2001:db9::/64") that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The except entry describes CIDRs that should not be included within this rule.
  */
trait IPBlock extends StObject {
  
  /**
    * CIDR is a string representing the IP Block Valid examples are "192.168.1.1/24" or "2001:db9::/64"
    */
  var cidr: Input[String]
  
  /**
    * Except is a slice of CIDRs that should not be included within an IP Block Valid examples are "192.168.1.1/24" or "2001:db9::/64" Except values will be rejected if they are outside the CIDR range
    */
  var except: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object IPBlock {
  
  @scala.inline
  def apply(cidr: Input[String]): IPBlock = {
    val __obj = js.Dynamic.literal(cidr = cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPBlock]
  }
  
  @scala.inline
  implicit class IPBlockMutableBuilder[Self <: IPBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidr(value: Input[String]): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcept(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "except", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptUndefined: Self = StObject.set(x, "except", js.undefined)
    
    @scala.inline
    def setExceptVarargs(value: Input[String]*): Self = StObject.set(x, "except", js.Array(value :_*))
  }
}
