package typings.rotDashJs.rotDashJsMod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Array[T] extends js.Object {
  def random(): T
  def randomize(): Array[T]
}

object Array {
  @scala.inline
  def apply[T](random: () => T, randomize: () => Array[T]): Array[T] = {
    val __obj = js.Dynamic.literal(random = js.Any.fromFunction0(random), randomize = js.Any.fromFunction0(randomize))
  
    __obj.asInstanceOf[Array[T]]
  }
}

