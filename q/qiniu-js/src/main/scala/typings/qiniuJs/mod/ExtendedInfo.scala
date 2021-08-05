package typings.qiniuJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.qiniuJs.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedInfo
  extends StObject
     with /* key */ StringDictionary[Type | Double | String] {
  
  var code: Double
  
  var error: String
}
object ExtendedInfo {
  
  inline def apply(code: Double, error: String): ExtendedInfo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedInfo]
  }
  
  extension [Self <: ExtendedInfo](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
