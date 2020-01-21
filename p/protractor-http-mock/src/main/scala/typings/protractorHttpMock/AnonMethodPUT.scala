package typings.protractorHttpMock

import typings.protractorHttpMock.protractorHttpMockStrings.PUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethodPUT extends js.Object {
  var method: PUT
  var path: String
  var regex: js.UndefOr[Boolean] = js.undefined
}

object AnonMethodPUT {
  @scala.inline
  def apply(method: PUT, path: String, regex: js.UndefOr[Boolean] = js.undefined): AnonMethodPUT = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMethodPUT]
  }
}

