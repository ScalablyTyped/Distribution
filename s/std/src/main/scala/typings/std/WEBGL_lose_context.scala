package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WEBGL_lose_context extends js.Object {
  def loseContext(): Unit
  def restoreContext(): Unit
}

object WEBGL_lose_context {
  @scala.inline
  def apply(loseContext: () => Unit, restoreContext: () => Unit): WEBGL_lose_context = {
    val __obj = js.Dynamic.literal(loseContext = js.Any.fromFunction0(loseContext), restoreContext = js.Any.fromFunction0(restoreContext))
  
    __obj.asInstanceOf[WEBGL_lose_context]
  }
}

