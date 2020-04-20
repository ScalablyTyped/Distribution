package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollDetails extends js.Object {
  var current: Position
  var diff: ScrollDifference
  var initial: Position
  // the maximum allowable scroll for the frame
  var max: Position
}

object ScrollDetails {
  @scala.inline
  def apply(current: Position, diff: ScrollDifference, initial: Position, max: Position): ScrollDetails = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], diff = diff.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollDetails]
  }
}

