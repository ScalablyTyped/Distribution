package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDBDatabaseEventMap extends StObject {
  
  /* standard dom */
  var abort: Event
  
  /* standard dom */
  var close: Event
  
  /* standard dom */
  var error: Event
  
  /* standard dom */
  var versionchange: IDBVersionChangeEvent
}
object IDBDatabaseEventMap {
  
  inline def apply(abort: Event, close: Event, error: Event, versionchange: IDBVersionChangeEvent): IDBDatabaseEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], versionchange = versionchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBDatabaseEventMap]
  }
  
  extension [Self <: IDBDatabaseEventMap](x: Self) {
    
    inline def setAbort(value: Event): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    inline def setClose(value: Event): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setError(value: Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setVersionchange(value: IDBVersionChangeEvent): Self = StObject.set(x, "versionchange", value.asInstanceOf[js.Any])
  }
}
