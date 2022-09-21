package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownMenuMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownMenu", JSImport.Default)
  @js.native
  val default: FC[DropdownMenuProps] = js.native
  
  trait DropdownMenuProps
    extends StObject
       with StrictDropdownMenuProps
       with /* key */ StringDictionary[Any]
  object DropdownMenuProps {
    
    inline def apply(): DropdownMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownMenuProps]
    }
  }
  
  trait StrictDropdownMenuProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A dropdown menu can open to the left or to the right. */
    var direction: js.UndefOr[left | right] = js.undefined
    
    /** Whether or not the dropdown menu is displayed. */
    var open: js.UndefOr[Boolean] = js.undefined
    
    /** A dropdown menu can scroll. */
    var scrolling: js.UndefOr[Boolean] = js.undefined
  }
  object StrictDropdownMenuProps {
    
    inline def apply(): StrictDropdownMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictDropdownMenuProps]
    }
    
    extension [Self <: StrictDropdownMenuProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDirection(value: left | right): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setScrolling(value: Boolean): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
      
      inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
    }
  }
  
  type _To = FC[DropdownMenuProps]
  
  /* This means you don't have to write `default`, but can instead just say `dropdownMenuMod.foo` */
  override def _to: FC[DropdownMenuProps] = default
}
