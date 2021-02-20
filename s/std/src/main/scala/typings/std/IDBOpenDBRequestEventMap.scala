package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDBOpenDBRequestEventMap extends IDBRequestEventMap {
  
  var blocked: Event = js.native
  
  var upgradeneeded: IDBVersionChangeEvent = js.native
}
object IDBOpenDBRequestEventMap {
  
  @scala.inline
  def apply(blocked: Event, error: Event, success: Event, upgradeneeded: IDBVersionChangeEvent): IDBOpenDBRequestEventMap = {
    val __obj = js.Dynamic.literal(blocked = blocked.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], upgradeneeded = upgradeneeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBOpenDBRequestEventMap]
  }
  
  @scala.inline
  implicit class IDBOpenDBRequestEventMapMutableBuilder[Self <: IDBOpenDBRequestEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlocked(value: Event): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgradeneeded(value: IDBVersionChangeEvent): Self = StObject.set(x, "upgradeneeded", value.asInstanceOf[js.Any])
  }
}
