package typings.pulumiAws.outputMod.elasticloadbalancingv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerRuleActionForwardTargetGroup extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var arn: String
  
  /**
    * The weight. The range is 0 to 999.
    */
  var weight: js.UndefOr[Double] = js.undefined
}
object ListenerRuleActionForwardTargetGroup {
  
  inline def apply(arn: String): ListenerRuleActionForwardTargetGroup = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleActionForwardTargetGroup]
  }
  
  extension [Self <: ListenerRuleActionForwardTargetGroup](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
