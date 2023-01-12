package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUsersResponse extends StObject {
  
  /**
    * list of users
    * @type {Array<User>}
    * @memberof ListUsersResponse
    */
  var data: js.UndefOr[js.Array[User]] = js.undefined
}
object ListUsersResponse {
  
  inline def apply(): ListUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUsersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListUsersResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[User]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: User*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
