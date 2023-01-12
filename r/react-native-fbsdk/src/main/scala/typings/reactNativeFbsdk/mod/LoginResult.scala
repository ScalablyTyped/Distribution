package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginResult extends StObject {
  
  var declinedPermissions: js.UndefOr[js.Array[Permissions]] = js.undefined
  
  var error: Any
  
  var grantedPermissions: js.UndefOr[js.Array[Permissions]] = js.undefined
  
  var isCancelled: Boolean
}
object LoginResult {
  
  inline def apply(error: Any, isCancelled: Boolean): LoginResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], isCancelled = isCancelled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoginResult] (val x: Self) extends AnyVal {
    
    inline def setDeclinedPermissions(value: js.Array[Permissions]): Self = StObject.set(x, "declinedPermissions", value.asInstanceOf[js.Any])
    
    inline def setDeclinedPermissionsUndefined: Self = StObject.set(x, "declinedPermissions", js.undefined)
    
    inline def setDeclinedPermissionsVarargs(value: Permissions*): Self = StObject.set(x, "declinedPermissions", js.Array(value*))
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setGrantedPermissions(value: js.Array[Permissions]): Self = StObject.set(x, "grantedPermissions", value.asInstanceOf[js.Any])
    
    inline def setGrantedPermissionsUndefined: Self = StObject.set(x, "grantedPermissions", js.undefined)
    
    inline def setGrantedPermissionsVarargs(value: Permissions*): Self = StObject.set(x, "grantedPermissions", js.Array(value*))
    
    inline def setIsCancelled(value: Boolean): Self = StObject.set(x, "isCancelled", value.asInstanceOf[js.Any])
  }
}
