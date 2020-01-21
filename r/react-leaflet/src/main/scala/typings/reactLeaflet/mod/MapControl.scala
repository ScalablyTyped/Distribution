package typings.reactLeaflet.mod

import typings.leaflet.mod.Control_
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "MapControl")
@js.native
class MapControl[P /* <: MapControlProps */, E /* <: Control_ */] ()
  extends Component[P, js.Object, js.Any] {
  var leafletElement: E = js.native
  def createLeafletElement(props: P): E = js.native
  def updateLeafletElement(fromProps: P, toProps: P): Unit = js.native
}

