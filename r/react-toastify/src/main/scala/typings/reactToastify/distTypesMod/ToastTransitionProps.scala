package typings.reactToastify.distTypesMod

import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastTransitionProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  def done(): Unit
  
  var isIn: Boolean
  
  var nodeRef: RefObject[HTMLElement]
  
  var position: ToastPosition | String
  
  var preventExitTransition: Boolean
}
object ToastTransitionProps {
  
  inline def apply(
    done: () => Unit,
    isIn: Boolean,
    nodeRef: RefObject[HTMLElement],
    position: ToastPosition | String,
    preventExitTransition: Boolean
  ): ToastTransitionProps = {
    val __obj = js.Dynamic.literal(done = js.Any.fromFunction0(done), isIn = isIn.asInstanceOf[js.Any], nodeRef = nodeRef.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], preventExitTransition = preventExitTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastTransitionProps]
  }
  
  extension [Self <: ToastTransitionProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDone(value: () => Unit): Self = StObject.set(x, "done", js.Any.fromFunction0(value))
    
    inline def setIsIn(value: Boolean): Self = StObject.set(x, "isIn", value.asInstanceOf[js.Any])
    
    inline def setNodeRef(value: RefObject[HTMLElement]): Self = StObject.set(x, "nodeRef", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: ToastPosition | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPreventExitTransition(value: Boolean): Self = StObject.set(x, "preventExitTransition", value.asInstanceOf[js.Any])
  }
}
