package typings
package rxDashDomLib.rxDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "MockObserverCls")
@js.native
class MockObserverCls[T] protected ()
  extends rxLib.rxMod.MockObserverCls[T] {
  def this(scheduler: rxDashCoreLib.RxNs.IScheduler) = this()
}

