package typings.reactMdMenu

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactMdAppBar.useInheritContextMod.AppBarColorInherit
import typings.reactMdButton.buttonMod.ButtonProps
import typings.reactMdMenu.reactMdMenuStrings.`true`
import typings.reactMdMenu.reactMdMenuStrings.menu
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuButtonMod {
  
  @JSImport("@react-md/menu/types/MenuButton", "MenuButton")
  @js.native
  val MenuButton: ForwardRefExoticComponent[MenuButtonProps & RefAttributes[HTMLButtonElement]] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactMdAppBar.useActionClassNameMod.AppBarActionClassNameProps because var conflicts: className. Inlined first, last */ trait MenuButtonProps
    extends StObject
       with ButtonProps
       with AppBarColorInherit {
    
    /**
      * This should probably be left at the default of `"menu"`, but can also be a
      * true string.  This is required for menu a11y.
      */
    @JSName("aria-haspopup")
    var `aria-haspopup_MenuButtonProps`: js.UndefOr[menu | `true` | typings.reactMdMenu.reactMdMenuBooleans.`true`] = js.undefined
    
    /**
      * Boolean if the menu button should be rendered as an `AppBarAction` button
      * instead of a default button. This will also be considered `true` if the
      * `first`, `last`, or `inheritColor` props are `true`.
      */
    var asAppBarAction: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the dropdown icon should be removed from the button. The icon
      * will always be removed for icon buttons.
      */
    var disableDropdownIcon: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The icon to show after the children in the button when the `buttonType` is
      * not set to `"icon"`.
      */
    var dropdownIcon: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Boolean if this is the first action within the app bar. This is really just
      * used to automatically right-align all the actions by applying `margin-left:
      * auto` to this action.
      */
    var first: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An id for the button. This is required so that the `Menu` can be positioned
      * relative to this component.
      */
    @JSName("id")
    var id_MenuButtonProps: String
    
    /**
      * Boolean if this is the last action within the app bar's row. This will just
      * apply the `$rmd-app-bar-lr-margin` as `margin-right`.
      *
      * NOTE: This should not be used when using an overflow menu.
      */
    var last: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the menu is currently visible. This is requied for `a11y` as it
      * will automatically set the `"aria-expanded"` prop to the correct value when
      * needed.
      */
    var visible: Boolean
  }
  object MenuButtonProps {
    
    @scala.inline
    def apply(id: String, visible: Boolean): MenuButtonProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuButtonProps]
    }
    
    @scala.inline
    implicit class MenuButtonPropsMutableBuilder[Self <: MenuButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-haspopup`(value: menu | `true` | typings.reactMdMenu.reactMdMenuBooleans.`true`): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      @scala.inline
      def setAsAppBarAction(value: Boolean): Self = StObject.set(x, "asAppBarAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsAppBarActionUndefined: Self = StObject.set(x, "asAppBarAction", js.undefined)
      
      @scala.inline
      def setDisableDropdownIcon(value: Boolean): Self = StObject.set(x, "disableDropdownIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableDropdownIconUndefined: Self = StObject.set(x, "disableDropdownIcon", js.undefined)
      
      @scala.inline
      def setDropdownIcon(value: ReactNode): Self = StObject.set(x, "dropdownIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownIconUndefined: Self = StObject.set(x, "dropdownIcon", js.undefined)
      
      @scala.inline
      def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
