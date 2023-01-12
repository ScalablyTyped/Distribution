package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionStatusEventMap extends StObject {
  
  /* standard dom */
  var change: Event
}
object PermissionStatusEventMap {
  
  inline def apply(change: Event): PermissionStatusEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionStatusEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PermissionStatusEventMap] (val x: Self) extends AnyVal {
    
    inline def setChange(value: Event): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
  }
}
