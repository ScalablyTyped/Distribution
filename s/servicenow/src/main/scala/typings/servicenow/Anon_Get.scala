package typings.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Get extends js.Object {
  def get(index: Double): String
  def size(): Double
}

object Anon_Get {
  @scala.inline
  def apply(get: Double => String, size: () => Double): Anon_Get = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), size = js.Any.fromFunction0(size))
  
    __obj.asInstanceOf[Anon_Get]
  }
}

