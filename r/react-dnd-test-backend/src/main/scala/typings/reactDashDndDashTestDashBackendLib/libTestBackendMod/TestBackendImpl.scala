package typings
package reactDashDndDashTestDashBackendLib.libTestBackendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestBackendImpl
  extends dndDashCoreLib.libInterfacesMod.Backend
     with TestBackend {
  var actions: js.Any = js.native
  def connectDragPreview(): js.Any = js.native
  def connectDragSource(): js.Any = js.native
  def connectDropTarget(): js.Any = js.native
  def simulateBeginDrag(sourceIds: js.Array[java.lang.String], options: dndDashCoreLib.libInterfacesMod.BeginDragOptions): scala.Unit = js.native
  def simulateHover(targetIds: js.Array[java.lang.String], options: dndDashCoreLib.libInterfacesMod.HoverOptions): scala.Unit = js.native
}

