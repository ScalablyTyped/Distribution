package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginUrl extends StObject {
  
  var id: String
  
  var loginUrl: String
}
object LoginUrl {
  
  inline def apply(id: String, loginUrl: String): LoginUrl = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], loginUrl = loginUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginUrl]
  }
  
  extension [Self <: LoginUrl](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLoginUrl(value: String): Self = StObject.set(x, "loginUrl", value.asInstanceOf[js.Any])
  }
}
