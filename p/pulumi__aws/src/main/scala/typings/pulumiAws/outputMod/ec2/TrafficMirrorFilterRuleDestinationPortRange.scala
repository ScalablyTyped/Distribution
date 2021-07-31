package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficMirrorFilterRuleDestinationPortRange extends StObject {
  
  /**
    * Starting port of the range
    */
  var fromPort: js.UndefOr[Double] = js.undefined
  
  /**
    * Ending port of the range
    */
  var toPort: js.UndefOr[Double] = js.undefined
}
object TrafficMirrorFilterRuleDestinationPortRange {
  
  @scala.inline
  def apply(): TrafficMirrorFilterRuleDestinationPortRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficMirrorFilterRuleDestinationPortRange]
  }
  
  @scala.inline
  implicit class TrafficMirrorFilterRuleDestinationPortRangeMutableBuilder[Self <: TrafficMirrorFilterRuleDestinationPortRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromPort(value: Double): Self = StObject.set(x, "fromPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromPortUndefined: Self = StObject.set(x, "fromPort", js.undefined)
    
    @scala.inline
    def setToPort(value: Double): Self = StObject.set(x, "toPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToPortUndefined: Self = StObject.set(x, "toPort", js.undefined)
  }
}
