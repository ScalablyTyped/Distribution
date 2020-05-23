package typings.reactBootstrapTable.anon

import typings.reactBootstrapTable.mod.FilterComparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comparator extends js.Object {
  /**
    * Comparator value.
    */
  var comparator: FilterComparator
  /**
    * Number value.
    */
  var number: Double
}

object Comparator {
  @scala.inline
  def apply(comparator: FilterComparator, number: Double): Comparator = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comparator]
  }
}

