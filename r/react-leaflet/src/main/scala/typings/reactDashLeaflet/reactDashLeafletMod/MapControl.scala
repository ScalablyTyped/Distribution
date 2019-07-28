package typings.reactDashLeaflet.reactDashLeafletMod

import typings.leaflet.leafletMod.Control
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "MapControl")
@js.native
class MapControl[P /* <: MapControlProps */, E /* <: Control */] ()
  extends Component[P, js.Object, js.Any] {
  var leafletElement: E = js.native
  def createLeafletElement(props: P): E = js.native
  def updateLeafletElement(fromProps: P, toProps: P): Unit = js.native
}

