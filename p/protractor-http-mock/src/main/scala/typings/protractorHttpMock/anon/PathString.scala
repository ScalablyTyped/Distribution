package typings.protractorHttpMock.anon

import typings.protractorHttpMock.protractorHttpMockStrings.JSONP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathString extends js.Object {
  var method: JSONP
  var path: String
  var regex: js.UndefOr[Boolean] = js.undefined
}

object PathString {
  @scala.inline
  def apply(method: JSONP, path: String, regex: js.UndefOr[Boolean] = js.undefined): PathString = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathString]
  }
}

