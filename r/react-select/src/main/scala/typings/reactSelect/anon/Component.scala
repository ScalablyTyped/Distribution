package typings.reactSelect.anon

import typings.react.mod.ComponentType
import typings.reactTransitionGroup.transitionMod.ExitHandler
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component[ComponentProps] extends StObject {
  
  var component: ComponentType[ComponentProps]
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var in: js.UndefOr[Boolean] = js.undefined
  
  var onExited: js.UndefOr[ExitHandler[js.UndefOr[HTMLElement]]] = js.undefined
}
object Component {
  
  inline def apply[ComponentProps](component: ComponentType[ComponentProps]): Component[ComponentProps] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component[ComponentProps]]
  }
  
  extension [Self <: Component[?], ComponentProps](x: Self & Component[ComponentProps]) {
    
    inline def setComponent(value: ComponentType[ComponentProps]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
    
    inline def setOnExited(value: ExitHandler[js.UndefOr[HTMLElement]]): Self = StObject.set(x, "onExited", value.asInstanceOf[js.Any])
    
    inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
  }
}
