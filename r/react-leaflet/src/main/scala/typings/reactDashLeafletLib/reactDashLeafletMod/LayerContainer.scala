package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerContainer extends js.Object {
  @JSName("addLayer")
  var addLayer_Original: AddLayerHandler = js.native
  @JSName("removeLayer")
  var removeLayer_Original: RemoveLayerHandler = js.native
  def addLayer(layer: leafletLib.leafletMod.Layer, name: java.lang.String): scala.Unit = js.native
  def addLayer(layer: leafletLib.leafletMod.Layer, name: java.lang.String, checked: scala.Boolean): scala.Unit = js.native
  def removeLayer(layer: leafletLib.leafletMod.Layer): scala.Unit = js.native
}

