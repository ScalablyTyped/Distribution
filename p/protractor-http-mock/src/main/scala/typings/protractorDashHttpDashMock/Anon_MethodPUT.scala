package typings.protractorDashHttpDashMock

import typings.protractorDashHttpDashMock.protractorDashHttpDashMockStrings.PUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MethodPUT extends js.Object {
  var method: PUT
  var path: String
  var regex: js.UndefOr[Boolean] = js.undefined
}

object Anon_MethodPUT {
  @scala.inline
  def apply(method: PUT, path: String, regex: js.UndefOr[Boolean] = js.undefined): Anon_MethodPUT = {
    val __obj = js.Dynamic.literal(method = method, path = path)
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex)
    __obj.asInstanceOf[Anon_MethodPUT]
  }
}

