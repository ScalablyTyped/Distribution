package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Package extends StObject {
  
  var access_token: String
  
  var packageid: Double
}
object Package {
  
  inline def apply(access_token: String, packageid: Double): Package = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], packageid = packageid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Package]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Package] (val x: Self) extends AnyVal {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setPackageid(value: Double): Self = StObject.set(x, "packageid", value.asInstanceOf[js.Any])
  }
}
