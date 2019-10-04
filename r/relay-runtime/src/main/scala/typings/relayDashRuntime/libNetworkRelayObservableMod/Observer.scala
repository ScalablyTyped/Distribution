package typings.relayDashRuntime.libNetworkRelayObservableMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  val complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  val error: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  val next: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  val start: js.UndefOr[js.Function1[/* subscription */ Subscription, Unit]] = js.undefined
  val unsubscribe: js.UndefOr[js.Function1[/* subscription */ Subscription, Unit]] = js.undefined
}

object Observer {
  @scala.inline
  def apply[T](
    complete: () => Unit = null,
    error: /* error */ Error => Unit = null,
    next: /* value */ T => Unit = null,
    start: /* subscription */ Subscription => Unit = null,
    unsubscribe: /* subscription */ Subscription => Unit = null
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

