package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  var complete: js.UndefOr[js.Function0[_]] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ stdLib.Error, _]] = js.undefined
  var next: js.UndefOr[js.Function1[/* nextThing */ T, _]] = js.undefined
  var start: js.UndefOr[js.Function1[/* subscription */ Subscription, _]] = js.undefined
  var unsubscribe: js.UndefOr[js.Function1[/* subscription */ Subscription, _]] = js.undefined
}

object Observer {
  @scala.inline
  def apply[T](
    complete: js.Function0[_] = null,
    error: js.Function1[/* error */ stdLib.Error, _] = null,
    next: js.Function1[/* nextThing */ T, _] = null,
    start: js.Function1[/* subscription */ Subscription, _] = null,
    unsubscribe: js.Function1[/* subscription */ Subscription, _] = null
  ): Observer[T] = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (error != null) __obj.updateDynamic("error")(error)
    if (next != null) __obj.updateDynamic("next")(next)
    if (start != null) __obj.updateDynamic("start")(start)
    if (unsubscribe != null) __obj.updateDynamic("unsubscribe")(unsubscribe)
    __obj.asInstanceOf[Observer[T]]
  }
}

