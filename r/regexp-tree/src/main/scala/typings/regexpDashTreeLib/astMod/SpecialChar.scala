package typings
package regexpDashTreeLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecialChar
  extends Char
     with Base[regexpDashTreeLib.regexpDashTreeLibStrings.Char] {
  var kind: regexpDashTreeLib.regexpDashTreeLibStrings.meta | regexpDashTreeLib.regexpDashTreeLibStrings.control | regexpDashTreeLib.regexpDashTreeLibStrings.hex | regexpDashTreeLib.regexpDashTreeLibStrings.decimal | regexpDashTreeLib.regexpDashTreeLibStrings.oct | regexpDashTreeLib.regexpDashTreeLibStrings.unicode
  var value: java.lang.String
}

object SpecialChar {
  @scala.inline
  def apply(
    kind: regexpDashTreeLib.regexpDashTreeLibStrings.meta | regexpDashTreeLib.regexpDashTreeLibStrings.control | regexpDashTreeLib.regexpDashTreeLibStrings.hex | regexpDashTreeLib.regexpDashTreeLibStrings.decimal | regexpDashTreeLib.regexpDashTreeLibStrings.oct | regexpDashTreeLib.regexpDashTreeLibStrings.unicode,
    `type`: regexpDashTreeLib.regexpDashTreeLibStrings.Char,
    value: java.lang.String,
    loc: regexpDashTreeLib.Anon_End = null
  ): SpecialChar = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[SpecialChar]
  }
}

