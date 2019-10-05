package typings.reactDashDndDashTestDashBackend

import typings.dndDashCore.libInterfacesMod.Backend
import typings.dndDashCore.libInterfacesMod.BeginDragOptions
import typings.dndDashCore.libInterfacesMod.DragDropManager
import typings.dndDashCore.libInterfacesMod.HoverOptions
import typings.dndDashCore.libInterfacesMod.Identifier
import typings.reactDashDndDashTestDashBackend.libTestBackendMod.TestBackend
import typings.reactDashDndDashTestDashBackend.libTestBackendMod.TestBackendImpl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd-test-backend/lib/TestBackend", JSImport.Namespace)
@js.native
object libTestBackendMod extends js.Object {
  @js.native
  trait TestBackend extends Backend {
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
  
  @js.native
  trait TestBackendImpl extends TestBackend {
    var actions: js.Any = js.native
    def connectDragPreview(): js.Function0[Unit] = js.native
    def connectDragSource(): js.Function0[Unit] = js.native
    def connectDropTarget(): js.Function0[Unit] = js.native
    def simulateBeginDrag(sourceIds: js.Array[Identifier], options: BeginDragOptions): Unit = js.native
    def simulateHover(targetIds: js.Array[Identifier], options: HoverOptions): Unit = js.native
  }
  
  @js.native
  class default protected () extends TestBackendImpl {
    def this(manager: DragDropManager) = this()
  }
  
}

