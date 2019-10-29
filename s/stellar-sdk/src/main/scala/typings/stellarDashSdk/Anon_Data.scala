package typings.stellarDashSdk

import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.ErrorResponseData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.UndefOr[ErrorResponseData] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
  var statusText: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply(
    data: ErrorResponseData = null,
    status: Int | Double = null,
    statusText: String = null,
    url: String = null
  ): Anon_Data = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Data]
  }
}

