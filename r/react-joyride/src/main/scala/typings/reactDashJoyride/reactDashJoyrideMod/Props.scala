package typings.reactDashJoyride.reactDashJoyrideMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends OverridableProps {
  /**
    * It will be called when Joyride's state changes. It returns a single parameter with the state.
    */
  var callback: js.UndefOr[js.Function1[/* data */ State, _]] = js.undefined
  /**
    * The tour is played sequentially with the Next button. Defaults to false.
    */
  var continuous: js.UndefOr[Boolean] = js.undefined
  /**
    * Log Joyride's actions to the console. Defaults to false.
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * Run/stop the tour. Defaults to true.
    */
  var run: js.UndefOr[Boolean] = js.undefined
  /**
    * The scroll distance from the element scrollTop value. Defaults to 20.
    */
  var scrollOffset: js.UndefOr[Double] = js.undefined
  /**
    * Scroll the page for the first step. Defaults to false
    */
  var scrollToFirstStep: js.UndefOr[Boolean] = js.undefined
  /**
    * Setting a number here will turn Joyride into controlled mode.
    * You will receive the state events in the callback and you'll have to update this prop by yourself.
    */
  var stepIndex: js.UndefOr[Double] = js.undefined
  /**
    * The tour's steps. Defaults to []
    */
  var steps: js.Array[Step]
}

object Props {
  @scala.inline
  def apply(
    steps: js.Array[Step],
    beaconComponent: ReactNode = null,
    callback: /* data */ State => _ = null,
    continuous: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    disableCloseOnEsc: js.UndefOr[Boolean] = js.undefined,
    disableOverlay: js.UndefOr[Boolean] = js.undefined,
    disableOverlayClose: js.UndefOr[Boolean] = js.undefined,
    disableScrolling: js.UndefOr[Boolean] = js.undefined,
    floaterProps: js.Object = null,
    hideBackButton: js.UndefOr[Boolean] = js.undefined,
    locale: Locale = null,
    run: js.UndefOr[Boolean] = js.undefined,
    scrollOffset: Int | Double = null,
    scrollToFirstStep: js.UndefOr[Boolean] = js.undefined,
    showProgress: js.UndefOr[Boolean] = js.undefined,
    showSkipButton: js.UndefOr[Boolean] = js.undefined,
    spotlightClicks: js.UndefOr[Boolean] = js.undefined,
    spotlightPadding: Int | Double = null,
    stepIndex: Int | Double = null,
    styles: StepStyles = null,
    tooltipComponent: ReactNode = null
  ): Props = {
    val __obj = js.Dynamic.literal(steps = steps)
    if (beaconComponent != null) __obj.updateDynamic("beaconComponent")(beaconComponent.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(disableCloseOnEsc)) __obj.updateDynamic("disableCloseOnEsc")(disableCloseOnEsc)
    if (!js.isUndefined(disableOverlay)) __obj.updateDynamic("disableOverlay")(disableOverlay)
    if (!js.isUndefined(disableOverlayClose)) __obj.updateDynamic("disableOverlayClose")(disableOverlayClose)
    if (!js.isUndefined(disableScrolling)) __obj.updateDynamic("disableScrolling")(disableScrolling)
    if (floaterProps != null) __obj.updateDynamic("floaterProps")(floaterProps)
    if (!js.isUndefined(hideBackButton)) __obj.updateDynamic("hideBackButton")(hideBackButton)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (!js.isUndefined(run)) __obj.updateDynamic("run")(run)
    if (scrollOffset != null) __obj.updateDynamic("scrollOffset")(scrollOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToFirstStep)) __obj.updateDynamic("scrollToFirstStep")(scrollToFirstStep)
    if (!js.isUndefined(showProgress)) __obj.updateDynamic("showProgress")(showProgress)
    if (!js.isUndefined(showSkipButton)) __obj.updateDynamic("showSkipButton")(showSkipButton)
    if (!js.isUndefined(spotlightClicks)) __obj.updateDynamic("spotlightClicks")(spotlightClicks)
    if (spotlightPadding != null) __obj.updateDynamic("spotlightPadding")(spotlightPadding.asInstanceOf[js.Any])
    if (stepIndex != null) __obj.updateDynamic("stepIndex")(stepIndex.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (tooltipComponent != null) __obj.updateDynamic("tooltipComponent")(tooltipComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

