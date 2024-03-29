package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserResponse extends StObject {
  
  /**
    * user object that was deleted
    * @type {User}
    * @memberof DeleteUserResponse
    */
  var data: js.UndefOr[User] = js.undefined
}
object DeleteUserResponse {
  
  inline def apply(): DeleteUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteUserResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteUserResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: User): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
