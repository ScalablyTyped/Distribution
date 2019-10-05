package typings.rxDashLiteDashTesting.rxDashLiteDashTestingMod

import typings.rxDashCore.Rx.IScheduler
import typings.rxDashCore.Rx.Observer
import typings.rxDashLiteDashTesting.Rx.MockObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-lite-testing", "MockObserver")
@js.native
class MockObserverCls[T] protected () extends MockObserver[T] {
  def this(scheduler: IScheduler) = this()
  /* CompleteClass */
  override var messages: js.Array[typings.rxDashLiteDashTesting.Rx.Recorded] = js.native
  /* CompleteClass */
  override def checked(): Observer[_] = js.native
}

