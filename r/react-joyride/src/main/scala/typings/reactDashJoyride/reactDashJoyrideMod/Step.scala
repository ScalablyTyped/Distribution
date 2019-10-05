package typings.reactDashJoyride.reactDashJoyrideMod

import typings.react.reactMod.ReactNode
import typings.reactDashJoyride.reactDashJoyrideStrings.`bottom-end`
import typings.reactDashJoyride.reactDashJoyrideStrings.`bottom-start`
import typings.reactDashJoyride.reactDashJoyrideStrings.`left-end`
import typings.reactDashJoyride.reactDashJoyrideStrings.`left-start`
import typings.reactDashJoyride.reactDashJoyrideStrings.`right-end`
import typings.reactDashJoyride.reactDashJoyrideStrings.`right-start`
import typings.reactDashJoyride.reactDashJoyrideStrings.`top-end`
import typings.reactDashJoyride.reactDashJoyrideStrings.`top-start`
import typings.reactDashJoyride.reactDashJoyrideStrings.auto
import typings.reactDashJoyride.reactDashJoyrideStrings.bottom
import typings.reactDashJoyride.reactDashJoyrideStrings.center
import typings.reactDashJoyride.reactDashJoyrideStrings.click
import typings.reactDashJoyride.reactDashJoyrideStrings.hover
import typings.reactDashJoyride.reactDashJoyrideStrings.left
import typings.reactDashJoyride.reactDashJoyrideStrings.right
import typings.reactDashJoyride.reactDashJoyrideStrings.top
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step extends OverridableProps {
  /**
    * The tooltip's body.
    */
  var content: ReactNode | String
  /**
    * Don't show the Beacon before the tooltip. Defaults to false.
    */
  var disableBeacon: js.UndefOr[Boolean] = js.undefined
  /**
    * The event to trigger the beacon. It can be click or hover. Defaults to click.
    */
  var event: js.UndefOr[click | hover] = js.undefined
  /**
    * Force the step to be fixed. Defaults to false.
    */
  var isFixed: js.UndefOr[Boolean] = js.undefined
  /**
    * The distance from the target to the tooltip. Defaults to 10.
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * The placement of the beacon and tooltip. It will re-position itself if there's no space available.
    * Defaults to bottom.
    */
  var placement: js.UndefOr[
    top | `top-start` | `top-end` | bottom | `bottom-start` | `bottom-end` | left | `left-start` | `left-end` | right | `right-start` | `right-end` | auto | center
  ] = js.undefined
  /**
    * The placement of the beacon. It will use the placement if nothing is passed and it can be: top, bottom, left, right.
    */
  var placementBeacon: js.UndefOr[top | bottom | left | right] = js.undefined
  /**
    * The target for the step. It can be a CSS selector or an HtmlElement directly (but using refs created in the same render would required an additional render afterwards).
    */
  var target: HTMLElement | String
  /**
    * The tooltip's title.
    */
  var title: js.UndefOr[ReactNode | String] = js.undefined
}

object Step {
  @scala.inline
  def apply(
    target: HTMLElement | String,
    beaconComponent: ReactNode = null,
    content: ReactNode | String = null,
    disableBeacon: js.UndefOr[Boolean] = js.undefined,
    disableCloseOnEsc: js.UndefOr[Boolean] = js.undefined,
    disableOverlay: js.UndefOr[Boolean] = js.undefined,
    disableOverlayClose: js.UndefOr[Boolean] = js.undefined,
    disableScrolling: js.UndefOr[Boolean] = js.undefined,
    event: click | hover = null,
    floaterProps: js.Object = null,
    hideBackButton: js.UndefOr[Boolean] = js.undefined,
    isFixed: js.UndefOr[Boolean] = js.undefined,
    locale: Locale = null,
    offset: Int | Double = null,
    placement: top | `top-start` | `top-end` | bottom | `bottom-start` | `bottom-end` | left | `left-start` | `left-end` | right | `right-start` | `right-end` | auto | center = null,
    placementBeacon: top | bottom | left | right = null,
    showProgress: js.UndefOr[Boolean] = js.undefined,
    showSkipButton: js.UndefOr[Boolean] = js.undefined,
    spotlightClicks: js.UndefOr[Boolean] = js.undefined,
    spotlightPadding: Int | Double = null,
    styles: StepStyles = null,
    title: ReactNode | String = null,
    tooltipComponent: ReactNode = null
  ): Step = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (beaconComponent != null) __obj.updateDynamic("beaconComponent")(beaconComponent.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
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

