package typings.reactDndTouchBackend

import typings.dndCore.interfacesMod.Backend
import typings.dndCore.interfacesMod.DragDropManager
import typings.dndCore.interfacesMod.Identifier
import typings.dndCore.interfacesMod.Unsubscribe
import typings.reactDndTouchBackend.anon.PartialTouchBackendOption
import typings.reactDndTouchBackend.interfacesMod.TouchBackendContext
import typings.std.Document
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.Map
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touchBackendImplMod {
  
  @JSImport("react-dnd-touch-backend/dist/TouchBackendImpl", "TouchBackendImpl")
  @js.native
  open class TouchBackendImpl protected ()
    extends StObject
       with Backend {
    def this(manager: DragDropManager, context: TouchBackendContext, options: PartialTouchBackendOption) = this()
    
    /**
      *
      * visible for testing
      */
    def _getDropTargetId(node: Element): js.UndefOr[Identifier] = js.native
    
    /* private */ var _isScrolling: Any = js.native
    
    /* private */ var _mouseClientOffset: Any = js.native
    
    /* private */ var actions: Any = js.native
    
    /* private */ var addEventListener: Any = js.native
    
    def connectDragPreview(sourceId: String, node: HTMLElement, options: Any): Unsubscribe = js.native
    
    def connectDragSource(sourceId: String, node: HTMLElement): Unsubscribe = js.native
    
    def connectDropTarget(targetId: String, node: HTMLElement): Unsubscribe = js.native
    
    def document: js.UndefOr[Document] = js.native
    
    /* private */ var dragOverTargetIds: Any = js.native
    
    /* private */ var draggedSourceNode: Any = js.native
    
    /* private */ var draggedSourceNodeRemovalObserver: Any = js.native
    
    /* private */ var getSourceClientOffset: Any = js.native
    
    /* private */ var getTopMoveStartHandler: Any = js.native
    
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
    
    /* private */ var installSourceNodeRemovalObserver: Any = js.native
    
    /* private */ var lastTargetTouchFallback: Any = js.native
    
    /* private */ var listenerTypes: Any = js.native
    
    /* private */ var monitor: Any = js.native
    
    /* private */ var moveStartSourceIds: Any = js.native
    
    /* private */ var options: Any = js.native
    
    /* private */ var removeEventListener: Any = js.native
    
    /* private */ var resurrectSourceNode: Any = js.native
    
    var sourceNodes: Map[Identifier, HTMLElement] = js.native
    
    var sourcePreviewNodeOptions: Map[String, Any] = js.native
    
    var sourcePreviewNodes: Map[String, HTMLElement] = js.native
    
    var targetNodes: Map[String, HTMLElement] = js.native
    
    /* private */ var timeout: Any = js.native
    
    /* private */ var uninstallSourceNodeRemovalObserver: Any = js.native
    
    /* private */ var waitingForDelay: Any = js.native
  }
  /* static members */
  object TouchBackendImpl {
    
    @JSImport("react-dnd-touch-backend/dist/TouchBackendImpl", "TouchBackendImpl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-dnd-touch-backend/dist/TouchBackendImpl", "TouchBackendImpl.isSetUp")
    @js.native
    def isSetUp: Any = js.native
    inline def isSetUp_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSetUp")(x.asInstanceOf[js.Any])
  }
}
