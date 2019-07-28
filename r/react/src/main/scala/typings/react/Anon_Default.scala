package typings.react

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default[T /* <: ComponentType[_] */] extends js.Object {
  var default: T
}

object Anon_Default {
  @scala.inline
  def apply[T /* <: ComponentType[_] */](default: T): Anon_Default[T] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Default[T]]
  }
}

