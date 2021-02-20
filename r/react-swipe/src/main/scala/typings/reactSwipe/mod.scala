package typings.reactSwipe

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.swipe.SwipeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-swipe", JSImport.Namespace)
  @js.native
  class ^ () extends ReactSwipe
  
  @js.native
  trait Props extends StObject {
    
    var childCount: js.UndefOr[Double] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[Style] = js.native
    
    var swipeOptions: js.UndefOr[SwipeOptions] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildCount(value: Double): Self = StObject.set(x, "childCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildCountUndefined: Self = StObject.set(x, "childCount", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSwipeOptions(value: SwipeOptions): Self = StObject.set(x, "swipeOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeOptionsUndefined: Self = StObject.set(x, "swipeOptions", js.undefined)
    }
  }
  
  @js.native
  trait ReactSwipe
    extends Component[Props, js.Object, js.Any] {
    
    def getNumSlides(): Double = js.native
    
    def getPos(): Double = js.native
    
    def next(): Unit = js.native
    
    def prev(): Unit = js.native
    
    def slide(index: Double, duration: Double): Unit = js.native
  }
  
  @js.native
  trait Style extends StObject {
    
    var child: CSSProperties = js.native
    
    var container: CSSProperties = js.native
    
    var wrapper: CSSProperties = js.native
  }
  object Style {
    
    @scala.inline
    def apply(child: CSSProperties, container: CSSProperties, wrapper: CSSProperties): Style = {
      val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChild(value: CSSProperties): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: CSSProperties): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapper(value: CSSProperties): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
}
