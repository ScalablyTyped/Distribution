package typings.rxDashCoreDashBinding.RxNs

import typings.rxDashCore.RxNs.IScheduler
import typings.rxDashCore.RxNs.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.ReplaySubject")
@js.native
class ReplaySubjectCls[T] () extends ReplaySubject[T] {
  def this(bufferSize: Double) = this()
  def this(bufferSize: Double, window: Double) = this()
  def this(bufferSize: Double, window: Double, scheduler: IScheduler) = this()
  /* CompleteClass */
  override def checked(): Observer[_] = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

