package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashChangeEventInit extends EventInit {
  var newURL: js.UndefOr[java.lang.String] = js.undefined
  var oldURL: js.UndefOr[java.lang.String] = js.undefined
}

object HashChangeEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    newURL: java.lang.String = null,
    oldURL: java.lang.String = null
  ): HashChangeEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.get.asInstanceOf[js.Any])
    if (newURL != null) __obj.updateDynamic("newURL")(newURL.asInstanceOf[js.Any])
    if (oldURL != null) __obj.updateDynamic("oldURL")(oldURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashChangeEventInit]
  }
}

