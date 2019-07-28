package typings.reactDashLeaflet.reactDashLeafletMod

import typings.leaflet.leafletMod.Evented
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "MapEvented")
@js.native
class MapEvented[P, E /* <: Evented */] ()
  extends Component[P, js.Object, js.Any] {
  var _leafletEvents: LeafletEvents = js.native
  var leafletElement: E = js.native
  def bindLeafletEvents(next: LeafletEvents, prev: LeafletEvents): LeafletEvents = js.native
  def extractLeafletEvents(props: P): LeafletEvents = js.native
  def fireLeafletEvent(`type`: String, data: js.Any): Unit = js.native
}

