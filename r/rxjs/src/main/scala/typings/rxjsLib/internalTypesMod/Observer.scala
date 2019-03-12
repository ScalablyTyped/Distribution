package typings
package rxjsLib.internalTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  var closed: js.UndefOr[scala.Boolean] = js.undefined
  def complete(): scala.Unit
  def error(err: js.Any): scala.Unit
  def next(value: T): scala.Unit
}

object Observer {
  @scala.inline
  def apply[T](
    complete: () => scala.Unit,
    error: js.Any => scala.Unit,
    next: T => scala.Unit,
    closed: js.UndefOr[scala.Boolean] = js.undefined
  ): Observer[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed)
    __obj.asInstanceOf[Observer[T]]
  }
}

