package typings.reactDashNativeDashMaps.reactDashNativeDashMapsMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-maps", "Marker")
@js.native
class Marker ()
  extends Component[MarkerProps, js.Any, js.Any] {
  /**
    * Animates marker movement.
    * __Android only__
    */
  def animateMarkerToCoordinate(coordinate: LatLng): Unit = js.native
  def animateMarkerToCoordinate(coordinate: LatLng, duration: Double): Unit = js.native
  /**
    * Hides the callout for this marker
    */
  def hideCallout(): Unit = js.native
  /**
    * Redraws the callout for this marker
    * __iOS only__
    */
  def redrawCallout(): Unit = js.native
  /**
    * Shows the callout for this marker
    */
  def showCallout(): Unit = js.native
}

