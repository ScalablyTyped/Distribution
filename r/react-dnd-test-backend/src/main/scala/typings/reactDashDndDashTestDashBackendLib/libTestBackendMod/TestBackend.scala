package typings
package reactDashDndDashTestDashBackendLib.libTestBackendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestBackend extends js.Object {
  var didCallSetup: scala.Boolean = js.native
  var didCallTeardown: scala.Boolean = js.native
  def simulateBeginDrag(sourceIds: js.Array[java.lang.String]): scala.Unit = js.native
  def simulateBeginDrag(sourceIds: js.Array[java.lang.String], options: js.Any): scala.Unit = js.native
  def simulateDrop(): scala.Unit = js.native
  def simulateEndDrag(): scala.Unit = js.native
  def simulateHover(targetIds: js.Array[java.lang.String]): scala.Unit = js.native
  def simulateHover(targetIds: js.Array[java.lang.String], options: js.Any): scala.Unit = js.native
  def simulatePublishDragSource(): scala.Unit = js.native
}

