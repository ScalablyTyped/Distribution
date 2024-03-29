package typings.rxjs.distTypesInternalTypesMod

import typings.rxjs.rxjsStrings.E
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorNotification
  extends StObject
     with ObservableNotification[Any] {
  
  var error: Any
  
  /** The kind of notification. Always "E" */
  var kind: E
}
object ErrorNotification {
  
  inline def apply(error: Any): ErrorNotification = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = "E")
    __obj.asInstanceOf[ErrorNotification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorNotification] (val x: Self) extends AnyVal {
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setKind(value: E): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
