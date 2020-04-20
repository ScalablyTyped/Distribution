package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WEBGLLoseContext extends js.Object {
  def loseContext(): Unit
  def restoreContext(): Unit
}

object WEBGLLoseContext {
  @scala.inline
  def apply(loseContext: () => Unit, restoreContext: () => Unit): WEBGLLoseContext = {
    val __obj = js.Dynamic.literal(loseContext = js.Any.fromFunction0(loseContext), restoreContext = js.Any.fromFunction0(restoreContext))
    __obj.asInstanceOf[WEBGLLoseContext]
  }
}

