package typings.reactSwipe

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.swipe.SwipeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-swipe", JSImport.Namespace)
  @js.native
  open class ^ () extends ReactSwipe
  
  trait Props extends StObject {
    
    var childCount: js.UndefOr[Double] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[Style] = js.undefined
    
    var swipeOptions: js.UndefOr[SwipeOptions] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setChildCount(value: Double): Self = StObject.set(x, "childCount", value.asInstanceOf[js.Any])
      
      inline def setChildCountUndefined: Self = StObject.set(x, "childCount", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSwipeOptions(value: SwipeOptions): Self = StObject.set(x, "swipeOptions", value.asInstanceOf[js.Any])
      
      inline def setSwipeOptionsUndefined: Self = StObject.set(x, "swipeOptions", js.undefined)
    }
  }
  
  @js.native
  trait ReactSwipe
    extends Component[Props, js.Object, Any] {
    
    def getNumSlides(): Double = js.native
    
    def getPos(): Double = js.native
    
    def next(): Unit = js.native
    
    def prev(): Unit = js.native
    
    def slide(index: Double, duration: Double): Unit = js.native
  }
  
  trait Style extends StObject {
    
    var child: CSSProperties
    
    var container: CSSProperties
    
    var wrapper: CSSProperties
  }
  object Style {
    
    inline def apply(child: CSSProperties, container: CSSProperties, wrapper: CSSProperties): Style = {
      val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      inline def setChild(value: CSSProperties): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: CSSProperties): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setWrapper(value: CSSProperties): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
}
