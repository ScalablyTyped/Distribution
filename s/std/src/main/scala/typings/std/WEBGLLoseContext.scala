package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WEBGLLoseContext extends js.Object {
  def loseContext(): Unit = js.native
  def restoreContext(): Unit = js.native
}

object WEBGLLoseContext {
  @scala.inline
  def apply(loseContext: () => Unit, restoreContext: () => Unit): WEBGLLoseContext = {
    val __obj = js.Dynamic.literal(loseContext = js.Any.fromFunction0(loseContext), restoreContext = js.Any.fromFunction0(restoreContext))
    __obj.asInstanceOf[WEBGLLoseContext]
  }
  @scala.inline
  implicit class WEBGLLoseContextOps[Self <: WEBGLLoseContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLoseContext(value: () => Unit): Self = this.set("loseContext", js.Any.fromFunction0(value))
    @scala.inline
    def setRestoreContext(value: () => Unit): Self = this.set("restoreContext", js.Any.fromFunction0(value))
  }
  
}

