package typings
package rollupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: java.lang.String
  var map: js.UndefOr[rollupLib.rollupMod.SourceMapInput] = js.undefined
}

object Anon_Code {
  @scala.inline
  def apply(code: java.lang.String, map: rollupLib.rollupMod.SourceMapInput = null): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code)
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Code]
  }
}

