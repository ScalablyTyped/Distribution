package typings.protonNative.mod

import typings.protonNative.protonNativeStrings.About
import typings.protonNative.protonNativeStrings.Check
import typings.protonNative.protonNativeStrings.Item
import typings.protonNative.protonNativeStrings.Preferences
import typings.protonNative.protonNativeStrings.Quit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuItemProps extends StObject {
  
  /**
    * If the type is `Check`, then set whether it is checked or not.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The text to display for the menu item.
    */
  var children: js.UndefOr[String] = js.undefined
  
  /**
    * Called when the menu item is clicked. If the type is `Check`, then it passes whether it is checked as an argument.
    */
  var onClick: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
  
  /**
    * How the menu item is displayed.
    *
    * - `Check` - a checkable option in the menu.
    * - `Quit` - a Quit button. This accepts no text.
    * - `About` - an About button. This accepts no text.
    * - `Preferences` - a Preferences button. This accepts no text.
    * - `Separator` - a Separator between menu items. This accepts no text.
    * - `Item` - a normal menu button. This is the default.
    */
  var `type`: js.UndefOr[
    Check | Quit | About | Preferences | typings.protonNative.protonNativeStrings.Separator | Item
  ] = js.undefined
}
object MenuItemProps {
  
  @scala.inline
  def apply(): MenuItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemProps]
  }
  
  @scala.inline
  implicit class MenuItemPropsMutableBuilder[Self <: MenuItemProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* checked */ Boolean => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setType(
      value: Check | Quit | About | Preferences | typings.protonNative.protonNativeStrings.Separator | Item
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
