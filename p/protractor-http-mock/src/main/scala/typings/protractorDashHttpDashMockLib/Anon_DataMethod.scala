package typings
package protractorDashHttpDashMockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataMethod[TPayload] extends js.Object {
  var data: TPayload
  var method: protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.mockNs.requestsNs.Method
  var path: java.lang.String
  var regex: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DataMethod {
  @scala.inline
  def apply[TPayload](
    data: TPayload,
    method: protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.mockNs.requestsNs.Method,
    path: java.lang.String,
    regex: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DataMethod[TPayload] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], method = method, path = path)
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex)
    __obj.asInstanceOf[Anon_DataMethod[TPayload]]
  }
}

