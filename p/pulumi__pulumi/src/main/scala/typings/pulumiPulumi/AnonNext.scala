package typings.pulumiPulumi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNext[T] extends js.Object {
  def next(): js.Promise[AnonDone[T]]
}

object AnonNext {
  @scala.inline
  def apply[T](next: () => js.Promise[AnonDone[T]]): AnonNext[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
  
    __obj.asInstanceOf[AnonNext[T]]
  }
}

