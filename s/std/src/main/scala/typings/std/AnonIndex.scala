package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndex[T] extends js.Object {
  def Item(index: js.Any): T
}

object AnonIndex {
  @scala.inline
  def apply[T](Item: js.Any => T): AnonIndex[T] = {
    val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[AnonIndex[T]]
  }
}

