package typings.reactNavigationNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Back extends js.Object {
  
  def back(): Unit = js.native
  
  def forward(): Unit = js.native
  
  def go(n: Double): Unit = js.native
  
  def pushState(state: js.Any, _underscore: String, path: String): Unit = js.native
  
  def replaceState(state: js.Any, _underscore: String, path: String): Unit = js.native
  
  val state: js.Any = js.native
}
object Back {
  
  @scala.inline
  def apply(
    back: () => Unit,
    forward: () => Unit,
    go: Double => Unit,
    pushState: (js.Any, String, String) => Unit,
    replaceState: (js.Any, String, String) => Unit,
    state: js.Any
  ): Back = {
    val __obj = js.Dynamic.literal(back = js.Any.fromFunction0(back), forward = js.Any.fromFunction0(forward), go = js.Any.fromFunction1(go), pushState = js.Any.fromFunction3(pushState), replaceState = js.Any.fromFunction3(replaceState), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Back]
  }
  
  @scala.inline
  implicit class BackOps[Self <: Back] (val x: Self) extends AnyVal {
    
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
    def setBack(value: () => Unit): Self = this.set("back", js.Any.fromFunction0(value))
    
    @scala.inline
    def setForward(value: () => Unit): Self = this.set("forward", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGo(value: Double => Unit): Self = this.set("go", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPushState(value: (js.Any, String, String) => Unit): Self = this.set("pushState", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReplaceState(value: (js.Any, String, String) => Unit): Self = this.set("replaceState", js.Any.fromFunction3(value))
    
    @scala.inline
    def setState(value: js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
