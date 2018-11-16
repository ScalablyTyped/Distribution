package typings
package reactDashToolboxLib.libMenuIconMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IconMenuProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
     * If true, the inner Menu component will be active.
     * @default false
     */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Children to pass through the component.
     */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * Icon font key string or Element to display the opener icon.
     * @default more_vert
     */
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * If true, the icon will show a ripple when is clicked.
     * @default true
     */
  var iconRipple: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * If true, the neutral colors are inverted. Useful if the icon is over a dark background.
     * @default false
     */
  var inverse: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Transferred to the Menu component.
     * @default true
     */
  var menuRipple: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Callback that will be called when the menu is being hidden.
     */
  var onHide: js.UndefOr[js.Function] = js.undefined
  /**
     * Callback that will be invoked when a menu item is selected.
     */
  var onSelect: js.UndefOr[js.Function] = js.undefined
  /**
     * Callback that will be invoked when the menu is being shown.
     */
  var onShow: js.UndefOr[js.Function] = js.undefined
  /**
     * Determines the position of the menu. This property is transferred to the inner Menu component.
     * @default auto
     */
  var position: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.auto | reactDashToolboxLib.reactDashToolboxLibStrings.static | reactDashToolboxLib.reactDashToolboxLibStrings.topLeft | reactDashToolboxLib.reactDashToolboxLibStrings.topRight | reactDashToolboxLib.reactDashToolboxLibStrings.bottomLeft | reactDashToolboxLib.reactDashToolboxLibStrings.bottomRight
  ] = js.undefined
  /**
     * If true, the menu will keep a value to highlight the active child item.
     * @default false
     */
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Used for selectable menus. Indicates the current selected value so the child item with this value can be highlighted.
     */
  var selected: js.UndefOr[js.Any] = js.undefined
  /**
     * Classnames object defining the component style.
     */
  var theme: js.UndefOr[IconMenuTheme] = js.undefined
}

