package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InteractiveMapProps extends StaticMapProps {
  var clickRadius: js.UndefOr[scala.Double] = js.undefined
  var doubleClickZoom: js.UndefOr[scala.Boolean] = js.undefined
  var dragPan: js.UndefOr[scala.Boolean] = js.undefined
  var dragRotate: js.UndefOr[scala.Boolean] = js.undefined
  var getCursor: js.UndefOr[js.Function1[/* state */ InteractiveMapState, scala.Unit]] = js.undefined
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  var mapControls: js.UndefOr[BaseMapControls] = js.undefined
  var maxPitch: js.UndefOr[scala.Double] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minPitch: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ MapEvent, scala.Unit]] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* event */ MapEvent, scala.Unit]] = js.undefined
  var onHover: js.UndefOr[js.Function1[/* event */ MapEvent, scala.Unit]] = js.undefined
  var onTransitionEnd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onTransitionInterrupt: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onTransitionStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onViewStateChange: js.UndefOr[js.Function1[/* info */ ViewStateChangeInfo, scala.Unit]] = js.undefined
  var onViewportChange: js.UndefOr[js.Function1[/* viewport */ Viewport, scala.Unit]] = js.undefined
  var scrollZoom: js.UndefOr[scala.Boolean] = js.undefined
  var touchAction: js.UndefOr[java.lang.String] = js.undefined
  var touchRotate: js.UndefOr[scala.Boolean] = js.undefined
  var touchZoom: js.UndefOr[scala.Boolean] = js.undefined
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
  var transitionEasing: js.UndefOr[EasingFunction] = js.undefined
  var transitionInterpolator: js.UndefOr[TransitionInterpolator] = js.undefined
  var transitionInterruption: js.UndefOr[TRANSITION_EVENTS] = js.undefined
  var visibilityConstraints: js.UndefOr[reactDashMapDashGlLib.Anon_MinPitch] = js.undefined
}

