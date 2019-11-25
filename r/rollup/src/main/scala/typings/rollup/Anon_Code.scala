package typings.rollup

import typings.rollup.rollupMod.SourceMapInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: String
  var map: js.UndefOr[SourceMapInput] = js.undefined
}

object Anon_Code {
  @scala.inline
  def apply(code: String, map: SourceMapInput = null): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Code]
  }
}

