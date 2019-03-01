package typings
package rotDashJsLib.rotDashJsMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Array[T] extends js.Object {
  def random(): T
  def randomize(): Array[T]
}

object Array {
  @scala.inline
  def apply[T](random: js.Function0[T], randomize: js.Function0[Array[T]]): Array[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("random")(random)
    __obj.updateDynamic("randomize")(randomize)
    __obj.asInstanceOf[Array[T]]
  }
}

