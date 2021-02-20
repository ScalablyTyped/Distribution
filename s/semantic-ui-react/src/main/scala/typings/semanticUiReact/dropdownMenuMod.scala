package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownMenuMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownMenu", JSImport.Default)
  @js.native
  val default: StatelessComponent[DropdownMenuProps] = js.native
  
  @js.native
  trait DropdownMenuProps
    extends StrictDropdownMenuProps
       with /* key */ StringDictionary[js.Any]
  object DropdownMenuProps {
    
    @scala.inline
    def apply(): DropdownMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownMenuProps]
    }
  }
  
  @js.native
  trait StrictDropdownMenuProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** A dropdown menu can open to the left or to the right. */
    var direction: js.UndefOr[left | right] = js.native
    
    /** Whether or not the dropdown menu is displayed. */
    var open: js.UndefOr[Boolean] = js.native
    
    /** A dropdown menu can scroll. */
    var scrolling: js.UndefOr[Boolean] = js.native
  }
  object StrictDropdownMenuProps {
    
    @scala.inline
    def apply(): StrictDropdownMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictDropdownMenuProps]
    }
    
    @scala.inline
    implicit class StrictDropdownMenuPropsMutableBuilder[Self <: StrictDropdownMenuProps] (val x: Self) extends AnyVal {
      
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
      def setDirection(value: left | right): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setScrolling(value: Boolean): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
    }
  }
  
  type _To = StatelessComponent[DropdownMenuProps]
  
  /* This means you don't have to write `default`, but can instead just say `dropdownMenuMod.foo` */
  override def _to: StatelessComponent[DropdownMenuProps] = default
}
