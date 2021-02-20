package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoginResult extends StObject {
  
  var declinedPermissions: js.UndefOr[js.Array[Permissions]] = js.native
  
  var error: js.Any = js.native
  
  var grantedPermissions: js.UndefOr[js.Array[Permissions]] = js.native
  
  var isCancelled: Boolean = js.native
}
object LoginResult {
  
  @scala.inline
  def apply(error: js.Any, isCancelled: Boolean): LoginResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], isCancelled = isCancelled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginResult]
  }
  
  @scala.inline
  implicit class LoginResultMutableBuilder[Self <: LoginResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeclinedPermissions(value: js.Array[Permissions]): Self = StObject.set(x, "declinedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclinedPermissionsUndefined: Self = StObject.set(x, "declinedPermissions", js.undefined)
    
    @scala.inline
    def setDeclinedPermissionsVarargs(value: Permissions*): Self = StObject.set(x, "declinedPermissions", js.Array(value :_*))
    
    @scala.inline
    def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantedPermissions(value: js.Array[Permissions]): Self = StObject.set(x, "grantedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantedPermissionsUndefined: Self = StObject.set(x, "grantedPermissions", js.undefined)
    
    @scala.inline
    def setGrantedPermissionsVarargs(value: Permissions*): Self = StObject.set(x, "grantedPermissions", js.Array(value :_*))
    
    @scala.inline
    def setIsCancelled(value: Boolean): Self = StObject.set(x, "isCancelled", value.asInstanceOf[js.Any])
  }
}
