package typings.reactNativeEventSource.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RNEventSource extends js.Object {
  
  def addEventListener(`type`: String, listener: ListenerCallback): js.Any = js.native
  
  def close(): Unit = js.native
  
  def removeAllListeners(): Unit = js.native
  
  def removeListener(`type`: String, listener: ListenerCallback): Unit = js.native
}
object RNEventSource {
  
  @scala.inline
  def apply(
    addEventListener: (String, ListenerCallback) => js.Any,
    close: () => Unit,
    removeAllListeners: () => Unit,
    removeListener: (String, ListenerCallback) => Unit
  ): RNEventSource = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), close = js.Any.fromFunction0(close), removeAllListeners = js.Any.fromFunction0(removeAllListeners), removeListener = js.Any.fromFunction2(removeListener))
    __obj.asInstanceOf[RNEventSource]
  }
  
  @scala.inline
  implicit class RNEventSourceOps[Self <: RNEventSource] (val x: Self) extends AnyVal {
    
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
    def setAddEventListener(value: (String, ListenerCallback) => js.Any): Self = this.set("addEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveAllListeners(value: () => Unit): Self = this.set("removeAllListeners", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveListener(value: (String, ListenerCallback) => Unit): Self = this.set("removeListener", js.Any.fromFunction2(value))
  }
}
