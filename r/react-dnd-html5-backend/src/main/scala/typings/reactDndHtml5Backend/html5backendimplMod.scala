package typings.reactDndHtml5Backend

import typings.dndCore.interfacesMod.Backend
import typings.dndCore.interfacesMod.DragDropManager
import typings.dndCore.interfacesMod.Unsubscribe
import typings.reactDndHtml5Backend.html5backendimplMod.global.Window
import typings.reactDndHtml5Backend.typesMod.HTML5BackendContext
import typings.std.Document
import typings.std.DragEvent
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object html5backendimplMod {
  
  @JSImport("react-dnd-html5-backend/lib/HTML5BackendImpl", "HTML5BackendImpl")
  @js.native
  class HTML5BackendImpl protected ()
    extends StObject
       with Backend {
    def this(manager: DragDropManager) = this()
    def this(manager: DragDropManager, globalContext: HTML5BackendContext) = this()
    
    /* private */ var actions: js.Any = js.native
    
    /* private */ var addEventListeners: js.Any = js.native
    
    /* private */ var altKeyPressed: js.Any = js.native
    
    /* private */ var asyncEndDragFrameId: js.Any = js.native
    
    /* private */ var beginDragNativeItem: js.Any = js.native
    
    /* private */ var clearCurrentDragSourceNode: js.Any = js.native
    
    def connectDragPreview(sourceId: String, node: Element, options: js.Any): Unsubscribe = js.native
    
    def connectDragSource(sourceId: String, node: Element, options: js.Any): Unsubscribe = js.native
    
    def connectDropTarget(targetId: String, node: HTMLElement): Unsubscribe = js.native
    
    /* private */ var currentDragSourceNode: js.Any = js.native
    
    /* private */ var currentNativeHandle: js.Any = js.native
    
    /* private */ var currentNativeSource: js.Any = js.native
    
    def document: js.UndefOr[Document] = js.native
    
    /* private */ var dragEnterTargetIds: js.Any = js.native
    
    /* private */ var dragOverTargetIds: js.Any = js.native
    
    /* private */ var dragStartSourceIds: js.Any = js.native
    
    /* private */ var dropTargetIds: js.Any = js.native
    
    /* private */ var endDragIfSourceWasRemovedFromDOM: js.Any = js.native
    
    /* private */ var endDragNativeItem: js.Any = js.native
    
    /* private */ var enterLeaveCounter: js.Any = js.native
    
    /* private */ var getCurrentDropEffect: js.Any = js.native
    
    /* private */ var getCurrentSourceNodeOptions: js.Any = js.native
    
    /* private */ var getCurrentSourcePreviewNodeOptions: js.Any = js.native
    
    /* private */ var getSourceClientOffset: js.Any = js.native
    
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
    
    /* private */ var isDraggingNativeItem: js.Any = js.native
    
    /* private */ var isNodeInDocument: js.Any = js.native
    
    /* private */ var monitor: js.Any = js.native
    
    /* private */ var mouseMoveTimeoutTimer: js.Any = js.native
    
    /* private */ var options: js.Any = js.native
    
    /* private */ var registry: js.Any = js.native
    
    /* private */ var removeEventListeners: js.Any = js.native
    
    /* private */ var setCurrentDragSourceNode: js.Any = js.native
    
    /* private */ var sourceNodeOptions: js.Any = js.native
    
    /* private */ var sourceNodes: js.Any = js.native
    
    /* private */ var sourcePreviewNodeOptions: js.Any = js.native
    
    /* private */ var sourcePreviewNodes: js.Any = js.native
    
    def window: js.UndefOr[Window] = js.native
  }
  
  object global {
    
    trait Window extends StObject {
      
      var __isReactDndBackendSetUp: js.UndefOr[Boolean] = js.undefined
    }
    object Window {
      
      inline def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def set__isReactDndBackendSetUp(value: Boolean): Self = StObject.set(x, "__isReactDndBackendSetUp", value.asInstanceOf[js.Any])
        
        inline def set__isReactDndBackendSetUpUndefined: Self = StObject.set(x, "__isReactDndBackendSetUp", js.undefined)
      }
    }
  }
}
