package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-map-gl", "MapController")
@js.native
class MapController () extends BaseMapController {
  /* CompleteClass */
  override var events: js.Array[java.lang.String] = js.native
  def getMapState(overrides: stdLib.Partial[MapState]): MapState = js.native
  /* CompleteClass */
  override def handleEvent(event: MapControlEvent): scala.Unit = js.native
  def setOptions(options: MapControllerOptions): scala.Unit = js.native
  def setState(newState: MapState): scala.Unit = js.native
  def updateViewport(newMapState: MapState, extraProps: js.Any, extraState: ExtraState): scala.Unit = js.native
}

