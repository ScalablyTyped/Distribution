package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaEncryptedEventInit extends EventInit {
  var initData: js.UndefOr[ArrayBuffer | Null] = js.undefined
  var initDataType: js.UndefOr[java.lang.String] = js.undefined
}

object MediaEncryptedEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    initData: ArrayBuffer = null,
    initDataType: java.lang.String = null
  ): MediaEncryptedEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (initData != null) __obj.updateDynamic("initData")(initData)
    if (initDataType != null) __obj.updateDynamic("initDataType")(initDataType)
    __obj.asInstanceOf[MediaEncryptedEventInit]
  }
}

