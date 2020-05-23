package typings.reactLeaflet.mod

import typings.leaflet.mod.PathOptions
import typings.reactLeaflet.anon.PopupContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "Path")
@js.native
abstract class Path[P /* <: PathProps */, E /* <: typings.leaflet.mod.Path */] () extends MapLayer[P, E] {
  def getChildContext(): PopupContainer[E] = js.native
  def getPathOptions(props: P): PathOptions = js.native
  def setStyle(options: PathOptions): Unit = js.native
  def setStyleIfChanged(fromProps: P, toProps: P): Unit = js.native
}

