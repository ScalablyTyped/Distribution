package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItem extends js.Object {
  var length: Double
  def Item(n: Double): java.lang.String
}

object AnonItem {
  @scala.inline
  def apply(Item: Double => java.lang.String, length: Double): AnonItem = {
    val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item), length = length.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItem]
  }
}

