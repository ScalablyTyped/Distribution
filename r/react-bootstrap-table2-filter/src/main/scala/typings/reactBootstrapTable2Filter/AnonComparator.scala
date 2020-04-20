package typings.reactBootstrapTable2Filter

import typings.reactBootstrapTable2Filter.mod.Comparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComparator extends js.Object {
  var comparator: Comparator
  var number: Double
}

object AnonComparator {
  @scala.inline
  def apply(comparator: Comparator, number: Double): AnonComparator = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComparator]
  }
}

