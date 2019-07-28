package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentTimelineOptions extends js.Object {
  var originTime: js.UndefOr[Double] = js.undefined
}

object DocumentTimelineOptions {
  @scala.inline
  def apply(originTime: Int | Double = null): DocumentTimelineOptions = {
    val __obj = js.Dynamic.literal()
    if (originTime != null) __obj.updateDynamic("originTime")(originTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentTimelineOptions]
  }
}

