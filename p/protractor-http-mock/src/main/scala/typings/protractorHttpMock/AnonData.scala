package typings.protractorHttpMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData[TResponse] extends js.Object {
  var data: TResponse
  var delay: js.UndefOr[Double] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
}

object AnonData {
  @scala.inline
  def apply[TResponse](data: TResponse, delay: Int | Double = null, status: Int | Double = null): AnonData[TResponse] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData[TResponse]]
  }
}

