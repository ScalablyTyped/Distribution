package typings.rmcPicker.nativePickerAndroidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPickerProp extends js.Object {
  def doScrollingComplete(arg: js.Any*): Unit
  def select(arg: js.Any*): Unit
}

object IPickerProp {
  @scala.inline
  def apply(doScrollingComplete: /* repeated */ js.Any => Unit, select: /* repeated */ js.Any => Unit): IPickerProp = {
    val __obj = js.Dynamic.literal(doScrollingComplete = js.Any.fromFunction1(doScrollingComplete), select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[IPickerProp]
  }
}

