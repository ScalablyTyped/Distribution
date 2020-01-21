package typings.stormReactDiagrams.linkModelMod

import typings.stormReactDiagrams.baseModelMod.BaseModel
import typings.stormReactDiagrams.diagramModelMod.DiagramModel
import typings.stormReactDiagrams.labelModelMod.LabelModel
import typings.stormReactDiagrams.pointModelMod.PointModel
import typings.stormReactDiagrams.portModelMod.PortModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/models/LinkModel", "LinkModel")
@js.native
class LinkModel[T /* <: LinkModelListener */] () extends BaseModel[DiagramModel, T] {
  def this(linkType: String) = this()
  def this(linkType: String, id: String) = this()
  var labels: js.Array[LabelModel] = js.native
  var points: js.Array[PointModel] = js.native
  var sourcePort: PortModel | Null = js.native
  var targetPort: PortModel | Null = js.native
  def addLabel(label: LabelModel): Unit = js.native
  def addPoint[P /* <: PointModel */](pointModel: P): P = js.native
  def addPoint[P /* <: PointModel */](pointModel: P, index: Double): P = js.native
  def doClone(lookupTable: js.Object, clone: js.Any): Unit = js.native
  def generatePoint(): PointModel = js.native
  def generatePoint(x: Double): PointModel = js.native
  def generatePoint(x: Double, y: Double): PointModel = js.native
  def getFirstPoint(): PointModel = js.native
  def getLastPoint(): PointModel = js.native
  def getPointForPort(port: PortModel): PointModel = js.native
  def getPointIndex(point: PointModel): Double = js.native
  def getPointModel(id: String): PointModel | Null = js.native
  def getPoints(): js.Array[PointModel] = js.native
  def getPortForPoint(point: PointModel): PortModel = js.native
  def getSourcePort(): PortModel = js.native
  def getTargetPort(): PortModel = js.native
  def isLastPoint(point: PointModel): Boolean = js.native
  def point(x: Double, y: Double): PointModel = js.native
  def removeMiddlePoints(): Unit = js.native
  def removePoint(pointModel: PointModel): Unit = js.native
  def removePointsAfter(pointModel: PointModel): Unit = js.native
  def removePointsBefore(pointModel: PointModel): Unit = js.native
  def setPoints(points: js.Array[PointModel]): Unit = js.native
  def setSourcePort(port: PortModel): Unit = js.native
  def setTargetPort(port: PortModel): Unit = js.native
}

