package typings.reactDashDndDashTestDashBackend.libTestBackendMod

import typings.dndDashCore.libInterfacesMod.BeginDragOptions
import typings.dndDashCore.libInterfacesMod.HoverOptions
import typings.dndDashCore.libInterfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestBackendImpl extends TestBackend {
  var actions: js.Any = js.native
  def connectDragPreview(): js.Function0[Unit] = js.native
  def connectDragSource(): js.Function0[Unit] = js.native
  def connectDropTarget(): js.Function0[Unit] = js.native
  def simulateBeginDrag(sourceIds: js.Array[Identifier], options: BeginDragOptions): Unit = js.native
  def simulateHover(targetIds: js.Array[Identifier], options: HoverOptions): Unit = js.native
}

