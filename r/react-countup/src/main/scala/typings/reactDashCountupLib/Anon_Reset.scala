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
  def apply(reset: js.Function0[scala.Unit], start: js.Function0[scala.Unit], update: js.Function0[scala.Unit]): Anon_Reset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[Anon_Reset]
  }
}

