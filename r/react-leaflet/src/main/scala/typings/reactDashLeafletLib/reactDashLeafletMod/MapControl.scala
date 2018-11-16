package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "MapControl")
@js.native
class MapControl[P /* <: MapControlProps */, E /* <: leafletLib.leafletMod.Control */] ()
  extends reactLib.reactMod.Component[P, js.Object, js.Any] {
  var leafletElement: E = js.native
  def createLeafletElement(props: P): E = js.native
  def updateLeafletElement(fromProps: P, toProps: P): scala.Unit = js.native
}

