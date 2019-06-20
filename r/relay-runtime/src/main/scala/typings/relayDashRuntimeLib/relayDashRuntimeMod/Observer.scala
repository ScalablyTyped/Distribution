package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  val complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  val error: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.undefined
  val next: js.UndefOr[js.Function1[/* value */ T, scala.Unit]] = js.undefined
  val start: js.UndefOr[js.Function1[/* subscription */ Subscription, scala.Unit]] = js.undefined
  val unsubscribe: js.UndefOr[js.Function1[/* subscription */ Subscription, scala.Unit]] = js.undefined
}

object Observer {
  @scala.inline
  def apply[T](
    complete: () => scala.Unit = null,
    error: /* error */ stdLib.Error => scala.Unit = null,
    next: /* value */ T => scala.Unit = null,
    start: /* subscription */ Subscription => scala.Unit = null,
    unsubscribe: /* subscription */ Subscription => scala.Unit = null
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

