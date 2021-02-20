package typings.reactJoyride.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreHelpers extends StObject {
  
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
  implicit class StoreHelpersMutableBuilder[Self <: StoreHelpers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGo(value: Double => Unit): Self = StObject.set(x, "go", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInfo(value: () => StoreState): Self = StObject.set(x, "info", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrev(value: () => Unit): Self = StObject.set(x, "prev", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: Boolean => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSkip(value: () => Unit): Self = StObject.set(x, "skip", js.Any.fromFunction0(value))
  }
}
