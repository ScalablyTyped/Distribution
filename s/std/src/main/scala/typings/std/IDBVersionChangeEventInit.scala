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
    newVersion: js.UndefOr[Null | Double] = js.undefined,
    oldVersion: js.UndefOr[Double] = js.undefined
  ): IDBVersionChangeEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(newVersion)) __obj.updateDynamic("newVersion")(newVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(oldVersion)) __obj.updateDynamic("oldVersion")(oldVersion.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBVersionChangeEventInit]
  }
}

