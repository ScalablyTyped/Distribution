package typings.stormReactDiagrams.diagramModelMod

import org.scalablytyped.runtime.StringDictionary
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/models/DiagramModel", "DiagramModel")
@js.native
class DiagramModel () extends BaseEntity[DiagramListener] {
  var gridSize: Double = js.native
  var links: StringDictionary[LinkModel[LinkModelListener]] = js.native
  var nodes: StringDictionary[NodeModel] = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  var rendered: Boolean = js.native
  var zoom: Double = js.native
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
  def removeLink(link: String): Unit = js.native
  def removeLink(link: LinkModel[LinkModelListener]): Unit = js.native
  def removeNode(node: String): Unit = js.native
  def removeNode(node: NodeModel): Unit = js.native
  def serializeDiagram(): GridSize = js.native
  def setGridSize(): Unit = js.native
  def setGridSize(size: Double): Unit = js.native
  def setOffset(offsetX: Double, offsetY: Double): Unit = js.native
  def setOffsetX(offsetX: Double): Unit = js.native
  def setOffsetY(offsetY: Double): Unit = js.native
  def setZoomLevel(zoom: Double): Unit = js.native
}

