package typings.rxCoreBinding.global.Rx

import typings.rxCore.Rx.Observer
import typings.rxCoreBinding.Rx.ISubject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.Subject")
@js.native
class SubjectCls[T] () extends ISubject[T] {
  /* CompleteClass */
  override def checked(): Observer[_] = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

