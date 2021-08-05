package typings.reachRouter.mod

import typings.history.mod.LocationState
import typings.reachRouter.anon.PushState
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistorySource extends StObject {
  
  def addEventListener(name: String, listener: js.Function1[/* event */ Event, Unit]): Unit
  
  var history: PushState
  
  val location: WindowLocation[LocationState]
  
  def removeEventListener(name: String, listener: js.Function1[/* event */ Event, Unit]): Unit
}
object HistorySource {
  
  inline def apply(
    addEventListener: (String, js.Function1[/* event */ Event, Unit]) => Unit,
    history: PushState,
    location: WindowLocation[LocationState],
    removeEventListener: (String, js.Function1[/* event */ Event, Unit]) => Unit
  ): HistorySource = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[HistorySource]
  }
  
  extension [Self <: HistorySource](x: Self) {
    
    inline def setAddEventListener(value: (String, js.Function1[/* event */ Event, Unit]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    inline def setHistory(value: PushState): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: WindowLocation[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setRemoveEventListener(value: (String, js.Function1[/* event */ Event, Unit]) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
  }
}
