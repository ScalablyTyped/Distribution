package typings.protractorDashHttpDashMock

import typings.protractorDashHttpDashMock.protractorDashHttpDashMockStrings.HEAD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HEAD extends js.Object {
  var method: HEAD
  var path: String
  var regex: js.UndefOr[Boolean] = js.undefined
}

object Anon_HEAD {
  @scala.inline
  def apply(method: HEAD, path: String, regex: js.UndefOr[Boolean] = js.undefined): Anon_HEAD = {
    val __obj = js.Dynamic.literal(method = method, path = path)
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex)
    __obj.asInstanceOf[Anon_HEAD]
  }
}

