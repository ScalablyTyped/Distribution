package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesPopupPopupHeaderMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Popup/PopupHeader", JSImport.Default)
  @js.native
  val default: FC[PopupHeaderProps] = js.native
  
  trait PopupHeaderProps
    extends StObject
       with StrictPopupHeaderProps
       with /* key */ StringDictionary[Any]
  object PopupHeaderProps {
    
    inline def apply(): PopupHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupHeaderProps]
    }
  }
  
  trait StrictPopupHeaderProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  }
  object StrictPopupHeaderProps {
    
    inline def apply(): StrictPopupHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictPopupHeaderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrictPopupHeaderProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
  
  type _To = FC[PopupHeaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsModulesPopupPopupHeaderMod.foo` */
  override def _to: FC[PopupHeaderProps] = default
}
