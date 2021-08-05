package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginResult extends StObject {
  
  var declinedPermissions: js.UndefOr[js.Array[Permissions]] = js.undefined
  
  var error: js.Any
  
  var grantedPermissions: js.UndefOr[js.Array[Permissions]] = js.undefined
  
  var isCancelled: Boolean
}
object LoginResult {
  
  inline def apply(error: js.Any, isCancelled: Boolean): LoginResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], isCancelled = isCancelled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginResult]
  }
  
  extension [Self <: LoginResult](x: Self) {
    
    inline def setDeclinedPermissions(value: js.Array[Permissions]): Self = StObject.set(x, "declinedPermissions", value.asInstanceOf[js.Any])
    
    inline def setDeclinedPermissionsUndefined: Self = StObject.set(x, "declinedPermissions", js.undefined)
    
    inline def setDeclinedPermissionsVarargs(value: Permissions*): Self = StObject.set(x, "declinedPermissions", js.Array(value :_*))
    
    inline def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setGrantedPermissions(value: js.Array[Permissions]): Self = StObject.set(x, "grantedPermissions", value.asInstanceOf[js.Any])
    
    inline def setGrantedPermissionsUndefined: Self = StObject.set(x, "grantedPermissions", js.undefined)
    
    inline def setGrantedPermissionsVarargs(value: Permissions*): Self = StObject.set(x, "grantedPermissions", js.Array(value :_*))
    
    inline def setIsCancelled(value: Boolean): Self = StObject.set(x, "isCancelled", value.asInstanceOf[js.Any])
  }
}
