package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Permissions) */
trait Permissions extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Permissions/query) */
  /* standard dom */
  def query(permissionDesc: PermissionDescriptor): js.Promise[PermissionStatus]
}
object Permissions {
  
  inline def apply(query: PermissionDescriptor => js.Promise[PermissionStatus]): Permissions = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[Permissions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Permissions] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: PermissionDescriptor => js.Promise[PermissionStatus]): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
  }
}
