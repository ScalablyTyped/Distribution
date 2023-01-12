package typings.reactHighlightJs

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object reactHighlightMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-highlight", JSImport.Default)
  @js.native
  open class default protected () extends Component[HighlightProps, ComponentState, Any] {
    def this(props: HighlightProps) = this()
    def this(props: HighlightProps, context: Any) = this()
  }
  /**
    * A lightweight React wrapper around the Highlight.js syntax highlighting library.
    */
  @JSImport("react-highlight", JSImport.Default)
  @js.native
  val default: ComponentClass[HighlightProps, ComponentState] = js.native
  
  trait HighlightProps extends StObject {
    
    /**
      * Content that will be highlighted
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Language name to use as a class to signal type to highlight.js.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Language name to use as a class to signal type to highlight.js.
      */
    var language: String
    
    /**
      * Inline styles to apply to the rendered <pre> tag.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object HighlightProps {
    
    inline def apply(language: String): HighlightProps = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HighlightProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ComponentClass[HighlightProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `reactHighlightMod.foo` */
  override def _to: ComponentClass[HighlightProps, ComponentState] = default
}
