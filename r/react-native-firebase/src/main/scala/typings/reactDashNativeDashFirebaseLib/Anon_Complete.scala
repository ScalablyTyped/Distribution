package typings
package reactDashNativeDashFirebaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Complete[T] extends js.Object {
  var complete: js.UndefOr[
    reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.Handler[T]
  ] = js.undefined
  var error: js.UndefOr[
    reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.ErrorHandler
  ] = js.undefined
  var next: js.UndefOr[
    reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.Handler[T]
  ] = js.undefined
}

object Anon_Complete {
  @scala.inline
  def apply[T](
    complete: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.Handler[T] = null,
    error: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.ErrorHandler = null,
    next: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.Handler[T] = null
  ): Anon_Complete[T] = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (error != null) __obj.updateDynamic("error")(error)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[Anon_Complete[T]]
  }
}

