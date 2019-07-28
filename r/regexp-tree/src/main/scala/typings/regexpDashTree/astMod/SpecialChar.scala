package typings.regexpDashTree.astMod

import typings.regexpDashTree.Anon_End
import typings.regexpDashTree.regexpDashTreeStrings.control
import typings.regexpDashTree.regexpDashTreeStrings.decimal
import typings.regexpDashTree.regexpDashTreeStrings.hex
import typings.regexpDashTree.regexpDashTreeStrings.meta
import typings.regexpDashTree.regexpDashTreeStrings.oct
import typings.regexpDashTree.regexpDashTreeStrings.unicode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecialChar
  extends Char
     with Base[typings.regexpDashTree.regexpDashTreeStrings.Char] {
  var kind: meta | control | hex | decimal | oct | unicode
  var value: String
}

object SpecialChar {
  @scala.inline
  def apply(
    kind: meta | control | hex | decimal | oct | unicode,
    `type`: typings.regexpDashTree.regexpDashTreeStrings.Char,
    value: String,
    loc: Anon_End = null
  ): SpecialChar = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[SpecialChar]
  }
}

