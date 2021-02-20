package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResetPasswordParams extends StObject {
  
  var connection: String = js.native
  
  var email: String = js.native
}
object ResetPasswordParams {
  
  @scala.inline
  def apply(connection: String, email: String): ResetPasswordParams = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetPasswordParams]
  }
  
  @scala.inline
  implicit class ResetPasswordParamsMutableBuilder[Self <: ResetPasswordParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
  }
}
