package typings.reactAce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Left extends js.Object {
  var left: js.Array[_]
  var right: js.Array[_]
}

object Left {
  @scala.inline
  def apply(left: js.Array[_], right: js.Array[_]): Left = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
}

