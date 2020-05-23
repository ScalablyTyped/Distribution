package typings.rollup.anon

import typings.rollup.mod.SourceMapInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var code: String
  var map: js.UndefOr[SourceMapInput] = js.undefined
}

object Code {
  @scala.inline
  def apply(code: String, map: js.UndefOr[Null | SourceMapInput] = js.undefined): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (!js.isUndefined(map)) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
}

