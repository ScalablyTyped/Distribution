package typings.reactScrollableAnchor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigureAnchorsOptions extends js.Object {
  var keepLastAnchorHash: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var scrollDuration: js.UndefOr[Double] = js.undefined
}

object ConfigureAnchorsOptions {
  @scala.inline
  def apply(
    keepLastAnchorHash: js.UndefOr[Boolean] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    scrollDuration: js.UndefOr[Double] = js.undefined
  ): ConfigureAnchorsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepLastAnchorHash)) __obj.updateDynamic("keepLastAnchorHash")(keepLastAnchorHash.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollDuration)) __obj.updateDynamic("scrollDuration")(scrollDuration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureAnchorsOptions]
  }
}

