package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.reactstrap.mod.CSSModule
import typings.reactstrap.reactstrapStrings.append
import typings.reactstrap.reactstrapStrings.prepend
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownMod {
  
  @JSImport("reactstrap/lib/Dropdown", JSImport.Default)
  @js.native
  class default ()
    extends Component[DropdownProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactstrap.reactstrapStrings.up
    - typings.reactstrap.reactstrapStrings.down
    - typings.reactstrap.reactstrapStrings.left
    - typings.reactstrap.reactstrapStrings.right
  */
  trait Direction extends StObject
  object Direction {
    
    @scala.inline
    def down: typings.reactstrap.reactstrapStrings.down = "down".asInstanceOf[typings.reactstrap.reactstrapStrings.down]
    
    @scala.inline
    def left: typings.reactstrap.reactstrapStrings.left = "left".asInstanceOf[typings.reactstrap.reactstrapStrings.left]
    
    @scala.inline
    def right: typings.reactstrap.reactstrapStrings.right = "right".asInstanceOf[typings.reactstrap.reactstrapStrings.right]
    
    @scala.inline
    def up: typings.reactstrap.reactstrapStrings.up = "up".asInstanceOf[typings.reactstrap.reactstrapStrings.up]
  }
  
  type Dropdown = Component[DropdownProps, js.Object, js.Any]
  
  @js.native
  trait DropdownProps
    extends HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var a11y: js.UndefOr[Boolean] = js.native
    
    var active: js.UndefOr[Boolean] = js.native
    
    var addonType: js.UndefOr[Boolean | prepend | append] = js.native
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var direction: js.UndefOr[Direction] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var group: js.UndefOr[Boolean] = js.native
    
    var inNavbar: js.UndefOr[Boolean] = js.native
    
    var isOpen: js.UndefOr[Boolean] = js.native
    
    var nav: js.UndefOr[Boolean] = js.native
    
    var setActiveFromChild: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[String] = js.native
    
    var tag: js.UndefOr[ElementType[_]] = js.native
    
    var toggle: js.UndefOr[KeyboardEventHandler[_] | MouseEventHandler[_]] = js.native
  }
  object DropdownProps {
    
    @scala.inline
    def apply(): DropdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownProps]
    }
    
    @scala.inline
    implicit class DropdownPropsMutableBuilder[Self <: DropdownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA11y(value: Boolean): Self = StObject.set(x, "a11y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA11yUndefined: Self = StObject.set(x, "a11y", js.undefined)
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAddonType(value: Boolean | prepend | append): Self = StObject.set(x, "addonType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddonTypeUndefined: Self = StObject.set(x, "addonType", js.undefined)
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setInNavbar(value: Boolean): Self = StObject.set(x, "inNavbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInNavbarUndefined: Self = StObject.set(x, "inNavbar", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setNav(value: Boolean): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
      
      @scala.inline
      def setSetActiveFromChild(value: Boolean): Self = StObject.set(x, "setActiveFromChild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetActiveFromChildUndefined: Self = StObject.set(x, "setActiveFromChild", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTag(value: ElementType[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setToggle(value: KeyboardEvent[_] | (MouseEvent[_, NativeMouseEvent]) => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    }
  }
  
  @js.native
  trait UncontrolledDropdownProps extends DropdownProps {
    
    var defaultOpen: js.UndefOr[Boolean] = js.native
    
    var onToggle: js.UndefOr[
        js.Function2[
          /* event */ KeyboardEvent[Element] | (MouseEvent[Element, NativeMouseEvent]), 
          /* isOpen */ Boolean, 
          Unit
        ]
      ] = js.native
  }
  object UncontrolledDropdownProps {
    
    @scala.inline
    def apply(): UncontrolledDropdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UncontrolledDropdownProps]
    }
    
    @scala.inline
    implicit class UncontrolledDropdownPropsMutableBuilder[Self <: UncontrolledDropdownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      @scala.inline
      def setOnToggle(
        value: (/* event */ KeyboardEvent[Element] | (MouseEvent[Element, NativeMouseEvent]), /* isOpen */ Boolean) => Unit
      ): Self = StObject.set(x, "onToggle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
    }
  }
}
