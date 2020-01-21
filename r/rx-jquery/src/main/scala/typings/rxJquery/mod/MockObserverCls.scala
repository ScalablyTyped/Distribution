package typings.rxJquery.mod

import typings.rxCore.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-jquery", "MockObserverCls")
@js.native
class MockObserverCls[T] protected ()
  extends typings.rxLiteTesting.Rx.MockObserverCls[T] {
  def this(scheduler: IScheduler) = this()
}

