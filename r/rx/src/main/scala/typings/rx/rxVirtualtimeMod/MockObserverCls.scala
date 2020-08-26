package typings.rx.rxVirtualtimeMod

import typings.rx.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx.virtualtime", "MockObserver")
@js.native
class MockObserverCls[T] protected ()
  extends typings.rx.Rx.MockObserver[T] {
  def this(scheduler: IScheduler) = this()
}

