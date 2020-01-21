package typings.stormReactDiagrams.diagramEngineMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.stormReactDiagrams.AnonHAdjustmentFactor
import typings.stormReactDiagrams.AnonHeight
import typings.stormReactDiagrams.AnonHeightWidth
import typings.stormReactDiagrams.AnonX
import typings.stormReactDiagrams.abstractLabelFactoryMod.AbstractLabelFactory
import typings.stormReactDiagrams.abstractLinkFactoryMod.AbstractLinkFactory
import typings.stormReactDiagrams.abstractNodeFactoryMod.AbstractNodeFactory
import typings.stormReactDiagrams.abstractPortFactoryMod.AbstractPortFactory
import typings.stormReactDiagrams.baseEntityMod.BaseEntity
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import typings.stormReactDiagrams.baseModelMod.BaseModel
import typings.stormReactDiagrams.baseModelMod.BaseModelListener
import typings.stormReactDiagrams.diagramModelMod.DiagramModel
import typings.stormReactDiagrams.labelModelMod.LabelModel
import typings.stormReactDiagrams.linkModelMod.LinkModel
import typings.stormReactDiagrams.linkModelMod.LinkModelListener
import typings.stormReactDiagrams.nodeModelMod.NodeModel
import typings.stormReactDiagrams.portModelMod.PortModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/DiagramEngine", "DiagramEngine")
@js.native
class DiagramEngine () extends BaseEntity[DiagramEngineListener] {
  var canvas: Element = js.native
  var canvasMatrix: js.Array[js.Array[Double]] = js.native
  var diagramModel: DiagramModel = js.native
  var hAdjustmentFactor: Double = js.native
  var labelFactories: StringDictionary[AbstractLabelFactory[LabelModel]] = js.native
  var linkFactories: StringDictionary[AbstractLinkFactory[LinkModel[LinkModelListener]]] = js.native
  var maxNumberPointsPerLink: Double = js.native
  var nodeFactories: StringDictionary[AbstractNodeFactory[NodeModel]] = js.native
  var nodesRendered: Boolean = js.native
  var portFactories: StringDictionary[AbstractPortFactory[PortModel]] = js.native
  var routingMatrix: js.Array[js.Array[Double]] = js.native
  var smartRouting: Boolean = js.native
  var vAdjustmentFactor: Double = js.native
  def calculateCanvasMatrix(): Unit = js.native
  /**
    * Despite being a long method, we simply iterate over all three collections (nodes, ports and points)
    * to find the highest X and Y dimensions, so we can build the matrix large enough to contain all elements.
    */
  def calculateMatrixDimensions(): AnonHAdjustmentFactor = js.native
  def calculateRoutingMatrix(): Unit = js.native
  def canEntityRepaint(baseModel: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]): Boolean = js.native
  def clearRepaintEntities(): Unit = js.native
  def enableRepaintEntities(entities: js.Array[BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]]): Unit = js.native
  def generateWidgetForLink(link: LinkModel[LinkModelListener]): typings.react.mod._Global_.JSX.Element | Null = js.native
  def generateWidgetForNode(node: NodeModel): typings.react.mod._Global_.JSX.Element | Null = js.native
  /**
    * A representation of the canvas in the following format:
    *
    * +-----------------+
    * | 0 0 0 0 0 0 0 0 |
    * | 0 0 0 0 0 0 0 0 |
    * | 0 0 0 0 0 0 0 0 |
    * | 0 0 0 0 0 0 0 0 |
    * | 0 0 0 0 0 0 0 0 |
    * +-----------------+
    *
    * In which all walkable points are marked by zeros.
    * It uses @link{#ROUTING_SCALING_FACTOR} to reduce the matrix dimensions and improve performance.
    */
  def getCanvasMatrix(): js.Array[js.Array[Double]] = js.native
  def getDiagramModel(): DiagramModel = js.native
  def getFactoryForLabel(label: LabelModel): AbstractLabelFactory[LabelModel] | Null = js.native
  def getFactoryForLink(link: LinkModel[LinkModelListener]): AbstractLinkFactory[LinkModel[LinkModelListener]] | Null = js.native
  def getFactoryForNode(node: NodeModel): AbstractNodeFactory[NodeModel] | Null = js.native
  def getLabelFactories(): StringDictionary[AbstractLabelFactory[LabelModel]] = js.native
  def getLabelFactory(`type`: String): AbstractLabelFactory[LabelModel] = js.native
  def getLinkFactories(): StringDictionary[AbstractLinkFactory[LinkModel[LinkModelListener]]] = js.native
  def getLinkFactory(`type`: String): AbstractLinkFactory[LinkModel[LinkModelListener]] = js.native
  def getMaxNumberPointsPerLink(): Double = js.native
  /**
    * Determine the width and height of the node passed in.
    * It currently assumes nodes have a rectangular shape, can be overriden for customised shapes.
    */
  def getNodeDimensions(node: NodeModel): AnonHeightWidth = js.native
  def getNodeElement(node: NodeModel): Element = js.native
  def getNodeFactories(): StringDictionary[AbstractNodeFactory[NodeModel]] = js.native
  def getNodeFactory(`type`: String): AbstractNodeFactory[NodeModel] = js.native
  def getNodePortElement(port: PortModel): js.Any = js.native
  def getPortCenter(port: PortModel): AnonX = js.native
  /**
    * Calculate rectangular coordinates of the port passed in.
    */
  def getPortCoords(port: PortModel): AnonHeight = js.native
  def getPortFactory(`type`: String): AbstractPortFactory[PortModel] = js.native
  def getRelativeMousePoint(event: js.Any): AnonX = js.native
  def getRelativePoint(x: js.Any, y: js.Any): AnonX = js.native
  /**
    * A representation of the canvas in the following format:
    *
    * +-----------------+
    * | 0 0 1 1 0 0 0 0 |
    * | 0 0 1 1 0 0 1 1 |
    * | 0 0 0 0 0 0 1 1 |
    * | 1 1 0 0 0 0 0 0 |
    * | 1 1 0 0 0 0 0 0 |
    * +-----------------+
    *
    * In which all points blocked by a node (and its ports) are
    * marked as 1; points were there is nothing (ie, free) receive 0.
    */
  def getRoutingMatrix(): js.Array[js.Array[Double]] = js.native
  def installDefaultFactories(): Unit = js.native
  /**
    * Checks to see if a model is locked by running through
    * its parents to see if they are locked first
    */
  def isModelLocked(model: BaseEntity[BaseListener[_]]): Boolean = js.native
  def isSmartRoutingEnabled(): Boolean = js.native
  def markMatrixPoint(matrix: js.Array[js.Array[Double]], x: Double, y: Double): Unit = js.native
  /**
    * Updates (by reference) where nodes will be drawn on the matrix passed in.
    */
  def markNodes(matrix: js.Array[js.Array[Double]]): Unit = js.native
  /**
    * Updates (by reference) where ports will be drawn on the matrix passed in.
    */
  def markPorts(matrix: js.Array[js.Array[Double]]): Unit = js.native
  def recalculatePortsVisually(): Unit = js.native
  def registerLabelFactory(factory: AbstractLabelFactory[LabelModel]): Unit = js.native
  def registerLinkFactory(factory: AbstractLinkFactory[LinkModel[LinkModelListener]]): Unit = js.native
  def registerNodeFactory(factory: AbstractNodeFactory[NodeModel]): Unit = js.native
  def registerPortFactory(factory: AbstractPortFactory[PortModel]): Unit = js.native
  def repaintCanvas(): Unit = js.native
  def setCanvas(): Unit = js.native
  def setCanvas(canvas: Element): Unit = js.native
  def setDiagramModel(model: DiagramModel): Unit = js.native
  def setMaxNumberPointsPerLink(max: Double): Unit = js.native
  def setSmartRoutingStatus(status: Boolean): Unit = js.native
  /**
    * The routing matrix does not have negative indexes, but elements could be negatively positioned.
    * We use the functions below to translate back and forth between these coordinates, relying on the
    * calculated values of hAdjustmentFactor and vAdjustmentFactor.
    */
  def translateRoutingX(x: Double): Double = js.native
  def translateRoutingX(x: Double, reverse: Boolean): Double = js.native
  def translateRoutingY(y: Double): Double = js.native
  def translateRoutingY(y: Double, reverse: Boolean): Double = js.native
  def zoomToFit(): Unit = js.native
}

