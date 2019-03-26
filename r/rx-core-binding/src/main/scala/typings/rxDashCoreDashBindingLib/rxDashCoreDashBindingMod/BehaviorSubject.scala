package typings
package rxDashCoreDashBindingLib.rxDashCoreDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-core-binding", "BehaviorSubject")
@js.native
class BehaviorSubjectCls[T] protected ()
  extends rxDashCoreDashBindingLib.RxNs.BehaviorSubject[T] {
  def this(initialValue: T) = this()
  /* CompleteClass */
  override def checked(): rxDashCoreLib.RxNs.Observer[_] = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
}

