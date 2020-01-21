package typings.reactAce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeft extends js.Object {
  var left: js.Array[_]
  var right: js.Array[_]
}

object AnonLeft {
  @scala.inline
  def apply(left: js.Array[_], right: js.Array[_]): AnonLeft = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLeft]
  }
}

