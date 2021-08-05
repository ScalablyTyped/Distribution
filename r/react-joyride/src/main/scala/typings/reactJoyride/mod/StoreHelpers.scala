package typings.reactJoyride.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreHelpers extends StObject {
  
  def close(): Unit
  
  def go(nextIndex: Double): Unit
  
  def info(): StoreState
  
  def next(): Unit
  
  def open(): Unit
  
  def prev(): Unit
  
  def reset(restart: Boolean): Unit
  
  def skip(): Unit
}
object StoreHelpers {
  
  inline def apply(
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
  
  extension [Self <: StoreHelpers](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setGo(value: Double => Unit): Self = StObject.set(x, "go", js.Any.fromFunction1(value))
    
    inline def setInfo(value: () => StoreState): Self = StObject.set(x, "info", js.Any.fromFunction0(value))
    
    inline def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    inline def setPrev(value: () => Unit): Self = StObject.set(x, "prev", js.Any.fromFunction0(value))
    
    inline def setReset(value: Boolean => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
    
    inline def setSkip(value: () => Unit): Self = StObject.set(x, "skip", js.Any.fromFunction0(value))
  }
}
