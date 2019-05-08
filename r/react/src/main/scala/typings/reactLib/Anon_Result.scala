package typings
package reactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Result[T /* <: reactLib.reactMod.ComponentType[_] */] extends js.Object {
  val _result: T
}

object Anon_Result {
  @scala.inline
  def apply[T /* <: reactLib.reactMod.ComponentType[_] */](_result: T): Anon_Result[T] = {
    val __obj = js.Dynamic.literal(_result = _result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Result[T]]
  }
}

