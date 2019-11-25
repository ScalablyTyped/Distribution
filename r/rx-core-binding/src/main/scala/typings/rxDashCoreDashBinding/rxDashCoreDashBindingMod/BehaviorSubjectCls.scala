package typings.rxDashCoreDashBinding.rxDashCoreDashBindingMod

import typings.rxDashCore.Rx.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-core-binding", "BehaviorSubject")
@js.native
class BehaviorSubjectCls[T] protected ()
  extends typings.rxDashCoreDashBinding.Rx.BehaviorSubject[T] {
  def this(initialValue: T) = this()
  /* CompleteClass */
  override def checked(): Observer[_] = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

