package typings.reactNavigationStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnPageChangeCancel extends js.Object {
  def onPageChangeCancel(): Unit
  def onPageChangeConfirm(): Unit
  def onPageChangeStart(): Unit
}

object AnonOnPageChangeCancel {
  @scala.inline
  def apply(onPageChangeCancel: () => Unit, onPageChangeConfirm: () => Unit, onPageChangeStart: () => Unit): AnonOnPageChangeCancel = {
    val __obj = js.Dynamic.literal(onPageChangeCancel = js.Any.fromFunction0(onPageChangeCancel), onPageChangeConfirm = js.Any.fromFunction0(onPageChangeConfirm), onPageChangeStart = js.Any.fromFunction0(onPageChangeStart))
    __obj.asInstanceOf[AnonOnPageChangeCancel]
  }
}

