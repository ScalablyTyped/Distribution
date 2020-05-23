package typings.react.anon

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result[T /* <: ComponentType[_] */] extends js.Object {
  val _result: T
}

object Result {
  @scala.inline
  def apply[T](_result: T): Result[T] = {
    val __obj = js.Dynamic.literal(_result = _result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result[T]]
  }
}

