package typings
package rxDashLiteDashTestingLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockObserver[T]
  extends rxDashCoreLib.RxNs.Observer[T] {
  var messages: js.Array[Recorded]
}

@JSGlobal("Rx.MockObserver")
@js.native
class MockObserverCls[T] protected () extends MockObserver[T] {
  def this(scheduler: rxDashCoreLib.RxNs.IScheduler) = this()
  /* CompleteClass */
  override var messages: js.Array[Recorded] = js.native
  /* CompleteClass */
  override def checked(): rxDashCoreLib.RxNs.Observer[_] = js.native
}

object MockObserver {
  @scala.inline
  def apply[T](checked: () => rxDashCoreLib.RxNs.Observer[_], messages: js.Array[Recorded]): MockObserver[T] = {
    val __obj = js.Dynamic.literal(checked = js.Any.fromFunction0(checked), messages = messages)
  
    __obj.asInstanceOf[MockObserver[T]]
  }
}

