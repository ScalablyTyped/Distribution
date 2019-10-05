package typings.rxDashCoreDashBinding.rxDashCoreDashBindingMod

import typings.rxDashCore.Rx.IScheduler
import typings.rxDashCore.Rx.Observer
import typings.rxDashCoreDashBinding.Rx.ReplaySubject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-core-binding", "ReplaySubject")
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

