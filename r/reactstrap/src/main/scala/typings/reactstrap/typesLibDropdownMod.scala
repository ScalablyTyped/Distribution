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
import typings.reactstrap.reactstrapStrings.append
import typings.reactstrap.reactstrapStrings.prepend
import typings.reactstrap.typesLibUtilsMod.CSSModule
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibDropdownMod {
  
  @JSImport("reactstrap/types/lib/Dropdown", JSImport.Default)
  @js.native
  open class default ()
    extends Component[DropdownProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactstrap.reactstrapStrings.up
    - typings.reactstrap.reactstrapStrings.down
    - typings.reactstrap.reactstrapStrings.start
    - typings.reactstrap.reactstrapStrings.end
  */
  trait Direction extends StObject
  object Direction {
    
    inline def down: typings.reactstrap.reactstrapStrings.down = "down".asInstanceOf[typings.reactstrap.reactstrapStrings.down]
    
    inline def end: typings.reactstrap.reactstrapStrings.end = "end".asInstanceOf[typings.reactstrap.reactstrapStrings.end]
    
    inline def start: typings.reactstrap.reactstrapStrings.start = "start".asInstanceOf[typings.reactstrap.reactstrapStrings.start]
    
    inline def up: typings.reactstrap.reactstrapStrings.up = "up".asInstanceOf[typings.reactstrap.reactstrapStrings.up]
  }
  
  type Dropdown = Component[DropdownProps, js.Object, Any]
  
  trait DropdownProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var a11y: js.UndefOr[Boolean] = js.undefined
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var addonType: js.UndefOr[Boolean | prepend | append] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var direction: js.UndefOr[Direction] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var group: js.UndefOr[Boolean] = js.undefined
    
    var inNavbar: js.UndefOr[Boolean] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var menuRole: js.UndefOr[Boolean | String] = js.undefined
    
    var nav: js.UndefOr[Boolean] = js.undefined
    
    var setActiveFromChild: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
    
    var toggle: js.UndefOr[KeyboardEventHandler[Any] | MouseEventHandler[Any]] = js.undefined
  }
  object DropdownProps {
    
    inline def apply(): DropdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropdownProps] (val x: Self) extends AnyVal {
      
      inline def setA11y(value: Boolean): Self = StObject.set(x, "a11y", value.asInstanceOf[js.Any])
      
      inline def setA11yUndefined: Self = StObject.set(x, "a11y", js.undefined)
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAddonType(value: Boolean | prepend | append): Self = StObject.set(x, "addonType", value.asInstanceOf[js.Any])
      
      inline def setAddonTypeUndefined: Self = StObject.set(x, "addonType", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setInNavbar(value: Boolean): Self = StObject.set(x, "inNavbar", value.asInstanceOf[js.Any])
      
      inline def setInNavbarUndefined: Self = StObject.set(x, "inNavbar", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setMenuRole(value: Boolean | String): Self = StObject.set(x, "menuRole", value.asInstanceOf[js.Any])
      
      inline def setMenuRoleUndefined: Self = StObject.set(x, "menuRole", js.undefined)
      
      inline def setNav(value: Boolean): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
      
      inline def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
      
      inline def setSetActiveFromChild(value: Boolean): Self = StObject.set(x, "setActiveFromChild", value.asInstanceOf[js.Any])
      
      inline def setSetActiveFromChildUndefined: Self = StObject.set(x, "setActiveFromChild", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setToggle(value: KeyboardEvent[Any] | (MouseEvent[Any, NativeMouseEvent]) => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    }
  }
  
  trait UncontrolledDropdownProps
    extends StObject
       with DropdownProps {
    
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    var onToggle: js.UndefOr[
        js.Function2[
          /* event */ KeyboardEvent[Element] | (MouseEvent[Element, NativeMouseEvent]), 
          /* isOpen */ Boolean, 
          Unit
        ]
      ] = js.undefined
  }
  object UncontrolledDropdownProps {
    
    inline def apply(): UncontrolledDropdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UncontrolledDropdownProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UncontrolledDropdownProps] (val x: Self) extends AnyVal {
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setOnToggle(
        value: (/* event */ KeyboardEvent[Element] | (MouseEvent[Element, NativeMouseEvent]), /* isOpen */ Boolean) => Unit
      ): Self = StObject.set(x, "onToggle", js.Any.fromFunction2(value))
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
    }
  }
}
