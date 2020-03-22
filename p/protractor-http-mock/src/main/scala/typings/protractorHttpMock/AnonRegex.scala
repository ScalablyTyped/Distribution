package typings.protractorHttpMock

import typings.protractorHttpMock.protractorHttpMockStrings.HEAD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRegex extends js.Object {
  var method: HEAD
  var path: String
  var regex: js.UndefOr[Boolean] = js.undefined
}

object AnonRegex {
  @scala.inline
  def apply(method: HEAD, path: String, regex: js.UndefOr[Boolean] = js.undefined): AnonRegex = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRegex]
  }
}

