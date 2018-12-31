package typings
package reactDashToolboxLib.libMenuMenuItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
    * The text to include in the menu item. Required.
    */
  var caption: java.lang.String
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * If true, the item will be displayed as disabled and is not selectable.
    * @default false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Icon font key string or Element to display in the right side of the option.
    */
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Transferred from the Menu component for selectable menus. Indicates if it's the current active option.
    * @default false
    */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Displays shortcut text on the right side of the caption attribute.
    */
  var shortcut: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[MenuItemTheme] = js.undefined
  /**
    * Passed down to the root element
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

