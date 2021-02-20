package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuHeaderMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/collections/Menu/MenuHeader", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[MenuHeaderProps, ComponentState, js.Any] {
    def this(props: MenuHeaderProps) = this()
    def this(props: MenuHeaderProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/collections/Menu/MenuHeader", JSImport.Default)
  @js.native
  val default: ComponentClass[MenuHeaderProps, ComponentState] = js.native
  
  @js.native
  trait MenuHeaderProps
    extends StrictMenuHeaderProps
       with /* key */ StringDictionary[js.Any]
  object MenuHeaderProps {
    
    @scala.inline
    def apply(): MenuHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuHeaderProps]
    }
  }
  
  @js.native
  trait StrictMenuHeaderProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
  }
  object StrictMenuHeaderProps {
    
    @scala.inline
    def apply(): StrictMenuHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictMenuHeaderProps]
    }
    
    @scala.inline
    implicit class StrictMenuHeaderPropsMutableBuilder[Self <: StrictMenuHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
  
  type _To = ComponentClass[MenuHeaderProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `menuHeaderMod.foo` */
  override def _to: ComponentClass[MenuHeaderProps, ComponentState] = default
}
