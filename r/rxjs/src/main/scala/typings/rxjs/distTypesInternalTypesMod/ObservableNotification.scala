package typings.rxjs.distTypesInternalTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.rxjs.distTypesInternalTypesMod.NextNotification[T]
  - typings.rxjs.distTypesInternalTypesMod.ErrorNotification
  - typings.rxjs.distTypesInternalTypesMod.CompleteNotification
*/
trait ObservableNotification[T] extends StObject
object ObservableNotification {
  
  inline def CompleteNotification(): typings.rxjs.distTypesInternalTypesMod.CompleteNotification = {
    val __obj = js.Dynamic.literal(kind = "C")
    __obj.asInstanceOf[typings.rxjs.distTypesInternalTypesMod.CompleteNotification]
  }
  
  inline def ErrorNotification(error: Any): typings.rxjs.distTypesInternalTypesMod.ErrorNotification = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = "E")
    __obj.asInstanceOf[typings.rxjs.distTypesInternalTypesMod.ErrorNotification]
  }
  
  inline def NextNotification[T](value: T): typings.rxjs.distTypesInternalTypesMod.NextNotification[T] = {
    val __obj = js.Dynamic.literal(kind = "N", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rxjs.distTypesInternalTypesMod.NextNotification[T]]
  }
}
