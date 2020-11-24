package typings.reactJoyride.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreHelpers extends js.Object {
  
  def close(): Unit = js.native
  
  def go(nextIndex: Double): Unit = js.native
  
  def info(): StoreState = js.native
  
  def next(): Unit = js.native
  
  def open(): Unit = js.native
  
  def prev(): Unit = js.native
  
  def reset(restart: Boolean): Unit = js.native
  
  def skip(): Unit = js.native
}
object StoreHelpers {
  
  @scala.inline
  def apply(
    close: () => Unit,
    go: Double => Unit,
    info: () => StoreState,
    next: () => Unit,
    open: () => Unit,
    prev: () => Unit,
    reset: Boolean => Unit,
    skip: () => Unit
  ): StoreHelpers = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), go = js.Any.fromFunction1(go), info = js.Any.fromFunction0(info), next = js.Any.fromFunction0(next), open = js.Any.fromFunction0(open), prev = js.Any.fromFunction0(prev), reset = js.Any.fromFunction1(reset), skip = js.Any.fromFunction0(skip))
    __obj.asInstanceOf[StoreHelpers]
  }
  
  @scala.inline
  implicit class StoreHelpersOps[Self <: StoreHelpers] (val x: Self) extends AnyVal {
    
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGo(value: Double => Unit): Self = this.set("go", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInfo(value: () => StoreState): Self = this.set("info", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNext(value: () => Unit): Self = this.set("next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: () => Unit): Self = this.set("open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrev(value: () => Unit): Self = this.set("prev", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: Boolean => Unit): Self = this.set("reset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSkip(value: () => Unit): Self = this.set("skip", js.Any.fromFunction0(value))
  }
}
