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
  def apply[TPeek, TRewind](peek: js.Function0[TPeek], rewind: js.Function0[TRewind]): Anon_Peek[TPeek, TRewind] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("peek")(peek)
    __obj.updateDynamic("rewind")(rewind)
    __obj.asInstanceOf[Anon_Peek[TPeek, TRewind]]
  }
}

