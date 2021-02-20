package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceOrderedPlacementStrategy extends StObject {
  
  /**
    * For the `spread` placement strategy, valid values are `instanceId` (or `host`,
    * which has the same effect), or any platform or custom attribute that is applied to a container instance.
    * For the `binpack` type, valid values are `memory` and `cpu`. For the `random` type, this attribute is not
    * needed. For more information, see [Placement Strategy](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PlacementStrategy.html).
    */
  var field: js.UndefOr[Input[String]] = js.native
  
  /**
    * The type of placement strategy. Must be one of: `binpack`, `random`, or `spread`
    */
  var `type`: Input[String] = js.native
}
object ServiceOrderedPlacementStrategy {
  
  @scala.inline
  def apply(`type`: Input[String]): ServiceOrderedPlacementStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceOrderedPlacementStrategy]
  }
  
  @scala.inline
  implicit class ServiceOrderedPlacementStrategyMutableBuilder[Self <: ServiceOrderedPlacementStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: Input[String]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
