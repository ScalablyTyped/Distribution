package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsCollectionsMenuMenuMenuMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Menu/MenuMenu", JSImport.Default)
  @js.native
  val default: FC[MenuMenuProps] = js.native
  
  trait MenuMenuProps
    extends StObject
       with StrictMenuMenuProps
       with /* key */ StringDictionary[Any]
  object MenuMenuProps {
    
    inline def apply(): MenuMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuMenuProps]
    }
  }
  
  trait StrictMenuMenuProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A sub menu can take left or right position. */
    var position: js.UndefOr["left" | "right"] = js.undefined
  }
  object StrictMenuMenuProps {
    
    inline def apply(): StrictMenuMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictMenuMenuProps]
    }
    
    extension [Self <: StrictMenuMenuProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setPosition(value: "left" | "right"): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  type _To = FC[MenuMenuProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsCollectionsMenuMenuMenuMod.foo` */
  override def _to: FC[MenuMenuProps] = default
}
