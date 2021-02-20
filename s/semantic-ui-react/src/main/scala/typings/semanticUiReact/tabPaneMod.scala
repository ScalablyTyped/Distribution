package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabPaneMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Tab/TabPane", JSImport.Default)
  @js.native
  val default: StatelessComponent[TabPaneProps] = js.native
  
  @js.native
  trait StrictTabPaneProps extends StObject {
    
    /** A tab pane can be active. */
    var active: js.UndefOr[Boolean] = js.native
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** A Tab.Pane can display a loading indicator. */
    var loading: js.UndefOr[Boolean] = js.native
  }
  object StrictTabPaneProps {
    
    @scala.inline
    def apply(): StrictTabPaneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTabPaneProps]
    }
    
    @scala.inline
    implicit class StrictTabPanePropsMutableBuilder[Self <: StrictTabPaneProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
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
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    }
  }
  
  @js.native
  trait TabPaneProps
    extends StrictTabPaneProps
       with /* key */ StringDictionary[js.Any]
  object TabPaneProps {
    
    @scala.inline
    def apply(): TabPaneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabPaneProps]
    }
  }
  
  type _To = StatelessComponent[TabPaneProps]
  
  /* This means you don't have to write `default`, but can instead just say `tabPaneMod.foo` */
  override def _to: StatelessComponent[TabPaneProps] = default
}
