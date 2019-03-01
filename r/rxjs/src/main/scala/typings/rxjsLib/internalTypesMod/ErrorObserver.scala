package typings
package rxjsLib.internalTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorObserver[T] extends PartialObserver[T] {
  var closed: js.UndefOr[scala.Boolean] = js.undefined
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var next: js.UndefOr[js.Function1[/* value */ T, scala.Unit]] = js.undefined
  def error(err: js.Any): scala.Unit
}

object ErrorObserver {
  @scala.inline
  def apply[T](
    error: js.Function1[js.Any, scala.Unit],
    closed: js.UndefOr[scala.Boolean] = js.undefined,
    complete: js.Function0[scala.Unit] = null,
    next: js.Function1[/* value */ T, scala.Unit] = null
  ): ErrorObserver[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[ErrorObserver[T]]
  }
}

