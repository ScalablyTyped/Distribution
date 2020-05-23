package typings.protractorHttpMock.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data[TResponse] extends js.Object {
  var data: TResponse
  var delay: js.UndefOr[Double] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
}

object Data {
  @scala.inline
  def apply[TResponse](
    data: TResponse,
    delay: js.UndefOr[Double] = js.undefined,
    status: js.UndefOr[Double] = js.undefined
  ): Data[TResponse] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[TResponse]]
  }
}

