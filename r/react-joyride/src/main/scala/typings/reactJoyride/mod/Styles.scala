package typings.reactJoyride.mod

import typings.react.mod.CSSProperties
import typings.reactJoyride.AnonArrowColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Styles extends js.Object {
  var beacon: js.UndefOr[CSSProperties] = js.undefined
  var beaconInner: js.UndefOr[CSSProperties] = js.undefined
  var beaconOuter: js.UndefOr[CSSProperties] = js.undefined
  var buttonBack: js.UndefOr[CSSProperties] = js.undefined
  var buttonClose: js.UndefOr[CSSProperties] = js.undefined
  var buttonNext: js.UndefOr[CSSProperties] = js.undefined
  var buttonSkip: js.UndefOr[CSSProperties] = js.undefined
  var options: js.UndefOr[AnonArrowColor] = js.undefined
  var overlay: js.UndefOr[CSSProperties] = js.undefined
  var overlayLegacy: js.UndefOr[CSSProperties] = js.undefined
  var overlayLegacyCenter: js.UndefOr[CSSProperties] = js.undefined
  var spotlight: js.UndefOr[CSSProperties] = js.undefined
  var spotlightLegacy: js.UndefOr[CSSProperties] = js.undefined
  var tooltip: js.UndefOr[CSSProperties] = js.undefined
  var tooltipContainer: js.UndefOr[CSSProperties] = js.undefined
  var tooltipContent: js.UndefOr[CSSProperties] = js.undefined
  var tooltipFooter: js.UndefOr[CSSProperties] = js.undefined
  var tooltipFooterSpacer: js.UndefOr[CSSProperties] = js.undefined
  var tooltipTitle: js.UndefOr[CSSProperties] = js.undefined
}

object Styles {
  @scala.inline
  def apply(
    beacon: CSSProperties = null,
    beaconInner: CSSProperties = null,
    beaconOuter: CSSProperties = null,
    buttonBack: CSSProperties = null,
    buttonClose: CSSProperties = null,
    buttonNext: CSSProperties = null,
    buttonSkip: CSSProperties = null,
    options: AnonArrowColor = null,
    overlay: CSSProperties = null,
    overlayLegacy: CSSProperties = null,
    overlayLegacyCenter: CSSProperties = null,
    spotlight: CSSProperties = null,
    spotlightLegacy: CSSProperties = null,
    tooltip: CSSProperties = null,
    tooltipContainer: CSSProperties = null,
    tooltipContent: CSSProperties = null,
    tooltipFooter: CSSProperties = null,
    tooltipFooterSpacer: CSSProperties = null,
    tooltipTitle: CSSProperties = null
  ): Styles = {
    val __obj = js.Dynamic.literal()
    if (beacon != null) __obj.updateDynamic("beacon")(beacon.asInstanceOf[js.Any])
    if (beaconInner != null) __obj.updateDynamic("beaconInner")(beaconInner.asInstanceOf[js.Any])
    if (beaconOuter != null) __obj.updateDynamic("beaconOuter")(beaconOuter.asInstanceOf[js.Any])
    if (buttonBack != null) __obj.updateDynamic("buttonBack")(buttonBack.asInstanceOf[js.Any])
    if (buttonClose != null) __obj.updateDynamic("buttonClose")(buttonClose.asInstanceOf[js.Any])
    if (buttonNext != null) __obj.updateDynamic("buttonNext")(buttonNext.asInstanceOf[js.Any])
    if (buttonSkip != null) __obj.updateDynamic("buttonSkip")(buttonSkip.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (overlayLegacy != null) __obj.updateDynamic("overlayLegacy")(overlayLegacy.asInstanceOf[js.Any])
    if (overlayLegacyCenter != null) __obj.updateDynamic("overlayLegacyCenter")(overlayLegacyCenter.asInstanceOf[js.Any])
    if (spotlight != null) __obj.updateDynamic("spotlight")(spotlight.asInstanceOf[js.Any])
    if (spotlightLegacy != null) __obj.updateDynamic("spotlightLegacy")(spotlightLegacy.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipContainer != null) __obj.updateDynamic("tooltipContainer")(tooltipContainer.asInstanceOf[js.Any])
    if (tooltipContent != null) __obj.updateDynamic("tooltipContent")(tooltipContent.asInstanceOf[js.Any])
    if (tooltipFooter != null) __obj.updateDynamic("tooltipFooter")(tooltipFooter.asInstanceOf[js.Any])
    if (tooltipFooterSpacer != null) __obj.updateDynamic("tooltipFooterSpacer")(tooltipFooterSpacer.asInstanceOf[js.Any])
    if (tooltipTitle != null) __obj.updateDynamic("tooltipTitle")(tooltipTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Styles]
  }
}

