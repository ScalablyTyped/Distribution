package typings.react.anon

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default[T /* <: ComponentType[_] */] extends js.Object {
  var default: T
}

object Default {
  @scala.inline
  def apply[T](default: T): Default[T] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default[T]]
  }
}

