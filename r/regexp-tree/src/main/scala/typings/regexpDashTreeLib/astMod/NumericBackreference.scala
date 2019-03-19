package typings
package regexpDashTreeLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumericBackreference
  extends Backreference
     with Base[regexpDashTreeLib.regexpDashTreeLibStrings.Backreference] {
  var kind: regexpDashTreeLib.regexpDashTreeLibStrings.number
  var number: scala.Double
  var reference: scala.Double
}

object NumericBackreference {
  @scala.inline
  def apply(
    kind: regexpDashTreeLib.regexpDashTreeLibStrings.number,
    number: scala.Double,
    reference: scala.Double,
    `type`: regexpDashTreeLib.regexpDashTreeLibStrings.Backreference,
    loc: regexpDashTreeLib.Anon_End = null
  ): NumericBackreference = {
    val __obj = js.Dynamic.literal(kind = kind, number = number, reference = reference)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[NumericBackreference]
  }
}

