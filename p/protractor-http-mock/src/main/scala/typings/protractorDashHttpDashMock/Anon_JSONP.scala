package typings.protractorDashHttpDashMock

import typings.protractorDashHttpDashMock.protractorDashHttpDashMockStrings.JSONP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_JSONP extends js.Object {
  var method: JSONP
  var path: String
  var regex: js.UndefOr[Boolean] = js.undefined
}

object Anon_JSONP {
  @scala.inline
  def apply(method: JSONP, path: String, regex: js.UndefOr[Boolean] = js.undefined): Anon_JSONP = {
    val __obj = js.Dynamic.literal(method = method, path = path)
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex)
    __obj.asInstanceOf[Anon_JSONP]
  }
}

