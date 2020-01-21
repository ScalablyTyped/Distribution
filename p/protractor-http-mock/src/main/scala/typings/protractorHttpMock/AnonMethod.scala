package typings.protractorHttpMock

import typings.protractorHttpMock.protractorHttpMockStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethod extends js.Object {
  var method: POST
  var path: String
  var regex: js.UndefOr[Boolean] = js.undefined
}

object AnonMethod {
  @scala.inline
  def apply(method: POST, path: String, regex: js.UndefOr[Boolean] = js.undefined): AnonMethod = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMethod]
  }
}

