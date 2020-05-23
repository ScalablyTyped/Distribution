package typings.ranjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Closed extends js.Object {
  var closed: Boolean
  var value: Double
}

object Closed {
  @scala.inline
  def apply(closed: Boolean, value: Double): Closed = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Closed]
  }
}

