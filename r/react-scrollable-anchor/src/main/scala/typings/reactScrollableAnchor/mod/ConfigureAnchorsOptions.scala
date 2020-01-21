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
    offset: Int | Double = null,
    scrollDuration: Int | Double = null
  ): ConfigureAnchorsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepLastAnchorHash)) __obj.updateDynamic("keepLastAnchorHash")(keepLastAnchorHash.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (scrollDuration != null) __obj.updateDynamic("scrollDuration")(scrollDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureAnchorsOptions]
  }
}

