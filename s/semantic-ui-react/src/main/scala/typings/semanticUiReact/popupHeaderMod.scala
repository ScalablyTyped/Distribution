package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupHeaderMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Popup/PopupHeader", JSImport.Default)
  @js.native
  val default: StatelessComponent[PopupHeaderProps] = js.native
  
  trait PopupHeaderProps
    extends StObject
       with StrictPopupHeaderProps
       with /* key */ StringDictionary[js.Any]
  object PopupHeaderProps {
    
    inline def apply(): PopupHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupHeaderProps]
    }
  }
  
  trait StrictPopupHeaderProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
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
    
    extension [Self <: StrictPopupHeaderProps](x: Self) {
      
      inline def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
  
  type _To = StatelessComponent[PopupHeaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `popupHeaderMod.foo` */
  override def _to: StatelessComponent[PopupHeaderProps] = default
}
