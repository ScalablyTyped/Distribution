package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesTabTabPaneMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Tab/TabPane", JSImport.Default)
  @js.native
  val default: FC[TabPaneProps] = js.native
  
  trait StrictTabPaneProps extends StObject {
    
    /** A tab pane can be active. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A Tab.Pane can display a loading indicator. */
    var loading: js.UndefOr[Boolean] = js.undefined
  }
  object StrictTabPaneProps {
    
    inline def apply(): StrictTabPaneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTabPaneProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrictTabPaneProps] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    }
  }
  
  trait TabPaneProps
    extends StObject
       with StrictTabPaneProps
       with /* key */ StringDictionary[Any]
  object TabPaneProps {
    
    inline def apply(): TabPaneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabPaneProps]
    }
  }
  
  type _To = FC[TabPaneProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsModulesTabTabPaneMod.foo` */
  override def _to: FC[TabPaneProps] = default
}
