package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoginUrl extends StObject {
  
  var id: String = js.native
  
  var loginUrl: String = js.native
}
object LoginUrl {
  
  @scala.inline
  def apply(id: String, loginUrl: String): LoginUrl = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], loginUrl = loginUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginUrl]
  }
  
  @scala.inline
  implicit class LoginUrlMutableBuilder[Self <: LoginUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginUrl(value: String): Self = StObject.set(x, "loginUrl", value.asInstanceOf[js.Any])
  }
}
