package typings.reactToolbox.libTooltipMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.reactToolbox.reactToolboxStrings.bottom
import typings.reactToolbox.reactToolboxStrings.horizontal
import typings.reactToolbox.reactToolboxStrings.left
import typings.reactToolbox.reactToolboxStrings.right
import typings.reactToolbox.reactToolboxStrings.top
import typings.reactToolbox.reactToolboxStrings.vertical
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
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter.asInstanceOf[js.Any])
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipDelay != null) __obj.updateDynamic("tooltipDelay")(tooltipDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipHideOnClick)) __obj.updateDynamic("tooltipHideOnClick")(tooltipHideOnClick.asInstanceOf[js.Any])
    if (tooltipPosition != null) __obj.updateDynamic("tooltipPosition")(tooltipPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipShowOnClick)) __obj.updateDynamic("tooltipShowOnClick")(tooltipShowOnClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}

