package typings.protractorDashHttpDashMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data[TResponse] extends js.Object {
  var data: TResponse
  var delay: js.UndefOr[Double] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply[TResponse](data: TResponse, delay: Int | Double = null, status: Int | Double = null): Anon_Data[TResponse] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Data[TResponse]]
  }
}

