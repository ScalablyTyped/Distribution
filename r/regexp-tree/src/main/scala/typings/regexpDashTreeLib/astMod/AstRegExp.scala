package typings
package regexpDashTreeLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AstRegExp
  extends Base[regexpDashTreeLib.regexpDashTreeLibStrings.RegExp] {
  var body: Expression | scala.Null
  var flags: java.lang.String
}

object AstRegExp {
  @scala.inline
  def apply(
    flags: java.lang.String,
    `type`: regexpDashTreeLib.regexpDashTreeLibStrings.RegExp,
    body: Expression = null,
    loc: regexpDashTreeLib.Anon_End = null
  ): AstRegExp = {
    val __obj = js.Dynamic.literal(flags = flags)
    __obj.updateDynamic("type")(`type`)
    if (body != null) __obj.updateDynamic("body")(body)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[AstRegExp]
  }
}

