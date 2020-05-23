package typings.reactNativeFirebase.anon

import typings.reactNativeFirebase.mod.RNFirebase.ErrorHandler
import typings.reactNativeFirebase.mod.RNFirebase.Handler
import typings.reactNativeFirebase.mod.RNFirebase.RnError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Complete[T] extends js.Object {
  var complete: js.UndefOr[Handler[T]] = js.undefined
  var error: js.UndefOr[ErrorHandler] = js.undefined
  var next: js.UndefOr[Handler[T]] = js.undefined
}

object Complete {
  @scala.inline
  def apply[T](complete: T => Unit = null, error: RnError => Unit = null, next: T => Unit = null): Complete[T] = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1(next))
    __obj.asInstanceOf[Complete[T]]
  }
}

