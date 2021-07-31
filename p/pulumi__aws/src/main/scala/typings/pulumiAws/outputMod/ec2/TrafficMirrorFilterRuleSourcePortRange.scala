package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficMirrorFilterRuleSourcePortRange extends StObject {
  
  /**
    * Starting port of the range
    */
  var fromPort: js.UndefOr[Double] = js.undefined
  
  /**
    * Ending port of the range
    */
  var toPort: js.UndefOr[Double] = js.undefined
}
object TrafficMirrorFilterRuleSourcePortRange {
  
  @scala.inline
  def apply(): TrafficMirrorFilterRuleSourcePortRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficMirrorFilterRuleSourcePortRange]
  }
  
  @scala.inline
  implicit class TrafficMirrorFilterRuleSourcePortRangeMutableBuilder[Self <: TrafficMirrorFilterRuleSourcePortRange] (val x: Self) extends AnyVal {
    
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
