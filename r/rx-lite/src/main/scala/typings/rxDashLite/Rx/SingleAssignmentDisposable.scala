package typings.rxDashLite.Rx

import typings.rxDashCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Single assignment
@JSGlobal("Rx.SingleAssignmentDisposable")
@js.native
class SingleAssignmentDisposable () extends IDisposable {
  var current: IDisposable = js.native
  var isDisposed: Boolean = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  def getDisposable(): IDisposable = js.native
  def setDisposable(value: IDisposable): Unit = js.native
}

