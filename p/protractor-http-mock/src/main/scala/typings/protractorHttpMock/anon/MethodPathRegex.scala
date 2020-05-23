package typings.protractorHttpMock.anon

import typings.protractorHttpMock.protractorHttpMockStrings.PATCH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodPathRegex extends js.Object {
  var method: PATCH
  var path: String
  var regex: js.UndefOr[Boolean] = js.undefined
}

object MethodPathRegex {
  @scala.inline
  def apply(method: PATCH, path: String, regex: js.UndefOr[Boolean] = js.undefined): MethodPathRegex = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodPathRegex]
  }
}

