package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServicePlacementConstraint extends StObject {
  
  /**
    * Cluster Query Language expression to apply to the constraint. Does not need to be specified
    * for the `distinctInstance` type.
    * For more information, see [Cluster Query Language in the Amazon EC2 Container
    * Service Developer
    * Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html).
    */
  var expression: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The type of constraint. The only valid values at this time are `memberOf` and `distinctInstance`.
    */
  var `type`: Input[String]
}
object ServicePlacementConstraint {
  
  inline def apply(`type`: Input[String]): ServicePlacementConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServicePlacementConstraint]
  }
  
  extension [Self <: ServicePlacementConstraint](x: Self) {
    
    inline def setExpression(value: Input[String]): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
