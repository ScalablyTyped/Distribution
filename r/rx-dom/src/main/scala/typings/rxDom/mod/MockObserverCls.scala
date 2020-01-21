package typings.rxDom.mod

import typings.rxCore.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "MockObserverCls")
@js.native
class MockObserverCls[T] protected ()
  extends typings.rx.mod.MockObserverCls[T] {
  def this(scheduler: IScheduler) = this()
}

