package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-map-gl", "experimental")
@js.native
object experimentalNs extends js.Object {
  @js.native
  class MapControls ()
    extends reactDashMapDashGlLib.reactDashMapDashGlMod.BaseMapControls {
    /* CompleteClass */
    override var events: js.Array[java.lang.String] = js.native
    def getMapState(overrides: stdLib.Partial[MapState]): MapState = js.native
    /* CompleteClass */
    override def handleEvent(event: reactDashMapDashGlLib.reactDashMapDashGlMod.MapControlEvent): scala.Unit = js.native
    def setOptions(options: Options): scala.Unit = js.native
    def setState(newState: MapState): scala.Unit = js.native
    def updateViewport(
      newMapState: MapState,
      extraProps: js.Any,
      extraState: reactDashMapDashGlLib.reactDashMapDashGlMod.InteractiveMapState
    ): scala.Unit = js.native
  }
  
  @js.native
  class MapState ()
    extends reactDashMapDashGlLib.reactDashMapDashGlMod.Viewport {
    var altitude: js.UndefOr[scala.Double] = js.native
    var height: scala.Double = js.native
    /* CompleteClass */
    override var latitude: scala.Double = js.native
    /* CompleteClass */
    override var longitude: scala.Double = js.native
    var maxPitch: js.UndefOr[scala.Double] = js.native
    var maxZoom: js.UndefOr[scala.Double] = js.native
    var minPitch: js.UndefOr[scala.Double] = js.native
    var minZoom: js.UndefOr[scala.Double] = js.native
    var startBearing: js.UndefOr[scala.Double] = js.native
    var startPanLngLat: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.native
    var startPitch: js.UndefOr[scala.Double] = js.native
    var startZoom: js.UndefOr[scala.Double] = js.native
    var startZoomLngLat: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.native
    var transitionDuration: js.UndefOr[scala.Double] = js.native
    var transitionEasing: js.UndefOr[reactDashMapDashGlLib.reactDashMapDashGlMod.EasingFunction] = js.native
    var transitionInterpolator: js.UndefOr[reactDashMapDashGlLib.reactDashMapDashGlMod.TransitionInterpolator] = js.native
    var transitionInterruption: js.UndefOr[reactDashMapDashGlLib.reactDashMapDashGlMod.TRANSITION_EVENTS] = js.native
    var width: scala.Double = js.native
    /* CompleteClass */
    override var zoom: scala.Double = js.native
  }
  
  
  trait Options extends js.Object {
    var doubleClickZoom: js.UndefOr[scala.Boolean] = js.undefined
    var dragPan: js.UndefOr[scala.Boolean] = js.undefined
    var dragRotate: js.UndefOr[scala.Boolean] = js.undefined
    var eventManager: js.UndefOr[js.Any] = js.undefined
    var keyboard: js.UndefOr[scala.Boolean] = js.undefined
    // TODO(deprecate): remove this when `onChangeViewport` gets deprecated
    var onChangeViewport: js.UndefOr[
        js.Function1[/* viewport */ reactDashMapDashGlLib.reactDashMapDashGlMod.Viewport, scala.Unit]
      ] = js.undefined
    var onStateChange: js.UndefOr[js.Function1[/* state */ MapState, scala.Unit]] = js.undefined
    var onViewStateChange: js.UndefOr[
        js.Function1[
          /* info */ reactDashMapDashGlLib.reactDashMapDashGlMod.ViewStateChangeInfo, 
          scala.Unit
        ]
      ] = js.undefined
    var onViewportChange: js.UndefOr[
        js.Function1[/* viewport */ reactDashMapDashGlLib.reactDashMapDashGlMod.Viewport, scala.Unit]
      ] = js.undefined
    var scrollZoom: js.UndefOr[scala.Boolean] = js.undefined
    var touchRotate: js.UndefOr[scala.Boolean] = js.undefined
    var touchZoom: js.UndefOr[scala.Boolean] = js.undefined
    // TODO(deprecate): remove this when `touchZoomRotate` gets deprecated
    var touchZoomRotate: js.UndefOr[scala.Boolean] = js.undefined
  }
  
}

