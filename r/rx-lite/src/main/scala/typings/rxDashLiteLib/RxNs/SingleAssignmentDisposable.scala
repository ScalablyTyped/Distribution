package typings
package rxDashLiteLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Single assignment
@JSGlobal("Rx.SingleAssignmentDisposable")
@js.native
class SingleAssignmentDisposable ()
  extends rxDashCoreLib.RxNs.IDisposable {
  var current: rxDashCoreLib.RxNs.IDisposable = js.native
  var isDisposed: scala.Boolean = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  def getDisposable(): rxDashCoreLib.RxNs.IDisposable = js.native
  def setDisposable(value: rxDashCoreLib.RxNs.IDisposable): scala.Unit = js.native
}

