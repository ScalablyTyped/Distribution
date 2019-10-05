package typings.reactDashNative.reactDashNativeMod.Animated

import typings.reactDashNative.reactDashNativeMod.NativeSyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventConfig[T] extends js.Object {
  var listener: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[T], Unit]] = js.undefined
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
}

object EventConfig {
  @scala.inline
  def apply[T](
    listener: /* event */ NativeSyntheticEvent[T] => Unit = null,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined
  ): EventConfig[T] = {
    val __obj = js.Dynamic.literal()
    if (listener != null) __obj.updateDynamic("listener")(js.Any.fromFunction1(listener))
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver)
    __obj.asInstanceOf[EventConfig[T]]
  }
}

