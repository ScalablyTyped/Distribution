package typings.servicenow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Get extends js.Object {
  def get(index: Double): String
  def size(): Double
}

object Get {
  @scala.inline
  def apply(get: Double => String, size: () => Double): Get = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[Get]
  }
}

