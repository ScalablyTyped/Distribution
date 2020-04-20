package typings.reactBootstrapTable2Filter

import typings.reactBootstrapTable2Filter.mod.Comparator
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDate extends js.Object {
  var comparator: Comparator
  var date: Date
}

object AnonDate {
  @scala.inline
  def apply(comparator: Comparator, date: Date): AnonDate = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDate]
  }
}

