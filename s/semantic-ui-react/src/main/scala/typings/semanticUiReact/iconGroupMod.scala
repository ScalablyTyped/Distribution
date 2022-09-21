package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.iconIconMod.IconSizeProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconGroupMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Icon/IconGroup", JSImport.Default)
  @js.native
  val default: FC[IconGroupProps] = js.native
  
  trait IconGroupProps
    extends StObject
       with StrictIconGroupProps
       with /* key */ StringDictionary[Any]
  object IconGroupProps {
    
    inline def apply(): IconGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconGroupProps]
    }
  }
  
  trait StrictIconGroupProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Size of the icon group. */
    var size: js.UndefOr[IconSizeProp] = js.undefined
  }
  object StrictIconGroupProps {
    
    inline def apply(): StrictIconGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictIconGroupProps]
    }
    
    extension [Self <: StrictIconGroupProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setSize(value: IconSizeProp): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[IconGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `iconGroupMod.foo` */
  override def _to: FC[IconGroupProps] = default
}
