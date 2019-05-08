package typings
package reactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type[T /* <: reactLib.reactMod.ComponentType[_] */] extends js.Object {
  val `type`: T
}

object Anon_Type {
  @scala.inline
  def apply[T /* <: reactLib.reactMod.ComponentType[_] */](`type`: T): Anon_Type[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Type[T]]
  }
}

