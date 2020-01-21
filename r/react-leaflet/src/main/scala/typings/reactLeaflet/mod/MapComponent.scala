package typings.reactLeaflet.mod

import typings.leaflet.mod.Evented
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "MapComponent")
@js.native
class MapComponent[P /* <: MapComponentProps */, E /* <: Evented */] () extends MapEvented[P, E] {
  def getOptions(props: P): P = js.native
}

