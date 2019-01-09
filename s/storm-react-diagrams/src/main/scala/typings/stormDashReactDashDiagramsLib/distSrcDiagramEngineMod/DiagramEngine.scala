package typings
package stormDashReactDashDiagramsLib.distSrcDiagramEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/DiagramEngine", "DiagramEngine")
@js.native
class DiagramEngine ()
  extends stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[DiagramEngineListener] {
  var canvas: reactLib.Element = js.native
  var canvasMatrix: js.Array[js.Array[scala.Double]] = js.native
  var diagramModel: stormDashReactDashDiagramsLib.distSrcModelsDiagramModelMod.DiagramModel = js.native
  var hAdjustmentFactor: scala.Double = js.native
  var labelFactories: org.scalablytyped.runtime.StringDictionary[
    stormDashReactDashDiagramsLib.distSrcFactoriesAbstractLabelFactoryMod.AbstractLabelFactory[stormDashReactDashDiagramsLib.distSrcModelsLabelModelMod.LabelModel]
  ] = js.native
  var linkFactories: org.scalablytyped.runtime.StringDictionary[
    stormDashReactDashDiagramsLib.distSrcFactoriesAbstractLinkFactoryMod.AbstractLinkFactory[
      stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener]
    ]
  ] = js.native
  var maxNumberPointsPerLink: scala.Double = js.native
  var nodeFactories: org.scalablytyped.runtime.StringDictionary[
    stormDashReactDashDiagramsLib.distSrcFactoriesAbstractNodeFactoryMod.AbstractNodeFactory[stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod.NodeModel]
  ] = js.native
  var nodesRendered: scala.Boolean = js.native
  var portFactories: org.scalablytyped.runtime.StringDictionary[
    stormDashReactDashDiagramsLib.distSrcFactoriesAbstractPortFactoryMod.AbstractPortFactory[stormDashReactDashDiagramsLib.distSrcModelsPortModelMod.PortModel]
  ] = js.native
  var routingMatrix: js.Array[js.Array[scala.Double]] = js.native
  var smartRouting: scala.Boolean = js.native
  var vAdjustmentFactor: scala.Double = js.native
  def calculateCanvasMatrix(): scala.Unit = js.native
  /**
    * Despite being a long method, we simply iterate over all three collections (nodes, ports and points)
    * to find the highest X and Y dimensions, so we can build the matrix large enough to contain all elements.
    */
  def calculateMatrixDimensions(): stormDashReactDashDiagramsLib.Anon_HAdjustmentFactor = js.native
  def calculateRoutingMatrix(): scala.Unit = js.native
  def canEntityRepaint(
    baseModel: stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModel[
      stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[_]], 
      stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModelListener
    ]
  ): scala.Boolean = js.native
  def clearRepaintEntities(): scala.Unit = js.native
  def enableRepaintEntities(
    entities: js.Array[
      stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModel[
        stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[_]], 
        stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModelListener
      ]
    ]
  ): scala.Unit = js.native
  def generateWidgetForLink(
    link: stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener]
  ): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  def generateWidgetForNode(node: stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod.NodeModel): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
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
  def getCanvasMatrix(): js.Array[js.Array[scala.Double]] = js.native
  def getDiagramModel(): stormDashReactDashDiagramsLib.distSrcModelsDiagramModelMod.DiagramModel = js.native
  def getFactoryForLabel(label: stormDashReactDashDiagramsLib.distSrcModelsLabelModelMod.LabelModel): stormDashReactDashDiagramsLib.distSrcFactoriesAbstractLabelFactoryMod.AbstractLabelFactory[stormDashReactDashDiagramsLib.distSrcModelsLabelModelMod.LabelModel] | scala.Null = js.native
  def getFactoryForLink(
    link: stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener]
  ): (stormDashReactDashDiagramsLib.distSrcFactoriesAbstractLinkFactoryMod.AbstractLinkFactory[
    stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener]
  ]) | scala.Null = js.native
  def getFactoryForNode(node: stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod.NodeModel): stormDashReactDashDiagramsLib.distSrcFactoriesAbstractNodeFactoryMod.AbstractNodeFactory[stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod.NodeModel] | scala.Null = js.native
  def getLabelFactories(): org.scalablytyped.runtime.StringDictionary[
    stormDashReactDashDiagramsLib.distSrcFactoriesAbstractLabelFactoryMod.AbstractLabelFactory[stormDashReactDashDiagramsLib.distSrcModelsLabelModelMod.LabelModel]
  ] = js.native
  def getLabelFactory(`type`: java.lang.String): stormDashReactDashDiagramsLib.distSrcFactoriesAbstractLabelFactoryMod.AbstractLabelFactory[stormDashReactDashDiagramsLib.distSrcModelsLabelModelMod.LabelModel] = js.native
  def getLinkFactories(): org.scalablytyped.runtime.StringDictionary[
    stormDashReactDashDiagramsLib.distSrcFactoriesAbstractLinkFactoryMod.AbstractLinkFactory[
      stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener]
    ]
  ] = js.native
  def getLinkFactory(`type`: java.lang.String): stormDashReactDashDiagramsLib.distSrcFactoriesAbstractLinkFactoryMod.AbstractLinkFactory[
    stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener]
  ] = js.native
  def getMaxNumberPointsPerLink(): scala.Double = js.native
  /**
    * Determine the width and height of the node passed in.
    * It currently assumes nodes have a rectangular shape, can be overriden for customised shapes.
    */
  def getNodeDimensions(node: stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod.NodeModel): stormDashReactDashDiagramsLib.Anon_HeightWidth = js.native
  def getNodeElement(node: stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod.NodeModel): reactLib.Element = js.native
  def getNodeFactories(): org.scalablytyped.runtime.StringDictionary[
    stormDashReactDashDiagramsLib.distSrcFactoriesAbstractNodeFactoryMod.AbstractNodeFactory[stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod.NodeModel]
  ] = js.native
  def getNodeFactory(`type`: java.lang.String): stormDashReactDashDiagramsLib.distSrcFactoriesAbstractNodeFactoryMod.AbstractNodeFactory[stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod.NodeModel] = js.native
  def getNodePortElement(port: stormDashReactDashDiagramsLib.distSrcModelsPortModelMod.PortModel): js.Any = js.native
  def getPortCenter(port: stormDashReactDashDiagramsLib.distSrcModelsPortModelMod.PortModel): stormDashReactDashDiagramsLib.Anon_X = js.native
  /**
    * Calculate rectangular coordinates of the port passed in.
    */
  def getPortCoords(port: stormDashReactDashDiagramsLib.distSrcModelsPortModelMod.PortModel): stormDashReactDashDiagramsLib.Anon_Height = js.native
  def getPortFactory(`type`: java.lang.String): stormDashReactDashDiagramsLib.distSrcFactoriesAbstractPortFactoryMod.AbstractPortFactory[stormDashReactDashDiagramsLib.distSrcModelsPortModelMod.PortModel] = js.native
  def getRelativeMousePoint(event: js.Any): stormDashReactDashDiagramsLib.Anon_X = js.native
  def getRelativePoint(x: js.Any, y: js.Any): stormDashReactDashDiagramsLib.Anon_X = js.native
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
  def getRoutingMatrix(): js.Array[js.Array[scala.Double]] = js.native
  def installDefaultFactories(): scala.Unit = js.native
  /**
    * Checks to see if a model is locked by running through
    * its parents to see if they are locked first
    */
  def isModelLocked(
    model: stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[_]]
  ): scala.Boolean = js.native
  def isSmartRoutingEnabled(): scala.Boolean = js.native
  def markMatrixPoint(matrix: js.Array[js.Array[scala.Double]], x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * Updates (by reference) where nodes will be drawn on the matrix passed in.
    */
  def markNodes(matrix: js.Array[js.Array[scala.Double]]): scala.Unit = js.native
  /**
    * Updates (by reference) where ports will be drawn on the matrix passed in.
    */
  def markPorts(matrix: js.Array[js.Array[scala.Double]]): scala.Unit = js.native
  def recalculatePortsVisually(): scala.Unit = js.native
  def registerLabelFactory(
    factory: stormDashReactDashDiagramsLib.distSrcFactoriesAbstractLabelFactoryMod.AbstractLabelFactory[stormDashReactDashDiagramsLib.distSrcModelsLabelModelMod.LabelModel]
  ): scala.Unit = js.native
  def registerLinkFactory(
    factory: stormDashReactDashDiagramsLib.distSrcFactoriesAbstractLinkFactoryMod.AbstractLinkFactory[
      stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener]
    ]
  ): scala.Unit = js.native
  def registerNodeFactory(
    factory: stormDashReactDashDiagramsLib.distSrcFactoriesAbstractNodeFactoryMod.AbstractNodeFactory[stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod.NodeModel]
  ): scala.Unit = js.native
  def registerPortFactory(
    factory: stormDashReactDashDiagramsLib.distSrcFactoriesAbstractPortFactoryMod.AbstractPortFactory[stormDashReactDashDiagramsLib.distSrcModelsPortModelMod.PortModel]
  ): scala.Unit = js.native
  def repaintCanvas(): scala.Unit = js.native
  def setCanvas(): scala.Unit = js.native
  def setCanvas(canvas: reactLib.Element): scala.Unit = js.native
  def setDiagramModel(model: stormDashReactDashDiagramsLib.distSrcModelsDiagramModelMod.DiagramModel): scala.Unit = js.native
  def setMaxNumberPointsPerLink(max: scala.Double): scala.Unit = js.native
  def setSmartRoutingStatus(status: scala.Boolean): scala.Unit = js.native
  /**
    * The routing matrix does not have negative indexes, but elements could be negatively positioned.
    * We use the functions below to translate back and forth between these coordinates, relying on the
    * calculated values of hAdjustmentFactor and vAdjustmentFactor.
    */
  def translateRoutingX(x: scala.Double): scala.Double = js.native
  def translateRoutingX(x: scala.Double, reverse: scala.Boolean): scala.Double = js.native
  def translateRoutingY(y: scala.Double): scala.Double = js.native
  def translateRoutingY(y: scala.Double, reverse: scala.Boolean): scala.Double = js.native
  def zoomToFit(): scala.Unit = js.native
}

