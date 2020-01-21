package typings.protooServer.mod

import typings.protooServer.protooServerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProotooResponse extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var errorCode: js.UndefOr[Double] = js.undefined
  var errorReason: js.UndefOr[String] = js.undefined
  var id: Double
  var ok: Boolean
  var response: `true`
}

object ProotooResponse {
  @scala.inline
  def apply(
    id: Double,
    ok: Boolean,
    response: `true`,
    data: js.Any = null,
    errorCode: Int | Double = null,
    errorReason: String = null
  ): ProotooResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (errorReason != null) __obj.updateDynamic("errorReason")(errorReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProotooResponse]
  }
}

