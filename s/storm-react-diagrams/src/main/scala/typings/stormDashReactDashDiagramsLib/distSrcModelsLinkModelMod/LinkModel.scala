package typings
package stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/models/LinkModel", "LinkModel")
@js.native
class LinkModel[T /* <: LinkModelListener */] ()
  extends stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModel[stormDashReactDashDiagramsLib.distSrcModelsDiagramModelMod.DiagramModel, T] {
  def this(linkType: java.lang.String) = this()
  def this(linkType: java.lang.String, id: java.lang.String) = this()
  var labels: js.Array[stormDashReactDashDiagramsLib.distSrcModelsLabelModelMod.LabelModel] = js.native
  var points: js.Array[stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel] = js.native
  var sourcePort: stormDashReactDashDiagramsLib.distSrcModelsPortModelMod.PortModel | scala.Null = js.native
  var targetPort: stormDashReactDashDiagramsLib.distSrcModelsPortModelMod.PortModel | scala.Null = js.native
  def addLabel(label: stormDashReactDashDiagramsLib.distSrcModelsLabelModelMod.LabelModel): scala.Unit = js.native
  def addPoint[P /* <: stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel */](pointModel: P): P = js.native
  def addPoint[P /* <: stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel */](pointModel: P, index: scala.Double): P = js.native
  def doClone(lookupTable: js.Object, clone: js.Any): scala.Unit = js.native
  def generatePoint(): stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel = js.native
  def generatePoint(x: scala.Double): stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel = js.native
  def generatePoint(x: scala.Double, y: scala.Double): stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel = js.native
  def getFirstPoint(): stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel = js.native
  def getLastPoint(): stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel = js.native
  def getPointForPort(port: stormDashReactDashDiagramsLib.distSrcModelsPortModelMod.PortModel): stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel = js.native
  def getPointIndex(point: stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel): scala.Double = js.native
  def getPointModel(id: java.lang.String): stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel | scala.Null = js.native
  def getPoints(): js.Array[stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel] = js.native
  def getPortForPoint(point: stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel): stormDashReactDashDiagramsLib.distSrcModelsPortModelMod.PortModel = js.native
  def getSourcePort(): stormDashReactDashDiagramsLib.distSrcModelsPortModelMod.PortModel = js.native
  def getTargetPort(): stormDashReactDashDiagramsLib.distSrcModelsPortModelMod.PortModel = js.native
  def isLastPoint(point: stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel): scala.Boolean = js.native
  def point(x: scala.Double, y: scala.Double): stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel = js.native
  def removeMiddlePoints(): scala.Unit = js.native
  def removePoint(pointModel: stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel): scala.Unit = js.native
  def removePointsAfter(pointModel: stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel): scala.Unit = js.native
  def removePointsBefore(pointModel: stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel): scala.Unit = js.native
  def setPoints(points: js.Array[stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel]): scala.Unit = js.native
  def setSourcePort(port: stormDashReactDashDiagramsLib.distSrcModelsPortModelMod.PortModel): scala.Unit = js.native
  def setTargetPort(port: stormDashReactDashDiagramsLib.distSrcModelsPortModelMod.PortModel): scala.Unit = js.native
}

