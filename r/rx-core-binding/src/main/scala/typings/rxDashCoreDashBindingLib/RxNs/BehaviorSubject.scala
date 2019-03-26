package typings
package rxDashCoreDashBindingLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BehaviorSubject[T] extends ISubject[T] {
  def getValue(): T = js.native
}

@JSGlobal("Rx.BehaviorSubject")
@js.native
class BehaviorSubjectCls[T] protected () extends BehaviorSubject[T] {
  def this(initialValue: T) = this()
  /* CompleteClass */
  override def checked(): rxDashCoreLib.RxNs.Observer[_] = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
}

