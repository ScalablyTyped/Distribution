package typings.reactDashJoyride.reactDashJoyrideMod

import typings.react.reactMod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonProps extends js.Object {
  var beaconComponent: js.UndefOr[ElementType[BeaconRenderProps]] = js.undefined
  var disableCloseOnEsc: js.UndefOr[Boolean] = js.undefined
  var disableOverlay: js.UndefOr[Boolean] = js.undefined
  var disableOverlayClose: js.UndefOr[Boolean] = js.undefined
  var disableScrollParentFix: js.UndefOr[Boolean] = js.undefined
  var disableScrolling: js.UndefOr[Boolean] = js.undefined
  var floaterProps: js.UndefOr[FloaterProps] = js.undefined
  var hideBackButton: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[Locale] = js.undefined
  var showProgress: js.UndefOr[Boolean] = js.undefined
  var showSkipButton: js.UndefOr[Boolean] = js.undefined
  var spotlightClicks: js.UndefOr[Boolean] = js.undefined
  var spotlightPadding: js.UndefOr[Double] = js.undefined
  var styles: js.UndefOr[Styles] = js.undefined
  var tooltipComponent: js.UndefOr[ElementType[TooltipRenderProps]] = js.undefined
}

object CommonProps {
  @scala.inline
  def apply(
    beaconComponent: ElementType[BeaconRenderProps] = null,
    disableCloseOnEsc: js.UndefOr[Boolean] = js.undefined,
    disableOverlay: js.UndefOr[Boolean] = js.undefined,
    disableOverlayClose: js.UndefOr[Boolean] = js.undefined,
    disableScrollParentFix: js.UndefOr[Boolean] = js.undefined,
    disableScrolling: js.UndefOr[Boolean] = js.undefined,
    floaterProps: FloaterProps = null,
    hideBackButton: js.UndefOr[Boolean] = js.undefined,
    locale: Locale = null,
    showProgress: js.UndefOr[Boolean] = js.undefined,
    showSkipButton: js.UndefOr[Boolean] = js.undefined,
    spotlightClicks: js.UndefOr[Boolean] = js.undefined,
    spotlightPadding: Int | Double = null,
    styles: Styles = null,
    tooltipComponent: ElementType[TooltipRenderProps] = null
  ): CommonProps = {
    val __obj = js.Dynamic.literal()
    if (beaconComponent != null) __obj.updateDynamic("beaconComponent")(beaconComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCloseOnEsc)) __obj.updateDynamic("disableCloseOnEsc")(disableCloseOnEsc.asInstanceOf[js.Any])
    if (!js.isUndefined(disableOverlay)) __obj.updateDynamic("disableOverlay")(disableOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(disableOverlayClose)) __obj.updateDynamic("disableOverlayClose")(disableOverlayClose.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScrollParentFix)) __obj.updateDynamic("disableScrollParentFix")(disableScrollParentFix.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScrolling)) __obj.updateDynamic("disableScrolling")(disableScrolling.asInstanceOf[js.Any])
    if (floaterProps != null) __obj.updateDynamic("floaterProps")(floaterProps.asInstanceOf[js.Any])
    if (!js.isUndefined(hideBackButton)) __obj.updateDynamic("hideBackButton")(hideBackButton.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(showProgress)) __obj.updateDynamic("showProgress")(showProgress.asInstanceOf[js.Any])
    if (!js.isUndefined(showSkipButton)) __obj.updateDynamic("showSkipButton")(showSkipButton.asInstanceOf[js.Any])
    if (!js.isUndefined(spotlightClicks)) __obj.updateDynamic("spotlightClicks")(spotlightClicks.asInstanceOf[js.Any])
    if (spotlightPadding != null) __obj.updateDynamic("spotlightPadding")(spotlightPadding.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tooltipComponent != null) __obj.updateDynamic("tooltipComponent")(tooltipComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonProps]
  }
}

