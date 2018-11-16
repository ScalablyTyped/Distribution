package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "Map")
@js.native
class Map[P /* <: MapProps */, E /* <: leafletLib.leafletMod.Map */] () extends MapComponent[P, E] {
  var className: js.UndefOr[java.lang.String] = js.native
  var container: reactLib.HTMLDivElement = js.native
  def bindContainer(container: reactLib.HTMLDivElement): scala.Unit = js.native
  def createLeafletElement(props: P): E = js.native
  def getChildContext(): reactDashLeafletLib.Anon_LayerContainer[E] = js.native
  def shouldUpdateBounds(
    next: leafletLib.leafletMod.LatLngBoundsExpression,
    prev: leafletLib.leafletMod.LatLngBoundsExpression
  ): scala.Boolean = js.native
  def shouldUpdateCenter(next: leafletLib.leafletMod.LatLngExpression, prev: leafletLib.leafletMod.LatLngExpression): scala.Boolean = js.native
  def updateLeafletElement(fromProps: P, toProps: P): scala.Unit = js.native
}

