package typings.rx.rxTestingMod

import typings.rx.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx.testing", "MockObserver")
@js.native
class MockObserverCls[T] protected ()
  extends typings.rx.Rx.MockObserver[T] {
  def this(scheduler: IScheduler) = this()
}
