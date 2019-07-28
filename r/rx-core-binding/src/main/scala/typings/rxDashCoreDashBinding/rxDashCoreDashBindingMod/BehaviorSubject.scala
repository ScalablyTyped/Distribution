package typings.rxDashCoreDashBinding.rxDashCoreDashBindingMod

import typings.rxDashCore.RxNs.Observer
import typings.rxDashCoreDashBinding.RxNs.BehaviorSubject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-core-binding", "BehaviorSubject")
@js.native
class BehaviorSubjectCls[T] protected () extends BehaviorSubject[T] {
  def this(initialValue: T) = this()
  /* CompleteClass */
  override def checked(): Observer[_] = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

