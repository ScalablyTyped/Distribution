package typings.reactDashDndDashTestDashBackend.libTestBackendMod

import typings.dndDashCore.libInterfacesMod.Backend
import typings.dndDashCore.libInterfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

