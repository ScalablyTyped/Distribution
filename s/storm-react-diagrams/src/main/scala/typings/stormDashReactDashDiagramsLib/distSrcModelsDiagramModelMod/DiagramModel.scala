package typings
package stormDashReactDashDiagramsLib.distSrcModelsDiagramModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/models/DiagramModel", "DiagramModel")
@js.native
class DiagramModel ()
  extends stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[DiagramListener] {
  var gridSize: scala.Double = js.native
  var links: org.scalablytyped.runtime.StringDictionary[
    stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener]
  ] = js.native
  var nodes: org.scalablytyped.runtime.StringDictionary[stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod.NodeModel] = js.native
  var offsetX: scala.Double = js.native
  var offsetY: scala.Double = js.native
  var rendered: scala.Boolean = js.native
  var zoom: scala.Double = js.native
  def addAll(
    models: (stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModel[
      stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[_]], 
      stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModelListener
    ])*
  ): js.Array[
    stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModel[
      stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[_]], 
      stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModelListener
    ]
  ] = js.native
  def addLink(
    link: stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener]
  ): stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener] = js.native
  def addNode(node: stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod.NodeModel): stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod.NodeModel = js.native
  def clearSelection(): scala.Unit = js.native
  def clearSelection(
    ignore: stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModel[
      stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[_]], 
      stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModelListener
    ]
  ): scala.Unit = js.native
  def deSerializeDiagram(
    `object`: js.Any,
    diagramEngine: stormDashReactDashDiagramsLib.distSrcDiagramEngineMod.DiagramEngine
  ): scala.Unit = js.native
  def getGridPosition(pos: js.Any): js.Any = js.native
  def getLink(link: java.lang.String): stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener] | scala.Null = js.native
  def getLink(
    link: stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener]
  ): stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener] | scala.Null = js.native
  def getLinks(): org.scalablytyped.runtime.StringDictionary[
    stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener]
  ] = js.native
  def getNode(node: java.lang.String): stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod.NodeModel | scala.Null = js.native
  def getNode(node: stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod.NodeModel): stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod.NodeModel | scala.Null = js.native
  def getNodes(): org.scalablytyped.runtime.StringDictionary[stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod.NodeModel] = js.native
  def getOffsetX(): scala.Double = js.native
  def getOffsetY(): scala.Double = js.native
  def getSelectedItems(filters: stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntityType*): js.Array[
    stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModel[
      stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[_]], 
      stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModelListener
    ]
  ] = js.native
  def getZoomLevel(): scala.Double = js.native
  def removeLink(link: java.lang.String): scala.Unit = js.native
  def removeLink(
    link: stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener]
  ): scala.Unit = js.native
  def removeNode(node: java.lang.String): scala.Unit = js.native
  def removeNode(node: stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod.NodeModel): scala.Unit = js.native
  def serializeDiagram(): stormDashReactDashDiagramsLib.Anon_GridSize = js.native
  def setGridSize(): scala.Unit = js.native
  def setGridSize(size: scala.Double): scala.Unit = js.native
  def setOffset(offsetX: scala.Double, offsetY: scala.Double): scala.Unit = js.native
  def setOffsetX(offsetX: scala.Double): scala.Unit = js.native
  def setOffsetY(offsetY: scala.Double): scala.Unit = js.native
  def setZoomLevel(zoom: scala.Double): scala.Unit = js.native
}

