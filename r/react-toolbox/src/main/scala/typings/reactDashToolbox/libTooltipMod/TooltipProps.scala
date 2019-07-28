package typings.reactDashToolbox.libTooltipMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import typings.reactDashToolbox.reactDashToolboxStrings.bottom
import typings.reactDashToolbox.reactDashToolboxStrings.horizontal
import typings.reactDashToolbox.reactDashToolboxStrings.left
import typings.reactDashToolbox.reactDashToolboxStrings.right
import typings.reactDashToolbox.reactDashToolboxStrings.top
import typings.reactDashToolbox.reactDashToolboxStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps
  extends /**
  * Additional attributes passed to composed component.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * Additional class added to composed component.
    */
  var className: js.UndefOr[String] = js.undefined
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
  var tooltip: js.UndefOr[ReactNode] = js.undefined
  /**
    * Amount of time in miliseconds spent before the tooltip is visible.
    * @default 0
    */
  var tooltipDelay: js.UndefOr[Double] = js.undefined
  /**
    * If true, the Tooltip hides after a click in the host component.
    * @default true
    */
  var tooltipHideOnClick: js.UndefOr[Boolean] = js.undefined
  /**
    * Tooltip position.
    * @default "vertical"
    */
  var tooltipPosition: js.UndefOr[bottom | top | left | right | horizontal | vertical] = js.undefined
  /**
    * Determines the tooltip should be toggled when clicked. This is useful for mobile where there is no mouse enter.
    * @default false
    */
  var tooltipShowOnClick: js.UndefOr[Boolean] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Additional attributes passed to composed component.
    */
  /* key */ StringDictionary[js.Any] = null,
    className: String = null,
    onClick: js.Function = null,
    onMouseEnter: js.Function = null,
    onMouseLeave: js.Function = null,
    theme: TooltipTheme = null,
    tooltip: ReactNode = null,
    tooltipDelay: Int | Double = null,
    tooltipHideOnClick: js.UndefOr[Boolean] = js.undefined,
    tooltipPosition: bottom | top | left | right | horizontal | vertical = null,
    tooltipShowOnClick: js.UndefOr[Boolean] = js.undefined
  ): TooltipProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipDelay != null) __obj.updateDynamic("tooltipDelay")(tooltipDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipHideOnClick)) __obj.updateDynamic("tooltipHideOnClick")(tooltipHideOnClick)
    if (tooltipPosition != null) __obj.updateDynamic("tooltipPosition")(tooltipPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipShowOnClick)) __obj.updateDynamic("tooltipShowOnClick")(tooltipShowOnClick)
    __obj.asInstanceOf[TooltipProps]
  }
}

