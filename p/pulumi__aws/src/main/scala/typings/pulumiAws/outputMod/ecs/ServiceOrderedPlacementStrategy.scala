package typings.pulumiAws.outputMod.ecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceOrderedPlacementStrategy extends StObject {
  
  /**
    * For the `spread` placement strategy, valid values are `instanceId` (or `host`,
    * which has the same effect), or any platform or custom attribute that is applied to a container instance.
    * For the `binpack` type, valid values are `memory` and `cpu`. For the `random` type, this attribute is not
    * needed. For more information, see [Placement Strategy](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PlacementStrategy.html).
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * The type of placement strategy. Must be one of: `binpack`, `random`, or `spread`
    */
  var `type`: String
}
object ServiceOrderedPlacementStrategy {
  
  inline def apply(`type`: String): ServiceOrderedPlacementStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceOrderedPlacementStrategy]
  }
  
  extension [Self <: ServiceOrderedPlacementStrategy](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
