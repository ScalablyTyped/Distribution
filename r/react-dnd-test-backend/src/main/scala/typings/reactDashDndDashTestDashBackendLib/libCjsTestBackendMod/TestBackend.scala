package typings
package reactDashDndDashTestDashBackendLib.libCjsTestBackendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestBackend
  extends dndDashCoreLib.libCjsInterfacesMod.Backend {
  var didCallSetup: scala.Boolean = js.native
  var didCallTeardown: scala.Boolean = js.native
  def simulateBeginDrag(sourceIds: js.Array[dndDashCoreLib.libCjsInterfacesMod.Identifier]): scala.Unit = js.native
  def simulateBeginDrag(sourceIds: js.Array[dndDashCoreLib.libCjsInterfacesMod.Identifier], options: js.Any): scala.Unit = js.native
  def simulateDrop(): scala.Unit = js.native
  def simulateEndDrag(): scala.Unit = js.native
  def simulateHover(targetIds: js.Array[dndDashCoreLib.libCjsInterfacesMod.Identifier]): scala.Unit = js.native
  def simulateHover(targetIds: js.Array[dndDashCoreLib.libCjsInterfacesMod.Identifier], options: js.Any): scala.Unit = js.native
  def simulatePublishDragSource(): scala.Unit = js.native
}

