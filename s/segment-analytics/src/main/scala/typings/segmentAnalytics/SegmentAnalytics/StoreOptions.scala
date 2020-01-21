package typings.segmentAnalytics.SegmentAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreOptions extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object StoreOptions {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): StoreOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreOptions]
  }
}

