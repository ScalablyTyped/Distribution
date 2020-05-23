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
    initData: js.UndefOr[Null | ArrayBuffer] = js.undefined,
    initDataType: java.lang.String = null
  ): MediaEncryptedEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initData)) __obj.updateDynamic("initData")(initData.asInstanceOf[js.Any])
    if (initDataType != null) __obj.updateDynamic("initDataType")(initDataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaEncryptedEventInit]
  }
}

