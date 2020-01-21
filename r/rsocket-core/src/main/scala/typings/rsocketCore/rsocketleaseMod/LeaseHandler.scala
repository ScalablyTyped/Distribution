package typings.rsocketCore.rsocketleaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaseHandler extends js.Object {
  def errorMessage(): String
  def use(): Boolean
}

object LeaseHandler {
  @scala.inline
  def apply(errorMessage: () => String, use: () => Boolean): LeaseHandler = {
    val __obj = js.Dynamic.literal(errorMessage = js.Any.fromFunction0(errorMessage), use = js.Any.fromFunction0(use))
  
    __obj.asInstanceOf[LeaseHandler]
  }
}

