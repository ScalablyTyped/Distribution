package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefObject[T] extends js.Object {
  val current: T | Null
}

object RefObject {
  @scala.inline
  def apply[T](current: T = null): RefObject[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefObject[T]]
  }
}

