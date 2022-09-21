package typings.rxjs.internalTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.rxjs.internalTypesMod.NextNotification[T]
  - typings.rxjs.internalTypesMod.ErrorNotification
  - typings.rxjs.internalTypesMod.CompleteNotification
*/
trait ObservableNotification[T] extends StObject
object ObservableNotification {
  
  inline def CompleteNotification(): typings.rxjs.internalTypesMod.CompleteNotification = {
    val __obj = js.Dynamic.literal(kind = "C")
    __obj.asInstanceOf[typings.rxjs.internalTypesMod.CompleteNotification]
  }
  
  inline def ErrorNotification(error: Any): typings.rxjs.internalTypesMod.ErrorNotification = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = "E")
    __obj.asInstanceOf[typings.rxjs.internalTypesMod.ErrorNotification]
  }
  
  inline def NextNotification[T](value: T): typings.rxjs.internalTypesMod.NextNotification[T] = {
    val __obj = js.Dynamic.literal(kind = "N", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rxjs.internalTypesMod.NextNotification[T]]
  }
}
