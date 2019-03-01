package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "Map")
@js.native
class Map[P /* <: MapProps */, E /* <: leafletLib.leafletMod.Map */] () extends MapEvented[P, E] {
  var className: js.UndefOr[java.lang.String | scala.Null] = js.native
  var container: js.UndefOr[reactLib.HTMLDivElement | scala.Null] = js.native
  var contextValue: js.UndefOr[LeafletContext | scala.Null] = js.native
  var viewport: Viewport = js.native
  def bindContainer(): scala.Unit = js.native
  def bindContainer(container: reactLib.HTMLDivElement): scala.Unit = js.native
  def createLeafletElement(props: P): E = js.native
  def onViewportChange(): scala.Unit = js.native
  def onViewportChange(viewport: Viewport): scala.Unit = js.native
  def onViewportChanged(): scala.Unit = js.native
  def onViewportChanged(viewport: Viewport): scala.Unit = js.native
  def shouldUpdateBounds(
    next: leafletLib.leafletMod.LatLngBoundsExpression,
    prev: leafletLib.leafletMod.LatLngBoundsExpression
  ): scala.Boolean = js.native
  def shouldUpdateCenter(next: leafletLib.leafletMod.LatLngExpression, prev: leafletLib.leafletMod.LatLngExpression): scala.Boolean = js.native
  def updateLeafletElement(fromProps: P, toProps: P): scala.Unit = js.native
}

