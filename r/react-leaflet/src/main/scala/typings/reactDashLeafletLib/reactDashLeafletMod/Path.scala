package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "Path")
@js.native
abstract class Path[P /* <: PathProps */, E] () extends MapLayer[P, E] {
  def getChildContext(): reactDashLeafletLib.Anon_PopupContainer[E] = js.native
  def getPathOptions(props: P): leafletLib.leafletMod.PathOptions = js.native
  def setStyle(options: leafletLib.leafletMod.PathOptions): scala.Unit = js.native
  def setStyleIfChanged(fromProps: P, toProps: P): scala.Unit = js.native
}

