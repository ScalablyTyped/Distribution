package typings.stormReactDiagrams

import org.scalablytyped.runtime.StringDictionary
import typings.stormReactDiagrams.anon.BaseEventDiagramModeloffs
import typings.stormReactDiagrams.anon.BaseEventDiagramModelsize
import typings.stormReactDiagrams.anon.BaseEventDiagramModelzoom
import typings.stormReactDiagrams.anon.BaseEventanylinkLinkModel
import typings.stormReactDiagrams.anon.BaseEventanynodeNodeModel
import typings.stormReactDiagrams.anon.GridSize
import typings.stormReactDiagrams.baseEntityMod.BaseEntity
import typings.stormReactDiagrams.baseEntityMod.BaseEntityType
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import typings.stormReactDiagrams.baseModelMod.BaseModel
import typings.stormReactDiagrams.baseModelMod.BaseModelListener
import typings.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typings.stormReactDiagrams.linkModelMod.LinkModel
import typings.stormReactDiagrams.linkModelMod.LinkModelListener
import typings.stormReactDiagrams.nodeModelMod.NodeModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diagramModelMod {
  
  @JSImport("storm-react-diagrams/dist/src/models/DiagramModel", "DiagramModel")
  @js.native
  class DiagramModel () extends BaseEntity[DiagramListener] {
    
    def addAll(models: (BaseModel[BaseEntity[BaseListener[_]], BaseModelListener])*): js.Array[BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]] = js.native
    
    def addLink(link: LinkModel[LinkModelListener]): LinkModel[LinkModelListener] = js.native
    
    def addNode(node: NodeModel): NodeModel = js.native
    
    def clearSelection(): Unit = js.native
    def clearSelection(ignore: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]): Unit = js.native
    
    def deSerializeDiagram(`object`: js.Any, diagramEngine: DiagramEngine): Unit = js.native
    
    def getGridPosition(pos: js.Any): js.Any = js.native
    
    def getLink(link: String): LinkModel[LinkModelListener] | Null = js.native
    def getLink(link: LinkModel[LinkModelListener]): LinkModel[LinkModelListener] | Null = js.native
    
    def getLinks(): StringDictionary[LinkModel[LinkModelListener]] = js.native
    
    def getNode(node: String): NodeModel | Null = js.native
    def getNode(node: NodeModel): NodeModel | Null = js.native
    
    def getNodes(): StringDictionary[NodeModel] = js.native
    
    def getOffsetX(): Double = js.native
    
    def getOffsetY(): Double = js.native
    
    def getSelectedItems(filters: BaseEntityType*): js.Array[BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]] = js.native
    
    def getZoomLevel(): Double = js.native
    
    var gridSize: Double = js.native
    
    var links: StringDictionary[LinkModel[LinkModelListener]] = js.native
    
    var nodes: StringDictionary[NodeModel] = js.native
    
    var offsetX: Double = js.native
    
    var offsetY: Double = js.native
    
    def removeLink(link: String): Unit = js.native
    def removeLink(link: LinkModel[LinkModelListener]): Unit = js.native
    
    def removeNode(node: String): Unit = js.native
    def removeNode(node: NodeModel): Unit = js.native
    
    var rendered: Boolean = js.native
    
    def serializeDiagram(): GridSize = js.native
    
    def setGridSize(): Unit = js.native
    def setGridSize(size: Double): Unit = js.native
    
    def setOffset(offsetX: Double, offsetY: Double): Unit = js.native
    
    def setOffsetX(offsetX: Double): Unit = js.native
    
    def setOffsetY(offsetY: Double): Unit = js.native
    
    def setZoomLevel(zoom: Double): Unit = js.native
    
    var zoom: Double = js.native
  }
  
  @js.native
  trait DiagramListener
    extends BaseListener[js.Any] {
    
    var gridUpdated: js.UndefOr[js.Function1[/* event */ BaseEventDiagramModelsize, Unit]] = js.native
    
    var linksUpdated: js.UndefOr[js.Function1[/* event */ BaseEventanylinkLinkModel, Unit]] = js.native
    
    var nodesUpdated: js.UndefOr[js.Function1[/* event */ BaseEventanynodeNodeModel, Unit]] = js.native
    
    var offsetUpdated: js.UndefOr[js.Function1[/* event */ BaseEventDiagramModeloffs, Unit]] = js.native
    
    var zoomUpdated: js.UndefOr[js.Function1[/* event */ BaseEventDiagramModelzoom, Unit]] = js.native
  }
  object DiagramListener {
    
    @scala.inline
    def apply(): DiagramListener = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiagramListener]
    }
    
    @scala.inline
    implicit class DiagramListenerMutableBuilder[Self <: DiagramListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGridUpdated(value: /* event */ BaseEventDiagramModelsize => Unit): Self = StObject.set(x, "gridUpdated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGridUpdatedUndefined: Self = StObject.set(x, "gridUpdated", js.undefined)
      
      @scala.inline
      def setLinksUpdated(value: /* event */ BaseEventanylinkLinkModel => Unit): Self = StObject.set(x, "linksUpdated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLinksUpdatedUndefined: Self = StObject.set(x, "linksUpdated", js.undefined)
      
      @scala.inline
      def setNodesUpdated(value: /* event */ BaseEventanynodeNodeModel => Unit): Self = StObject.set(x, "nodesUpdated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodesUpdatedUndefined: Self = StObject.set(x, "nodesUpdated", js.undefined)
      
      @scala.inline
      def setOffsetUpdated(value: /* event */ BaseEventDiagramModeloffs => Unit): Self = StObject.set(x, "offsetUpdated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOffsetUpdatedUndefined: Self = StObject.set(x, "offsetUpdated", js.undefined)
      
      @scala.inline
      def setZoomUpdated(value: /* event */ BaseEventDiagramModelzoom => Unit): Self = StObject.set(x, "zoomUpdated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZoomUpdatedUndefined: Self = StObject.set(x, "zoomUpdated", js.undefined)
    }
  }
}
