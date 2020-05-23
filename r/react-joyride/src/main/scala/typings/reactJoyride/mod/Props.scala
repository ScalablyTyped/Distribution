package typings.reactJoyride.mod

import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends CommonProps {
  var callback: js.UndefOr[js.Function1[/* data */ CallBackProps, Unit]] = js.undefined
  var continuous: js.UndefOr[Boolean] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var getHelpers: js.UndefOr[js.Function1[/* helpers */ StoreHelpers, _]] = js.undefined
  var run: js.UndefOr[Boolean] = js.undefined
  var scrollOffset: js.UndefOr[Double] = js.undefined
  var scrollToFirstStep: js.UndefOr[Boolean] = js.undefined
  var stepIndex: js.UndefOr[Double] = js.undefined
  var steps: js.Array[Step]
}

object Props {
  @scala.inline
  def apply(
    steps: js.Array[Step],
    beaconComponent: ElementType[BeaconRenderProps] = null,
    callback: /* data */ CallBackProps => Unit = null,
    continuous: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    disableCloseOnEsc: js.UndefOr[Boolean] = js.undefined,
    disableOverlay: js.UndefOr[Boolean] = js.undefined,
    disableOverlayClose: js.UndefOr[Boolean] = js.undefined,
    disableScrollParentFix: js.UndefOr[Boolean] = js.undefined,
    disableScrolling: js.UndefOr[Boolean] = js.undefined,
    floaterProps: FloaterProps = null,
    getHelpers: /* helpers */ StoreHelpers => _ = null,
    hideBackButton: js.UndefOr[Boolean] = js.undefined,
    locale: Locale = null,
    run: js.UndefOr[Boolean] = js.undefined,
    scrollOffset: js.UndefOr[Double] = js.undefined,
    scrollToFirstStep: js.UndefOr[Boolean] = js.undefined,
    showProgress: js.UndefOr[Boolean] = js.undefined,
    showSkipButton: js.UndefOr[Boolean] = js.undefined,
    spotlightClicks: js.UndefOr[Boolean] = js.undefined,
    spotlightPadding: js.UndefOr[Double] = js.undefined,
    stepIndex: js.UndefOr[Double] = js.undefined,
    styles: Styles = null,
    tooltipComponent: ElementType[TooltipRenderProps] = null
  ): Props = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    if (beaconComponent != null) __obj.updateDynamic("beaconComponent")(beaconComponent.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCloseOnEsc)) __obj.updateDynamic("disableCloseOnEsc")(disableCloseOnEsc.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableOverlay)) __obj.updateDynamic("disableOverlay")(disableOverlay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableOverlayClose)) __obj.updateDynamic("disableOverlayClose")(disableOverlayClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScrollParentFix)) __obj.updateDynamic("disableScrollParentFix")(disableScrollParentFix.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScrolling)) __obj.updateDynamic("disableScrolling")(disableScrolling.get.asInstanceOf[js.Any])
    if (floaterProps != null) __obj.updateDynamic("floaterProps")(floaterProps.asInstanceOf[js.Any])
    if (getHelpers != null) __obj.updateDynamic("getHelpers")(js.Any.fromFunction1(getHelpers))
    if (!js.isUndefined(hideBackButton)) __obj.updateDynamic("hideBackButton")(hideBackButton.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(run)) __obj.updateDynamic("run")(run.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollOffset)) __obj.updateDynamic("scrollOffset")(scrollOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToFirstStep)) __obj.updateDynamic("scrollToFirstStep")(scrollToFirstStep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showProgress)) __obj.updateDynamic("showProgress")(showProgress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showSkipButton)) __obj.updateDynamic("showSkipButton")(showSkipButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spotlightClicks)) __obj.updateDynamic("spotlightClicks")(spotlightClicks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spotlightPadding)) __obj.updateDynamic("spotlightPadding")(spotlightPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stepIndex)) __obj.updateDynamic("stepIndex")(stepIndex.get.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tooltipComponent != null) __obj.updateDynamic("tooltipComponent")(tooltipComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

