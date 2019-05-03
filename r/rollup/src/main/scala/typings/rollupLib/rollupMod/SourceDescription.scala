package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceDescription extends js.Object {
  var ast: js.UndefOr[estreeLib.estreeMod.Program] = js.undefined
  var code: java.lang.String
  var map: js.UndefOr[java.lang.String | RawSourceMap] = js.undefined
}

object SourceDescription {
  @scala.inline
  def apply(
    code: java.lang.String,
    ast: estreeLib.estreeMod.Program = null,
    map: java.lang.String | RawSourceMap = null
  ): SourceDescription = {
    val __obj = js.Dynamic.literal(code = code)
    if (ast != null) __obj.updateDynamic("ast")(ast)
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceDescription]
  }
}

