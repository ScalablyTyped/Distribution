package typings.protractorDashHttpDashMock

import typings.protractorDashHttpDashMock.protractorDashHttpDashMockMod.requestsNs.Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataMethod[TPayload] extends js.Object {
  var data: TPayload
  var method: Method
  var path: String
  var regex: js.UndefOr[Boolean] = js.undefined
}

object Anon_DataMethod {
  @scala.inline
  def apply[TPayload](data: TPayload, method: Method, path: String, regex: js.UndefOr[Boolean] = js.undefined): Anon_DataMethod[TPayload] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], method = method, path = path)
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex)
    __obj.asInstanceOf[Anon_DataMethod[TPayload]]
  }
}

