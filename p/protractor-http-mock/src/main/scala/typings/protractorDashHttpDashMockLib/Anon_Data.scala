package typings
package protractorDashHttpDashMockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data[TResponse] extends js.Object {
  var data: TResponse
  var status: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply[TResponse](data: TResponse, status: scala.Int | scala.Double = null): Anon_Data[TResponse] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Data[TResponse]]
  }
}

