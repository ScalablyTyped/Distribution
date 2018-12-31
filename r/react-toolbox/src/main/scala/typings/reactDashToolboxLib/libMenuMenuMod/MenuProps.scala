package typings
package reactDashToolboxLib.libMenuMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
    * If true, the menu will be displayed as opened by default.
    * @default false
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Callback that will be called when the menu is being hidden.
    */
  var onHide: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * Callback that will be invoked when a menu item is selected.
    */
  var onSelect: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * Callback that will be invoked when the menu is being shown.
    */
  var onShow: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * If true the menu wrapper will show an outline with a soft shadow.
    * @default true
    */
  var outline: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Determine the position of the menu. With static value the menu will be always shown, auto means that the it will decide the opening direction based on the current position. To force a position use topLeft, topRight, bottomLeft, bottomRight.
    * @default static
    */
  var position: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.auto | reactDashToolboxLib.reactDashToolboxLibStrings.static | reactDashToolboxLib.reactDashToolboxLibStrings.topLeft | reactDashToolboxLib.reactDashToolboxLibStrings.topRight | reactDashToolboxLib.reactDashToolboxLibStrings.bottomLeft | reactDashToolboxLib.reactDashToolboxLibStrings.bottomRight
  ] = js.undefined
  /**
    * If true, the menu items will show a ripple effect on click.
    * @default true
    */
  var ripple: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, the menu will keep a value to highlight the active child item.
    * @default true
    */
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Used for selectable menus. Indicates the current selected value so the child item with this value can be highlighted.
    */
  var selected: js.UndefOr[js.Any] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[MenuTheme] = js.undefined
}

