package typings.protractorHttpMock.anon

import typings.protractorHttpMock.protractorHttpMockStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  var method: POST
  var path: String
  var regex: js.UndefOr[Boolean] = js.undefined
}

object Path {
  @scala.inline
  def apply(method: POST, path: String, regex: js.UndefOr[Boolean] = js.undefined): Path = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
}

