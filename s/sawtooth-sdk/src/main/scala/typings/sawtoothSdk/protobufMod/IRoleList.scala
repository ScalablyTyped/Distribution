package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRoleList extends StObject {
  
  /** RoleList roles */
  var roles: js.UndefOr[js.Array[IRole] | Null] = js.native
}
object IRoleList {
  
  @scala.inline
  def apply(): IRoleList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRoleList]
  }
  
  @scala.inline
  implicit class IRoleListMutableBuilder[Self <: IRoleList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoles(value: js.Array[IRole]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesNull: Self = StObject.set(x, "roles", null)
    
    @scala.inline
    def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    @scala.inline
    def setRolesVarargs(value: IRole*): Self = StObject.set(x, "roles", js.Array(value :_*))
  }
}
