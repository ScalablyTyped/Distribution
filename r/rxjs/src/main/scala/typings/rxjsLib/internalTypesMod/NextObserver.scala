package typings
package rxjsLib.internalTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextObserver[T] extends PartialObserver[T] {
  var closed: js.UndefOr[scala.Boolean] = js.undefined
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* err */ js.Any, scala.Unit]] = js.undefined
  def next(value: T): scala.Unit
}

object NextObserver {
  @scala.inline
  def apply[T](
    next: js.Function1[T, scala.Unit],
    closed: js.UndefOr[scala.Boolean] = js.undefined,
    complete: js.Function0[scala.Unit] = null,
    error: js.Function1[/* err */ js.Any, scala.Unit] = null
  ): NextObserver[T] = {
    val __obj = js.Dynamic.literal(next = next)
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[NextObserver[T]]
  }
}

