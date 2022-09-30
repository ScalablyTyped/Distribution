package typings.reactLeaflet.mod

import typings.leaflet.mod.Control_
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-leaflet", "MapControl")
@js.native
open class MapControl[P /* <: MapControlProps */, E /* <: Control_ */] protected ()
  extends Component[P, js.Object, Any] {
  def this(props: P) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P, context: Any) = this()
  
  def createLeafletElement(props: P): E = js.native
  
  var leafletElement: E = js.native
  
  def updateLeafletElement(fromProps: P, toProps: P): Unit = js.native
}
