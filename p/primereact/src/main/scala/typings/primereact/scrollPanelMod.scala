package typings.primereact

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollPanelMod {
  
  @JSImport("primereact/components/scrollpanel/ScrollPanel", "ScrollPanel")
  @js.native
  class ScrollPanel protected ()
    extends Component[ScrollPanelProps, js.Any, js.Any] {
    def this(props: ScrollPanelProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollPanelProps, context: js.Any) = this()
  }
  
  @js.native
  trait ScrollPanelProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
  }
  object ScrollPanelProps {
    
    @scala.inline
    def apply(): ScrollPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollPanelProps]
    }
    
    @scala.inline
    implicit class ScrollPanelPropsMutableBuilder[Self <: ScrollPanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
