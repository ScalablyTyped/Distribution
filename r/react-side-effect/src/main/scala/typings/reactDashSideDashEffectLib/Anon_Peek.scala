package typings
package reactDashSideDashEffectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Peek[TPeek, TRewind] extends js.Object {
  def peek(): TPeek
  def rewind(): TRewind
}

object Anon_Peek {
  @scala.inline
  def apply[TPeek, TRewind](peek: () => TPeek, rewind: () => TRewind): Anon_Peek[TPeek, TRewind] = {
    val __obj = js.Dynamic.literal(peek = js.Any.fromFunction0(peek), rewind = js.Any.fromFunction0(rewind))
  
    __obj.asInstanceOf[Anon_Peek[TPeek, TRewind]]
  }
}

