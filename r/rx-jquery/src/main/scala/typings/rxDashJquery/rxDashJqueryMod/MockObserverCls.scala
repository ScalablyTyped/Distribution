package typings.rxDashJquery.rxDashJqueryMod

import typings.rxDashCore.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-jquery", "MockObserverCls")
@js.native
class MockObserverCls[T] protected ()
  extends typings.rxDashLiteDashTesting.Rx.MockObserverCls[T] {
  def this(scheduler: IScheduler) = this()
}

