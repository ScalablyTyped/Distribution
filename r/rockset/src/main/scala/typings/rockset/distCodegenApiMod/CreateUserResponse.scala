package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserResponse extends StObject {
  
  /**
    * user that was created
    * @type {User}
    * @memberof CreateUserResponse
    */
  var data: js.UndefOr[User] = js.undefined
}
object CreateUserResponse {
  
  inline def apply(): CreateUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUserResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateUserResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: User): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
