package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollDifference extends js.Object {
  // The actual displacement as a result of a scroll is in the opposite
  // direction to the scroll itself. When scrolling down items are displaced
  // upwards. This value is the negated version of the 'value'
  var displacement: Position
  var value: Position
}

object ScrollDifference {
  @scala.inline
  def apply(displacement: Position, value: Position): ScrollDifference = {
    val __obj = js.Dynamic.literal(displacement = displacement.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScrollDifference]
  }
}

