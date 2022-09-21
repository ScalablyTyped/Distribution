package typings.stormReactDiagrams

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.stormReactDiagrams.abstractLabelFactoryMod.AbstractLabelFactory
import typings.stormReactDiagrams.abstractLinkFactoryMod.AbstractLinkFactory
import typings.stormReactDiagrams.abstractNodeFactoryMod.AbstractNodeFactory
import typings.stormReactDiagrams.abstractPortFactoryMod.AbstractPortFactory
import typings.stormReactDiagrams.anon.HAdjustmentFactor
import typings.stormReactDiagrams.anon.Height
import typings.stormReactDiagrams.anon.Width
import typings.stormReactDiagrams.anon.X
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diagramEngineMod {
  
  @JSImport("storm-react-diagrams/dist/src/DiagramEngine", "DiagramEngine")
  @js.native
  open class DiagramEngine () extends BaseEntity[DiagramEngineListener] {
    
    def calculateCanvasMatrix(): Unit = js.native
    
    /**
      * Despite being a long method, we simply iterate over all three collections (nodes, ports and points)
      * to find the highest X and Y dimensions, so we can build the matrix large enough to contain all elements.
      */
    def calculateMatrixDimensions(): HAdjustmentFactor = js.native
    
    def calculateRoutingMatrix(): Unit = js.native
    
    def canEntityRepaint(baseModel: BaseModel[BaseEntity[BaseListener[Any]], BaseModelListener]): Boolean = js.native
    
    var canvas: Element = js.native
    
    var canvasMatrix: js.Array[js.Array[Double]] = js.native
    
    def clearRepaintEntities(): Unit = js.native
    
    var diagramModel: DiagramModel = js.native
    
    def enableRepaintEntities(entities: js.Array[BaseModel[BaseEntity[BaseListener[Any]], BaseModelListener]]): Unit = js.native
    
    def generateWidgetForLink(link: LinkModel[LinkModelListener]): typings.react.mod.global.JSX.Element | Null = js.native
    
    def generateWidgetForNode(node: NodeModel): typings.react.mod.global.JSX.Element | Null = js.native
    
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
    def getNodeDimensions(node: NodeModel): Width = js.native
    
    def getNodeElement(node: NodeModel): Element = js.native
    
    def getNodeFactories(): StringDictionary[AbstractNodeFactory[NodeModel]] = js.native
    
    def getNodeFactory(`type`: String): AbstractNodeFactory[NodeModel] = js.native
    
    def getNodePortElement(port: PortModel): Any = js.native
    
    def getPortCenter(port: PortModel): X = js.native
    
    /**
      * Calculate rectangular coordinates of the port passed in.
      */
    def getPortCoords(port: PortModel): Height = js.native
    
    def getPortFactory(`type`: String): AbstractPortFactory[PortModel] = js.native
    
    def getRelativeMousePoint(event: Any): X = js.native
    
    def getRelativePoint(x: Any, y: Any): X = js.native
    
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
    
    var hAdjustmentFactor: Double = js.native
    
    def installDefaultFactories(): Unit = js.native
    
    /**
      * Checks to see if a model is locked by running through
      * its parents to see if they are locked first
      */
    def isModelLocked(model: BaseEntity[BaseListener[Any]]): Boolean = js.native
    
    def isSmartRoutingEnabled(): Boolean = js.native
    
    var labelFactories: StringDictionary[AbstractLabelFactory[LabelModel]] = js.native
    
    var linkFactories: StringDictionary[AbstractLinkFactory[LinkModel[LinkModelListener]]] = js.native
    
    def markMatrixPoint(matrix: js.Array[js.Array[Double]], x: Double, y: Double): Unit = js.native
    
    /**
      * Updates (by reference) where nodes will be drawn on the matrix passed in.
      */
    def markNodes(matrix: js.Array[js.Array[Double]]): Unit = js.native
    
    /**
      * Updates (by reference) where ports will be drawn on the matrix passed in.
      */
    def markPorts(matrix: js.Array[js.Array[Double]]): Unit = js.native
    
    var maxNumberPointsPerLink: Double = js.native
    
    var nodeFactories: StringDictionary[AbstractNodeFactory[NodeModel]] = js.native
    
    var nodesRendered: Boolean = js.native
    
    var portFactories: StringDictionary[AbstractPortFactory[PortModel]] = js.native
    
    def recalculatePortsVisually(): Unit = js.native
    
    def registerLabelFactory(factory: AbstractLabelFactory[LabelModel]): Unit = js.native
    
    def registerLinkFactory(factory: AbstractLinkFactory[LinkModel[LinkModelListener]]): Unit = js.native
    
    def registerNodeFactory(factory: AbstractNodeFactory[NodeModel]): Unit = js.native
    
    def registerPortFactory(factory: AbstractPortFactory[PortModel]): Unit = js.native
    
    def repaintCanvas(): Unit = js.native
    
    var routingMatrix: js.Array[js.Array[Double]] = js.native
    
    def setCanvas(): Unit = js.native
    def setCanvas(canvas: Element): Unit = js.native
    
    def setDiagramModel(model: DiagramModel): Unit = js.native
    
    def setMaxNumberPointsPerLink(max: Double): Unit = js.native
    
    def setSmartRoutingStatus(status: Boolean): Unit = js.native
    
    var smartRouting: Boolean = js.native
    
    /**
      * The routing matrix does not have negative indexes, but elements could be negatively positioned.
      * We use the functions below to translate back and forth between these coordinates, relying on the
      * calculated values of hAdjustmentFactor and vAdjustmentFactor.
      */
    def translateRoutingX(x: Double): Double = js.native
    def translateRoutingX(x: Double, reverse: Boolean): Double = js.native
    
    def translateRoutingY(y: Double): Double = js.native
    def translateRoutingY(y: Double, reverse: Boolean): Double = js.native
    
    var vAdjustmentFactor: Double = js.native
    
    def zoomToFit(): Unit = js.native
  }
  
  trait DiagramEngineListener
    extends StObject
       with BaseListener[Any] {
    
    var labelFactoriesUpdated: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var linkFactoriesUpdated: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var nodeFactoriesUpdated: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var portFactoriesUpdated: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var repaintCanvas: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object DiagramEngineListener {
    
    inline def apply(): DiagramEngineListener = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiagramEngineListener]
    }
    
    extension [Self <: DiagramEngineListener](x: Self) {
      
      inline def setLabelFactoriesUpdated(value: () => Unit): Self = StObject.set(x, "labelFactoriesUpdated", js.Any.fromFunction0(value))
      
      inline def setLabelFactoriesUpdatedUndefined: Self = StObject.set(x, "labelFactoriesUpdated", js.undefined)
      
      inline def setLinkFactoriesUpdated(value: () => Unit): Self = StObject.set(x, "linkFactoriesUpdated", js.Any.fromFunction0(value))
      
      inline def setLinkFactoriesUpdatedUndefined: Self = StObject.set(x, "linkFactoriesUpdated", js.undefined)
      
      inline def setNodeFactoriesUpdated(value: () => Unit): Self = StObject.set(x, "nodeFactoriesUpdated", js.Any.fromFunction0(value))
      
      inline def setNodeFactoriesUpdatedUndefined: Self = StObject.set(x, "nodeFactoriesUpdated", js.undefined)
      
      inline def setPortFactoriesUpdated(value: () => Unit): Self = StObject.set(x, "portFactoriesUpdated", js.Any.fromFunction0(value))
      
      inline def setPortFactoriesUpdatedUndefined: Self = StObject.set(x, "portFactoriesUpdated", js.undefined)
      
      inline def setRepaintCanvas(value: () => Unit): Self = StObject.set(x, "repaintCanvas", js.Any.fromFunction0(value))
      
      inline def setRepaintCanvasUndefined: Self = StObject.set(x, "repaintCanvas", js.undefined)
    }
  }
}
