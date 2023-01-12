package typings.reactHighlight

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-highlight", JSImport.Default)
  @js.native
  open class default protected () extends Component[HighlightProps, ComponentState, Any] {
    def this(props: HighlightProps) = this()
    def this(props: HighlightProps, context: Any) = this()
  }
  /**
    * Visually prettifies child code with highlight.js.
    */
  @JSImport("react-highlight", JSImport.Default)
  @js.native
  val default: ComponentClass[HighlightProps, ComponentState] = js.native
  
  trait HighlightProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Language name to use as a class to signal type to highlight.js.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Set innerHTML=true to highlight multiple code snippets at a time.
      */
    var innerHTML: js.UndefOr[Boolean] = js.undefined
  }
  object HighlightProps {
    
    inline def apply(): HighlightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighlightProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HighlightProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setInnerHTML(value: Boolean): Self = StObject.set(x, "innerHTML", value.asInstanceOf[js.Any])
      
      inline def setInnerHTMLUndefined: Self = StObject.set(x, "innerHTML", js.undefined)
    }
  }
  
  type _To = ComponentClass[HighlightProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ComponentClass[HighlightProps, ComponentState] = default
}
