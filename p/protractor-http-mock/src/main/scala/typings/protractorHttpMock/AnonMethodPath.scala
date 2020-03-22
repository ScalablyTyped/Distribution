package typings.protractorHttpMock

import typings.protractorHttpMock.protractorHttpMockStrings.DELETE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethodPath extends js.Object {
  var method: DELETE
  var path: String
  var regex: js.UndefOr[Boolean] = js.undefined
}

object AnonMethodPath {
  @scala.inline
  def apply(method: DELETE, path: String, regex: js.UndefOr[Boolean] = js.undefined): AnonMethodPath = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMethodPath]
  }
}

