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
    complete: js.Function0[scala.Unit],
    closed: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.Function1[/* err */ js.Any, scala.Unit] = null,
    next: js.Function1[/* value */ T, scala.Unit] = null
  ): CompletionObserver[T] = {
    val __obj = js.Dynamic.literal(complete = complete)
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed)
    if (error != null) __obj.updateDynamic("error")(error)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[CompletionObserver[T]]
  }
}

