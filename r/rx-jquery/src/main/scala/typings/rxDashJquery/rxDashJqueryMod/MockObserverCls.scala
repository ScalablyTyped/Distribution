package typings.rxDashJquery.rxDashJqueryMod

import typings.rxDashCore.RxNs.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-jquery", "MockObserverCls")
@js.native
class MockObserverCls[T] protected ()
  extends typings.rxDashLiteDashTesting.RxNs.MockObserverCls[T] {
  def this(scheduler: IScheduler) = this()
}

