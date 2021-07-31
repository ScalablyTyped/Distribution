package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionStatusEventMap extends StObject {
  
  var change: Event
}
object PermissionStatusEventMap {
  
  @scala.inline
  def apply(change: Event): PermissionStatusEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionStatusEventMap]
  }
  
  @scala.inline
  implicit class PermissionStatusEventMapMutableBuilder[Self <: PermissionStatusEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: Event): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
  }
}
