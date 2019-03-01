package typings
package reactDashRelayLib.classicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreUpdateCallbacks[T] extends js.Object {
  var onFailure: js.UndefOr[js.Function1[/* transaction */ Transaction, _]] = js.undefined
  var onSuccess: js.UndefOr[js.Function1[/* response */ T, _]] = js.undefined
}

object StoreUpdateCallbacks {
  @scala.inline
  def apply[T](
    onFailure: js.Function1[/* transaction */ Transaction, _] = null,
    onSuccess: js.Function1[/* response */ T, _] = null
  ): StoreUpdateCallbacks[T] = {
    val __obj = js.Dynamic.literal()
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure)
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess)
    __obj.asInstanceOf[StoreUpdateCallbacks[T]]
  }
}

