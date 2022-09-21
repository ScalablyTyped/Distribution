package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrantTokenPermissions extends StObject {
  
  var delete: js.UndefOr[Boolean] = js.undefined
  
  var get: js.UndefOr[Boolean] = js.undefined
  
  var join: js.UndefOr[Boolean] = js.undefined
  
  var manage: js.UndefOr[Boolean] = js.undefined
  
  var read: js.UndefOr[Boolean] = js.undefined
  
  var update: js.UndefOr[Boolean] = js.undefined
  
  var write: js.UndefOr[Boolean] = js.undefined
}
object GrantTokenPermissions {
  
  inline def apply(): GrantTokenPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantTokenPermissions]
  }
  
  extension [Self <: GrantTokenPermissions](x: Self) {
    
    inline def setDelete(value: Boolean): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setGet(value: Boolean): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setJoin(value: Boolean): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
    
    inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
    
    inline def setManage(value: Boolean): Self = StObject.set(x, "manage", value.asInstanceOf[js.Any])
    
    inline def setManageUndefined: Self = StObject.set(x, "manage", js.undefined)
    
    inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
