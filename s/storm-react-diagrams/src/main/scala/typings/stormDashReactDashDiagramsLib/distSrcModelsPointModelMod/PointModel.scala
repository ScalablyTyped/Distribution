package typings
package stormDashReactDashDiagramsLib.distSrcModelsPointModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/models/PointModel", "PointModel")
@js.native
class PointModel protected ()
  extends stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModel[
      stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener], 
      stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModelListener
    ] {
  def this(link: stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener], points: stormDashReactDashDiagramsLib.Anon_X) = this()
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def getLink(): stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener] = js.native
  def getX(): scala.Double = js.native
  def getY(): scala.Double = js.native
  def isConnectedToPort(): scala.Boolean = js.native
  def updateLocation(points: stormDashReactDashDiagramsLib.Anon_X): scala.Unit = js.native
}

