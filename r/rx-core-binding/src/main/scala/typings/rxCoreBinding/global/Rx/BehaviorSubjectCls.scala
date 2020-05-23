package typings.rxCoreBinding.global.Rx

import typings.rxCore.Rx.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.BehaviorSubject")
@js.native
class BehaviorSubjectCls[T] protected ()
  extends typings.rxCoreBinding.Rx.BehaviorSubject[T] {
  def this(initialValue: T) = this()
  /* CompleteClass */
  override def checked(): Observer[_] = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

