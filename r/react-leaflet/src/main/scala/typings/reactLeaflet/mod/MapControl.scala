package typings.reactLeaflet.mod

import typings.leaflet.mod.Control_
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-leaflet", "MapControl")
@js.native
class MapControl[P /* <: MapControlProps */, E /* <: Control_ */] ()
  extends Component[P, js.Object, js.Any] {
  
  def createLeafletElement(props: P): E = js.native
  
  var leafletElement: E = js.native
  
  def updateLeafletElement(fromProps: P, toProps: P): Unit = js.native
}
