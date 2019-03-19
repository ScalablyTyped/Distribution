package typings
package regexpDashTreeLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedBackreference
  extends Backreference
     with Base[regexpDashTreeLib.regexpDashTreeLibStrings.Backreference] {
  var kind: regexpDashTreeLib.regexpDashTreeLibStrings.name
  var number: scala.Double
  var reference: java.lang.String
}

object NamedBackreference {
  @scala.inline
  def apply(
    kind: regexpDashTreeLib.regexpDashTreeLibStrings.name,
    number: scala.Double,
    reference: java.lang.String,
    `type`: regexpDashTreeLib.regexpDashTreeLibStrings.Backreference,
    loc: regexpDashTreeLib.Anon_End = null
  ): NamedBackreference = {
    val __obj = js.Dynamic.literal(kind = kind, number = number, reference = reference)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[NamedBackreference]
  }
}

