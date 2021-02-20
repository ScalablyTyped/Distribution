package typings.rollup.anon

import typings.rollup.mod.RollupWatcherEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Change extends StObject {
  
  def change(id: String, change: Event): Unit = js.native
  
  def close(): Unit = js.native
  
  def event(event: RollupWatcherEvent): Unit = js.native
  
  def restart(): Unit = js.native
}
object Change {
  
  @scala.inline
  def apply(
    change: (String, Event) => Unit,
    close: () => Unit,
    event: RollupWatcherEvent => Unit,
    restart: () => Unit
  ): Change = {
    val __obj = js.Dynamic.literal(change = js.Any.fromFunction2(change), close = js.Any.fromFunction0(close), event = js.Any.fromFunction1(event), restart = js.Any.fromFunction0(restart))
    __obj.asInstanceOf[Change]
  }
  
  @scala.inline
  implicit class ChangeMutableBuilder[Self <: Change] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: (String, Event) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEvent(value: RollupWatcherEvent => Unit): Self = StObject.set(x, "event", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRestart(value: () => Unit): Self = StObject.set(x, "restart", js.Any.fromFunction0(value))
  }
}
