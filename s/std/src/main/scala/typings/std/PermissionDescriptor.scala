package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionDescriptor extends StObject {
  
  /* standard dom */
  var name: PermissionName
}
object PermissionDescriptor {
  
  inline def apply(name: PermissionName): PermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PermissionDescriptor] (val x: Self) extends AnyVal {
    
    inline def setName(value: PermissionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
