package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageEventInit extends EventInit {
  var key: js.UndefOr[java.lang.String | Null] = js.undefined
  var newValue: js.UndefOr[java.lang.String | Null] = js.undefined
  var oldValue: js.UndefOr[java.lang.String | Null] = js.undefined
  var storageArea: js.UndefOr[Storage | Null] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object StorageEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    newValue: java.lang.String = null,
    oldValue: java.lang.String = null,
    storageArea: Storage = null,
    url: java.lang.String = null
  ): StorageEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (key != null) __obj.updateDynamic("key")(key)
    if (newValue != null) __obj.updateDynamic("newValue")(newValue)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue)
    if (storageArea != null) __obj.updateDynamic("storageArea")(storageArea)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[StorageEventInit]
  }
}

