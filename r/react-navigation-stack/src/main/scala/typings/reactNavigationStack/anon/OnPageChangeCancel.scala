package typings.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPageChangeCancel extends js.Object {
  def onPageChangeCancel(): Unit
  def onPageChangeConfirm(): Unit
  def onPageChangeStart(): Unit
}

object OnPageChangeCancel {
  @scala.inline
  def apply(onPageChangeCancel: () => Unit, onPageChangeConfirm: () => Unit, onPageChangeStart: () => Unit): OnPageChangeCancel = {
    val __obj = js.Dynamic.literal(onPageChangeCancel = js.Any.fromFunction0(onPageChangeCancel), onPageChangeConfirm = js.Any.fromFunction0(onPageChangeConfirm), onPageChangeStart = js.Any.fromFunction0(onPageChangeStart))
    __obj.asInstanceOf[OnPageChangeCancel]
  }
}

