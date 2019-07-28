package typings.rxDashLiteDashTesting.RxNs

import typings.rxDashCore.RxNs.IScheduler
import typings.rxDashCore.RxNs.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockObserver[T] extends Observer[T] {
  var messages: js.Array[Recorded]
}

@JSGlobal("Rx.MockObserver")
@js.native
class MockObserverCls[T] protected () extends MockObserver[T] {
  def this(scheduler: IScheduler) = this()
  /* CompleteClass */
  override var messages: js.Array[Recorded] = js.native
  /* CompleteClass */
  override def checked(): Observer[_] = js.native
}

object MockObserver {
  @scala.inline
  def apply[T](checked: () => Observer[_], messages: js.Array[Recorded]): MockObserver[T] = {
    val __obj = js.Dynamic.literal(checked = js.Any.fromFunction0(checked), messages = messages)
  
    __obj.asInstanceOf[MockObserver[T]]
  }
}

