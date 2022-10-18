package typings.rxjs.distTypesInternalTypesMod

import typings.rxjs.rxjsStrings.N
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextNotification[T]
  extends StObject
     with ObservableNotification[T] {
  
  /** The kind of notification. Always "N" */
  var kind: N
  
  /** The value of the notification. */
  var value: T
}
object NextNotification {
  
  inline def apply[T](value: T): NextNotification[T] = {
    val __obj = js.Dynamic.literal(kind = "N", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextNotification[T]]
  }
  
  extension [Self <: NextNotification[?], T](x: Self & NextNotification[T]) {
    
    inline def setKind(value: N): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
