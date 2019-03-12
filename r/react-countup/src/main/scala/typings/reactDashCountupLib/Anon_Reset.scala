package typings
package reactDashCountupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Reset extends js.Object {
  def reset(): scala.Unit
  def start(): scala.Unit
  def update(): scala.Unit
}

object Anon_Reset {
  @scala.inline
  def apply(reset: () => scala.Unit, start: () => scala.Unit, update: () => scala.Unit): Anon_Reset = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[Anon_Reset]
  }
}

