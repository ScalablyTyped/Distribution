package typings.reactMapGl.mod

import typings.reactMapGl.anon.PartialMapState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-map-gl", "MapController")
@js.native
open class MapController ()
  extends StObject
     with BaseMapController {
  
  /* CompleteClass */
  var events: js.Array[String] = js.native
  
  def getMapState(overrides: PartialMapState): MapState = js.native
  
  /* CompleteClass */
  override def handleEvent(event: MapControlEvent): Unit = js.native
  
  def setOptions(options: MapControllerOptions): Unit = js.native
  
  def setState(newState: MapState): Unit = js.native
  
  def updateViewport(newMapState: MapState, extraProps: Any, extraState: ExtraState): Unit = js.native
}
