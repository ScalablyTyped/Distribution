package typings.rx.rxBackpressureMod

import typings.rx.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx.backpressure", "MockObserver")
@js.native
class MockObserverCls[T] protected ()
  extends typings.rx.Rx.MockObserver[T] {
  def this(scheduler: IScheduler) = this()
}

