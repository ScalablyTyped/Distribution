package typings.reachRouter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushState extends js.Object {
  val state: js.Any = js.native
  def pushState(state: js.Any, title: String, uri: String): Unit = js.native
  def replaceState(state: js.Any, title: String, uri: String): Unit = js.native
}

object PushState {
  @scala.inline
  def apply(
    pushState: (js.Any, String, String) => Unit,
    replaceState: (js.Any, String, String) => Unit,
    state: js.Any
  ): PushState = {
    val __obj = js.Dynamic.literal(pushState = js.Any.fromFunction3(pushState), replaceState = js.Any.fromFunction3(replaceState), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushState]
  }
  @scala.inline
  implicit class PushStateOps[Self <: PushState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPushState(value: (js.Any, String, String) => Unit): Self = this.set("pushState", js.Any.fromFunction3(value))
    @scala.inline
    def setReplaceState(value: (js.Any, String, String) => Unit): Self = this.set("replaceState", js.Any.fromFunction3(value))
    @scala.inline
    def setState(value: js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

