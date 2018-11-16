package typings
package reactDashToolboxLib.libTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TooltipProps
  extends /**
   * Additional attributes passed to composed component.
   */
/* key */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
     * Additional class added to composed component.
     */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Callback to be invoked when Component is clicked.
     */
  var onClick: js.UndefOr[js.Function] = js.undefined
  /**
     * Callback called when the mouse enters the Component.
     */
  var onMouseEnter: js.UndefOr[js.Function] = js.undefined
  /**
     * Callback called when the mouse leaves the Component.
     */
  var onMouseLeave: js.UndefOr[js.Function] = js.undefined
  /**
     * Classnames object defining the component style.
     */
  var theme: js.UndefOr[TooltipTheme] = js.undefined
  /**
     * The text (or node) used for the tooltip.
     */
  var tooltip: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * Amount of time in miliseconds spent before the tooltip is visible.
     * @default 0
     */
  var tooltipDelay: js.UndefOr[scala.Double] = js.undefined
  /**
     * If true, the Tooltip hides after a click in the host component.
     * @default true
     */
  var tooltipHideOnClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Tooltip position.
     * @default "vertical"
     */
  var tooltipPosition: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.bottom | reactDashToolboxLib.reactDashToolboxLibStrings.top | reactDashToolboxLib.reactDashToolboxLibStrings.left | reactDashToolboxLib.reactDashToolboxLibStrings.right | reactDashToolboxLib.reactDashToolboxLibStrings.horizontal | reactDashToolboxLib.reactDashToolboxLibStrings.vertical
  ] = js.undefined
  /**
     * Determines the tooltip should be toggled when clicked. This is useful for mobile where there is no mouse enter.
     * @default false
     */
  var tooltipShowOnClick: js.UndefOr[scala.Boolean] = js.undefined
}

