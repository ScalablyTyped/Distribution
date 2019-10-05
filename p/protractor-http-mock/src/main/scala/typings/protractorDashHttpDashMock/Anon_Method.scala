package typings.protractorDashHttpDashMock

import typings.protractorDashHttpDashMock.protractorDashHttpDashMockMod.requests.Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Method extends js.Object {
  var method: Method
  var path: String
  var regex: js.UndefOr[Boolean] = js.undefined
}

object Anon_Method {
  @scala.inline
  def apply(method: Method, path: String, regex: js.UndefOr[Boolean] = js.undefined): Anon_Method = {
    val __obj = js.Dynamic.literal(method = method, path = path)
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex)
    __obj.asInstanceOf[Anon_Method]
  }
}

