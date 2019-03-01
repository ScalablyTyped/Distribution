package typings
package reactDashLeafletLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddBaseLayer extends js.Object {
  @JSName("addBaseLayer")
  var addBaseLayer_Original: reactDashLeafletLib.reactDashLeafletMod.AddLayerHandler = js.native
  @JSName("addOverlay")
  var addOverlay_Original: reactDashLeafletLib.reactDashLeafletMod.AddLayerHandler = js.native
  @JSName("removeLayerControl")
  var removeLayerControl_Original: reactDashLeafletLib.reactDashLeafletMod.RemoveLayerHandler = js.native
  @JSName("removeLayer")
  var removeLayer_Original: reactDashLeafletLib.reactDashLeafletMod.RemoveLayerHandler = js.native
  def addBaseLayer(layer: leafletLib.leafletMod.Layer, name: java.lang.String): scala.Unit = js.native
  def addBaseLayer(layer: leafletLib.leafletMod.Layer, name: java.lang.String, checked: scala.Boolean): scala.Unit = js.native
  def addOverlay(layer: leafletLib.leafletMod.Layer, name: java.lang.String): scala.Unit = js.native
  def addOverlay(layer: leafletLib.leafletMod.Layer, name: java.lang.String, checked: scala.Boolean): scala.Unit = js.native
  def removeLayer(layer: leafletLib.leafletMod.Layer): scala.Unit = js.native
  def removeLayerControl(layer: leafletLib.leafletMod.Layer): scala.Unit = js.native
}

