package typings.reactDashJoyride.reactDashJoyrideMod

import typings.react.reactMod.ElementType
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step extends CommonProps {
  var content: ReactNode
  var disableBeacon: js.UndefOr[Boolean] = js.undefined
  var event: js.UndefOr[String] = js.undefined
  var hideCloseButton: js.UndefOr[Boolean] = js.undefined
  var hideFooter: js.UndefOr[Boolean] = js.undefined
  var isFixed: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var placement: js.UndefOr[Placement] = js.undefined
  var placementBeacon: js.UndefOr[PlacementBeacon] = js.undefined
  var target: String | HTMLElement
  var title: js.UndefOr[ReactNode] = js.undefined
}

object Step {
  @scala.inline
  def apply(
    target: String | HTMLElement,
    beaconComponent: ElementType[BeaconRenderProps] = null,
    content: ReactNode = null,
    disableBeacon: js.UndefOr[Boolean] = js.undefined,
    disableCloseOnEsc: js.UndefOr[Boolean] = js.undefined,
    disableOverlay: js.UndefOr[Boolean] = js.undefined,
    disableOverlayClose: js.UndefOr[Boolean] = js.undefined,
    disableScrollParentFix: js.UndefOr[Boolean] = js.undefined,
    disableScrolling: js.UndefOr[Boolean] = js.undefined,
    event: String = null,
    floaterProps: FloaterProps = null,
    hideBackButton: js.UndefOr[Boolean] = js.undefined,
    hideCloseButton: js.UndefOr[Boolean] = js.undefined,
    hideFooter: js.UndefOr[Boolean] = js.undefined,
    isFixed: js.UndefOr[Boolean] = js.undefined,
    locale: Locale = null,
    offset: Int | Double = null,
    placement: Placement = null,
    placementBeacon: PlacementBeacon = null,
    showProgress: js.UndefOr[Boolean] = js.undefined,
    showSkipButton: js.UndefOr[Boolean] = js.undefined,
    spotlightClicks: js.UndefOr[Boolean] = js.undefined,
    spotlightPadding: Int | Double = null,
    styles: Styles = null,
    title: ReactNode = null,
    tooltipComponent: ElementType[TooltipRenderProps] = null
  ): Step = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (beaconComponent != null) __obj.updateDynamic("beaconComponent")(beaconComponent.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disableBeacon)) __obj.updateDynamic("disableBeacon")(disableBeacon)
    if (!js.isUndefined(disableCloseOnEsc)) __obj.updateDynamic("disableCloseOnEsc")(disableCloseOnEsc)
    if (!js.isUndefined(disableOverlay)) __obj.updateDynamic("disableOverlay")(disableOverlay)
    if (!js.isUndefined(disableOverlayClose)) __obj.updateDynamic("disableOverlayClose")(disableOverlayClose)
    if (!js.isUndefined(disableScrollParentFix)) __obj.updateDynamic("disableScrollParentFix")(disableScrollParentFix)
    if (!js.isUndefined(disableScrolling)) __obj.updateDynamic("disableScrolling")(disableScrolling)
    if (event != null) __obj.updateDynamic("event")(event)
    if (floaterProps != null) __obj.updateDynamic("floaterProps")(floaterProps)
    if (!js.isUndefined(hideBackButton)) __obj.updateDynamic("hideBackButton")(hideBackButton)
    if (!js.isUndefined(hideCloseButton)) __obj.updateDynamic("hideCloseButton")(hideCloseButton)
    if (!js.isUndefined(hideFooter)) __obj.updateDynamic("hideFooter")(hideFooter)
    if (!js.isUndefined(isFixed)) __obj.updateDynamic("isFixed")(isFixed)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (placementBeacon != null) __obj.updateDynamic("placementBeacon")(placementBeacon)
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

