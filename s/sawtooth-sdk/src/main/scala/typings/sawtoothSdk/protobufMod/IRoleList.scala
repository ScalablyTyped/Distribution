package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRoleList extends StObject {
  
  /** RoleList roles */
  var roles: js.UndefOr[js.Array[IRole] | Null] = js.undefined
}
object IRoleList {
  
  inline def apply(): IRoleList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRoleList]
  }
  
  extension [Self <: IRoleList](x: Self) {
    
    inline def setRoles(value: js.Array[IRole]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesNull: Self = StObject.set(x, "roles", null)
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: IRole*): Self = StObject.set(x, "roles", js.Array(value :_*))
  }
}
