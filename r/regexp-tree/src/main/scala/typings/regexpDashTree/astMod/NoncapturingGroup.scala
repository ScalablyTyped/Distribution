package typings.regexpDashTree.astMod

import typings.regexpDashTree.Anon_End
import typings.regexpDashTree.regexpDashTreeNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoncapturingGroup
  extends Group
     with Base[typings.regexpDashTree.regexpDashTreeStrings.Group] {
  var capturing: `false`
  var expression: Expression | Null
}

object NoncapturingGroup {
  @scala.inline
  def apply(
    capturing: `false`,
    `type`: typings.regexpDashTree.regexpDashTreeStrings.Group,
    expression: Expression = null,
    loc: Anon_End = null
  ): NoncapturingGroup = {
    val __obj = js.Dynamic.literal(capturing = capturing)
    __obj.updateDynamic("type")(`type`)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[NoncapturingGroup]
  }
}

