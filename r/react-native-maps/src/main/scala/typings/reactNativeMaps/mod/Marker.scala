package typings.reactNativeMaps.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-maps", "Marker")
@js.native
class Marker protected ()
  extends Component[MarkerProps, js.Any, js.Any] {
  def this(props: MarkerProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: MarkerProps, context: js.Any) = this()
  
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
