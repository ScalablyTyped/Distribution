package typings.rollup

import typings.rollup.mod.SourceMapInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends js.Object {
  var code: String
  var map: js.UndefOr[SourceMapInput] = js.undefined
}

object AnonCode {
  @scala.inline
  def apply(code: String, map: SourceMapInput = null): AnonCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCode]
  }
}

