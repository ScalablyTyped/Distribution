package typings.pulumiAws.inputMod.elasticloadbalancingv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerDefaultActionForwardStickiness extends StObject {
  
  /**
    * The time period, in seconds, during which requests from a client should be routed to the same target group. The range is 1-604800 seconds (7 days).
    */
  var duration: Input[Double] = js.native
  
  /**
    * Indicates whether target group stickiness is enabled.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.native
}
object ListenerDefaultActionForwardStickiness {
  
  @scala.inline
  def apply(duration: Input[Double]): ListenerDefaultActionForwardStickiness = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDefaultActionForwardStickiness]
  }
  
  @scala.inline
  implicit class ListenerDefaultActionForwardStickinessMutableBuilder[Self <: ListenerDefaultActionForwardStickiness] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Input[Double]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
