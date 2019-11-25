package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDBVersionChangeEventInit extends EventInit {
  var newVersion: js.UndefOr[Double | Null] = js.undefined
  var oldVersion: js.UndefOr[Double] = js.undefined
}

object IDBVersionChangeEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    newVersion: Int | Double = null,
    oldVersion: Int | Double = null
  ): IDBVersionChangeEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (newVersion != null) __obj.updateDynamic("newVersion")(newVersion.asInstanceOf[js.Any])
    if (oldVersion != null) __obj.updateDynamic("oldVersion")(oldVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBVersionChangeEventInit]
  }
}

