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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touchBackendImplMod {
  
  @JSImport("react-dnd-touch-backend/lib/TouchBackendImpl", "TouchBackendImpl")
  @js.native
  class TouchBackendImpl protected ()
    extends StObject
       with Backend {
    def this(manager: DragDropManager, context: TouchBackendContext, options: TouchBackendOptions) = this()
    
    /**
      *
      * visible for testing
      */
    def _getDropTargetId(node: Element): js.UndefOr[Identifier] = js.native
    
    /* private */ var _isScrolling: js.Any = js.native
    
    /* private */ var _mouseClientOffset: js.Any = js.native
    
    /* private */ var actions: js.Any = js.native
    
    /* private */ var addEventListener: js.Any = js.native
    
    def connectDragPreview(sourceId: String, node: HTMLElement, options: js.Any): Unsubscribe = js.native
    
    def connectDragSource(sourceId: String, node: HTMLElement): Unsubscribe = js.native
    
    def connectDropTarget(targetId: String, node: HTMLElement): Unsubscribe = js.native
    
    def document: js.UndefOr[Document] = js.native
    
    /* private */ var dragOverTargetIds: js.Any = js.native
    
    /* private */ var draggedSourceNode: js.Any = js.native
    
    /* private */ var draggedSourceNodeRemovalObserver: js.Any = js.native
    
    /* private */ var getSourceClientOffset: js.Any = js.native
    
    /* private */ var getTopMoveStartHandler: js.Any = js.native
    
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
    
    /* private */ var installSourceNodeRemovalObserver: js.Any = js.native
    
    /* private */ var lastTargetTouchFallback: js.Any = js.native
    
    /* private */ var listenerTypes: js.Any = js.native
    
    /* private */ var monitor: js.Any = js.native
    
    /* private */ var moveStartSourceIds: js.Any = js.native
    
    /* private */ var options: js.Any = js.native
    
    /* private */ var removeEventListener: js.Any = js.native
    
    /* private */ var resurrectSourceNode: js.Any = js.native
    
    var sourceNodes: Map[Identifier, HTMLElement] = js.native
    
    var sourcePreviewNodeOptions: Map[String, js.Any] = js.native
    
    var sourcePreviewNodes: Map[String, HTMLElement] = js.native
    
    var targetNodes: Map[String, HTMLElement] = js.native
    
    /* private */ var timeout: js.Any = js.native
    
    /* private */ var uninstallSourceNodeRemovalObserver: js.Any = js.native
    
    /* private */ var waitingForDelay: js.Any = js.native
    
    def window: js.UndefOr[Window] = js.native
  }
  /* static members */
  object TouchBackendImpl {
    
    @JSImport("react-dnd-touch-backend/lib/TouchBackendImpl", "TouchBackendImpl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-dnd-touch-backend/lib/TouchBackendImpl", "TouchBackendImpl.isSetUp")
    @js.native
    def isSetUp: js.Any = js.native
    inline def isSetUp_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSetUp")(x.asInstanceOf[js.Any])
  }
}
