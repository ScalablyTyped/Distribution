package typings.reactDashNativeDashFirebase

import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.ErrorHandler
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Complete[T] extends js.Object {
  var complete: js.UndefOr[Handler[T]] = js.undefined
  var error: js.UndefOr[ErrorHandler] = js.undefined
  var next: js.UndefOr[Handler[T]] = js.undefined
}

object Anon_Complete {
  @scala.inline
  def apply[T](complete: Handler[T] = null, error: ErrorHandler = null, next: Handler[T] = null): Anon_Complete[T] = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (error != null) __obj.updateDynamic("error")(error)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[Anon_Complete[T]]
  }
}

