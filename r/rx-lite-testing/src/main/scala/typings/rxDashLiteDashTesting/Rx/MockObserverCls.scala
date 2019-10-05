package typings.rxDashLiteDashTesting.Rx

import typings.rxDashCore.Rx.IScheduler
import typings.rxDashCore.Rx.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.MockObserver")
@js.native
class MockObserverCls[T] protected () extends MockObserver[T] {
  def this(scheduler: IScheduler) = this()
  /* CompleteClass */
  override var messages: js.Array[Recorded] = js.native
  /* CompleteClass */
  override def checked(): Observer[_] = js.native
}

