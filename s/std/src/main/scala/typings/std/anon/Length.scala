package typings.std.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Length extends js.Object {
  var length: Double
  def Item(n: Double): String
}

object Length {
  @scala.inline
  def apply(Item: Double => String, length: Double): Length = {
    val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
}

