package typings.simonwepSelectionJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionEvents extends StObject {
  
  def beforestart(e: SelectionEvent): Boolean
  
  def move(e: SelectionEvent): Unit
  
  def start(e: SelectionEvent): Unit
  
  def stop(e: SelectionEvent): Unit
}
object SelectionEvents {
  
  inline def apply(
    beforestart: SelectionEvent => Boolean,
    move: SelectionEvent => Unit,
    start: SelectionEvent => Unit,
    stop: SelectionEvent => Unit
  ): SelectionEvents = {
    val __obj = js.Dynamic.literal(beforestart = js.Any.fromFunction1(beforestart), move = js.Any.fromFunction1(move), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[SelectionEvents]
  }
  
  extension [Self <: SelectionEvents](x: Self) {
    
    inline def setBeforestart(value: SelectionEvent => Boolean): Self = StObject.set(x, "beforestart", js.Any.fromFunction1(value))
    
    inline def setMove(value: SelectionEvent => Unit): Self = StObject.set(x, "move", js.Any.fromFunction1(value))
    
    inline def setStart(value: SelectionEvent => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStop(value: SelectionEvent => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
  }
}
