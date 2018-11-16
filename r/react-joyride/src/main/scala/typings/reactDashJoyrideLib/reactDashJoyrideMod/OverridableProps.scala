package typings
package reactDashJoyrideLib.reactDashJoyrideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OverridableProps extends js.Object {
  /**
       * A React component or function to be used instead the default Beacon.
       */
  var beaconComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
       * Disable closing the tooltip on ESC. Defaults to false.
       */
  var disableCloseOnEsc: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Don't show the overlay. Defaults to false
       */
  var disableOverlay: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Don't close the tooltip when clicking the overlay. Defaults to false.
       */
  var disableOverlayClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Disable auto scrolling between steps.
       */
  var disableScrolling: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Options to be passed to react-floater.
       */
  var floaterProps: js.UndefOr[js.Object] = js.undefined
  /**
       * Hide the "back" button. Defaults to false.
       */
  var hideBackButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The strings used in the tooltip. Defaults to `{ back: 'Back', close: 'Close', last: 'Last', next: 'Next', skip: 'Skip' }`
       */
  var locale: js.UndefOr[Locale] = js.undefined
  /**
       * Display the tour progress in the next button _e.g. 2/5 _in continuous tours. Defaults to false.
       */
  var showProgress: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Display a button to skip the tour.
       */
  var showSkipButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Allow mouse and touch events thru the spotlight. You can click links in your app. Defaults to true.
       */
  var spotlightClicks: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The padding of the spotlight. Defaults to 10.
       */
  var spotlightPadding: js.UndefOr[scala.Double] = js.undefined
  var styles: js.UndefOr[StepStyles] = js.undefined
  /**
       * A React component or function to be used instead the default Tooltip excluding the arrow.
       */
  var tooltipComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

