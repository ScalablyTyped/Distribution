package typings.regexpDashTree.astMod

import typings.regexpDashTree.Anon_End
import typings.regexpDashTree.regexpDashTreeNumbers.`true`
import typings.regexpDashTree.regexpDashTreeStrings.simple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleChar
  extends Char
     with Base[typings.regexpDashTree.regexpDashTreeStrings.Char] {
  var escaped: js.UndefOr[`true`] = js.undefined
  var kind: simple
  var value: String
}

object SimpleChar {
  @scala.inline
  def apply(
    kind: simple,
    `type`: typings.regexpDashTree.regexpDashTreeStrings.Char,
    value: String,
    escaped: `true` = null,
    loc: Anon_End = null
  ): SimpleChar = {
    val __obj = js.Dynamic.literal(kind = kind, value = value)
    __obj.updateDynamic("type")(`type`)
    if (escaped != null) __obj.updateDynamic("escaped")(escaped)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[SimpleChar]
  }
}

