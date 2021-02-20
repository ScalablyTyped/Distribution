package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserResponse extends StObject {
  
  // user that was created
  var data: js.UndefOr[User] = js.native
}
object CreateUserResponse {
  
  @scala.inline
  def apply(): CreateUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUserResponse]
  }
  
  @scala.inline
  implicit class CreateUserResponseMutableBuilder[Self <: CreateUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: User): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
