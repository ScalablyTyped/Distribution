package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDBOpenDBRequestEventMap
  extends StObject
     with IDBRequestEventMap {
  
  var blocked: Event
  
  var upgradeneeded: IDBVersionChangeEvent
}
object IDBOpenDBRequestEventMap {
  
  inline def apply(blocked: Event, error: Event, success: Event, upgradeneeded: IDBVersionChangeEvent): IDBOpenDBRequestEventMap = {
    val __obj = js.Dynamic.literal(blocked = blocked.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], upgradeneeded = upgradeneeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBOpenDBRequestEventMap]
  }
  
  extension [Self <: IDBOpenDBRequestEventMap](x: Self) {
    
    inline def setBlocked(value: Event): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
    
    inline def setUpgradeneeded(value: IDBVersionChangeEvent): Self = StObject.set(x, "upgradeneeded", value.asInstanceOf[js.Any])
  }
}
