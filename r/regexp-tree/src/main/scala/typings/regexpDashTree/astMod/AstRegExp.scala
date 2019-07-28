package typings.regexpDashTree.astMod

import typings.regexpDashTree.Anon_End
import typings.regexpDashTree.regexpDashTreeStrings.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AstRegExp extends Base[RegExp] {
  var body: Expression | Null
  var flags: String
}

object AstRegExp {
  @scala.inline
  def apply(flags: String, `type`: RegExp, body: Expression = null, loc: Anon_End = null): AstRegExp = {
    val __obj = js.Dynamic.literal(flags = flags)
    __obj.updateDynamic("type")(`type`)
    if (body != null) __obj.updateDynamic("body")(body)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[AstRegExp]
  }
}

