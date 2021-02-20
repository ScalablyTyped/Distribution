package typings.reachRouter.mod

import typings.history.mod.LocationState
import typings.reachRouter.anon.PushState
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistorySource extends StObject {
  
  def addEventListener(name: String, listener: js.Function1[/* event */ Event, Unit]): Unit = js.native
  
  var history: PushState = js.native
  
  val location: WindowLocation[LocationState] = js.native
  
  def removeEventListener(name: String, listener: js.Function1[/* event */ Event, Unit]): Unit = js.native
}
object HistorySource {
  
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* event */ Event, Unit]) => Unit,
    history: PushState,
    location: WindowLocation[LocationState],
    removeEventListener: (String, js.Function1[/* event */ Event, Unit]) => Unit
  ): HistorySource = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[HistorySource]
  }
  
  @scala.inline
  implicit class HistorySourceMutableBuilder[Self <: HistorySource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEventListener(value: (String, js.Function1[/* event */ Event, Unit]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHistory(value: PushState): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: WindowLocation[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveEventListener(value: (String, js.Function1[/* event */ Event, Unit]) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
  }
}
