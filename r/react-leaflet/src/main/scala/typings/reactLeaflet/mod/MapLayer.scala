package typings.reactLeaflet.mod

import typings.leaflet.mod.Layer
import typings.leaflet.mod.Map_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-leaflet", "MapLayer")
@js.native
class MapLayer[P /* <: MapLayerProps */, E /* <: Layer */] protected () extends MapComponent[P, E] {
  def this(props: P) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P, context: js.Any) = this()
  
  var contextValue: js.UndefOr[LeafletContext | Null] = js.native
  
  def createLeafletElement(props: P): E = js.native
  
  val layerContainer: LayerContainer | Map_ = js.native
  
  def updateLeafletElement(fromProps: P, toProps: P): Unit = js.native
}
