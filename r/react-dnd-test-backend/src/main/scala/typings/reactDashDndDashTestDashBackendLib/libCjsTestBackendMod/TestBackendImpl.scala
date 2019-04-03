package typings
package reactDashDndDashTestDashBackendLib.libCjsTestBackendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestBackendImpl extends TestBackend {
  var actions: js.Any = js.native
  def connectDragPreview(): js.Function0[scala.Unit] = js.native
  def connectDragSource(): js.Function0[scala.Unit] = js.native
  def connectDropTarget(): js.Function0[scala.Unit] = js.native
  def simulateBeginDrag(
    sourceIds: js.Array[dndDashCoreLib.libCjsInterfacesMod.Identifier],
    options: dndDashCoreLib.libCjsInterfacesMod.BeginDragOptions
  ): scala.Unit = js.native
  def simulateHover(
    targetIds: js.Array[dndDashCoreLib.libCjsInterfacesMod.Identifier],
    options: dndDashCoreLib.libCjsInterfacesMod.HoverOptions
  ): scala.Unit = js.native
}

