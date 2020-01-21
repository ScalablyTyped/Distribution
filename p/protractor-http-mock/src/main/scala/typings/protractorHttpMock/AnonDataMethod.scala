package typings.protractorHttpMock

import typings.protractorHttpMock.protractorHttpMockStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataMethod[TPayload] extends js.Object {
  var data: TPayload
  var method: POST
  var path: String
  var regex: js.UndefOr[Boolean] = js.undefined
}

object AnonDataMethod {
  @scala.inline
  def apply[TPayload](data: TPayload, method: POST, path: String, regex: js.UndefOr[Boolean] = js.undefined): AnonDataMethod[TPayload] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataMethod[TPayload]]
  }
}

