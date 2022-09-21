package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itemDescriptionMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Item/ItemDescription", JSImport.Default)
  @js.native
  val default: FC[ItemDescriptionProps] = js.native
  
  trait ItemDescriptionProps
    extends StObject
       with StrictItemDescriptionProps
       with /* key */ StringDictionary[Any]
  object ItemDescriptionProps {
    
    inline def apply(): ItemDescriptionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemDescriptionProps]
    }
  }
  
  trait StrictItemDescriptionProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  }
  object StrictItemDescriptionProps {
    
    inline def apply(): StrictItemDescriptionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictItemDescriptionProps]
    }
    
    extension [Self <: StrictItemDescriptionProps](x: Self) {
      
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
  
  type _To = FC[ItemDescriptionProps]
  
  /* This means you don't have to write `default`, but can instead just say `itemDescriptionMod.foo` */
  override def _to: FC[ItemDescriptionProps] = default
}
