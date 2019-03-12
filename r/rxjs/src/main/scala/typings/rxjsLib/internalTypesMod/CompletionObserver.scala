package typings
package rxjsLib.internalTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionObserver[T] extends PartialObserver[T] {
  var closed: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[js.Function1[/* err */ js.Any, scala.Unit]] = js.undefined
  var next: js.UndefOr[js.Function1[/* value */ T, scala.Unit]] = js.undefined
  def complete(): scala.Unit
}

object CompletionObserver {
  @scala.inline
  def apply[T](
    complete: () => scala.Unit,
    closed: js.UndefOr[scala.Boolean] = js.undefined,
    error: /* err */ js.Any => scala.Unit = null,
    next: /* value */ T => scala.Unit = null
  ): CompletionObserver[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1(next))
    __obj.asInstanceOf[CompletionObserver[T]]
  }
}

