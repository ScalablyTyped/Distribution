package typings.reactDashLeaflet.reactDashLeafletMod

import typings.leaflet.leafletMod.PathOptions
import typings.reactDashLeaflet.Anon_PopupContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "Path")
@js.native
abstract class Path[P /* <: PathProps */, E /* <: typings.leaflet.leafletMod.Path */] () extends MapLayer[P, E] {
  def getChildContext(): Anon_PopupContainer[E] = js.native
  def getPathOptions(props: P): PathOptions = js.native
  def setStyle(options: PathOptions): Unit = js.native
  def setStyleIfChanged(fromProps: P, toProps: P): Unit = js.native
}

