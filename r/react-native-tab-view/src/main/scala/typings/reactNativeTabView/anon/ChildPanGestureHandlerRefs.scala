package typings.reactNativeTabView.anon

import typings.react.mod.RefObject
import typings.reactNativeGestureHandler.mod.PanGestureHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildPanGestureHandlerRefs extends StObject {
  
  var childPanGestureHandlerRefs: js.Array[RefObject[PanGestureHandler]]
  
  var enabled: Boolean
}
object ChildPanGestureHandlerRefs {
  
  @scala.inline
  def apply(childPanGestureHandlerRefs: js.Array[RefObject[PanGestureHandler]], enabled: Boolean): ChildPanGestureHandlerRefs = {
    val __obj = js.Dynamic.literal(childPanGestureHandlerRefs = childPanGestureHandlerRefs.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildPanGestureHandlerRefs]
  }
  
  @scala.inline
  implicit class ChildPanGestureHandlerRefsMutableBuilder[Self <: ChildPanGestureHandlerRefs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildPanGestureHandlerRefs(value: js.Array[RefObject[PanGestureHandler]]): Self = StObject.set(x, "childPanGestureHandlerRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildPanGestureHandlerRefsVarargs(value: RefObject[PanGestureHandler]*): Self = StObject.set(x, "childPanGestureHandlerRefs", js.Array(value :_*))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
