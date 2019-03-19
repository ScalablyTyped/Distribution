package typings
package regexpDashTreeLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoncapturingGroup
  extends Group
     with Base[regexpDashTreeLib.regexpDashTreeLibStrings.Group] {
  var capturing: regexpDashTreeLib.regexpDashTreeLibNumbers.`false`
  var expression: Expression | scala.Null
}

object NoncapturingGroup {
  @scala.inline
  def apply(
    capturing: regexpDashTreeLib.regexpDashTreeLibNumbers.`false`,
    `type`: regexpDashTreeLib.regexpDashTreeLibStrings.Group,
    expression: Expression = null,
    loc: regexpDashTreeLib.Anon_End = null
  ): NoncapturingGroup = {
    val __obj = js.Dynamic.literal(capturing = capturing)
    __obj.updateDynamic("type")(`type`)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[NoncapturingGroup]
  }
}

