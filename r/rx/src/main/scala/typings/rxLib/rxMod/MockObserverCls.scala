package typings
package rxLib.rxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "MockObserverCls")
@js.native
class MockObserverCls[T] protected ()
  extends rxDashLiteDashTestingLib.RxNs.MockObserverCls[T] {
  def this(scheduler: rxDashCoreLib.RxNs.IScheduler) = this()
}

