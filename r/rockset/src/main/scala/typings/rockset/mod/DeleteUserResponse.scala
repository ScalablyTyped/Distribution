package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteUserResponse extends StObject {
  
  // user object that was deleted
  var data: js.UndefOr[User] = js.native
}
object DeleteUserResponse {
  
  @scala.inline
  def apply(): DeleteUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteUserResponse]
  }
  
  @scala.inline
  implicit class DeleteUserResponseMutableBuilder[Self <: DeleteUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: User): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
