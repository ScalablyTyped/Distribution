package typings.rx.rxMod

import typings.rxDashCore.RxNs.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "MockObserverCls")
@js.native
class MockObserverCls[T] protected ()
  extends typings.rxDashLiteDashTesting.RxNs.MockObserverCls[T] {
  def this(scheduler: IScheduler) = this()
}

