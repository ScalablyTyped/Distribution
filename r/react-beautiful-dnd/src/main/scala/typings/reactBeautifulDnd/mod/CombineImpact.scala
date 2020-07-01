package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.COMBINE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CombineImpact extends ImpactLocation {
  var combine: Combine
  var `type`: COMBINE
}

object CombineImpact {
  @scala.inline
  def apply(combine: Combine, `type`: COMBINE): CombineImpact = {
    val __obj = js.Dynamic.literal(combine = combine.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CombineImpact]
  }
}

