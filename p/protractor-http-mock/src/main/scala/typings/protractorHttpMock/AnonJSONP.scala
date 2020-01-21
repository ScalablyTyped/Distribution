package typings.protractorHttpMock

import typings.protractorHttpMock.protractorHttpMockStrings.JSONP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJSONP extends js.Object {
  var method: JSONP
  var path: String
  var regex: js.UndefOr[Boolean] = js.undefined
}

object AnonJSONP {
  @scala.inline
  def apply(method: JSONP, path: String, regex: js.UndefOr[Boolean] = js.undefined): AnonJSONP = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonJSONP]
  }
}

