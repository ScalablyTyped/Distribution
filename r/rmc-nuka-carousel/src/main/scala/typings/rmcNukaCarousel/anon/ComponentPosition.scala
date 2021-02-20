package typings.rmcNukaCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentPosition extends StObject {
  
  var component: InstantiableForceUpdate = js.native
  
  var position: String = js.native
}
object ComponentPosition {
  
  @scala.inline
  def apply(component: InstantiableForceUpdate, position: String): ComponentPosition = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentPosition]
  }
  
  @scala.inline
  implicit class ComponentPositionMutableBuilder[Self <: ComponentPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: InstantiableForceUpdate): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
