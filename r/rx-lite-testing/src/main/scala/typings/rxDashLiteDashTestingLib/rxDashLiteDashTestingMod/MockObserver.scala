package typings
package rxDashLiteDashTestingLib.rxDashLiteDashTestingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-lite-testing", "MockObserver")
@js.native
class MockObserverCls[T] protected ()
  extends rxDashLiteDashTestingLib.RxNs.MockObserver[T] {
  def this(scheduler: rxDashCoreLib.RxNs.IScheduler) = this()
  /* CompleteClass */
  override var messages: js.Array[rxDashLiteDashTestingLib.RxNs.Recorded] = js.native
  /* CompleteClass */
  override def checked(): rxDashCoreLib.RxNs.Observer[_] = js.native
}

