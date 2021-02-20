package typings.reactBootstrap

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactType
import typings.react.mod.SyntheticEvent
import typings.reactBootstrap.anon.Source
import typings.reactBootstrap.mod.SelectCallback
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownMod {
  
  @JSImport("react-bootstrap/lib/Dropdown", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[DropdownProps, js.Object, js.Any]
  @JSImport("react-bootstrap/lib/Dropdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Dropdown", "Menu")
  @js.native
  class Menu ()
    extends typings.reactBootstrap.dropdownMenuMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Dropdown", "Menu")
  @js.native
  def Menu: Instantiable0[typings.reactBootstrap.dropdownMenuMod.^] = js.native
  @scala.inline
  def Menu_=(x: Instantiable0[typings.reactBootstrap.dropdownMenuMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Menu")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Dropdown", "Toggle")
  @js.native
  class Toggle ()
    extends typings.reactBootstrap.dropdownToggleMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Dropdown", "Toggle")
  @js.native
  def Toggle: Instantiable0[typings.reactBootstrap.dropdownToggleMod.^] = js.native
  @scala.inline
  def Toggle_=(x: Instantiable0[typings.reactBootstrap.dropdownToggleMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Toggle")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Dropdown
    extends Component[DropdownProps, js.Object, js.Any]
  
  @js.native
  trait DropdownBaseProps extends StObject {
    
    var bsClass: js.UndefOr[String] = js.native
    
    var componentClass: js.UndefOr[ReactType[_]] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var dropup: js.UndefOr[Boolean] = js.native
    
    var id: String = js.native
    
    var onClose: js.UndefOr[js.Function] = js.native
    
    var onSelect: js.UndefOr[SelectCallback] = js.native
    
    var onToggle: js.UndefOr[
        js.Function3[
          /* isOpen */ Boolean, 
          /* event */ SyntheticEvent[Element, Event], 
          /* metadata */ Source, 
          Unit
        ]
      ] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var pullRight: js.UndefOr[Boolean] = js.native
    
    var role: js.UndefOr[String] = js.native
  }
  object DropdownBaseProps {
    
    @scala.inline
    def apply(id: String): DropdownBaseProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownBaseProps]
    }
    
    @scala.inline
    implicit class DropdownBasePropsMutableBuilder[Self <: DropdownBaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setComponentClass(value: ReactType[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDropup(value: Boolean): Self = StObject.set(x, "dropup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropupUndefined: Self = StObject.set(x, "dropup", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SelectCallback): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnToggle(
        value: (/* isOpen */ Boolean, /* event */ SyntheticEvent[Element, Event], /* metadata */ Source) => Unit
      ): Self = StObject.set(x, "onToggle", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPullRight(value: Boolean): Self = StObject.set(x, "pullRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRightUndefined: Self = StObject.set(x, "pullRight", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
  
  type DropdownProps = DropdownBaseProps with HTMLProps[Dropdown]
}
