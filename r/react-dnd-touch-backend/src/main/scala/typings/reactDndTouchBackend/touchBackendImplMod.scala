package typings.reactDndTouchBackend

import typings.dndCore.interfacesMod.Backend
import typings.dndCore.interfacesMod.DragDropManager
import typings.dndCore.interfacesMod.Identifier
import typings.dndCore.interfacesMod.Unsubscribe
import typings.reactDndTouchBackend.interfacesMod.TouchBackendContext
import typings.reactDndTouchBackend.interfacesMod.TouchBackendOptions
import typings.std.Document
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.Map
import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-dnd-touch-backend/lib/TouchBackendImpl", JSImport.Namespace)
@js.native
object touchBackendImplMod extends js.Object {
  
  @js.native
  class TouchBackendImpl protected () extends Backend {
    def this(manager: DragDropManager, context: TouchBackendContext, options: TouchBackendOptions) = this()
    
    /**
      *
      * visible for testing
      */
    def _getDropTargetId(node: Element): js.UndefOr[Identifier] = js.native
    
    var _isScrolling: js.Any = js.native
    
    var _mouseClientOffset: js.Any = js.native
    
    var actions: js.Any = js.native
    
    var addEventListener: js.Any = js.native
    
    def connectDragPreview(sourceId: String, node: HTMLElement, options: js.Any): Unsubscribe = js.native
    
    def connectDragSource(sourceId: String, node: HTMLElement): Unsubscribe = js.native
    
    def connectDropTarget(targetId: String, node: HTMLElement): Unsubscribe = js.native
    
    def document: js.UndefOr[Document] = js.native
    
    var dragOverTargetIds: js.Any = js.native
    
    var draggedSourceNode: js.Any = js.native
    
    var draggedSourceNodeRemovalObserver: js.Any = js.native
    
    var getSourceClientOffset: js.Any = js.native
    
    var getTopMoveStartHandler: js.Any = js.native
    
    def handleCancelOnEscape(e: KeyboardEvent): Unit = js.native
    
    def handleMove(_evt: MouseEvent, targetId: String): Unit = js.native
    def handleMove(_evt: TouchEvent, targetId: String): Unit = js.native
    
    def handleMoveStart(sourceId: String): Unit = js.native
    
    def handleTopMove(e: MouseEvent): Unit = js.native
    def handleTopMove(e: TouchEvent): Unit = js.native
    
    def handleTopMoveCapture(): Unit = js.native
    
    def handleTopMoveEndCapture(e: Event): Unit = js.native
    
    def handleTopMoveStart(e: MouseEvent): Unit = js.native
    def handleTopMoveStart(e: TouchEvent): Unit = js.native
    
    def handleTopMoveStartCapture(e: Event): Unit = js.native
    
    def handleTopMoveStartDelay(e: Event): Unit = js.native
    
    var installSourceNodeRemovalObserver: js.Any = js.native
    
    var lastTargetTouchFallback: js.Any = js.native
    
    var listenerTypes: js.Any = js.native
    
    var monitor: js.Any = js.native
    
    var moveStartSourceIds: js.Any = js.native
    
    var options: js.Any = js.native
    
    var removeEventListener: js.Any = js.native
    
    var resurrectSourceNode: js.Any = js.native
    
    var sourceNodes: Map[Identifier, HTMLElement] = js.native
    
    var sourcePreviewNodeOptions: Map[String, _] = js.native
    
    var sourcePreviewNodes: Map[String, HTMLElement] = js.native
    
    var targetNodes: Map[String, HTMLElement] = js.native
    
    var timeout: js.Any = js.native
    
    var uninstallSourceNodeRemovalObserver: js.Any = js.native
    
    var waitingForDelay: js.Any = js.native
    
    def window: js.UndefOr[Window] = js.native
  }
  /* static members */
  @js.native
  object TouchBackendImpl extends js.Object {
    
    var isSetUp: js.Any = js.native
  }
}
