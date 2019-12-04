package typings.atPulumiPulumi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Next[T] extends js.Object {
  def next(): js.Promise[Anon_Done[T]]
}

object Anon_Next {
  @scala.inline
  def apply[T](next: () => js.Promise[Anon_Done[T]]): Anon_Next[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
  
    __obj.asInstanceOf[Anon_Next[T]]
  }
}

