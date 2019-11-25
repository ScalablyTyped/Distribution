package typings.rxjs.internalTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rxjs.internalTypesMod.NextObserver[T]
  - typings.rxjs.internalTypesMod.ErrorObserver[T]
  - typings.rxjs.internalTypesMod.CompletionObserver[T]
*/
trait PartialObserver[T] extends js.Object

object PartialObserver {
  @scala.inline
  def NextObserver[T](
    next: T => Unit,
    closed: js.UndefOr[Boolean] = js.undefined,
    complete: () => Unit = null,
    error: /* err */ js.Any => Unit = null
  ): PartialObserver[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    __obj.asInstanceOf[PartialObserver[T]]
  }
  @scala.inline
  def ErrorObserver[T](
    error: js.Any => Unit,
    closed: js.UndefOr[Boolean] = js.undefined,
    complete: () => Unit = null,
    next: T => Unit = null
  ): PartialObserver[T] = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error))
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1(next))
    __obj.asInstanceOf[PartialObserver[T]]
  }
  @scala.inline
  def CompletionObserver[T](
    complete: () => Unit,
    closed: js.UndefOr[Boolean] = js.undefined,
    error: /* err */ js.Any => Unit = null,
    next: T => Unit = null
  ): PartialObserver[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1(next))
    __obj.asInstanceOf[PartialObserver[T]]
  }
}

