package typings.protractorHttpMock.anon

import typings.protractorHttpMock.protractorHttpMockStrings.DELETE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodPath extends js.Object {
  var method: DELETE
  var path: String
  var regex: js.UndefOr[Boolean] = js.undefined
}

object MethodPath {
  @scala.inline
  def apply(method: DELETE, path: String, regex: js.UndefOr[Boolean] = js.undefined): MethodPath = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodPath]
  }
}

