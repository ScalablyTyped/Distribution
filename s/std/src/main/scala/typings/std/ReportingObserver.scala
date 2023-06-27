package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReportingObserver) */
trait ReportingObserver extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReportingObserver/disconnect) */
  /* standard dom */
  def disconnect(): Unit
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReportingObserver/observe) */
  /* standard dom */
  def observe(): Unit
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReportingObserver/takeRecords) */
  /* standard dom */
  def takeRecords(): ReportList
}
object ReportingObserver {
  
  inline def apply(disconnect: () => Unit, observe: () => Unit, takeRecords: () => ReportList): ReportingObserver = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), observe = js.Any.fromFunction0(observe), takeRecords = js.Any.fromFunction0(takeRecords))
    __obj.asInstanceOf[ReportingObserver]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportingObserver] (val x: Self) extends AnyVal {
    
    inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
    
    inline def setObserve(value: () => Unit): Self = StObject.set(x, "observe", js.Any.fromFunction0(value))
    
    inline def setTakeRecords(value: () => ReportList): Self = StObject.set(x, "takeRecords", js.Any.fromFunction0(value))
  }
}
