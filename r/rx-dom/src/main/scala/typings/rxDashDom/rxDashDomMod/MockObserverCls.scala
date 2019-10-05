package typings.rxDashDom.rxDashDomMod

import typings.rxDashCore.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "MockObserverCls")
@js.native
class MockObserverCls[T] protected ()
  extends typings.rx.rxMod.MockObserverCls[T] {
  def this(scheduler: IScheduler) = this()
}

