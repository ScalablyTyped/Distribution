package typings.regexpDashTree.astMod

import typings.regexpDashTree.Anon_End
import typings.regexpDashTree.regexpDashTreeNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CapturingGroup
  extends Group
     with Base[typings.regexpDashTree.regexpDashTreeStrings.Group] {
  var capturing: `true`
  var expression: Expression | Null
  var name: js.UndefOr[String] = js.undefined
  var number: Double
}

object CapturingGroup {
  @scala.inline
  def apply(
    capturing: `true`,
    number: Double,
    `type`: typings.regexpDashTree.regexpDashTreeStrings.Group,
    expression: Expression = null,
    loc: Anon_End = null,
    name: String = null
  ): CapturingGroup = {
    val __obj = js.Dynamic.literal(capturing = capturing, number = number)
    __obj.updateDynamic("type")(`type`)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[CapturingGroup]
  }
}

