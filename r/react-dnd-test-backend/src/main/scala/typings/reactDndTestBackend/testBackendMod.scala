package typings.reactDndTestBackend

import typings.dndCore.interfacesMod.Backend
import typings.dndCore.interfacesMod.BeginDragOptions
import typings.dndCore.interfacesMod.DragDropManager
import typings.dndCore.interfacesMod.HoverOptions
import typings.dndCore.interfacesMod.Identifier
import typings.dndCore.interfacesMod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testBackendMod {
  
  @JSImport("react-dnd-test-backend/lib/TestBackend", "TestBackendImpl")
  @js.native
  class TestBackendImpl protected ()
    extends StObject
       with ITestBackend {
    def this(manager: DragDropManager) = this()
    
    /* private */ var actions: js.Any = js.native
    
    def connectDragPreview(): Unsubscribe = js.native
    
    def connectDragSource(): Unsubscribe = js.native
    
    def connectDropTarget(): Unsubscribe = js.native
    
    var manager: DragDropManager = js.native
    
    def simulateBeginDrag(sourceIds: js.Array[Identifier], options: BeginDragOptions): Unit = js.native
    
    def simulateHover(targetIds: js.Array[Identifier], options: HoverOptions): Unit = js.native
  }
  
  @js.native
  trait ITestBackend
    extends StObject
       with Backend {
    
    var didCallSetup: Boolean = js.native
    
    var didCallTeardown: Boolean = js.native
    
    def simulateBeginDrag(sourceIds: js.Array[Identifier]): Unit = js.native
    def simulateBeginDrag(sourceIds: js.Array[Identifier], options: js.Any): Unit = js.native
    
    def simulateDrop(): Unit = js.native
    
    def simulateEndDrag(): Unit = js.native
    
    def simulateHover(targetIds: js.Array[Identifier]): Unit = js.native
    def simulateHover(targetIds: js.Array[Identifier], options: js.Any): Unit = js.native
    
    def simulatePublishDragSource(): Unit = js.native
  }
}
