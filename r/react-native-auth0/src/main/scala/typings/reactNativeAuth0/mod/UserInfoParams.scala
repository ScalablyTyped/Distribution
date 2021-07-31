package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserInfoParams extends StObject {
  
  var token: String
}
object UserInfoParams {
  
  @scala.inline
  def apply(token: String): UserInfoParams = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfoParams]
  }
  
  @scala.inline
  implicit class UserInfoParamsMutableBuilder[Self <: UserInfoParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
