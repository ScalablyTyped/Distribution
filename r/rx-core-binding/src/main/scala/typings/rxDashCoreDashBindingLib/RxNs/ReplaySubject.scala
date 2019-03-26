package typings
package rxDashCoreDashBindingLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.ReplaySubject")
@js.native
class ReplaySubjectCls[T] () extends ReplaySubject[T] {
  def this(bufferSize: scala.Double) = this()
  def this(bufferSize: scala.Double, window: scala.Double) = this()
  def this(bufferSize: scala.Double, window: scala.Double, scheduler: rxDashCoreLib.RxNs.IScheduler) = this()
  /* CompleteClass */
  override def checked(): rxDashCoreLib.RxNs.Observer[_] = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
}

