package typings.reactNativeDraggableFlatlist.anon

import typings.react.mod.RefObject
import typings.reactNative.mod.LayoutRectangle
import typings.reactNativeReanimated.mod.Animated.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layout extends StObject {
  
  var containerRef: RefObject[View]
  
  var layout: LayoutRectangle
}
object Layout {
  
  inline def apply(containerRef: RefObject[View], layout: LayoutRectangle): Layout = {
    val __obj = js.Dynamic.literal(containerRef = containerRef.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Layout] (val x: Self) extends AnyVal {
    
    inline def setContainerRef(value: RefObject[View]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: LayoutRectangle): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
  }
}
