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
    complete: () => _ = null,
    error: /* error */ stdLib.Error => _ = null,
    next: /* nextThing */ T => _ = null,
    start: /* subscription */ Subscription => _ = null,
    unsubscribe: /* subscription */ Subscription => _ = null
  ): Observer[T] = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1(next))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    if (unsubscribe != null) __obj.updateDynamic("unsubscribe")(js.Any.fromFunction1(unsubscribe))
    __obj.asInstanceOf[Observer[T]]
  }
}

