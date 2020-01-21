package typings.protractorHttpMock

import typings.protractorHttpMock.protractorHttpMockStrings.PATCH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethodPATCH extends js.Object {
  var method: PATCH
  var path: String
  var regex: js.UndefOr[Boolean] = js.undefined
}

object AnonMethodPATCH {
  @scala.inline
  def apply(method: PATCH, path: String, regex: js.UndefOr[Boolean] = js.undefined): AnonMethodPATCH = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMethodPATCH]
  }
}

