package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.COMBINE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CombineImpact extends ImpactLocation {
  var combine: Combine
  var `type`: COMBINE
  var whenEntered: UserDirection
}

object CombineImpact {
  @scala.inline
  def apply(combine: Combine, `type`: COMBINE, whenEntered: UserDirection): CombineImpact = {
    val __obj = js.Dynamic.literal(combine = combine.asInstanceOf[js.Any], whenEntered = whenEntered.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CombineImpact]
  }
}

