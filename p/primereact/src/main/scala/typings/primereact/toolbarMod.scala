package typings.primereact

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolbarMod {
  
  @JSImport("primereact/components/toolbar/Toolbar", "Toolbar")
  @js.native
  class Toolbar protected ()
    extends Component[ToolbarProps, js.Any, js.Any] {
    def this(props: ToolbarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ToolbarProps, context: js.Any) = this()
  }
  
  trait ToolbarProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var left: js.UndefOr[js.Function1[/* props */ js.Object, js.Any]] = js.undefined
    
    var right: js.UndefOr[js.Function1[/* props */ js.Object, js.Any]] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object ToolbarProps {
    
    @scala.inline
    def apply(): ToolbarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarProps]
    }
    
    @scala.inline
    implicit class ToolbarPropsMutableBuilder[Self <: ToolbarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLeft(value: /* props */ js.Object => js.Any): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: /* props */ js.Object => js.Any): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
