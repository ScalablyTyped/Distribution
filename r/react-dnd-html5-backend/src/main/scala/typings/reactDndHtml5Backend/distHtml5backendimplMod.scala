package typings.reactDndHtml5Backend

import typings.dndCore.distInterfacesMod.Backend
import typings.dndCore.distInterfacesMod.DragDropManager
import typings.dndCore.distInterfacesMod.Unsubscribe
import typings.reactDndHtml5Backend.distBrowserDetectorMod.global.Window
import typings.reactDndHtml5Backend.distTypesMod.HTML5BackendContext
import typings.reactDndHtml5Backend.distTypesMod.HTML5BackendOptions
import typings.std.Document
import typings.std.DragEvent
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHtml5backendimplMod {
  
  @JSImport("react-dnd-html5-backend/dist/HTML5BackendImpl", "HTML5BackendImpl")
  @js.native
  open class HTML5BackendImpl protected ()
    extends StObject
       with Backend {
    def this(manager: DragDropManager) = this()
    def this(manager: DragDropManager, globalContext: HTML5BackendContext) = this()
    def this(manager: DragDropManager, globalContext: Unit, options: HTML5BackendOptions) = this()
    def this(manager: DragDropManager, globalContext: HTML5BackendContext, options: HTML5BackendOptions) = this()
    
    /* private */ var actions: Any = js.native
    
    /* private */ var addEventListeners: Any = js.native
    
    /* private */ var altKeyPressed: Any = js.native
    
    /* private */ var asyncEndDragFrameId: Any = js.native
    
    /* private */ var beginDragNativeItem: Any = js.native
    
    /* private */ var cancelHover: Any = js.native
    
    /* private */ var clearCurrentDragSourceNode: Any = js.native
    
    def connectDragPreview(sourceId: String, node: Element, options: Any): Unsubscribe = js.native
    
    def connectDragSource(sourceId: String, node: Element, options: Any): Unsubscribe = js.native
    
    def connectDropTarget(targetId: String, node: HTMLElement): Unsubscribe = js.native
    
    /* private */ var currentDragSourceNode: Any = js.native
    
    /* private */ var currentNativeHandle: Any = js.native
    
    /* private */ var currentNativeSource: Any = js.native
    
    def document: js.UndefOr[Document] = js.native
    
    /* private */ var dragEnterTargetIds: Any = js.native
    
    /* private */ var dragOverTargetIds: Any = js.native
    
    /* private */ var dragStartSourceIds: Any = js.native
    
    /* private */ var dropTargetIds: Any = js.native
    
    /* private */ var endDragIfSourceWasRemovedFromDOM: Any = js.native
    
    /* private */ var endDragNativeItem: Any = js.native
    
    /* private */ var enterLeaveCounter: Any = js.native
    
    /* private */ var getCurrentDropEffect: Any = js.native
    
    /* private */ var getCurrentSourceNodeOptions: Any = js.native
    
    /* private */ var getCurrentSourcePreviewNodeOptions: Any = js.native
    
    /* private */ var getSourceClientOffset: Any = js.native
    
    def handleDragEnter(_e: DragEvent, targetId: String): Unit = js.native
    
    def handleDragOver(_e: DragEvent, targetId: String): Unit = js.native
    
    def handleDragStart(e: DragEvent, sourceId: String): Unit = js.native
    
    def handleDrop(_e: DragEvent, targetId: String): Unit = js.native
    
    def handleSelectStart(e: DragEvent): Unit = js.native
    
    def handleTopDragEndCapture(): Unit = js.native
    
    def handleTopDragEnter(e: DragEvent): Unit = js.native
    
    def handleTopDragEnterCapture(e: DragEvent): Unit = js.native
    
    def handleTopDragLeaveCapture(e: DragEvent): Unit = js.native
    
    def handleTopDragOver(e: DragEvent): Unit = js.native
    
    def handleTopDragOverCapture(e: DragEvent): Unit = js.native
    
    def handleTopDragStart(e: DragEvent): Unit = js.native
    
    def handleTopDragStartCapture(): Unit = js.native
    
    def handleTopDrop(e: DragEvent): Unit = js.native
    
    def handleTopDropCapture(e: DragEvent): Unit = js.native
    
    /* private */ var hoverRafId: Any = js.native
    
    /* private */ var isDraggingNativeItem: Any = js.native
    
    /* private */ var isNodeInDocument: Any = js.native
    
    /* private */ var lastClientOffset: Any = js.native
    
    /* private */ var monitor: Any = js.native
    
    /* private */ var mouseMoveTimeoutTimer: Any = js.native
    
    /* private */ var options: Any = js.native
    
    /* private */ var registry: Any = js.native
    
    /* private */ var removeEventListeners: Any = js.native
    
    /**
      * Get the root element to use for event subscriptions
      */
    /* private */ def rootElement: Any = js.native
    
    /* private */ var scheduleHover: Any = js.native
    
    /* private */ var setCurrentDragSourceNode: Any = js.native
    
    /* private */ var sourceNodeOptions: Any = js.native
    
    /* private */ var sourceNodes: Any = js.native
    
    /* private */ var sourcePreviewNodeOptions: Any = js.native
    
    /* private */ var sourcePreviewNodes: Any = js.native
    
    def window: js.UndefOr[Window] = js.native
  }
}
