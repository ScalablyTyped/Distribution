package typings
package reactDashJoyrideLib.reactDashJoyrideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step extends OverridableProps {
  /**
    * The tooltip's body.
    */
  var content: reactLib.reactMod.ReactNs.ReactNode | java.lang.String
  /**
    * Don't show the Beacon before the tooltip. Defaults to false.
    */
  var disableBeacon: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The event to trigger the beacon. It can be click or hover. Defaults to click.
    */
  var event: js.UndefOr[
    reactDashJoyrideLib.reactDashJoyrideLibStrings.click | reactDashJoyrideLib.reactDashJoyrideLibStrings.hover
  ] = js.undefined
  /**
    * Force the step to be fixed. Defaults to false.
    */
  var isFixed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The distance from the target to the tooltip. Defaults to 10.
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * The placement of the beacon and tooltip. It will re-position itself if there's no space available.
    * Defaults to bottom.
    */
  var placement: js.UndefOr[
    reactDashJoyrideLib.reactDashJoyrideLibStrings.top | reactDashJoyrideLib.reactDashJoyrideLibStrings.`top-start` | reactDashJoyrideLib.reactDashJoyrideLibStrings.`top-end` | reactDashJoyrideLib.reactDashJoyrideLibStrings.bottom | reactDashJoyrideLib.reactDashJoyrideLibStrings.`bottom-start` | reactDashJoyrideLib.reactDashJoyrideLibStrings.`bottom-end` | reactDashJoyrideLib.reactDashJoyrideLibStrings.left | reactDashJoyrideLib.reactDashJoyrideLibStrings.`left-start` | reactDashJoyrideLib.reactDashJoyrideLibStrings.`left-end` | reactDashJoyrideLib.reactDashJoyrideLibStrings.right | reactDashJoyrideLib.reactDashJoyrideLibStrings.`right-start` | reactDashJoyrideLib.reactDashJoyrideLibStrings.`right-end` | reactDashJoyrideLib.reactDashJoyrideLibStrings.auto | reactDashJoyrideLib.reactDashJoyrideLibStrings.center
  ] = js.undefined
  /**
    * The placement of the beacon. It will use the placement if nothing is passed and it can be: top, bottom, left, right.
    */
  var placementBeacon: js.UndefOr[
    reactDashJoyrideLib.reactDashJoyrideLibStrings.top | reactDashJoyrideLib.reactDashJoyrideLibStrings.bottom | reactDashJoyrideLib.reactDashJoyrideLibStrings.left | reactDashJoyrideLib.reactDashJoyrideLibStrings.right
  ] = js.undefined
  /**
    * The target for the step. It can be a CSS selector or an HtmlElement directly (but using refs created in the same render would required an additional render afterwards).
    */
  var target: reactLib.HTMLElement | java.lang.String
  /**
    * The tooltip's title.
    */
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | java.lang.String] = js.undefined
}

object Step {
  @scala.inline
  def apply(
    content: reactLib.reactMod.ReactNs.ReactNode | java.lang.String,
    target: reactLib.HTMLElement | java.lang.String,
    beaconComponent: reactLib.reactMod.ReactNs.ReactNode = null,
    disableBeacon: js.UndefOr[scala.Boolean] = js.undefined,
    disableCloseOnEsc: js.UndefOr[scala.Boolean] = js.undefined,
    disableOverlay: js.UndefOr[scala.Boolean] = js.undefined,
    disableOverlayClose: js.UndefOr[scala.Boolean] = js.undefined,
    disableScrolling: js.UndefOr[scala.Boolean] = js.undefined,
    event: reactDashJoyrideLib.reactDashJoyrideLibStrings.click | reactDashJoyrideLib.reactDashJoyrideLibStrings.hover = null,
    floaterProps: js.Object = null,
    hideBackButton: js.UndefOr[scala.Boolean] = js.undefined,
    isFixed: js.UndefOr[scala.Boolean] = js.undefined,
    locale: Locale = null,
    offset: scala.Int | scala.Double = null,
    placement: reactDashJoyrideLib.reactDashJoyrideLibStrings.top | reactDashJoyrideLib.reactDashJoyrideLibStrings.`top-start` | reactDashJoyrideLib.reactDashJoyrideLibStrings.`top-end` | reactDashJoyrideLib.reactDashJoyrideLibStrings.bottom | reactDashJoyrideLib.reactDashJoyrideLibStrings.`bottom-start` | reactDashJoyrideLib.reactDashJoyrideLibStrings.`bottom-end` | reactDashJoyrideLib.reactDashJoyrideLibStrings.left | reactDashJoyrideLib.reactDashJoyrideLibStrings.`left-start` | reactDashJoyrideLib.reactDashJoyrideLibStrings.`left-end` | reactDashJoyrideLib.reactDashJoyrideLibStrings.right | reactDashJoyrideLib.reactDashJoyrideLibStrings.`right-start` | reactDashJoyrideLib.reactDashJoyrideLibStrings.`right-end` | reactDashJoyrideLib.reactDashJoyrideLibStrings.auto | reactDashJoyrideLib.reactDashJoyrideLibStrings.center = null,
    placementBeacon: reactDashJoyrideLib.reactDashJoyrideLibStrings.top | reactDashJoyrideLib.reactDashJoyrideLibStrings.bottom | reactDashJoyrideLib.reactDashJoyrideLibStrings.left | reactDashJoyrideLib.reactDashJoyrideLibStrings.right = null,
    showProgress: js.UndefOr[scala.Boolean] = js.undefined,
    showSkipButton: js.UndefOr[scala.Boolean] = js.undefined,
    spotlightClicks: js.UndefOr[scala.Boolean] = js.undefined,
    spotlightPadding: scala.Int | scala.Double = null,
    styles: StepStyles = null,
    title: reactLib.reactMod.ReactNs.ReactNode | java.lang.String = null,
    tooltipComponent: reactLib.reactMod.ReactNs.ReactNode = null
  ): Step = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (beaconComponent != null) __obj.updateDynamic("beaconComponent")(beaconComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(disableBeacon)) __obj.updateDynamic("disableBeacon")(disableBeacon)
    if (!js.isUndefined(disableCloseOnEsc)) __obj.updateDynamic("disableCloseOnEsc")(disableCloseOnEsc)
    if (!js.isUndefined(disableOverlay)) __obj.updateDynamic("disableOverlay")(disableOverlay)
    if (!js.isUndefined(disableOverlayClose)) __obj.updateDynamic("disableOverlayClose")(disableOverlayClose)
    if (!js.isUndefined(disableScrolling)) __obj.updateDynamic("disableScrolling")(disableScrolling)
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (floaterProps != null) __obj.updateDynamic("floaterProps")(floaterProps)
    if (!js.isUndefined(hideBackButton)) __obj.updateDynamic("hideBackButton")(hideBackButton)
    if (!js.isUndefined(isFixed)) __obj.updateDynamic("isFixed")(isFixed)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (placementBeacon != null) __obj.updateDynamic("placementBeacon")(placementBeacon.asInstanceOf[js.Any])
    if (!js.isUndefined(showProgress)) __obj.updateDynamic("showProgress")(showProgress)
    if (!js.isUndefined(showSkipButton)) __obj.updateDynamic("showSkipButton")(showSkipButton)
    if (!js.isUndefined(spotlightClicks)) __obj.updateDynamic("spotlightClicks")(spotlightClicks)
    if (spotlightPadding != null) __obj.updateDynamic("spotlightPadding")(spotlightPadding.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltipComponent != null) __obj.updateDynamic("tooltipComponent")(tooltipComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
}

