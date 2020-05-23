package typings.protractorHttpMock.anon

import typings.protractorHttpMock.protractorHttpMockStrings.HEAD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Regex extends js.Object {
  var method: HEAD
  var path: String
  var regex: js.UndefOr[Boolean] = js.undefined
}

object Regex {
  @scala.inline
  def apply(method: HEAD, path: String, regex: js.UndefOr[Boolean] = js.undefined): Regex = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Regex]
  }
}

