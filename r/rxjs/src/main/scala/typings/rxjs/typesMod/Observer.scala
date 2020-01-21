package typings.rxjs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  var closed: js.UndefOr[Boolean] = js.undefined
  def complete(): Unit
  def error(err: js.Any): Unit
  def next(value: T): Unit
}

object Observer {
  @scala.inline
  def apply[T](
    complete: () => Unit,
    error: js.Any => Unit,
    next: T => Unit,
    closed: js.UndefOr[Boolean] = js.undefined
  ): Observer[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Observer[T]]
  }
}

