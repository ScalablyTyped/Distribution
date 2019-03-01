package typings
package protractorDashHttpDashMockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Method extends js.Object {
  var method: protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.mockNs.requestsNs.Method
  var path: java.lang.String
  var regex: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Method {
  @scala.inline
  def apply(
    method: protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.mockNs.requestsNs.Method,
    path: java.lang.String,
    regex: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Method = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("path")(path)
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex)
    __obj.asInstanceOf[Anon_Method]
  }
}

