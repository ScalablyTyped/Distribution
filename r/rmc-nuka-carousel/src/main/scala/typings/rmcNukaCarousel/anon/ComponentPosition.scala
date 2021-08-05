package typings.rmcNukaCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentPosition extends StObject {
  
  var component: InstantiableForceUpdate
  
  var position: String
}
object ComponentPosition {
  
  inline def apply(component: InstantiableForceUpdate, position: String): ComponentPosition = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentPosition]
  }
  
  extension [Self <: ComponentPosition](x: Self) {
    
    inline def setComponent(value: InstantiableForceUpdate): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
