package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegacyObserver[T] extends js.Object {
  var onCompleted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.undefined
  var onNext: js.UndefOr[js.Function1[/* data */ T, scala.Unit]] = js.undefined
}

object LegacyObserver {
  @scala.inline
  def apply[T](
    onCompleted: () => scala.Unit = null,
    onError: /* error */ stdLib.Error => scala.Unit = null,
    onNext: /* data */ T => scala.Unit = null
  ): LegacyObserver[T] = {
    val __obj = js.Dynamic.literal()
    if (onCompleted != null) __obj.updateDynamic("onCompleted")(js.Any.fromFunction0(onCompleted))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction1(onNext))
    __obj.asInstanceOf[LegacyObserver[T]]
  }
}

