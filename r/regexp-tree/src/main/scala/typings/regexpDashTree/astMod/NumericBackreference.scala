package typings.regexpDashTree.astMod

import typings.regexpDashTree.Anon_End
import typings.regexpDashTree.regexpDashTreeStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumericBackreference
  extends Backreference
     with Base[typings.regexpDashTree.regexpDashTreeStrings.Backreference] {
  var kind: number
  var number: Double
  var reference: Double
}

object NumericBackreference {
  @scala.inline
  def apply(
    kind: number,
    number: Double,
    reference: Double,
    `type`: typings.regexpDashTree.regexpDashTreeStrings.Backreference,
    loc: Anon_End = null
  ): NumericBackreference = {
    val __obj = js.Dynamic.literal(kind = kind, number = number, reference = reference)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[NumericBackreference]
  }
}

