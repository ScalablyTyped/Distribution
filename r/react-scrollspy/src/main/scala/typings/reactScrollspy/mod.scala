package typings.reactScrollspy

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-scrollspy", JSImport.Default)
  @js.native
  class default () extends Scrollspy
  
  @js.native
  trait Scrollspy
    extends Component[ScrollspyProps, js.Object, js.Any] {
    
    // Remove event listener of scrollspy.
    def offEvent(): Unit = js.native
    
    // Add event listener of scrollspy.
    def onEvent(): Unit = js.native
  }
  
  @js.native
  trait ScrollspyProps extends StObject {
    
    // ClassName attribute to be passed to the generated <ul /> element
    var className: js.UndefOr[String] = js.native
    
    // HTML tag for Scrollspy component if you want to use other than ul
    var componentTag: js.UndefOr[String | ComponentType[js.Object]] = js.native
    
    // Class name that apply to the navigation element paired with the content element in viewport
    var currentClassName: String = js.native
    
    // Array of target element IDs
    var items: js.Array[String] = js.native
    
    // Offset value that adjusts to determine the elements are in the viewport
    var offset: js.UndefOr[Double] = js.native
    
    // Function to be executed when the active item has been updated
    var onUpdate: js.UndefOr[js.Function1[/* item */ HTMLElement, Unit]] = js.native
    
    // Selector for the element of scrollable container that can be used with querySelector
    var rootEl: js.UndefOr[String] = js.native
    
    // Class name that apply to the navigation elements that have been scrolled past
    var scrolledPastClassName: js.UndefOr[String] = js.native
    
    // Style attribute to be passed to the generated <ul /> element
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ScrollspyProps {
    
    @scala.inline
    def apply(currentClassName: String, items: js.Array[String]): ScrollspyProps = {
      val __obj = js.Dynamic.literal(currentClassName = currentClassName.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollspyProps]
    }
    
    @scala.inline
    implicit class ScrollspyPropsMutableBuilder[Self <: ScrollspyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponentTag(value: String | ComponentType[js.Object]): Self = StObject.set(x, "componentTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentTagUndefined: Self = StObject.set(x, "componentTag", js.undefined)
      
      @scala.inline
      def setCurrentClassName(value: String): Self = StObject.set(x, "currentClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: /* item */ HTMLElement => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setRootEl(value: String): Self = StObject.set(x, "rootEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootElUndefined: Self = StObject.set(x, "rootEl", js.undefined)
      
      @scala.inline
      def setScrolledPastClassName(value: String): Self = StObject.set(x, "scrolledPastClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrolledPastClassNameUndefined: Self = StObject.set(x, "scrolledPastClassName", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
