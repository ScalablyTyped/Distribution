package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshTokenParams
  extends StObject
     with /* key */ StringDictionary[js.UndefOr[String]] {
  
  var refreshToken: String
  
  var scope: js.UndefOr[String] = js.undefined
}
object RefreshTokenParams {
  
  inline def apply(refreshToken: String): RefreshTokenParams = {
    val __obj = js.Dynamic.literal(refreshToken = refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshTokenParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefreshTokenParams] (val x: Self) extends AnyVal {
    
    inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
