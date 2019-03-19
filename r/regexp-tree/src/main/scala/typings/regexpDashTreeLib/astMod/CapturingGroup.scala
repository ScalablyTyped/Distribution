package typings
package regexpDashTreeLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CapturingGroup
  extends Group
     with Base[regexpDashTreeLib.regexpDashTreeLibStrings.Group] {
  var capturing: regexpDashTreeLib.regexpDashTreeLibNumbers.`true`
  var expression: Expression | scala.Null
  var name: js.UndefOr[java.lang.String] = js.undefined
  var number: scala.Double
}

object CapturingGroup {
  @scala.inline
  def apply(
    capturing: regexpDashTreeLib.regexpDashTreeLibNumbers.`true`,
    number: scala.Double,
    `type`: regexpDashTreeLib.regexpDashTreeLibStrings.Group,
    expression: Expression = null,
    loc: regexpDashTreeLib.Anon_End = null,
    name: java.lang.String = null
  ): CapturingGroup = {
    val __obj = js.Dynamic.literal(capturing = capturing, number = number)
    __obj.updateDynamic("type")(`type`)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[CapturingGroup]
  }
}

