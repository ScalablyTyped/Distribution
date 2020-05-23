package typings.reactSideEffect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Peek[TPeek, TRewind] extends js.Object {
  def peek(): TPeek
  def rewind(): TRewind
}

object Peek {
  @scala.inline
  def apply[TPeek, TRewind](peek: () => TPeek, rewind: () => TRewind): Peek[TPeek, TRewind] = {
    val __obj = js.Dynamic.literal(peek = js.Any.fromFunction0(peek), rewind = js.Any.fromFunction0(rewind))
    __obj.asInstanceOf[Peek[TPeek, TRewind]]
  }
}

