package typings.regexpDashTree.astMod

import typings.regexpDashTree.Anon_End
import typings.regexpDashTree.regexpDashTreeStrings.name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedBackreference
  extends Backreference
     with Base[typings.regexpDashTree.regexpDashTreeStrings.Backreference] {
  var kind: name
  var number: Double
  var reference: String
}

object NamedBackreference {
  @scala.inline
  def apply(
    kind: name,
    number: Double,
    reference: String,
    `type`: typings.regexpDashTree.regexpDashTreeStrings.Backreference,
    loc: Anon_End = null
  ): NamedBackreference = {
    val __obj = js.Dynamic.literal(kind = kind, number = number, reference = reference)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[NamedBackreference]
  }
}

