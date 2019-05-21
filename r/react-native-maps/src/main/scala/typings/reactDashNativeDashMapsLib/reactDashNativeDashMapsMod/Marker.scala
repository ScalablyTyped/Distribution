package typings
package reactDashNativeDashMapsLib.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-maps", "Marker")
@js.native
class Marker ()
  extends reactLib.reactMod.Component[MarkerProps, js.Any, js.Any] {
  /**
    * Animates marker movement.
    * __Android only__
    */
  def animateMarkerToCoordinate(coordinate: LatLng): scala.Unit = js.native
  def animateMarkerToCoordinate(coordinate: LatLng, duration: scala.Double): scala.Unit = js.native
  /**
    * Hides the callout for this marker
    */
  def hideCallout(): scala.Unit = js.native
  /**
    * Redraws the callout for this marker
    * __iOS only__
    */
  def redrawCallout(): scala.Unit = js.native
  /**
    * Shows the callout for this marker
    */
  def showCallout(): scala.Unit = js.native
}

