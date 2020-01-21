package typings.react

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault[T /* <: ComponentType[_] */] extends js.Object {
  var default: T
}

object AnonDefault {
  @scala.inline
  def apply[T /* <: ComponentType[_] */](default: T): AnonDefault[T] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDefault[T]]
  }
}

