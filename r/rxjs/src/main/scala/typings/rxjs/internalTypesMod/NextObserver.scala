package typings.rxjs.internalTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextObserver[T] extends PartialObserver[T] {
  var closed: js.UndefOr[Boolean] = js.undefined
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.undefined
  def next(value: T): Unit
}

object NextObserver {
  @scala.inline
  def apply[T](
    next: T => Unit,
    closed: js.UndefOr[Boolean] = js.undefined,
    complete: () => Unit = null,
    error: /* err */ js.Any => Unit = null
  ): NextObserver[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    __obj.asInstanceOf[NextObserver[T]]
  }
}

