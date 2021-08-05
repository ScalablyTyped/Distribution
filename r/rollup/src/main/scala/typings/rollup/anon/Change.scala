package typings.rollup.anon

import typings.rollup.mod.RollupWatcherEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Change extends StObject {
  
  def change(id: String, change: Event): Unit
  
  def close(): Unit
  
  def event(event: RollupWatcherEvent): Unit
  
  def restart(): Unit
}
object Change {
  
  inline def apply(
    change: (String, Event) => Unit,
    close: () => Unit,
    event: RollupWatcherEvent => Unit,
    restart: () => Unit
  ): Change = {
    val __obj = js.Dynamic.literal(change = js.Any.fromFunction2(change), close = js.Any.fromFunction0(close), event = js.Any.fromFunction1(event), restart = js.Any.fromFunction0(restart))
    __obj.asInstanceOf[Change]
  }
  
  extension [Self <: Change](x: Self) {
    
    inline def setChange(value: (String, Event) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setEvent(value: RollupWatcherEvent => Unit): Self = StObject.set(x, "event", js.Any.fromFunction1(value))
    
    inline def setRestart(value: () => Unit): Self = StObject.set(x, "restart", js.Any.fromFunction0(value))
  }
}
