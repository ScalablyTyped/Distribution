package typings.protractorDashHttpDashMock

import typings.protractorDashHttpDashMock.protractorDashHttpDashMockStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Method extends js.Object {
  var method: POST
  var path: String
  var regex: js.UndefOr[Boolean] = js.undefined
}

object Anon_Method {
  @scala.inline
  def apply(method: POST, path: String, regex: js.UndefOr[Boolean] = js.undefined): Anon_Method = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Method]
  }
}

