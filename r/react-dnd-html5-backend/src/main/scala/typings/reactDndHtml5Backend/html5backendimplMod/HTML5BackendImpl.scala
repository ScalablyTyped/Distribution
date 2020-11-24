package typings.reactDndHtml5Backend.html5backendimplMod

import typings.dndCore.interfacesMod.Backend
import typings.dndCore.interfacesMod.DragDropManager
import typings.dndCore.interfacesMod.Unsubscribe
import typings.reactDndHtml5Backend.html5backendimplMod.global.Window
import typings.reactDndHtml5Backend.typesMod.HTML5BackendContext
import typings.std.Document
import typings.std.DragEvent
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-dnd-html5-backend/lib/HTML5BackendImpl", "HTML5BackendImpl")
@js.native
class HTML5BackendImpl protected () extends Backend {
  def this(manager: DragDropManager) = this()
  def this(manager: DragDropManager, globalContext: HTML5BackendContext) = this()
  
  var actions: js.Any = js.native
  
  var addEventListeners: js.Any = js.native
  
  var altKeyPressed: js.Any = js.native
  
  var asyncEndDragFrameId: js.Any = js.native
  
  var beginDragNativeItem: js.Any = js.native
  
  var clearCurrentDragSourceNode: js.Any = js.native
  
  def connectDragPreview(sourceId: String, node: Element, options: js.Any): Unsubscribe = js.native
  
  def connectDragSource(sourceId: String, node: Element, options: js.Any): Unsubscribe = js.native
  
  def connectDropTarget(targetId: String, node: HTMLElement): Unsubscribe = js.native
  
  var currentDragSourceNode: js.Any = js.native
  
  var currentNativeHandle: js.Any = js.native
  
  var currentNativeSource: js.Any = js.native
  
  def document: js.UndefOr[Document] = js.native
  
  var dragEnterTargetIds: js.Any = js.native
  
  var dragOverTargetIds: js.Any = js.native
  
  var dragStartSourceIds: js.Any = js.native
  
  var dropTargetIds: js.Any = js.native
  
  var endDragIfSourceWasRemovedFromDOM: js.Any = js.native
  
  var endDragNativeItem: js.Any = js.native
  
  var enterLeaveCounter: js.Any = js.native
  
  var getCurrentDropEffect: js.Any = js.native
  
  var getCurrentSourceNodeOptions: js.Any = js.native
  
  var getCurrentSourcePreviewNodeOptions: js.Any = js.native
  
  var getSourceClientOffset: js.Any = js.native
  
  def handleDragEnter(e: DragEvent, targetId: String): Unit = js.native
  
  def handleDragOver(e: DragEvent, targetId: String): Unit = js.native
  
  def handleDragStart(e: DragEvent, sourceId: String): Unit = js.native
  
  def handleDrop(e: DragEvent, targetId: String): Unit = js.native
  
  def handleSelectStart(e: DragEvent): Unit = js.native
  
  def handleTopDragEndCapture(): Unit = js.native
  
  def handleTopDragEnter(e: DragEvent): Unit = js.native
  
  def handleTopDragEnterCapture(e: DragEvent): Unit = js.native
  
  def handleTopDragLeaveCapture(e: DragEvent): Unit = js.native
  
  def handleTopDragOver(e: DragEvent): Unit = js.native
  
  def handleTopDragOverCapture(): Unit = js.native
  
  def handleTopDragStart(e: DragEvent): Unit = js.native
  
  def handleTopDragStartCapture(): Unit = js.native
  
  def handleTopDrop(e: DragEvent): Unit = js.native
  
  def handleTopDropCapture(e: DragEvent): Unit = js.native
  
  var isDraggingNativeItem: js.Any = js.native
  
  var isNodeInDocument: js.Any = js.native
  
  var monitor: js.Any = js.native
  
  var mouseMoveTimeoutTimer: js.Any = js.native
  
  var options: js.Any = js.native
  
  var registry: js.Any = js.native
  
  var removeEventListeners: js.Any = js.native
  
  var setCurrentDragSourceNode: js.Any = js.native
  
  var sourceNodeOptions: js.Any = js.native
  
  var sourceNodes: js.Any = js.native
  
  var sourcePreviewNodeOptions: js.Any = js.native
  
  var sourcePreviewNodes: js.Any = js.native
  
  def window: js.UndefOr[Window] = js.native
}
