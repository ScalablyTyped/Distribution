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
    complete: js.Function0[scala.Unit],
    error: js.Function1[js.Any, scala.Unit],
    next: js.Function1[T, scala.Unit],
    closed: js.UndefOr[scala.Boolean] = js.undefined
  ): Observer[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("next")(next)
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed)
    __obj.asInstanceOf[Observer[T]]
  }
}

