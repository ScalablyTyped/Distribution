package typings.rmcNukaCarousel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var position: String
  var right: Double
  var top: Double
}

object Position {
  @scala.inline
  def apply(position: String, right: Double, top: Double): Position = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

