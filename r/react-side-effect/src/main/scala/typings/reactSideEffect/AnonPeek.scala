package typings.reactSideEffect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPeek[TPeek, TRewind] extends js.Object {
  def peek(): TPeek
  def rewind(): TRewind
}

object AnonPeek {
  @scala.inline
  def apply[TPeek, TRewind](peek: () => TPeek, rewind: () => TRewind): AnonPeek[TPeek, TRewind] = {
    val __obj = js.Dynamic.literal(peek = js.Any.fromFunction0(peek), rewind = js.Any.fromFunction0(rewind))
    __obj.asInstanceOf[AnonPeek[TPeek, TRewind]]
  }
}

