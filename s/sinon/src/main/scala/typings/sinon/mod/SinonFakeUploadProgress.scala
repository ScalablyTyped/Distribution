package typings.sinon.mod

import typings.sinon.anon.Abort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SinonFakeUploadProgress extends StObject {
  
  def addEventListener(event: String, listener: js.Function1[/* e */ Event, js.Any]): Unit
  
  def dispatchEvent(event: Event): Unit
  
  var eventListeners: Abort
  
  def removeEventListener(event: String, listener: js.Function1[/* e */ Event, js.Any]): Unit
}
object SinonFakeUploadProgress {
  
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* e */ Event, js.Any]) => Unit,
    dispatchEvent: Event => Unit,
    eventListeners: Abort,
    removeEventListener: (String, js.Function1[/* e */ Event, js.Any]) => Unit
  ): SinonFakeUploadProgress = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), eventListeners = eventListeners.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[SinonFakeUploadProgress]
  }
  
  @scala.inline
  implicit class SinonFakeUploadProgressMutableBuilder[Self <: SinonFakeUploadProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEventListener(value: (String, js.Function1[/* e */ Event, js.Any]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDispatchEvent(value: Event => Unit): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEventListeners(value: Abort): Self = StObject.set(x, "eventListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveEventListener(value: (String, js.Function1[/* e */ Event, js.Any]) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
  }
}
