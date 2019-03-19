package typings
package regexpDashTreeLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleChar
  extends Char
     with Base[regexpDashTreeLib.regexpDashTreeLibStrings.Char] {
  var escaped: js.UndefOr[regexpDashTreeLib.regexpDashTreeLibNumbers.`true`] = js.undefined
  var kind: regexpDashTreeLib.regexpDashTreeLibStrings.simple
  var value: java.lang.String
}

object SimpleChar {
  @scala.inline
  def apply(
    kind: regexpDashTreeLib.regexpDashTreeLibStrings.simple,
    `type`: regexpDashTreeLib.regexpDashTreeLibStrings.Char,
    value: java.lang.String,
    escaped: regexpDashTreeLib.regexpDashTreeLibNumbers.`true` = null,
    loc: regexpDashTreeLib.Anon_End = null
  ): SimpleChar = {
    val __obj = js.Dynamic.literal(kind = kind, value = value)
    __obj.updateDynamic("type")(`type`)
    if (escaped != null) __obj.updateDynamic("escaped")(escaped)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[SimpleChar]
  }
}

