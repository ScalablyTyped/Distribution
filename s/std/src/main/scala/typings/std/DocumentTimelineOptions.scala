package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentTimelineOptions extends js.Object {
  var originTime: js.UndefOr[Double] = js.undefined
}

object DocumentTimelineOptions {
  @scala.inline
  def apply(originTime: js.UndefOr[Double] = js.undefined): DocumentTimelineOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(originTime)) __obj.updateDynamic("originTime")(originTime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentTimelineOptions]
  }
}

