package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDBDatabaseEventMap extends StObject {
  
  var abort: Event = js.native
  
  var close: Event = js.native
  
  var error: Event = js.native
  
  var versionchange: IDBVersionChangeEvent = js.native
}
object IDBDatabaseEventMap {
  
  @scala.inline
  def apply(abort: Event, close: Event, error: Event, versionchange: IDBVersionChangeEvent): IDBDatabaseEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], versionchange = versionchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBDatabaseEventMap]
  }
  
  @scala.inline
  implicit class IDBDatabaseEventMapMutableBuilder[Self <: IDBDatabaseEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: Event): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: Event): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionchange(value: IDBVersionChangeEvent): Self = StObject.set(x, "versionchange", value.asInstanceOf[js.Any])
  }
}
