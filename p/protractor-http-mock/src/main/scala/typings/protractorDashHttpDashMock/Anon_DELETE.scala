package typings.protractorDashHttpDashMock

import typings.protractorDashHttpDashMock.protractorDashHttpDashMockStrings.DELETE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DELETE extends js.Object {
  var method: DELETE
  var path: String
  var regex: js.UndefOr[Boolean] = js.undefined
}

object Anon_DELETE {
  @scala.inline
  def apply(method: DELETE, path: String, regex: js.UndefOr[Boolean] = js.undefined): Anon_DELETE = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DELETE]
  }
}

