package typings.protractorDashHttpDashMock

import typings.protractorDashHttpDashMock.protractorDashHttpDashMockStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataMethod[TPayload] extends js.Object {
  var data: TPayload
  var method: POST
  var path: String
  var regex: js.UndefOr[Boolean] = js.undefined
}

object Anon_DataMethod {
  @scala.inline
  def apply[TPayload](data: TPayload, method: POST, path: String, regex: js.UndefOr[Boolean] = js.undefined): Anon_DataMethod[TPayload] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataMethod[TPayload]]
  }
}

