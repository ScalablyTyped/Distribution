package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbSectionMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/collections/Breadcrumb/BreadcrumbSection", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[BreadcrumbSectionProps, ComponentState, js.Any] {
    def this(props: BreadcrumbSectionProps) = this()
    def this(props: BreadcrumbSectionProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/collections/Breadcrumb/BreadcrumbSection", JSImport.Default)
  @js.native
  val default: ComponentClass[BreadcrumbSectionProps, ComponentState] = js.native
  
  trait BreadcrumbSectionProps
    extends StObject
       with StrictBreadcrumbSectionProps
       with /* key */ StringDictionary[js.Any]
  object BreadcrumbSectionProps {
    
    inline def apply(): BreadcrumbSectionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbSectionProps]
    }
  }
  
  trait StrictBreadcrumbSectionProps extends StObject {
    
    /** Style as the currently active section. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Render as an `a` tag instead of a `div` and adds the href attribute. */
    var href: js.UndefOr[String] = js.undefined
    
    /** Render as an `a` tag instead of a `div`. */
    var link: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Called on click. When passed, the component will render as an `a`
      * tag by default instead of a `div`.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClick: js.UndefOr[
        js.Function2[
          /* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], 
          /* data */ BreadcrumbSectionProps, 
          Unit
        ]
      ] = js.undefined
  }
  object StrictBreadcrumbSectionProps {
    
    inline def apply(): StrictBreadcrumbSectionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictBreadcrumbSectionProps]
    }
    
    extension [Self <: StrictBreadcrumbSectionProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setLink(value: Boolean): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setOnClick(
        value: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ BreadcrumbSectionProps) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
  
  type _To = ComponentClass[BreadcrumbSectionProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `breadcrumbSectionMod.foo` */
  override def _to: ComponentClass[BreadcrumbSectionProps, ComponentState] = default
}
