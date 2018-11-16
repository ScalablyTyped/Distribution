package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "MapComponent")
@js.native
class MapComponent[P, E /* <: leafletLib.leafletMod.Class */] ()
  extends reactLib.reactMod.Component[P, js.Object, js.Any] {
  var _leafletEvents: LeafletEvents = js.native
  var leafletElement: E = js.native
  def bindLeafletEvents(next: LeafletEvents, prev: LeafletEvents): LeafletEvents = js.native
  def extractLeafletEvents(props: P): LeafletEvents = js.native
  def fireLeafletEvent(`type`: java.lang.String, data: js.Any): scala.Unit = js.native
  def getOptions(props: P): P = js.native
}

