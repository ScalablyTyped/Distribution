package typings.reactJoyride.mod

import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonProps extends js.Object {
  var beaconComponent: js.UndefOr[ElementType[BeaconRenderProps]] = js.native
  var disableCloseOnEsc: js.UndefOr[Boolean] = js.native
  var disableOverlay: js.UndefOr[Boolean] = js.native
  var disableOverlayClose: js.UndefOr[Boolean] = js.native
  var disableScrollParentFix: js.UndefOr[Boolean] = js.native
  var disableScrolling: js.UndefOr[Boolean] = js.native
  var floaterProps: js.UndefOr[FloaterProps] = js.native
  var hideBackButton: js.UndefOr[Boolean] = js.native
  var locale: js.UndefOr[Locale] = js.native
  var showProgress: js.UndefOr[Boolean] = js.native
  var showSkipButton: js.UndefOr[Boolean] = js.native
  var spotlightClicks: js.UndefOr[Boolean] = js.native
  var spotlightPadding: js.UndefOr[Double] = js.native
  var styles: js.UndefOr[Styles] = js.native
  var tooltipComponent: js.UndefOr[ElementType[TooltipRenderProps]] = js.native
}

object CommonProps {
  @scala.inline
  def apply(): CommonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonProps]
  }
  @scala.inline
  implicit class CommonPropsOps[Self <: CommonProps] (val x: Self) extends AnyVal {
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
    def setBeaconComponent(value: ElementType[BeaconRenderProps]): Self = this.set("beaconComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeaconComponent: Self = this.set("beaconComponent", js.undefined)
    @scala.inline
    def setDisableCloseOnEsc(value: Boolean): Self = this.set("disableCloseOnEsc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableCloseOnEsc: Self = this.set("disableCloseOnEsc", js.undefined)
    @scala.inline
    def setDisableOverlay(value: Boolean): Self = this.set("disableOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableOverlay: Self = this.set("disableOverlay", js.undefined)
    @scala.inline
    def setDisableOverlayClose(value: Boolean): Self = this.set("disableOverlayClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableOverlayClose: Self = this.set("disableOverlayClose", js.undefined)
    @scala.inline
    def setDisableScrollParentFix(value: Boolean): Self = this.set("disableScrollParentFix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableScrollParentFix: Self = this.set("disableScrollParentFix", js.undefined)
    @scala.inline
    def setDisableScrolling(value: Boolean): Self = this.set("disableScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableScrolling: Self = this.set("disableScrolling", js.undefined)
    @scala.inline
    def setFloaterProps(value: FloaterProps): Self = this.set("floaterProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloaterProps: Self = this.set("floaterProps", js.undefined)
    @scala.inline
    def setHideBackButton(value: Boolean): Self = this.set("hideBackButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideBackButton: Self = this.set("hideBackButton", js.undefined)
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setShowProgress(value: Boolean): Self = this.set("showProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowProgress: Self = this.set("showProgress", js.undefined)
    @scala.inline
    def setShowSkipButton(value: Boolean): Self = this.set("showSkipButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSkipButton: Self = this.set("showSkipButton", js.undefined)
    @scala.inline
    def setSpotlightClicks(value: Boolean): Self = this.set("spotlightClicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotlightClicks: Self = this.set("spotlightClicks", js.undefined)
    @scala.inline
    def setSpotlightPadding(value: Double): Self = this.set("spotlightPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotlightPadding: Self = this.set("spotlightPadding", js.undefined)
    @scala.inline
    def setStyles(value: Styles): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTooltipComponent(value: ElementType[TooltipRenderProps]): Self = this.set("tooltipComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipComponent: Self = this.set("tooltipComponent", js.undefined)
  }
  
}

