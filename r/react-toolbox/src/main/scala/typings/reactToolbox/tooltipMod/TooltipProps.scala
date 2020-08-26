package typings.reactToolbox.tooltipMod

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

@js.native
trait TooltipProps
  extends /**
  * Additional properties passed to Radio container.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * Additional class added to composed component.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Callback to be invoked when Component is clicked.
    */
  var onClick: js.UndefOr[js.Function] = js.native
  /**
    * Callback called when the mouse enters the Component.
    */
  var onMouseEnter: js.UndefOr[js.Function] = js.native
  /**
    * Callback called when the mouse leaves the Component.
    */
  var onMouseLeave: js.UndefOr[js.Function] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[TooltipTheme] = js.native
  /**
    * The text (or node) used for the tooltip.
    */
  var tooltip: js.UndefOr[ReactNode] = js.native
  /**
    * Amount of time in miliseconds spent before the tooltip is visible.
    * @default 0
    */
  var tooltipDelay: js.UndefOr[Double] = js.native
  /**
    * If true, the Tooltip hides after a click in the host component.
    * @default true
    */
  var tooltipHideOnClick: js.UndefOr[Boolean] = js.native
  /**
    * Tooltip position.
    * @default "vertical"
    */
  var tooltipPosition: js.UndefOr[bottom | top | left | right | horizontal | vertical] = js.native
  /**
    * Determines the tooltip should be toggled when clicked. This is useful for mobile where there is no mouse enter.
    * @default false
    */
  var tooltipShowOnClick: js.UndefOr[Boolean] = js.native
}

object TooltipProps {
  @scala.inline
  def apply(): TooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipProps]
  }
  @scala.inline
  implicit class TooltipPropsOps[Self <: TooltipProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setOnClick(value: js.Function): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: js.Function): Self = this.set("onMouseEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: js.Function): Self = this.set("onMouseLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setTheme(value: TooltipTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTooltip(value: ReactNode): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTooltipDelay(value: Double): Self = this.set("tooltipDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipDelay: Self = this.set("tooltipDelay", js.undefined)
    @scala.inline
    def setTooltipHideOnClick(value: Boolean): Self = this.set("tooltipHideOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipHideOnClick: Self = this.set("tooltipHideOnClick", js.undefined)
    @scala.inline
    def setTooltipPosition(value: bottom | top | left | right | horizontal | vertical): Self = this.set("tooltipPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipPosition: Self = this.set("tooltipPosition", js.undefined)
    @scala.inline
    def setTooltipShowOnClick(value: Boolean): Self = this.set("tooltipShowOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipShowOnClick: Self = this.set("tooltipShowOnClick", js.undefined)
  }
  
}

