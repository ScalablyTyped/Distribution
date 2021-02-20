package typings.pulumiKubernetes.inputMod.policy.v1beta1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HostPortRange defines a range of host ports that will be enabled by a policy for pods to use.  It requires both the start and end to be defined.
  */
@js.native
trait HostPortRange extends StObject {
  
  /**
    * max is the end of the range, inclusive.
    */
  var max: Input[Double] = js.native
  
  /**
    * min is the start of the range, inclusive.
    */
  var min: Input[Double] = js.native
}
object HostPortRange {
  
  @scala.inline
  def apply(max: Input[Double], min: Input[Double]): HostPortRange = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostPortRange]
  }
  
  @scala.inline
  implicit class HostPortRangeMutableBuilder[Self <: HostPortRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Input[Double]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Input[Double]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
