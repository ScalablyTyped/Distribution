package typings.storybookComponents.anon

import typings.popperJs.mod.Modifiers
import typings.popperJs.mod.Placement
import typings.react.mod.ReactNode
import typings.storybookComponents.storybookComponentsStrings.`right-click`
import typings.storybookComponents.storybookComponentsStrings.click
import typings.storybookComponents.storybookComponentsStrings.hover
import typings.storybookComponents.storybookComponentsStrings.none
import typings.storybookComponents.withTooltipMod.WithHideFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @storybook/components.@storybook/components/dist/tooltip/WithTooltip.WithTooltipPureProps & {  startOpen :boolean | undefined} */
@js.native
trait WithTooltipPurePropsstart extends js.Object {
  var children: ReactNode = js.native
  var closeOnClick: js.UndefOr[Boolean] = js.native
  var hasChrome: js.UndefOr[Boolean] = js.native
  var modifiers: js.UndefOr[Modifiers] = js.native
  var onDoubleClick: js.UndefOr[js.Function0[Unit]] = js.native
  var onVisibilityChange: js.UndefOr[js.Function1[/* visibility */ Boolean, Unit]] = js.native
  var placement: js.UndefOr[Placement] = js.native
  var startOpen: js.UndefOr[Boolean] = js.native
  var svg: js.UndefOr[Boolean] = js.native
  var tooltip: ReactNode | (js.Function1[/* p */ WithHideFn, ReactNode]) = js.native
  var tooltipShown: js.UndefOr[Boolean] = js.native
  var trigger: js.UndefOr[none | hover | click | `right-click`] = js.native
}

object WithTooltipPurePropsstart {
  @scala.inline
  def apply(): WithTooltipPurePropsstart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithTooltipPurePropsstart]
  }
  @scala.inline
  implicit class WithTooltipPurePropsstartOps[Self <: WithTooltipPurePropsstart] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = this.set("closeOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnClick: Self = this.set("closeOnClick", js.undefined)
    @scala.inline
    def setHasChrome(value: Boolean): Self = this.set("hasChrome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasChrome: Self = this.set("hasChrome", js.undefined)
    @scala.inline
    def setModifiers(value: Modifiers): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    @scala.inline
    def setOnDoubleClick(value: () => Unit): Self = this.set("onDoubleClick", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", js.undefined)
    @scala.inline
    def setOnVisibilityChange(value: /* visibility */ Boolean => Unit): Self = this.set("onVisibilityChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVisibilityChange: Self = this.set("onVisibilityChange", js.undefined)
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setStartOpen(value: Boolean): Self = this.set("startOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartOpen: Self = this.set("startOpen", js.undefined)
    @scala.inline
    def setSvg(value: Boolean): Self = this.set("svg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvg: Self = this.set("svg", js.undefined)
    @scala.inline
    def setTooltipFunction1(value: /* p */ WithHideFn => ReactNode): Self = this.set("tooltip", js.Any.fromFunction1(value))
    @scala.inline
    def setTooltip(value: ReactNode | (js.Function1[/* p */ WithHideFn, ReactNode])): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTooltipShown(value: Boolean): Self = this.set("tooltipShown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipShown: Self = this.set("tooltipShown", js.undefined)
    @scala.inline
    def setTrigger(value: none | hover | click | `right-click`): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
  }
  
}

