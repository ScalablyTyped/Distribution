package typings.reactCssCollapse

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-css-collapse", JSImport.Default)
  @js.native
  class default () extends Collapse
  
  @js.native
  trait Collapse
    extends Component[Props, js.Object, js.Any]
  
  @js.native
  trait Props extends StObject {
    
    var className: js.UndefOr[String | Null] = js.native
    
    var isOpen: Boolean = js.native
    
    var onRest: js.UndefOr[js.Function0[Unit]] = js.native
    
    var transition: js.UndefOr[String | Null] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(isOpen: Boolean): Props = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameNull: Self = StObject.set(x, "className", null)
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRest(value: () => Unit): Self = StObject.set(x, "onRest", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRestUndefined: Self = StObject.set(x, "onRest", js.undefined)
      
      @scala.inline
      def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNull: Self = StObject.set(x, "transition", null)
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
}
