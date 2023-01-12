package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseGetCurrentUser200
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var exp: js.UndefOr[Double] = js.undefined
  
  var iat: js.UndefOr[Double] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object ResponseGetCurrentUser200 {
  
  inline def apply(): ResponseGetCurrentUser200 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseGetCurrentUser200]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseGetCurrentUser200] (val x: Self) extends AnyVal {
    
    inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    inline def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
    
    inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
    
    inline def setIatUndefined: Self = StObject.set(x, "iat", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
