package typings.rcMenu.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MiniStore extends js.Object {
  
  def getState(): js.Any = js.native
  
  def setState(state: js.Any): Unit = js.native
  
  def subscribe(listener: js.Function0[Unit]): js.Function0[Unit] = js.native
}
object MiniStore {
  
  @scala.inline
  def apply(
    getState: () => js.Any,
    setState: js.Any => Unit,
    subscribe: js.Function0[Unit] => js.Function0[Unit]
  ): MiniStore = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), setState = js.Any.fromFunction1(setState), subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[MiniStore]
  }
  
  @scala.inline
  implicit class MiniStoreOps[Self <: MiniStore] (val x: Self) extends AnyVal {
    
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
    def setGetState(value: () => js.Any): Self = this.set("getState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetState(value: js.Any => Unit): Self = this.set("setState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubscribe(value: js.Function0[Unit] => js.Function0[Unit]): Self = this.set("subscribe", js.Any.fromFunction1(value))
  }
}
