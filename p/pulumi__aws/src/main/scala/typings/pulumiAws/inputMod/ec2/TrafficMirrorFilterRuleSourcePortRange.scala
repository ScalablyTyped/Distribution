package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficMirrorFilterRuleSourcePortRange extends StObject {
  
  /**
    * Starting port of the range
    */
  var fromPort: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Ending port of the range
    */
  var toPort: js.UndefOr[Input[Double]] = js.undefined
}
object TrafficMirrorFilterRuleSourcePortRange {
  
  inline def apply(): TrafficMirrorFilterRuleSourcePortRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficMirrorFilterRuleSourcePortRange]
  }
  
  extension [Self <: TrafficMirrorFilterRuleSourcePortRange](x: Self) {
    
    inline def setFromPort(value: Input[Double]): Self = StObject.set(x, "fromPort", value.asInstanceOf[js.Any])
    
    inline def setFromPortUndefined: Self = StObject.set(x, "fromPort", js.undefined)
    
    inline def setToPort(value: Input[Double]): Self = StObject.set(x, "toPort", value.asInstanceOf[js.Any])
    
    inline def setToPortUndefined: Self = StObject.set(x, "toPort", js.undefined)
  }
}
