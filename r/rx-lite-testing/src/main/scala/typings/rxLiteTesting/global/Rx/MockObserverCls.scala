package typings.rxLiteTesting.global.Rx

import typings.rxCore.Rx.IScheduler
import typings.rxCore.Rx.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.MockObserver")
@js.native
class MockObserverCls[T] protected ()
  extends typings.rxLiteTesting.Rx.MockObserver[T] {
  def this(scheduler: IScheduler) = this()
  /* CompleteClass */
  override var messages: js.Array[typings.rxLiteTesting.Rx.Recorded] = js.native
  /* CompleteClass */
  override def checked(): Observer[_] = js.native
}

